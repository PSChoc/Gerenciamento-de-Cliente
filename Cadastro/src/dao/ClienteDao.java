package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import java.text.SimpleDateFormat;
import modelo.ModelTabela;

public abstract class ClienteDao implements DaoGenerica<Cliente> {

    private final bancoConection conexao;
    
    public ClienteDao() {
        this.conexao = new bancoConection();
    }

    @Override
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO Cliente(idCliente, nomeCliente, cpfCliente, dataNascimento, docIdentificador, orgaoEmissor, ufEmissor, dataEmissao, naturalidadeCliente, idEstadoCivil, idSexo, nomeMae, nomePai, obsCliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    sentenca.setInt(1, cliente.getIdCliente());
                    sentenca.setString(2, cliente.getNomeCliente());
                    sentenca.setString(3, cliente.getCpfCliente());
                    sentenca.setDate(4, (Date) cliente.getDataNascimento()); // Alterado para setDate
                    sentenca.setString(5, cliente.getDocIdentificador());
                    sentenca.setString(6, cliente.getOrgaoEmissor());
                    sentenca.setString(7, cliente.getUfEmissor());
                    sentenca.setDate(8, (Date) cliente.getDataEmissao()); // Alterado para setDate
                    sentenca.setString(9, cliente.getNaturalidadeCliente());
                    sentenca.setInt(10, cliente.getIdEstadoCivil());
                    sentenca.setInt(11, cliente.getIdSexo());
                    sentenca.setString(12, cliente.getNomeMae());
                    sentenca.setString(13, cliente.getNomePai());
                    sentenca.setString(14, cliente.getObsCliente());
                    
                    sentenca.execute();
                }
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        String sql = "UPDATE Cliente SET nomeCliente = ?, cpfCliente = ?, dataNascimento = ?, docIdentificador = ?, orgaoEmissor = ?, ufEmissor = ?, dataEmissao = ?, naturalidadeCliente = ?, idEstadoCivil = ?, idSexo = ?, nomeMae = ?, nomePai = ?, obsCliente = ? WHERE idCliente = ?";

        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    sentenca.setString(1, cliente.getNomeCliente());
                    sentenca.setString(2, cliente.getCpfCliente());
                    sentenca.setDate(3, (Date) cliente.getDataNascimento()); // Alterado para setDate
                    sentenca.setString(4, cliente.getDocIdentificador());
                    sentenca.setString(5, cliente.getOrgaoEmissor());
                    sentenca.setString(6, cliente.getUfEmissor());
                    sentenca.setDate(7, (Date) cliente.getDataEmissao()); // Alterado para setDate
                    sentenca.setString(8, cliente.getNaturalidadeCliente());
                    sentenca.setInt(9, cliente.getIdEstadoCivil());
                    sentenca.setInt(10, cliente.getIdSexo());
                    sentenca.setString(11, cliente.getNomeMae());
                    sentenca.setString(12, cliente.getNomePai());
                    sentenca.setString(13, cliente.getObsCliente());
                    sentenca.setInt(14, cliente.getIdCliente());
                    
                    sentenca.execute();
                }
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM Cliente";
        
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    sentenca.execute();
                }
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void excluirPorID(int id) {
        String sql = "DELETE FROM Cliente WHERE idCliente = ?";
        
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    sentenca.setInt(1, id);
                    
                    sentenca.execute();
                }
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Cliente> consultar() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente ORDER BY idCliente";
        
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet resultadoSentenca = sentenca.executeQuery();
                    
                    while (resultadoSentenca.next()) {
                        Cliente cliente = new Cliente();
                        cliente.setIdCliente(resultadoSentenca.getInt("idCliente"));
                        cliente.setNomeCliente(resultadoSentenca.getString("nomeCliente"));
                        cliente.setCpfCliente(resultadoSentenca.getString("cpfCliente"));
                        cliente.setDataNascimento(resultadoSentenca.getDate("dataNascimento")); // Alterado para getDate
                        cliente.setDocIdentificador(resultadoSentenca.getString("docIdentificador"));
                        cliente.setOrgaoEmissor(resultadoSentenca.getString("orgaoEmissor"));
                        cliente.setUfEmissor(resultadoSentenca.getString("ufEmissor"));
                        cliente.setDataEmissao(resultadoSentenca.getDate("dataEmissao")); // Alterado para getDate
                        cliente.setNaturalidadeCliente(resultadoSentenca.getString("naturalidadeCliente"));
                        cliente.setIdEstadoCivil(resultadoSentenca.getInt("idEstadoCivil"));
                        cliente.setIdSexo(resultadoSentenca.getInt("idSexo"));
                        cliente.setNomeMae(resultadoSentenca.getString("nomeMae"));
                        cliente.setNomePai(resultadoSentenca.getString("nomePai"));
                        cliente.setObsCliente(resultadoSentenca.getString("obsCliente"));
                        
                        listaClientes.add(cliente);
                    }
                }
                this.conexao.getConnection().close();
            }
            
            return listaClientes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public ArrayList<Cliente> consultar(String str) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente WHERE UPPER(nomeCliente) LIKE UPPER(?) ORDER BY nomeCliente";
        
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                    sentenca.setString(1, "%" + str + "%");
                    
                    ResultSet resultadoSentenca = sentenca.executeQuery();
                    
                    while (resultadoSentenca.next()) {
                        Cliente cliente = new Cliente();
                        cliente.setIdCliente(resultadoSentenca.getInt("idCliente"));
                        cliente.setNomeCliente(resultadoSentenca.getString("nomeCliente"));
                        cliente.setCpfCliente(resultadoSentenca.getString("cpfCliente"));
                        cliente.setDataNascimento(resultadoSentenca.getDate("dataNascimento")); // Alterado para getDate
                        cliente.setDocIdentificador(resultadoSentenca.getString("docIdentificador"));
                        cliente.setOrgaoEmissor(resultadoSentenca.getString("orgaoEmissor"));
                        cliente.setUfEmissor(resultadoSentenca.getString("ufEmissor"));
                        cliente.setDataEmissao(resultadoSentenca.getDate("dataEmissao")); // Alterado para getDate
                        cliente.setNaturalidadeCliente(resultadoSentenca.getString("naturalidadeCliente"));
                        cliente.setIdEstadoCivil(resultadoSentenca.getInt("idEstadoCivil"));
                        cliente.setIdSexo(resultadoSentenca.getInt("idSexo"));
                        cliente.setNomeMae(resultadoSentenca.getString("nomeMae"));
                        cliente.setNomePai(resultadoSentenca.getString("nomePai"));
                        cliente.setObsCliente(resultadoSentenca.getString("obsCliente"));
                        
                        listaClientes.add(cliente);
                    }
                }
                this.conexao.getConnection().close();
            }
            
            return listaClientes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author soare
 */
public class Cliente {
    private int idClient;
    private String nomeCliente;
    private String cpfCliente;
    private Date dataNascimento;
    private String docIdentificador;
    private String orgaoEmissor;
    private String ufEmissor;
    private Date dataEmissao;
    private String naturalidadeCliente;
    private int idEstadoCivil;
    private int idSexo;
    private String nomeMae;
    private String nomePai;
    private String obsCliente;
    private int numCadastros;
    private int somaCodigos;
    private int numSexualidade;
    
public Cliente(){
}

public Cliente(String nomeCliente, String cpfCliente, Date dataNascimento,
                   String docIdentificador, String orgaoEmissor, String ufEmissor, Date dataEmissao,
                   String naturalidadeCliente, int idEstadoCivil, int idSexo, String nomeMae, 
                   String nomePai, String obsCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimento = dataNascimento;
        this.docIdentificador = docIdentificador;
        this.orgaoEmissor = orgaoEmissor;
        this.ufEmissor = ufEmissor;
        this.dataEmissao = dataEmissao;
        this.naturalidadeCliente = naturalidadeCliente;
        this.idEstadoCivil = idEstadoCivil;
        this.idSexo = idSexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.obsCliente = obsCliente;
    }
public Cliente(int idClient, String nomeCliente, String cpfCliente, Date dataNascimento,
                   String docIdentificador, String orgaoEmissor, String ufEmissor, Date dataEmissao,
                   String naturalidadeCliente, int idEstadoCivil, int idSexo, String nomeMae, 
                   String nomePai, String obsCliente) {
        this.idClient = idClient;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimento = dataNascimento;
        this.docIdentificador = docIdentificador;
        this.orgaoEmissor = orgaoEmissor;
        this.ufEmissor = ufEmissor;
        this.dataEmissao = dataEmissao;
        this.naturalidadeCliente = naturalidadeCliente;
        this.idEstadoCivil = idEstadoCivil;
        this.idSexo = idSexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.obsCliente = obsCliente;
    }
  public Cliente(int numCadastros, int somaCodigos, int numSexualidade) {
        this.numCadastros = numCadastros;
        this.somaCodigos = somaCodigos; 
        this.numSexualidade = numSexualidade;
    }    

    // Getters e Setters para os atributos

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDocIdentificador() {
        return docIdentificador;
    }

    public void setDocIdentificador(String docIdentificador) {
        this.docIdentificador = docIdentificador;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getUfEmissor() {
        return ufEmissor;
    }

    public void setUfEmissor(String ufEmissor) {
        this.ufEmissor = ufEmissor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNaturalidadeCliente() {
        return naturalidadeCliente;
    }

    public void setNaturalidadeCliente(String naturalidadeCliente) {
        this.naturalidadeCliente = naturalidadeCliente;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getObsCliente() {
        return obsCliente;
    }

    public void setObsCliente(String obsCliente) {
        this.obsCliente = obsCliente;
    }
    public int getTotalCadastros() {
        return numCadastros;
    }

    public void setTotalCadastros(int numCadastros) {
        this.numCadastros = numCadastros;
    }

    public int getSomaCodigos() {
        return somaCodigos;
    }

    public void SetSomaCodigos(int somaCodigos) {
        this.somaCodigos = somaCodigos;
    }

    public int getIdCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdCliente(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}

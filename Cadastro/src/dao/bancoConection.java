/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author soare
 */
public class bancoConection {
    private String servidor;
    private String senha;
    private String banco;
    private String usuario;
    private Connection conexao;
public bancoConection(){
    this.servidor = "200.195.171.122";
    this.usuario = "grupo14";
    this.senha = "1YfQviup0Og2xAtl";
    this.banco = "grupo14_PedroS_Integrador";
}

public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection() {
        return conexao;
    }



}

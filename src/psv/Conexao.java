/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

import java.sql.*;
/**
 *Essa classe vai abrir e fechar conexao com o banco de dados
 * @author User
 */
        
public class Conexao{
//vamos abrir a conexao
    public static Connection abrirConexao() {
        Connection con = null;
    try {
        /*vamos dizer ao java que esse é o driver que ultilizaremos para todas
        as conexoes*/
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        //*criaremos um metodo string que recebera o endereço do banco
        String url = "";
        url += "jdbc:mysql://192.168.0.202/estacionamento?";
        url += "user=root&password=123456";
        //*faremos a conexao e passar o valor para a vaeriavel
        con = DriverManager.getConnection(url);
        System.out.println("Conexao aberta.");
        /*como abrimos um try devemos ter no minimo um catch ou finally para
        encerra-lo
        */
    } catch (SQLException e) {
        System.out.println((e.getMessage()));
    } catch (ClassNotFoundException e){
        System.out.println((e.getMessage()));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return con;
    }
    public static void fecharConexao(Connection con) {
        try{
            con.close();
            System.out.println("Conexao fechada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

import java.sql.*;
import java.util.*;
/**
 *
 * @author User
 */
public class Teste {
    public static void main(String[] args){
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
    /**
    //testando metodo inserir
        cb.setPlaca("RRS0009");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));

    //metodo de alteração no banco
        cb.setPlaca("JKK1901");
        cb.setCor("Vermelho");
        cb.setCor("Vermelho");
        cb.setDescricao("Principal");
        System.out.println(cd.alterar(cb));  
    //metodo de exclusao
        cb.setPlaca("JKK1901");
        System.out.println(cd.excluir(cb));
*/  
    List<CarroBean> lista = cd.listarTodos();
        if(lista!= null){
            for(CarroBean carro : lista){
                System.out.println("Placa: " +carro.getPlaca());
                System.out.println("Cor :" +carro.getCor());
                System.out.println("Descricao: " +carro.getDescricao());
                
            }
        }
        Conexao.fecharConexao(con);
    }    
}
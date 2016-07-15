/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

/**
 *Inserimos o private para que não seja acessados diretamente
 * @author User
 */
public class CarroBean {
    private String placa;
    private String cor;
    private String descricao;
    //inserimos um get e um set para acessar os atributos do private da classe
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
}

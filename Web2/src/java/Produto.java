/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bone
 */
public class Produto {
    public int id;
    public String descricao;
    public String categoria;
    public int quantidade;
    public String fornecedor;
    public String contacto;
    
    public Produto(int id, String descricao, String categoria, int quantidade, String fornecedor, String contacto){
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.contacto = contacto;
    }

}

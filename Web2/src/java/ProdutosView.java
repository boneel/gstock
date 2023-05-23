
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bone
 */
@Named("dtProdutoView")
@ViewScoped
public class ProdutosView implements Serializable{
    private List<Produto> produtos;
    
    @Inject
    private ProdutoServico servico;
    
    @PostConstruct
    public void init(){
        produtos = servico.getProdutos();
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
    
    public void setService(ProdutoServico servico){
        this.servico = servico;
    }
}

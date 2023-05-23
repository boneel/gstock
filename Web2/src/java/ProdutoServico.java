
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
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
@Named
@ViewScoped
public class ProdutoServico {
    
    private List<Produto> produtos;
    
    @PostConstruct
    public void init(){
        produtos = new ArrayList<>();
        
        produtos.add(new Produto(1, "188g Frango", "Carne", 20, "MMA", "847889911"));
        produtos.add(new Produto(1, "5k Pork", "Carne", 10, "MMA", "847889911"));
        produtos.add(new Produto(1, "2k Vaca", "Carne", 25, "MMA", "847889911"));
        produtos.add(new Produto(1, "1k Cabrito", "Carne", 9, "MMA", "847889911"));
    }
    
    public List<Produto> getProdutos(){
        return new ArrayList<>(produtos);
    }
    
    
}

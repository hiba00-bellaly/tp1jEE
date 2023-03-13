package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Produit;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
@Component("dao")
@Data @AllArgsConstructor

public class ProduitDao implements IProduitDao <Produit, Integer> {
    public static Set<Produit> BdProduit(){
        return new HashSet<Produit>(
                Arrays.asList(
                      new Produit(1,15,12,14,"ecran"),
                        new Produit(2,18,5,15,"cerave"),
                        new Produit(3,14,3,17, "vichi")


                ));
}

    @Override
    public Produit trouverParId(Integer id) {
        return BdProduit().stream().filter(produit -> produit.getId()== id).findFirst().orElse(null);




    }


}

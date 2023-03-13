package metier;

import dao.IProduitDao;
import dao.ProduitDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("metier")


@Data @AllArgsConstructor @RequiredArgsConstructor

public class ProduitMetier implements IProduitMetier {
    @Autowired
    @Qualifier("dao")
 private ProduitDao produitDao;






    public  Integer calculer_Produit(Integer id)throws Exception {
        var produit = produitDao.trouverParId(id);
        Integer PrixTTC;
        if (produit == null)
            throw new Exception("l id est introuvable");
        else {
            Integer margeDeBinifice = produit.getMargeBinifice();
            Integer prix = produit.getPrixUnitaire();

            PrixTTC = (prix * 20 / 100) + margeDeBinifice;


        }
        return PrixTTC;

    }





        }









package model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Produit {
    private Integer id;
    private Integer prixUnitaire;

    private Integer margeBinifice;


    private int quantite;
    private String description;







    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", prix=" + prixUnitaire +
                ", description='" + description + '\'' +
                '}';
    }




}

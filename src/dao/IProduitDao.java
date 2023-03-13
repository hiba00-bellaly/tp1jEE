package dao;

public interface IProduitDao<P, ID> {

    P trouverParId(ID id);


}

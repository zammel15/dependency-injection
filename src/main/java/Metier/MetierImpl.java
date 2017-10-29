package Metier;

import dao.IDo;

public class MetierImpl implements IMetier {

    private IDo dao = null;

    public void setDao(IDo dao) {
        this.dao = dao;
    }

    public double calcul() {
        double nb = dao.getvalue() ;
        return nb * 6 ;
    }
}

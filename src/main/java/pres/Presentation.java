package pres;

import Metier.MetierImpl;
import dao.DaoImp;

public class Presentation {

    public static void main(String[] args){
        //ici je faut l'injection de dependance ;
        DaoImp dao = new DaoImp();
        MetierImpl metier = new MetierImpl() ;
        metier.setDao(dao);

        System.out.println(metier.calcul());
    }
}

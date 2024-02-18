package presentation;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetierImpl;

public class PresStatic {
    public static void main(String[] args) {

        IDao dao = new IDaoImpl();
        IMetierImpl metier = new IMetierImpl(dao);
        metier.setDao(dao);
        System.out.println("Res = " + metier.calcul());

    }
}

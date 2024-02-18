package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PresDynamic {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));

            String IdaoClassname = scanner.nextLine();
            Class cDao = Class.forName(IdaoClassname);
            IDao Dao = (IDao) cDao.getConstructor().newInstance();

            String ImetieClassname = scanner.nextLine();
            Class cMetier = Class.forName(ImetieClassname);
            IMetier Metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(Dao);

            System.out.println(Metier.calcul());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

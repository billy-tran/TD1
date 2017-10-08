package fr.univ_amu.iut.exo4;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {

        LocalDate dateEmploiEmploye1 = LocalDate.of(2001, Month.JANUARY,1);
        LocalDate dateEmploiEmploye2 = LocalDate.of(2002,Month.FEBRUARY,2);
        LocalDate dateEmploiEmploye3 = LocalDate.of(2003,Month.MARCH,3);
        LocalDate dateEmploiEmploye4 = LocalDate.of(2004,Month.APRIL,4);

        LocalDate dateNaissanceEmploye1 = LocalDate.of(1975,Month.MAY,5);
        LocalDate dateNaissanceEmploye2 = LocalDate.of(1976,Month.JUNE,6);
        LocalDate dateNaissanceEmploye3 = LocalDate.of(1977, Month.JULY, 7);
        LocalDate dateNaissanceEmploye4 = LocalDate.of(1978,Month.SEPTEMBER,8);

        Employe monEmploye1 = new Employe(1,11,"nom1","prenom1",1,dateNaissanceEmploye1,dateEmploiEmploye1,1,35);
        Employe monEmploye2 = new Employe(2,12,"nom2","prenom2",1,dateNaissanceEmploye2,dateEmploiEmploye2,2,36);
        Employe monEmploye3 = new Employe(3,13,"nom3","prenom3",1,dateNaissanceEmploye3,dateEmploiEmploye3,3,37);
        Employe monEmploye4 = new Employe(4,14,"nom4","prenom4",1,dateNaissanceEmploye4,dateEmploiEmploye4,4,38);

        Entreprise maBoiteInfo = new Entreprise ("maBoiteInfo");

        maBoiteInfo.ajouterEmploye(monEmploye1);
        maBoiteInfo.ajouterEmploye(monEmploye2);
        maBoiteInfo.ajouterEmploye(monEmploye3);
        maBoiteInfo.ajouterEmploye(monEmploye4);

        maBoiteInfo.sauvegarderDansUnFichier("fichierTest");
        maBoiteInfo.lireUnFichier("fichierTest");
    }
}
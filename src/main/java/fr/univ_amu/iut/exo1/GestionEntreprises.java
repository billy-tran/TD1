package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {

        LocalDate dateEmploi = LocalDate.of(2017, Month.OCTOBER,5);
        LocalDate dateNaissance = LocalDate.of(2003, Month.MARCH,1);
        Employe bibi = new Employe(13,14, "Jean", "Pierre", 13, dateNaissance , dateEmploi,15,15 );
        Employe jiji = new Employe(13,14, "Jean", "Pierre", 13, dateNaissance , dateEmploi,15,15 );
        Entreprise maBoiteInfo = new Entreprise("NomMaBoiteInfo");
        maBoiteInfo.ajouterEmploye(bibi,dateEmploi);
        maBoiteInfo.ajouterEmploye(jiji,dateEmploi);
        System.out.print(maBoiteInfo.toString());

    }
}


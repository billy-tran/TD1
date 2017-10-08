package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {

        LocalDate dateEmploi = LocalDate.of(2017, Month.OCTOBER,5);
        LocalDate dateNaissance1 = LocalDate.of(2003, Month.MARCH,1);
        LocalDate dateNaissance2 = LocalDate.of(1999, Month.APRIL,26);
        Employe bibi = new Employe(13,14, "Jean", "Pierre", 13, dateNaissance1 , dateEmploi,15,15 );
        Employe jiji = new Employe(12,14, "Jean", "Pierre", 13, dateNaissance2 , dateEmploi,15,15 );
        Entreprise maBoiteInfo = new Entreprise("NomMaBoiteInfo");
        maBoiteInfo.ajouterEmploye(bibi);
        maBoiteInfo.ajouterEmploye(jiji);
        Employe monEmployeOrdinaire = new EmployeOrdinaire(1, 12,"Paul","Ordinaire",4, dateNaissance1, dateEmploi, 2, 35);
        Employe monEmployeRepresentant = new Representant(2, 13,"Paul","Representant",4, dateNaissance1, dateEmploi, 35,35,10000,10);
        Employe monEmployeCommercial = new Commercial(3, 14,"Paul","Commercial",4, dateNaissance1, dateEmploi, 35,35,10000,10);
        Employe monEmployeVendeur = new Vendeur(4, 15,"Paul","Vendeur",4, dateNaissance1, dateEmploi, 35,35,10000,10);
        Employe monEmployeTechnicien = new Technicien(5, 16,"Paul","Baba",4, dateNaissance1, dateEmploi, 35,35,10000,10);
        System.out.print(maBoiteInfo.toString());
        System.out.print("Salaire employe ordinaire brut puis net =" +monEmployeOrdinaire.getSalaireBrut() + " " + monEmployeOrdinaire.getSalaireNet()+"\n");
        System.out.print("Salaire representant brut puis net =" + monEmployeRepresentant.getSalaireBrut()+  " " + monEmployeRepresentant.getSalaireNet()+"\n");
        System.out.print("Salaire commercial brut puis net =" + monEmployeCommercial.getSalaireBrut()+  " " + monEmployeCommercial.getSalaireNet()+"\n");
        System.out.print("Salaire vendeur brut puis net =" + monEmployeVendeur.getSalaireBrut()+ " " + monEmployeVendeur.getSalaireNet()+"\n");
        System.out.print("Salaire technicien brut puis net =" + monEmployeTechnicien.getSalaireBrut()+ " " + monEmployeTechnicien.getSalaireNet()+"\n");
    }
}


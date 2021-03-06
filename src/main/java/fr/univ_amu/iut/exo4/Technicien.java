package fr.univ_amu.iut.exo4;

import java.time.LocalDate;

public class Technicien extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public void fabriquerProduit()
    {
        System.out.print("Je fabrique un produit");
    }

    public double getSalaireBrut()
    {
        return super.getSalaireBrut()+ nbUnitesProduites*tauxCommissionUnite;
    }



    public Technicien(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures);
        this.nbUnitesProduites=nbUnitesProduites;
        this.tauxCommissionUnite=tauxCommissionUnite;

    }
}
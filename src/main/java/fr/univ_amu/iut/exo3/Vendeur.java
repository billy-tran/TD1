package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class Vendeur extends Commercial {

    public double getSalaireBrut()
    {
        return super.getSalaireBrut();
    }


    public Vendeur(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}
package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

/**
 * Created by t16000367 on 05/10/17.
 */
public class Vendeur extends Commercial {

    public double getSalaireBrut()
    {
        return super.getSalaireBrut();
    }


    public Vendeur(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}

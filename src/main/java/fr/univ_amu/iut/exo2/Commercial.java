package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

/**
 * Created by t16000367 on 05/10/17.
 */
public class Commercial extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;

    public void negocierTransaction()
    {
        System.out.print("Je négocie une transaction");
    }

    public double getSalaireBrut()
    {
        return super.getBase() + chiffreAffaires*tauxCommission;
    }




    public Commercial(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures,double chiffreAffaires, double tauxCommission) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures);
        this.chiffreAffaires=chiffreAffaires;
        this.tauxCommission=tauxCommission;
    }
}

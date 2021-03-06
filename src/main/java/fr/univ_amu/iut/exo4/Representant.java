package fr.univ_amu.iut.exo4;

import java.time.LocalDate;

public class Representant extends Commercial {

    public double getSalaireBrut()
    {
        EmployeOrdinaire monEmploye = new EmployeOrdinaire(0,0,"dqfqd","dqkljmd",0,null,null,getBase(),getNbHeures());
        return monEmploye.getSalaireBrut();

    }


    public Representant(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}
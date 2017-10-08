package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Employe
{
    private int numeroEmploye;
    private int numeroSecurite;
    private String nom;
    private String prenom;
    int echellon;
    private LocalDate dateNaissance;
    private LocalDate dateEmploi;
    private double base;
    private double nbHeures;

    public Employe(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures) {
        this.numeroEmploye = numeroEmploye;
        this.numeroSecurite = numeroSecurite;
        this.nom = nom;
        this.prenom = prenom;
        this.echellon = echellon;
        this.dateNaissance = dateNaissance;
        this.dateEmploi = dateEmploi;
        this.base = base;
        this.nbHeures = nbHeures;
    }
    @Override
    public String toString() {
        double salaireBrut=base*nbHeures;
        return "Employe{" +
                "numeroEmploye=" + numeroEmploye +
                ", numeroSecurite=" + numeroSecurite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echellon=" + echellon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmploi=" + dateEmploi +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", salaire brut=" + this.getSalaireBrut() +
                ", salaire net=" + this.getSalaireNet()+
                '}';
    }


    //Afin d'augmenter le salaire brut de chacun des employés de 100 €, il faudra faire +100 au return base*nbHeures

    public double getSalaireBrut()
    {
        return base*nbHeures;
        //return base*nbHeures+100;
    }

    public double getSalaireNet()
    {
        return this.getSalaireBrut()*0.8;
    }

    public int getEchellon() {
        return echellon;
    }

    public double getBase() {
        return base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public void setDateEmploi(LocalDate dateEmploi) {
        this.dateEmploi = dateEmploi;
    }

}


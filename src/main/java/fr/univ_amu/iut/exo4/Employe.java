package fr.univ_amu.iut.exo4;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

public class Employe implements Serializable{

    private int numeroEmploye;
    private int numeroSecurite;
    private String nom;
    private String prenom;
    int echellon;
    private transient LocalDate dateNaissance;
    private transient LocalDate dateEmploi;
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

    public LocalDate getDateEmploi() {
        return dateEmploi;
    }

    public void sauvegarder(DataOutput str) throws IOException
    {
        str.writeInt(numeroEmploye);
        str.writeInt(numeroSecurite);
        str.writeUTF(nom);
        str.writeUTF(prenom);
        str.writeInt(echellon);
        str.writeDouble(base);
        str.writeDouble(nbHeures);
    }

    public void lire (DataInputStream str) throws IOException
    {
        numeroEmploye=str.readInt();
        numeroSecurite=str.readInt();
        nom=str.readUTF();
        prenom=str.readUTF();
        echellon=str.readInt();
        base=str.readDouble();
        nbHeures=str.readDouble();
    }
}
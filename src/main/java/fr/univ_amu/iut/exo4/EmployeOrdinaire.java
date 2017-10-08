package fr.univ_amu.iut.exo4;
import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {

    public void effectuerTacheOrdinaire()
    {
        System.out.print("J'effectue une tâche ordinaire");
    }

    public EmployeOrdinaire(int numeroEmploye, int numeroSecurite, String nom, String prenom, int echellon, LocalDate dateNaissance, LocalDate dateEmploi, double base, double nbHeures) {
        super(numeroEmploye, numeroSecurite, nom, prenom, echellon, dateNaissance, dateEmploi, base, nbHeures);
    }

    public double getSalaireBrut()
    {
        return super.getSalaireBrut()+this.getEchellon()*100;    }

}
package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Entreprise
{
    private String nomEntreprise;
    private List<Employe> listeEmploye;

    public void setNomEntreprise(String nouveauNomEntreprise)
    {
        nomEntreprise = nouveauNomEntreprise;
    }

    public void ajouterEmploye(Employe employeAjoute, LocalDate dateEmploi)
    {
        employeAjoute.setDateEmploi(dateEmploi);
        listeEmploye.add(employeAjoute);
    }

    public void licencierEmploye(Employe employeLicencie)
    {
        listeEmploye.remove(employeLicencie);
    }

    public Entreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        this.listeEmploye = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nomEntreprise='" + nomEntreprise + '\'' +
                ", listeEmploye=" + listeEmploye +
                '}';
    }
}

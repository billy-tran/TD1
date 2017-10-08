package fr.univ_amu.iut.exo3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Entreprise
{
    private String nomEntreprise;
    private List<Employe> listeEmploye;

    public void setNomEntreprise(String nouveauNomEntreprise)
    {
        nomEntreprise = nouveauNomEntreprise;
    }

    public void ajouterEmploye(Employe employeAjoute)
    {
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

    public void distribuerBonus(long bonusTotal)
    {
        PriorityQueue<Employe> listeEnFonctionAnciennete = new PriorityQueue<Employe>(10, new ComparatorAnciennete());
        for(int i=0; i<listeEmploye.size();++i)
        {
            listeEnFonctionAnciennete.add(listeEmploye.get(i));
        }

        while(bonusTotal>0)
        {
            Employe employeTemporaire = listeEnFonctionAnciennete.poll();
            long bonus = ChronoUnit.MONTHS.between(employeTemporaire.getDateEmploi(),LocalDate.now())*10;
            if(bonusTotal-bonus<=0)
            {
            bonus = bonusTotal;
            bonusTotal=0;

            }
            else
                bonusTotal=bonusTotal-bonus;
            System.out.print(employeTemporaire.toString() + " bonus reçu = " + bonus + "\n");
            if(listeEnFonctionAnciennete.isEmpty())
                break;

        }
    }

}

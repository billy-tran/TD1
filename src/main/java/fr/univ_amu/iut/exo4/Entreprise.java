package fr.univ_amu.iut.exo4;

import javax.xml.crypto.Data;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Entreprise {
    private String nomEntreprise;
    private List<Employe> listeEmploye;

    public void setNomEntreprise(String nouveauNomEntreprise) {
        nomEntreprise = nouveauNomEntreprise;
    }

    public void ajouterEmploye(Employe employeAjoute) {
        listeEmploye.add(employeAjoute);
    }

    public void licencierEmploye(Employe employeLicencie) {
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

    public void distribuerBonus(long bonusTotal) {
        PriorityQueue<Employe> listeEnFonctionAnciennete = new PriorityQueue<Employe>(10, new ComparatorAnciennete());
        for (int i = 0; i < listeEmploye.size(); ++i) {
            listeEnFonctionAnciennete.add(listeEmploye.get(i));
        }

        while (bonusTotal > 0) {
            Employe employeTemporaire = listeEnFonctionAnciennete.poll();
            long bonus = ChronoUnit.MONTHS.between(employeTemporaire.getDateEmploi(), LocalDate.now()) * 10;
            if (bonusTotal - bonus <= 0) {
                bonus = bonusTotal;
                bonusTotal = 0;

            } else
                bonusTotal = bonusTotal - bonus;
            System.out.print(employeTemporaire.toString() + " bonus reçu = " + bonus + "\n");
            if (listeEnFonctionAnciennete.isEmpty())
                break;

        }
    }

    public void sauvegarderDansUnFichier(String nomFichier)
    {
        System.out.print("sauvegarde \n");
        DataOutputStream sortie = null;
        try {
            sortie = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nomFichier)));
            for (Employe employeTemporaire : listeEmploye) {
                employeTemporaire.sauvegarder(sortie);
            }
            sortie.close();
        }catch(IOException e)
        {
            e.printStackTrace();
            new File(nomFichier).delete();
        }
    }

    public void lireUnFichier(String nomFichier)
    {
        System.out.print("lecture \n");
        DataInputStream entree = null;
        try
        {
            entree = new DataInputStream(new BufferedInputStream(new FileInputStream(nomFichier)));
            try {
                for (Employe employeTemporaire : listeEmploye) {
                    employeTemporaire.lire(entree);
                }
            }
            catch (EOFException e) {
                System.out.println("On a recupéré " + listeEmploye.size() + " employés");
            }
            entree.close();
            }catch (IOException e )
        {
            e.printStackTrace();
        }
            }

}



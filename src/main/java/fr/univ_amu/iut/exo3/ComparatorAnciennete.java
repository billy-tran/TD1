package fr.univ_amu.iut.exo3;

import java.util.Comparator;

public class ComparatorAnciennete implements Comparator<Employe> {
    @Override
    public int compare(Employe employe1, Employe employe2) {

        return employe1.getDateEmploi().compareTo(employe2.getDateEmploi());

    }
}

package main.java.comparators;

import main.java.family.Family;

import java.util.Comparator;

public class FamilyTitleComparator implements Comparator<Family> {
    @Override
    public int compare(Family family1, Family family2) {
        return Integer.compare(0, family1.getTitle().compareTo(family2.getTitle()));
    }
}

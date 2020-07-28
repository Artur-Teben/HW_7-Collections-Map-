package main.java.comparators;

import main.java.family.Family;

import java.util.Comparator;

public class FamilyNameOfEmblemComparator implements Comparator<Family> {
    @Override
    public int compare(Family family1, Family family2) {
        return family1.getNameOfEmblem().length() - family2.getNameOfEmblem().length();
    }
}

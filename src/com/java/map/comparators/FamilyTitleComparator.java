package com.java.map.comparators;

import com.java.map.family.Family;

import java.util.Comparator;

public class FamilyTitleComparator implements Comparator<Family> {
    @Override
    public int compare(Family family1, Family family2) {
        if (family1.getTitle().compareTo(family2.getTitle()) == 0) {
            return 0;
        } else if (family1.getTitle().compareTo(family2.getTitle()) > 0) {
            return -1;
        } else
            return 1;
    }
}

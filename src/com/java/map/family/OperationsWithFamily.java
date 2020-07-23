package com.java.map.family;

import com.java.map.comparators.FamilyNameOfEmblemComparator;
import com.java.map.comparators.FamilyTitleComparator;

import java.util.*;

public class OperationsWithFamily {

    public HashMap<String, Family> initFamilyMap() {
        Family family1 = new Family("Targaryens", "Three-headed red dragon", "Flame and blood!", 7);
        Family family2 = new Family("Starks", "Direwolf", "Winter is coming", 13);
        Family family3 = new Family("Lannisters", "Golden lion", "A Lannister Always Pays His Debts", 11);
        Family family4 = new Family("Tyrells", "Golden rose", "Growing strong", 7);
        Family family5 = new Family("Greyjoys", "Golden kraken", "What Is Dead May Never Die", 6);
        Family family6 = new Family("Tullys", "Silver trout", "Family, Duty, Honor", 8);
        Family family7 = new Family("Arryns", "White falcon", "As High as Honor", 5);
        Family family8 = new Family("Baratheons", "Crowned black stag", "Ours is the Fury", 4);
        Family family9 = new Family("Martells", "Red sun pierced by a gold spear", "Unbowed, Unbent, Unbroken", 7);
        Family family10 = new Family("Freys", "The two stone grey towers and bridge of the Twins", "We Stand Together", 11);

        HashMap<String, Family> familyMap = new HashMap<>();
        familyMap.put(family1.getName(), family1);
        familyMap.put(family2.getName(), family2);
        familyMap.put(family3.getName(), family3);
        familyMap.put(family4.getName(), family4);
        familyMap.put(family5.getName(), family5);
        familyMap.put(family6.getName(), family6);
        familyMap.put(family7.getName(), family7);
        familyMap.put(family8.getName(), family8);
        familyMap.put(family9.getName(), family9);
        familyMap.put(family10.getName(), family10);
        return familyMap;
    }

    public Map<String, Family> sortName(HashMap<String, Family> familyMap) {
        List<Family> list = new ArrayList<>(familyMap.values());
        Collections.sort(list);
        return toMap(list);
    }

    public Map<String, Family> sortNameOfEmblem(HashMap<String, Family> familyMap) {
        List<Family> list = new ArrayList<>(familyMap.values());
        list.sort(new FamilyNameOfEmblemComparator());
        return toMap(list);
    }

    public Map<String, Family> sortTitleDesc(HashMap<String, Family> familyMap) {
        List<Family> list = new ArrayList<>(familyMap.values());
        list.sort(new FamilyTitleComparator());
        return toMap(list);
    }
    
    public void printMapFamily(Map<String, Family> familyMap) {
        for (Map.Entry m: familyMap.entrySet()) {
            String key = String.format("%-10s", m.getKey());
            System.out.println(key + " " + m.getValue());
        }
        System.out.println(" ");
    }

    private Map<String, Family> toMap(List<Family> families) {
        final Map<String, Family> treeMap = new LinkedHashMap<>();
        for (final Family family : families) {
            treeMap.put(family.getName(), family);
        }
        return treeMap;
    }
}

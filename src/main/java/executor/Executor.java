package main.java.executor;

import main.java.family.Family;
import main.java.family.OperationsWithFamily;
import main.java.numbers.OperationsWithNumbers;

import java.util.*;

public class Executor {
    public void execute() {

        OperationsWithNumbers opr = new OperationsWithNumbers();
        String nums = opr.dataInput();
        List<Integer> list = opr.removeSimilarNumbers(nums);
        System.out.println(list);

        OperationsWithFamily oprWithFmly = new OperationsWithFamily();
        HashMap<String, Family> familyMap = oprWithFmly.initFamilyMap();

        System.out.println(String.format("%93s", "INITIALIZED FAMILIES"));
        oprWithFmly.printMapFamily(familyMap);

        System.out.println(String.format("%95s", "FAMILIES SORTED BY NAME"));
        oprWithFmly.printMapFamily(oprWithFmly.sortName(familyMap));

        System.out.println(String.format("%95s", "FAMILIES SORTED BY TITLE"));
        oprWithFmly.printMapFamily(oprWithFmly.sortTitleDesc(familyMap));

        System.out.println(String.format("%100s", "FAMILIES SORTED BY NAME OF EMBLEM "));
        oprWithFmly.printMapFamily(oprWithFmly.sortNameOfEmblem(familyMap));
    }
}

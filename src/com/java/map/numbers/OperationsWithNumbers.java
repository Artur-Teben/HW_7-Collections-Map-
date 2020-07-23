package com.java.map.numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperationsWithNumbers {
    public String dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers into a line separating with a comma");
        return scanner.nextLine();
    }
    public Set<String> removeSimilarNumbers(String nums) {
        return new HashSet<>(Arrays.asList(nums.split(",")));
    }
}

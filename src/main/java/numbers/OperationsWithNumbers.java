package main.java.numbers;

import java.util.*;
import java.util.stream.Collectors;

public class OperationsWithNumbers {
    public String dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers into a line separating with a spacebar");
        return scanner.nextLine();
    }

    public List<Integer> removeSimilarNumbers(String nums) {
        List<String> strList = new ArrayList<>(Arrays.asList(nums.split(" ")));
        return strList.stream()
                .map(Integer::valueOf)
                .distinct()
                .collect(Collectors.toList());
    }
}

//Print the cubes of odd numbers

import java.util.List;

public class FP05Exercise {

    public static void main(String[] args) {

        printCubeOfOddNumbers(List.of(2, 4, 47, 65, 646, 8, 68546,5,6514,65465,85,86,65,898,68,74));
    }

    private static void printCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 != 0)
                .map(number -> number*number*number)
                .forEach(System.out::println);
    }
}


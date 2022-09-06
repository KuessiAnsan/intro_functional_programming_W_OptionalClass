//Print only odd numbers from the list


import java.util.List;

public class FP01Exercise {

    public static void main(String[] args) {

        printOnlyOddNumbers(List.of(2, 4, 47, 65, 646, 8, 68546,5,6514,65465,85,86,65,898,68,74));
    }

    private static void printOnlyOddNumbers(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2 != 0)
                .forEach(System.out::println);
    }
}

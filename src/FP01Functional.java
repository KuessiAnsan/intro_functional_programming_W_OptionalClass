import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {


        //printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        //printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        //printSquareOfNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
//        printSquareOfEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printSquareOfOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

    }

    private static void printSquareOfOddNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2 != 0)
                .map(number->number*number)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2 == 0)
                .map(number -> number*number)
                .forEach(System.out::println);

    }

    private static void printSquareOfNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);

    }


//    private static boolean isEven(int number){
  //      return number%2 == 0;
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //For each function to loop and print the elements

//        for (int number:
//             numbers) {
//            System.out.println(number);
//        }

        numbers.stream()
                .forEach(System.out::println);

    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //For each function to loop and print the elements

//        for (int number:
//             numbers) {
//            System.out.println(number);
//        }



        numbers.stream()

                //.filter(FP01Functional::isEven) //Filter - Only allow Even Numbers

                .filter(number -> number %2 == 0) //LAMBDA EXPRESSION
                .forEach(System.out::println);
    }
}

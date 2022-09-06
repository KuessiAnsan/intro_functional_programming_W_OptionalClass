import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {
    private static Predicate<? super String> predicate;


    public static void main(String[] args) {

        List<String>fruits = List.of("Orange","Banana","Mango");

        predicate = fruit -> fruit.startsWith("B");

        Optional<String> optional = fruits.stream().filter(predicate).findFirst();

        //METHODS OF OPTIONAL

        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

    }
}

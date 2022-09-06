//Print Courses Containing the word "Spring"


import java.util.List;

public class FP03Exercise {

    public static void main(String[] args) {

        printCoursesContainingSpring(List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printCoursesContainingSpring(List<String> courses) {

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }


}

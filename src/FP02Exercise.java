//Print all courses individually

import java.util.List;

public class FP02Exercise {

    public static void main(String[] args) {

        printAllCoursesIndividually(List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printAllCoursesIndividually(List<String> courses) {

        courses.stream()
                .forEach(System.out::println);
    }
}

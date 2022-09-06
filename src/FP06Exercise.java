//Print the number of characters in each course name

import java.util.List;

public class FP06Exercise {
    public static void main(String[] args) {

        printAllCoursesIndividually(List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printAllCoursesIndividually(List<String> courses) {

        courses.stream()
                .map(course -> course + "'s size => "+course.length())
                .forEach(System.out::println);
    }
}

//Print Courses Whose Name has at least 4 letters

import java.util.List;

public class FP04Exercise {

    public static void main(String[] args) {
        printAllCoursesThatHasAtLeastFoursLetters(List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printAllCoursesThatHasAtLeastFoursLetters(List<String> courses) {

        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);
    }
}

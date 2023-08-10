package ClassesExercises;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double circleRadius = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * circleRadius * circleRadius;
        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}

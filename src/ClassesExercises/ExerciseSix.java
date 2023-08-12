package ClassesExercises;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapeze, square, rectangle;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = A * C / 2;
        circle = 3.14159 * C * C;
        trapeze = (A + B) / 2 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGLES: %.3f%nCIRCLE: %.3f%nTRAPEZE: %.3f%nSQUARE: %.3f%nRECTANGLE: %.3f%n"
                , triangle, circle, trapeze, square, rectangle);

        sc.close();
    }
}

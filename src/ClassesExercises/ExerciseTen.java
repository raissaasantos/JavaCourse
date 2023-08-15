package ClassesExercises;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int duration;

        if (start < end) {
            duration = end - start;
        }
        else {
            duration = 24 - start + end;
        }

        System.out.println("The game lasted "+ duration +" hour(s)");

        sc.close();
    }
}

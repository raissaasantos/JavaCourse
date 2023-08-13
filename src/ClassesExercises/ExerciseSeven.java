package ClassesExercises;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0){
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("NOT NEGATIVE");
        }

    }
}

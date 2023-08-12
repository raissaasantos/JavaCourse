package ClassesExercises;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code1, code2, qt1, qt2;
        double price1, price2, payment;

        code1 = sc.nextInt();
        qt1 = sc.nextInt();
        price1 = sc.nextDouble();

        code2 = sc.nextInt();
        qt2 = sc.nextInt();
        price2 = sc.nextDouble();

        payment = price1 * qt1 + price2 * qt2;

        System.out.printf("TOTAL: R$ %.2f%n", payment);

        sc.close();

    }
}

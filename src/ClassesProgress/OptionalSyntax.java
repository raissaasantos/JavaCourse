package ClassesProgress;

import java.util.Scanner;

public class OptionalSyntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();
        double bill = 50.0;

        if (minutes > 100) {
            bill += (minutes - 100) * 2.0;
        }

        System.out.printf("Bill = R$ %.2f%n", bill);

        sc.close();

    }
}

// a += b;
// same as
// a = a + b;
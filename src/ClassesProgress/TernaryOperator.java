package ClassesProgress;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(discount);

        sc.close();
    }
}


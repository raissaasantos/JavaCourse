package ClassesProgress;

public class ScopeAndInitialization {
    public static void main(String[] args) {

        double price = 400.0;
        double discount;

        if (price < 200.00) {
            double discount = price * 0.1;
        }
        else {
            discount = 0;
        }

        System.out.println(discount);

    }
}

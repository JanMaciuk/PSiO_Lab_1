public class Main {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 6.0;
        double c = 4.0;
        double delta = Math.pow(b,2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta))/(2 * a);
        double x2 = (-b - Math.sqrt(delta))/(2 * a);
        System.out.println("Delta: " + delta);

        if (delta >= 0) {
            // jeżeli delta == 0, to obydwa pierwiastki są identyczne, ale i tak je zwracamy
            System.out.println("Pierwiastek pierwszy: " + x1);
            System.out.println("Pierwiastek drugi: " + x2);
        }
        else {
            System.out.println("Brak pierwiastków rzeczywistych");
        }

    }
}
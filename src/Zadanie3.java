public class Zadanie3 {
    public static void main(String[] args) {
        double a = 43;
        double b = 7;
        double dzielnik = 1;
        if (a <= 0 || b <= 0) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        if ((a != (int)a) || (b != (int)b)) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        for (int i = 1; ((i <= b) && (i <= a)); i++) {
            if (a%i == 0 && b%i ==0) { dzielnik = i; }
        }
        System.out.println("Największy wspólny dzielnik: "+ dzielnik);
    }
}

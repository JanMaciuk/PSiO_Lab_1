public class Zadanie3 {
    public static void main(String[] args) {
        double a = 3;
        double b = 9;
        double dzielnik = 1;
        // zakładamy że 0 nie jest liczbą naturalną, więc nie sprawdzamy czy jest tu 0
        for (int i = 1; ((i <= b) && (i <= a)); i++) {
            if (a%i == 0 && b%i ==0) { dzielnik = i; }
        }
        System.out.println("Największy wspólny dzielnik: "+ dzielnik);
    }
}

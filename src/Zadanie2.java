public class Zadanie2 {
    public static void main(String[] args) {

        double a = 3;
        double b = 5;
        double c = 9;

        if (a < b) {
            if (a < c) {
                if (b < c) { System.out.println("Posortowane wartości: "+a+", "+b+", "+c); }
                else { System.out.println("Posortowane wartości: "+a+", "+c+", "+b); }
            } else { System.out.println("Posortowane wartości: "+c+", "+a+", "+b); }

        } else {
            if (b < c) {
                if (a < c) { System.out.println("Posortowane wartości: "+b+", "+a+", "+c);  }
                else { System.out.println("Posortowane wartości: "+b+", "+c+", "+a); }
            } else { System.out.println("Posortowane wartości: "+c+", "+b+", "+a); }
        }

    }}

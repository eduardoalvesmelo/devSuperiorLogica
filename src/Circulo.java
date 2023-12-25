import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        double PI = 3.14159;
        return PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double circulo1 = sc.nextDouble();

        Circulo circulo = new Circulo(circulo1);
        System.out.printf("AREA = %.3f", circulo.getArea());
    }
}

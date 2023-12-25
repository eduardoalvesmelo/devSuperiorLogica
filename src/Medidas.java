import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    private double a;
    private double b;
    private double c;

    public Medidas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getQuadrado() {
        return Math.pow(a, 2);
    }

    public double getTriangulo() {
        return a * b / 2;
    }

    public double getTrapezio() {
        return ((a + b) * c) / 2;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();

        System.out.print("Digite a medida B:: ");
        double b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        Medidas medidas = new Medidas(a, b, c);
        System.out.printf("AREA DO QUADRADO = %.4f\n",medidas.getQuadrado());
        System.out.printf("AREA DO TRIANGULO = %.4f\n",medidas.getTriangulo());
        System.out.printf("AREA DO TRAPEZIO = %.4f",medidas.getTrapezio());
    }
}

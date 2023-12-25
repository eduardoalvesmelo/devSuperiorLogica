import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return 2 * (base + altura);
    }

    public double getDiagonal(){
        double baseQ = Math.pow(base, 2);
        double alturaQ = Math.pow(altura, 2);
        double diagonal = Math.sqrt(baseQ+alturaQ);
        return diagonal;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);
        System.out.printf("AREA: %.4f\n", retangulo.getArea());
        System.out.printf("PERIMETRO: %.4f\n", retangulo.getPerimetro());
        System.out.printf("DIAGONAL: %.4f\n", retangulo.getDiagonal());
    }
}

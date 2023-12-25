import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    private double largura;
    private double comprimento;
    private double valorMetro;

    public Terreno() { }

    public Terreno(double largura, double comprimento, double valorMetro) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetro = valorMetro;
    }

    public double getArea () {
        return largura * comprimento;
    }

    public double getVlrTotal () {
        return valorMetro * getArea();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetro = sc.nextDouble();

        Terreno terreno = new Terreno(largura,comprimento,valorMetro);
        System.out.printf("Digite o valor do metro quadrado: %.2f\n", terreno.getArea());
        System.out.printf("Digite o valor do metro quadrado: %.2f", terreno.getVlrTotal());
    }
}

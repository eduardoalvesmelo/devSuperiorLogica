import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    private int distancia;
    private double combustivelGasto;

    public Consumo(int distancia, double combustivelGasto) {
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public double getConsumoMedio() {
        return distancia/combustivelGasto;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        Consumo consumo = new Consumo(distancia, combustivel);
        System.out.printf("Consumo medio = %.3f",consumo.getConsumoMedio());
    }
}

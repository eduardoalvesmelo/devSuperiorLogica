import java.util.Locale;
import java.util.Scanner;

public class Soma {
    private int x;
    private int y;

    public Soma(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSoma(){
        return x + y;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        Soma soma = new Soma(x,y);
        System.out.printf("SOMA = %d", soma.getSoma());
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int dur = sc.nextInt();

        int hor = dur / 3600;
        int min = (dur % 3600) / 60;
        int seg = dur % 60;
        System.out.printf("%d:%d:%d", hor, min, seg);
    }
}

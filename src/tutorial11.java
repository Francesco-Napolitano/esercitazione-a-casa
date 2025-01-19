import java.util.Objects;
import java.util.Scanner;

public class tutorial11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
//        boolean isOnline = true;
        if (nome.equals("Luca")) System.out.println("è Luca");
        else if (nome.equals("Armando")) System.out.println("si chiama Armando");
        else System.out.println("è sconosciuto");
//        System.out.println("Un blocco di codice saltato");


        int num = 20;
        if (num < 10) {
            System.out.println("è minore di 10");

            if (num % 2 == 0) System.out.println("è pari");
            else System.out.println("è dispari");

        } else System.out.println("non è minore di 10");

        String x = 3 == 10 ? "Ciao" : "Buongiorno";
        System.out.println(x);
    }
}

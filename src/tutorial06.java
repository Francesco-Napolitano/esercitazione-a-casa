import java.util.Scanner;

public class tutorial06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual è il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.println("Ciao! " + nome);
        System.out.println("Quanti anni hai? ");
        int eta = scanner.nextByte();
        scanner.nextLine();
        System.out.println("qual è il tuo cognome? ");
        String cognome = scanner.nextLine();
        System.out.println("Che bel cognome! " + cognome + ", ed hai " + eta + " anni");

    }
}

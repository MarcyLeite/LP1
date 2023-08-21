import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Anos: ");
        int years = scan.nextInt();

        System.out.print("Meses: ");
        int mounths = scan.nextInt();

        System.out.print("Dias: ");
        int days = scan.nextInt();

        scan.close();
        int ageInDays = years*365 + mounths*30 + days;

        System.out.println(String.format("Idade em dias: %d", ageInDays));
    }
}

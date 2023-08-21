import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite Salario: ");
        float wage = scan.nextFloat();

        System.out.print("Digite Percentual do Reajuste: ");
        float adjustment = scan.nextFloat();

        scan.close();

        float newWage = wage + adjustment*wage/100;

        System.out.println(String.format("Novo salario: %.2f", newWage));
    }
}

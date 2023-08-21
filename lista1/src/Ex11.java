import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero de carros vendidos: ");
        int sellCount = scan.nextInt();

        System.out.print("Valor total das vendas: ");
        float sellTotal = scan.nextFloat();

        System.out.print("Salario fixo: ");
        float wageFixed = scan.nextFloat();

        System.out.print("Valor da comissão por carro: ");
        float commisionFixed = scan.nextFloat();
        scan.close();

        float wage = wageFixed + commisionFixed * sellCount + (sellTotal*0.05f);

        System.out.println(String.format("Salario final: %.2f", wage));
    }
}

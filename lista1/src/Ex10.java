import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float distPercentual = 28;
        float taxPercentual = 45;

        System.out.print("Digite preço de Fabrica: ");
        float factoryPrice = scan.nextFloat();
        scan.close();

        float distValue = factoryPrice*distPercentual/100;
        float taxValue = factoryPrice*taxPercentual/100;

        float consumerPrice = factoryPrice + distValue + taxValue;

        System.out.println(String.format("Preço para o consumidor: %.2f", consumerPrice));
    }
}

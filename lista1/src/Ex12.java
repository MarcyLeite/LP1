import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        float temperatureF = scan.nextFloat();
        scan.close();

        float temperatureC = (temperatureF - 32f) * 5f / 9f;

        System.out.println(String.format("Temperature em Celsius: %.2f", temperatureC));
    }
}

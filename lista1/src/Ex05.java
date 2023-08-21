import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite Numero: ");
        int num = scan.nextInt();

        scan.close();
        int prevNum = num -1;


        System.out.println(String.format("Antecessor de %d é %d", num, prevNum));
    }
}

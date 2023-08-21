import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        float width = scan.nextFloat();

        System.out.print("Altura: ");
        float height = scan.nextFloat();

        scan.close();
        float area = width*height;

        System.out.println(String.format("Area: %.2f", area));
    }
}

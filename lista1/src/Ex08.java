import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Total de Eleitores: ");
        int votersTotal = scan.nextInt();

        System.out.print("Total de votos Brancos: ");
        int whiteTotal = scan.nextInt();

        System.out.print("Total de votos Nulos: ");
        int nullTotal = scan.nextInt();


        System.out.print("Total de votos Validos: ");
        int validTotal = scan.nextInt();

        scan.close();

        if (validTotal + nullTotal + whiteTotal > votersTotal) {
            throw new Exception("Votes Sum cannot be greater than total");
        }
        float whitePercentual = whiteTotal*100/votersTotal;
        float nullPercentual = nullTotal*100/votersTotal;
        float validPercentual = validTotal*100/votersTotal;

        System.out.println(String.format("Total de Eleitores: %d", votersTotal));
        System.out.println(String.format("Porcentagem de votos Brancos: %.2f%s", whitePercentual, "%"));
        System.out.println(String.format("Porcentagem de votos Nulos: %.2f%s", nullPercentual, "%"));
        System.out.println(String.format("Porcentagem de votos Validos: %.2f%s", validPercentual, "%"));
    }
}

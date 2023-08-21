public class Ex02 {
    public static void main(String[] args) {
        algoA();
        algoB();
        algoC();
        algoD();
        algoE();
        algoF();
    }
    static void algoA() {
        System.out.println(" --- ALGORITMO A ---");
        int a = 10;
        int b = 20;
        System.out.println(b);

        b = 5;
        // System.out.println(String.valueOf(a)+ ' ' + String.valueOf(b));

        System.out.println(String.format("%d %d", a, b));
    }

    static void algoB() {
        System.out.println(" --- ALGORITMO B ---");
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println(String.valueOf(c));
        
        b = 10;
        System.out.println(String.format("%d %d", b, c));

        c = a + b;
        System.out.println(String.format("%d %d %d", a, b, c));
    }
    static void algoC() {
        System.out.println(" --- ALGORITMO C ---");
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println(String.format("%d %d %d", a, b, c));
    }
    static void algoD() {

        System.out.println(" --- ALGORITMO D ---");
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println(a);
        
        a = b + 1;
        System.out.println(String.format("%d %d", a, b));
    }
    static void algoE() {
        System.out.println(" --- ALGORITMO E ---");
        int a = 10;
        int b = 5;
        int c = a + b;
        b = 20;
        a = 10;

        System.out.println(String.format("%d %d %d", a, b, c));
    }
    static void algoF() {
        System.out.println(" --- ALGORITMO F ---");
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println(z);

        x = 5;
        y = x + z;
        System.out.println(String.format("%d %d %d", x, y, z));
    }
}
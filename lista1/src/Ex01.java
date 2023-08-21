public class Ex01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int tempA = a;
        a = b;
        b = tempA;
        
        System.out.println("A: " + String.valueOf(a) + "\nB: " + String.valueOf(b));
    }
}
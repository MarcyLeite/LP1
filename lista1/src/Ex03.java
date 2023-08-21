public class Ex03 {
    public static void main(String[] args) {
        float a1 = (4/2) + (2/4);
        float a2 = 4/2 + 2/4;
        
        System.out.println(String.format("Item A é igual: %b", a1 == a2));

        float b1 = 4/(2+2)/4;
        float b2 = 4/2+2/4;

        System.out.println(String.format("Item B é igual: %b", b1 == b2));

        float c1 = (4+2)*2-4;
        float c2 = 4+2*2-4;

        System.out.println(String.format("Item C é igual: %b", c1 == c2));
    }
}

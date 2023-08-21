public class Ex03 {
    public static void main(String[] args) {
        float a1 = (4f/2f) + (2f/4f);
        float a2 = 4f/2f + 2f/4f;
        System.out.println(String.format("Item A é igual: %b", a1 == a2));

        float b1 = 4f/(2f+2f)/4f;
        float b2 = 4f/2f+2f/4f;
        System.out.println(String.format("Item B é igual: %b", b1 == b2));

        float c1 = (4f+2f)*2f-4f;
        float c2 = 4f+2f*2f-4f;
        System.out.println(String.format("Item C é igual: %b", c1 == c2));
    }
}

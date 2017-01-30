package poo;

public class StringBuffer_vs_String {

    public static void main(String[] args) {
        concatenacionStringBuffer();
        concatenacionString();        
    }

    public static void concatenacionStringBuffer() {

        System.out.println("Concatenando con StringBuffer");

        long hi = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();

        int n = 1000;

        char c;
        for (int i = 0; i < n; i++) {

            c = (char) ('A' + i % ('Z' - 'A' + 1));

            sb.append(c);
        }

        long hf = System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println((hf - hi) + " milisegundos");
        System.out.println();
    }

    public static void concatenacionString() {
        System.out.println("Concatenando con String");
        long hi = System.currentTimeMillis();
        int n = 1000;

        String s = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = (char) ('A' + i % ('Z' - 'A' + 1));
            s = s + c;
        }
        long hf = System.currentTimeMillis();
        System.out.println(s);
        System.out.println((hf - hi) + " milisegundos");
        System.out.println();
    }
}

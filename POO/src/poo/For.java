package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        
        for (i = 1; i <= n; i++) {
            System.out.println(i);
            i++;
        }
        
        
        //foreach();
    }
    
    public static void foreach(){
        ArrayList<String> a = new ArrayList();
        a.add("Jorge");
        a.add("Pedro");
        a.add("Ana");
        
        for (String p: a) {
            System.out.println(p);
        }
    }
}

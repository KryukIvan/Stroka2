import java.util.Locale;
import java.util.Scanner;

public class Stroka2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку I like Java!!! ");
        String n = in.nextLine();
        boolean x = n.contains("Java");
        boolean y = n.startsWith("I like");
        boolean z = n.endsWith("!!!");
        if (x & y & z ) {
            String m = n.toUpperCase();
            System.out.println(m);
            String o = n.substring(7, 11);
            String p = o.replace("a", "o");
            System.out.println(p);
        }
        else { System.out.println("Где-то ошибка");}
    }
}

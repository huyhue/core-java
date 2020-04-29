
package bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) {
        DSGV ds= new DSGV();
        Scanner k = new Scanner(System.in);
        char c;
        do{
            System.out.println("nhap thong tin giang vien");
            System.out.println("Co huu c hay thinh giang t:");
            char q=k.next()charAt(0);
            k.nextLine();
            System.out.println("ma:");
            String ma = k.nextLine();
            System.out.println("ho ten:");
            String ht = k.nextLine();
            System.out.println("so gio day:");
            int sg = k.nextLine();
            boolean phai =true;
            System.out.println("ma:");
            String ma = k.nextLine();
            Date nv = new Date();
            DateFormat df = new SimpleDateFormat("yyyy/m/d");
            try {
                nv = df.parse(k.nextLine());
            } catch (ParseException ex) {
            }
        }
    }
}

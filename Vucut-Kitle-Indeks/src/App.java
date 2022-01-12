import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double kilo,boy;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kilo=sc.nextDouble();
        total=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :"+total);
        
    }
}

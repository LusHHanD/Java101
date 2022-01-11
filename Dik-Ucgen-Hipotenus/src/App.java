import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double kenar1,kenar2,kenar3;
        double alan,u,cevre;

        Scanner read = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        kenar1 = read.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        kenar2 = read.nextInt();
        System.out.print("3.Kenarı Giriniz: ");
        kenar3 = read.nextInt();
        
        u=(kenar1+kenar2+kenar3)/2;
        cevre=2*u;
        alan=Math.sqrt((u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
        System.out.println("Değerleri Girilen Üçgenin Çevresi="+cevre);
        System.out.println("Değerleri Girilen Üçgenin Alanı="+alan);
    }
}

import java.util.Scanner;

public class App {

// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
// 𝜋 sayısını = 3.14 alınız.
// Formül : (𝜋 * (r*r) * 𝛼) / 360
    public static void main(String[] args) throws Exception {
        int r;
        double pi=3.14;
        int angle;
        double total;

        Scanner sc= new Scanner(System.in);
        System.out.println("Yarıçapı Giriniz: ");
        r= sc.nextInt();

        System.out.println("Merkez Açı Ölçüsünü Giriniz: ");
        angle=sc.nextInt();

        total=(pi*(r*r)*angle)/360;

        System.out.println("Dairenin Alanı: "+total);
    }
}

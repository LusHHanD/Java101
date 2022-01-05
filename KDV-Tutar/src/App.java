import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar,kdvOran;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ücret Tutarını Giriniz: ");
            tutar = input.nextDouble();
        }

        if(tutar>0&&tutar<=1000){
            kdvOran = 0.18;
            double kdvTutar = tutar*kdvOran;
            double kdvliTutar = tutar+kdvTutar;

            System.out.println("KDV'siz Tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOran);
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'li Tutar: "+kdvliTutar);

        }else{
        
            kdvOran = 0.08;
            double kdvTutar = tutar*kdvOran;
            double kdvliTutar = tutar+kdvTutar;

            System.out.println("KDV'siz Tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOran);
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'li Tutar: "+kdvliTutar);
        }
    }
}

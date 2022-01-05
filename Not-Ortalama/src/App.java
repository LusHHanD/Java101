import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat,fizik,kimya,turkce,tarih,muzik;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Matematik Notunuz:");
            mat=sc.nextInt();

            System.out.print("Fizik Notunuz:");
            fizik=sc.nextInt();

            System.out.print("Kimya Notunuz:");
            kimya=sc.nextInt();

            System.out.print("Türkçe Notunuz:");
            turkce=sc.nextInt();

            System.out.print("Tarih Notunuz:");
            tarih=sc.nextInt();

            System.out.print("Müzik Notunuz:");
            muzik=sc.nextInt();
        }

        int toplam = ( mat + fizik + kimya + turkce + tarih + muzik );
        double ortalama=toplam/6;
        System.out.println("Ortalamanız: " + ortalama);

        System.out.print ((ortalama) >= 60 ? "Geçti" : "Kaldı");
    }
}

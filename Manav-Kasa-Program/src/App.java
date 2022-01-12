import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    // Manav Kasa Programı
    // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
    // Meyveler ve KG Fiyatları
    // Armut : 2,14 TL
    // Elma : 3,67 TL
    // Domates : 1,11 TL
    // Muz: 0,95 TL
    // Patlıcan : 5,00 TL

    double armut=2.14;
    double elma=3.67;
    double domates=1.11;
    double muz=0.95;
    double patlican=5.0;

    double armutkg,elmakg,domateskg,muzkg,patlicankg;
    double armuttotal,elmatotal,domatestotal,muztotal,patlicantotal;

    double total=0;
    
    Scanner sc=new Scanner(System.in);

    System.out.print("Armut kaç kilogram? ");
    armutkg=sc.nextInt();
    armuttotal=armutkg*armut;

    System.out.print("Elma kaç kilogram? ");
    elmakg=sc.nextInt();
    elmatotal=elmakg*elma;
    
    System.out.print("Domates kaç kilogram? ");
    domateskg=sc.nextInt();
    domatestotal=domateskg*domates;

    System.out.print("Muz kaç kilogram? ");
    muzkg=sc.nextInt();
    muztotal=muzkg*muz;

    System.out.print("Patlıcan kaç kilogram? ");
    patlicankg=sc.nextInt();
    patlicantotal=patlicankg*patlican;

    total=armuttotal+elmatotal+domatestotal+muztotal+patlicantotal;
    System.out.println("Toplam tutar: "+total+"TL.");    
    
    }
}

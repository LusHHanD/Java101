import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int input1,input2,islem;

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        input1=sc.nextInt();
        System.out.print("İkinci sayı: ");
        input2=sc.nextInt();

        System.out.println("1.) Toplama \n 2.) Çıkarma \n 3.) Çarpma \n 4.) Bölme");
        System.out.print("Yapılacak İşlem: ");
        islem =sc.nextInt();

        switch(islem){
            case 1:
                System.out.println("Sonuç: "+(input1+input2));
            break;
            case 2:
                System.out.println("Sonuç: "+(input1-input2));
            break;
            case 3:
                System.out.println("Sonuç: "+(input1*input2));
            break;
            case 4:
                if(input2 != 0){
                    System.out.println("Sonuç: "+(input1/input2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                
            break;
            default:
                System.out.println("Girilen değer aralıklarını kontrol ediniz.");            
        }
        

    }
}

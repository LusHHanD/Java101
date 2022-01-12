import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int kilometer;
        double amount=0;
        double kmCost =2.20;

        Scanner sc =new Scanner(System.in);
        System.out.println("Mesafe Giriniz: ");
        kilometer = sc.nextInt();

        amount=kilometer*kmCost;
        amount=amount+10;
        if(amount<=20){
            System.out.println("Ücret: 20TL.");
        }else{
            System.out.println("Ücret: "+amount+"TL.");
        }


    }
}

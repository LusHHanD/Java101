import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String userName,userPassword;
        String secim,newPassword;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kullanıcı Adı: ");
        userName = sc.nextLine();
        System.out.print("Şifre: ");
        userPassword = sc.nextLine();

        if(userName.equals("patika") && userPassword.equals("java123")){
            System.out.println("Giriş Yapıldı!");
        }else{
            System.out.println("Bilgileriniz Yanlış! \n Şifrenizi sıfırlamak ister misiniz? [ e / h ]");
            secim =sc.nextLine();
            if(secim.equals("e")){
                System.out.println("Yeni Şifre: ");
                newPassword = sc.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newPassword=sc.nextLine();
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Şifrenizi tekrar deneyiniz.");
            }

        }

        
    }
}

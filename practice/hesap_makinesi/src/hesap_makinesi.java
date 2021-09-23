import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı 1 Giriniz : ");
        float s1 = input.nextFloat();
        System.out.println("Sayı 2 Giriniz : ");
        float s2 = input.nextFloat();

        System.out.println("Yapılacak İşlemi Seçiniz : ");
        System.out.println("Toplama ise '+'");
        System.out.println("Çıkarma ise '-'");
        System.out.println("Çarpma ise '*'");
        System.out.println("Bölme ise '/'");

        char islem = input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println("Toplama İşlemi Sonucu : " + (double)(s1+s2));break;
            case '-':
                System.out.println("Çıkarma İşlemi Sonucu : " + (double)(s1-s2));break;
            case '*':
                System.out.println("Çarpma İşlemi Sonucu : " + (double)(s1*s2));break;
            case '/':
                if (s2 == 0)
                    System.out.println("0 ile Bölünemez.");
                else
                    System.out.println("Bölme İşlemi Sonucu : " + (double)(s1/s2));break;

            default:
                System.out.println("Lütfen bir işlem seçiniz.");break;
        }



    }
}

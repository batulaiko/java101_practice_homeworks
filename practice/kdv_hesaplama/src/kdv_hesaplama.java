import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("KDV'siz Fiyatı Ekleyin : ");
        float kdvsiz = input.nextFloat();
        double kdv_dahil;

        if (kdvsiz >0 && kdvsiz <= 1000){
            kdv_dahil = (kdvsiz * 1.18);
        }
        else{
            kdv_dahil = (kdvsiz * 1.08);
        }
        System.out.println("Ürün KDV Dahil = " + kdv_dahil);
    }
}

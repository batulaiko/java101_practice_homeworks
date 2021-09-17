import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç Kilo : ");
        double armut = input.nextDouble();
        double armut_tl = armut * 2.14;

        System.out.println("Domates kaç Kilo : ");
        double domates = input.nextDouble();
        double domates_tl = domates * 1.11;
        System.out.println("Elma kaç Kilo : ");
        double elma = input.nextDouble();
        double elma_tl = elma * 3.67;
        System.out.println("Muz kaç Kilo : ");
        double muz = input.nextDouble();
        double muz_tl = muz * 0.95;
        System.out.println("Patlıcan kaç Kilo : ");
        double patlican = input.nextDouble();
        double patlican_tl = patlican * 5.00;
        double toplam = armut_tl + domates_tl + elma_tl + muz_tl + patlican_tl;
        System.out.println("Armut = "+ armut_tl + "TL\nDomates = " + domates_tl + "TL\nElma = " + elma_tl + "TL\nMuz = " + muz_tl + "TL\nPatlican = " + patlican_tl + "TL");
        System.out.println("Toplam Fiyat = " + toplam + "TL");


    }
}

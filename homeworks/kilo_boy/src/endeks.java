//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class endeks {
    public endeks() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz :");
        double boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz :");
        double kilo = input.nextDouble();
        double endeks = kilo / Math.pow(boy / 100.0D, 2.0D);
        System.out.println("Boy - Kilonuz = " + boy + " - " + kilo + "\nEndeksiniz = " + endeks);
        if (endeks < 15.0D) {
            System.out.println("Çok ciddi derecede düşük kilolu");
        } else if (15.0D < endeks && endeks < 16.0D) {
            System.out.println("Ciddi derecede düşük kilolu");
        } else if (16.0D < endeks && endeks < 18.5D) {
            System.out.println("Düşük kilolu");
        } else if (18.5D < endeks && endeks < 25.0D) {
            System.out.println("Normal kilolu");
        } else if (25.0D < endeks && endeks < 30.0D) {
            System.out.println("Fazla kilolu");
        } else if (30.0D < endeks && endeks < 35.0D) {
            System.out.println("1. derece hafif obez");
        } else if (35.0D < endeks && endeks < 40.0D) {
            System.out.println("2. derece hafif obez");
        } else if (endeks > 40.0D) {
            System.out.println("3. derece hafif obez");
        }

    }
}

import java.util.Scanner;

public class PiyangoOyunu {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int bakiye=150;
        for (; ; ) {
            //Piyango Oyunu
            System.out.println("Piyango Oyununa Hoşgeldiniz");
            System.out.println("Bakiyeniz " + bakiye + " TL");
            System.out.println("Oyuna giriş bedeli 50 TL'dir.");
            System.out.println("Lütfen iki basamaklı bir sayı giriniz.");
            int girilenSayi = tara.nextInt();
            bakiye=bakiye-50;
            System.out.println("Girdiğiniz sayı= " + girilenSayi);
            if(girilenSayi<10 || girilenSayi>100){
                System.out.println("Yanlış sayı girdiniz. Lütfen iki basamaklı sayı giriniz.\n");
                continue;
            }
            int rastgeleSayi = (int) (Math.random() * 90 + 10);
            System.out.println("Sistem tarafından atanan sayı= "+ rastgeleSayi);
            int rastgeleSayiOnlarBasamagi = rastgeleSayi / 10;
            int rastgeleSayiBirlerBasamagi = rastgeleSayi % 10;
            int girilenSayiOnlarBasamagi = girilenSayi / 10;
            int girilenSayiBirlerBasamagi = girilenSayi % 10;
            if (girilenSayi == rastgeleSayi) {
                System.out.println("Tebrikler 10000 TL ödül kazandınız.");
                bakiye=bakiye+10000;
                System.out.println("Yeni Bakiyeniz " + bakiye + " TL'dir.\n");
            } else if (girilenSayiOnlarBasamagi == rastgeleSayiBirlerBasamagi && girilenSayiBirlerBasamagi == rastgeleSayiOnlarBasamagi) {
                System.out.println("Tebrikler 5000 TL ödül kazandınız.");
                bakiye=bakiye+5000;
                System.out.println("Yeni Bakiyeniz " + bakiye + " TL'dir.\n");
            } else if (girilenSayiOnlarBasamagi == rastgeleSayiOnlarBasamagi || girilenSayiBirlerBasamagi == rastgeleSayiBirlerBasamagi) {
                System.out.println("Tebrikler 1000 TL ödül kazandınız.");
                bakiye=bakiye+1000;
                System.out.println("Yeni Bakiyeniz " + bakiye + " TL'dir.\n");
            } else {
                System.out.println("Maalesef ödül kazanamadınız.");
                System.out.println("Kalan bakiye= " + bakiye + " TL\n");
            }  if(bakiye<50){
                System.out.println("Bakiyeniz yetersizdir.\n");
                return;
            }
        }
    }
}
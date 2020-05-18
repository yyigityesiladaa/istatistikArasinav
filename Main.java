import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

ÖNEMLİ NOT --> Sayı Sıralaması Aşağıdaki Şekle Göre Ayarlanmıştır. 

1       6       11      16      21      25      29      33      37
2       7       12      17      22      26      30      34      38
3       8       13      18      23      27      31      35      39
4       9       14      19      24      28      32      36      40
5       10      15      20

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/



        Scanner scn = new Scanner(System.in);
        System.out.println("");

        System.out.print("Okul Numaranızın Son İki Rakamını Giriniz: ");
        double sonIkiRakam = scn.nextDouble();
        double eklenecekDeger = sonIkiRakam/100;

        System.out.println("\n***************************\n");

        double[] sayilar = new double[]{
                2.3,1.6,3.2,4.3,3.6,4.1,3.1,3.6,3.1,3.2,3.6,3.2,2.8,4.2,4.4,4.5,3.7,3.4,1.8, 3.5,
                3.1,3.1,3.8,3.4,3.8,4.7,3.1,4.7,3.2,3.9,3.3,3.9,2.8,2.6,3.0,3.4,3.3,4.2,3.6,2.7};

        double[] yeniSayilar = new double[40];



        for(int i = 0; i < sayilar.length; i++){
            yeniSayilar[i] = sayilar[i] + 0.52;
        }

        for(int i = 0; i < yeniSayilar.length; i++){
            System.out.println((i+1) + ". = " + yeniSayilar[i]);
        }

        double enBuyukDeger = yeniSayilar[0];
        double enKucukDeger = yeniSayilar[0];

        for(int i = 0; i< yeniSayilar.length; i++){
            if(yeniSayilar[i] > enBuyukDeger){
                enBuyukDeger = yeniSayilar[i];
            }
            if(yeniSayilar[i] < enKucukDeger){
                enKucukDeger = yeniSayilar[i];
            }
        }

        double DG = enBuyukDeger - enKucukDeger;
        double kucukDeger = 0.1;
        double altLimitBaslangicDegeri = enKucukDeger - kucukDeger;

        System.out.println("\nDeğişim Genşliği: " + DG);
        System.out.println("");
        double[] altLimitler = new double[7];

        System.out.println("\n***************************\n");

        //                 Alt Limitler

        for (int i = 0; i < altLimitler.length; i++){
            altLimitler[i] = altLimitBaslangicDegeri;
            altLimitBaslangicDegeri += 0.5;
        }
        System.out.println("Sınıf Alt Limitleri: \n");
        for (int i = 0; i<altLimitler.length; i++){
            System.out.println(altLimitler[i]);
        }
        System.out.println("\n***************************\n");

        //                 Üst Limitler

        double ustLimitBaslangicDegeri = altLimitler[1] - kucukDeger;
        double[] ustLimitler = new double[7];

        for (int i = 0; i < ustLimitler.length; i++){
            ustLimitler[i] = ustLimitBaslangicDegeri;
            ustLimitBaslangicDegeri += 0.5;
        }
        System.out.println("Sınıf Üst Limitleri: \n");
        for (int i = 0; i<ustLimitler.length; i++){
            System.out.println(ustLimitler[i]);
        }
        System.out.println("\n***************************\n");

        //                 Sınıf Sınırları

        double[] sınıfAltSınırları = new double[7];
        double[] sınıfUstSınırları = new double[7];

        double deger = (altLimitler[1] - ustLimitler[0])/2;

        System.out.println("Sınıf Alt Sınırları: \n");

        for (int i = 0; i < sınıfAltSınırları.length; i++){
            System.out.println((i+1) + ". Sınıf Alt Limiti = " + (altLimitler[i] - deger));
        }

        System.out.println("\n***************************\n");

        System.out.println("Sınıf Üst Sınırları: \n");

        for (int i = 0; i < sınıfUstSınırları.length; i++){
            System.out.println((i+1) + ". Sınıf Alt Limiti = " + (ustLimitler[i] - deger));
        }




    }
}

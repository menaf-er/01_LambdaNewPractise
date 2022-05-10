package lambda_practice;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {

        ılkOtuz(30);
        System.out.println("\n**********\n");
        ılkOtuzDahil(30);
        System.out.println("\n**********\n");
        System.out.println(top(10, 20));
        System.out.println("\n**********\n");
        System.out.println(ortlama(20, 30));
        System.out.println("\n**********\n");
        System.out.println(sekizeBolunenSayıAdedi(325, 468));
        System.out.println("\n**********\n");
        sekizeBolunenleriYazdır(325, 468);
        System.out.println("\n**********\n");
        System.out.println(sekizeBolunenlerinToplamıYazdır(325, 468));
        System.out.println("\n**********\n");
        System.out.println(tekSayıCarp(7, 15));
        System.out.println("\n**********\n");
        ilk10pozitifTekSayı(150);
        System.out.println("\n**********\n");
        yedininKatlarıTek(150);
        System.out.println("\n**********\n");
        System.out.println(yedininKatlarıToplam(20));
    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
    public static void ılkOtuz(int a) {
        IntStream.range(1, a).sorted().forEach(t -> System.out.print(t + " "));

    }

    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void ılkOtuzDahil(int a) {
        IntStream.range(1, a + 1).forEach(t -> System.out.print(t + " "));
        IntStream.rangeClosed(1, a).forEach(t -> System.out.print(t + " "));

    }

    //S3 Istenen iki deger(dahi) arasindaki sayilari toplayalim
    public static int top(int baslangıc, int bıtıs) {
        return IntStream.rangeClosed(baslangıc, bıtıs).sum();
    }


    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim
    public static OptionalDouble ortlama(int baslangıc, int bıtıs) {
        return IntStream.rangeClosed(baslangıc, bıtıs).average();
    }


    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

    public static long sekizeBolunenSayıAdedi(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).count();
    }

    //S6: 325 ile 468 arasinda 8 bolunen sayilari yazdiralim

    public static void sekizeBolunenleriYazdır(int a, int b) {
        IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).forEach(t -> System.out.print(t + " "));
    }

    // S7:325 ile 468 arasinda 8 bolunen sayilarin toplamini bulalim
    public static int sekizeBolunenlerinToplamıYazdır(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).sum();
    }


    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim

    public static double tekSayıCarp(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(Methods::tekMi).reduce(1, (x, y) -> x * y);
    }

//S9: pozitif tek sayilarin ilk 10 elemanini yazdiralim

    public static void ilk10pozitifTekSayı(int a) {
        //IntStream.rangeClosed(1,a).filter(t-> t>0).limit(10).filter(Methods::tekMi).forEach(Methods::yazInteger);

        IntStream.iterate(1, t -> t + 2).limit(10).filter(Methods::tekMi).forEach(Methods::yazInteger);
    }

//S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim

    public static void yedininKatlarıTek(int a) {
        IntStream.iterate(21, t -> t + 7).filter(Methods::tekMi).limit(10).forEach(Methods::yazInteger);
    }

//S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
public static int yedininKatlarıToplam(int a) {
        return IntStream.iterate(21, t-> t+7).limit(20).sum();
}



//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belilioruz



}
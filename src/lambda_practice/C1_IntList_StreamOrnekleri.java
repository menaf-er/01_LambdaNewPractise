package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));

        boslukBırakYaz(list);

        negativeYaz(list);

        System.out.println("pozitif list : " + positiveList(list));

        System.out.println("kareleri : " + kareleriList(list));

        System.out.println("tekrarsız : " + kareleriTekrarsızList(list));
        sırala(list);
        terSsırala(list);
        System.out.println("s8 :" +  positiveKupList(list));
        System.out.println("s 9 : " + positiveKareleriList(list));
        System.out.println("s 10 : "+ toplam(list));
        System.out.println("s11 : " + negativekareleriList(list));
        System.out.println("s 12 : " + bestenBuyukVarmı(list));
        System.out.println("s13 : " + sıfırdanKucukMu(list));
        System.out.println("s14 : " + yuzeEsitElemanVarmı(list));
        System.out.println("s15 : " + sıfıraEsitVarmı(list));
        System.out.println("s16 : " + ilkbesElemanıTopla(list));

    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz //



    //S2: sadece negatif olanlari yazdir
        public static void boslukBırakYaz(List<Integer> list){
            System.out.println();
        list.stream().forEach(t-> System.out.print(t + " "));
        }


    //S2: sadece negatif olanlari yazdir
    public static void negativeYaz (List<Integer> list){
        System.out.println();
        list.stream().filter(t-> t<0).forEach(t-> System.out.print(t));
    }



    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> positiveList (List<Integer> list){
       System.out.println();
        return  list.stream().filter(t-> t>0).collect(Collectors.toList());
    }



    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kareleriList (List<Integer> list){
       return  list.stream().map(t-> t*t).collect(Collectors.toList());
    }



    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim



    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static List<Integer> kareleriTekrarsızList (List<Integer> list){
        return list.stream().map(t-> t*t).distinct().collect(Collectors.toList());
    }


    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void sırala (List<Integer> list){
        list.stream().sorted().forEach(t-> System.out.print(t + " "));
    }




    //S7: listin elemanlarini buyukten kucuge siralayalim

    public static void terSsırala (List<Integer> list){
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }




    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim




    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim



    // S10 :list elemanlarini toplamini bulalim



    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim



    // S12 : listeden 5 den buyuk  sayi var mi?



    // S13 : listenin tum elemanlari sifirdan kucuk mu?

    public static List<Integer> positiveKupList (List<Integer> list){
        System.out.println();

      return   list.stream().filter(t-> t>0).map(t-> t*t*t).filter(t-> t%10==5).collect(Collectors.toList());
    }

        //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

    public static List<Integer> positiveKareleriList (List<Integer> list){
        return   list.stream().filter(t-> t>0).map(t-> t*t).filter(t-> t%10!=5).collect(Collectors.toList());
    }


    // S10 :list elemanlarini toplamini bulalim
    public static int toplam (List<Integer> list){
       return list.stream().reduce(0 ,(x,y)-> x+y );

    }

        // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
        public static List<Integer>  negativekareleriList (List<Integer> list){

            System.out.println();
            return  list.stream().filter(t-> t<0).peek(t-> System.out.println("negatifler :" + t )).map(t-> t*t).peek(t-> System.out.println("map sonrası : " + t )).collect(Collectors.toList());
        }

        // S12 : listeden 5 den buyuk  sayi var mi?
        public static boolean bestenBuyukVarmı (List<Integer> list ){

        return list.stream().anyMatch(t-> t>5);
    }


    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    public static boolean sıfırdanKucukMu (List<Integer> list ){
        System.out.println();
        return list.stream().allMatch(t-> t<0);
    }


    // S14: listenin 100 e esit elemani yok mu ?



    // S15: listenin sifira esit elemani yok mu?
    public static boolean yuzeEsitElemanVarmı (List<Integer> list){
        return
                 list.stream().anyMatch(t-> t==100);
    }


    // S15: listenin sifira esit elemani yok mu?
     public static boolean sıfıraEsitVarmı (List<Integer> list) {
        return list.stream().anyMatch(t-> t==0);

     }



    // S16:  listenin ilk 5 elemanini topla?

public static int ilkbesElemanıTopla (List<Integer> list){
        return list.stream().limit(5).reduce(0, (x,y)-> x+y);

}


    //S17: listenin son bes elemaninin  listele





    //public static List<Integer>list sonbesEleman (List<Integer> list) {
       // return list.stream().skip(list.size()-5).collect(Collectors.toList());
    }



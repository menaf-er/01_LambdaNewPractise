package lambda_practice;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        System.out.println("s1 : " + dcileBaslayan(list));
        basaSonaYıldızKoyYazdır(list);
        System.out.println("s3 : " + alfabetikList(list));
        lSil(list);
        System.out.println("s5 : " + eOlanlardanYeniList(list));
        ilkUvHarfTekrar(list);
        ilkHarfBuyukDıgerleriKucuk(list);
        System.out.println("son soru : " + uzunluk4ve6Harıc(list));
    }


    // S1: ilk harfi d ve ya c olanlari listeleyelim


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim


    //S3: alfabedik  gore siralayalim list olarak


    //S4: tum 'l' leri silelim yazdiralim


    //S5 : icinde e olanlardan yeni bir list olusturunuz



    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi



    // S1: ilk harfi d ve ya c olanlari listeleyelim
        public static List<String> dcileBaslayan (List<String> list ){

        return
                list.stream().filter(t-> t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
}

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void basaSonaYıldızKoyYazdır ( List<String> list ) {
        list.stream().map(t-> "*" + t + "*").forEach(t-> System.out.println(t + " "));
    }

    //S3: alfabedik  gore siralayalim list olarak
    public static List<String> alfabetikList ( List<String> list) {

        return list.stream().sorted().collect(Collectors.toList());
    }

    //S4: tum 'l' leri silelim yazdiralim

    public static void lSil (List<String> list) {
        list.stream().map(t-> t.replaceAll("l", "")).forEach(t-> System.out.println(t+ " "));
    }


    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static List<String> eOlanlardanYeniList (List<String> list ) {
        return list.stream().filter(t-> t.contains("e")).collect(Collectors.toList());
    }

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void ilkUvHarfTekrar (List<String> list ) {
        list.stream().map(t-> (t.substring(0,1).toLowerCase() + t.substring(0,1).toLowerCase()) + t.toLowerCase() ).forEach(t-> System.out.print(t+ " "));
    }



    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz



    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

public static void ilkHarfBuyukDıgerleriKucuk ( List<String> list ) {
    System.out.println();
        list.stream().map(t-> t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase()).forEach(t-> System.out.print(t + " ") );
}

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

    public static List<String> uzunluk4ve6Harıc (List<String> list ) {

        return list.stream().filter(t-> t.length()!=4 && t.length()!=6).collect(Collectors.toList());
    }




}

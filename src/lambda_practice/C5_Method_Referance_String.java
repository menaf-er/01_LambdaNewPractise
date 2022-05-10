package lambda_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

        hepsiBuyuk(l);
        System.out.println();
        sırala(l);
        System.out.println();
        EilebaslayanlarıSırala(l);
    }

    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void hepsiBuyuk(List<String> liste) {
        liste.stream().map(String::toUpperCase).forEach(Methods::yazString);
    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    public static void sırala(List<String> liste) {

        liste.stream().sorted(Comparator.comparing(String::length)).forEach(Methods::yazString);
    }

    //S3: E ILE Baslayanlari yazdiralim
    public static void EilebaslayanlarıSırala(List<String> liste) {

        liste.stream().filter(t-> t.toLowerCase().startsWith("e")).sorted(Comparator.comparing(String::length)).forEach(Methods::yazString);
        System.out.println();

        //2. yol
        liste.stream().filter(Methods::EbasliyorMu).forEach(Methods::yazString);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Q01_CharakterSayisi {

    public static void main(String[] args) {

       /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */
        // cözüm 1
        String str = "merve";
        String benzersizStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (!benzersizStr.contains(""+str.charAt(i))) {
                benzersizStr += str.charAt(i);
            }
            System.out.println("benzersizStr : "+benzersizStr);
            System.out.println("str : "+ str);
        }
        for (int i = 0; i < benzersizStr.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (benzersizStr.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(benzersizStr.charAt(i) + " -> " + count);
        }

        // 2.cözüm
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cumle girin: ");
        String cumle = sc.nextLine();
        //split
        String[] arr = cumle.split(""); // herbir karakteri ayirir.
        System.out.println(Arrays.toString(arr));
        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // sayac olustur
        int counter = 0;
        // karakterleri karsilastirmak icin foorloop
        for (int i = 1; i < arr.length; i++) { // birden fazla sayidaki karakter icin
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else { // tek sayidaki karakter
                System.out.println(arr[i - 1] + "`nin sayisi: " + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) { // en son karakter benzersiz ise calisir.
                System.out.println(arr[i] + "`nin sayisi: " + (counter + 1));
            }
        }

        // 3.cözüm
        String s = "hgşsdsh ghgrmıajfaüo";
        //String s="hgşsdsh ghgrmıajfaüo";
        String yeni = "";

        for (int i = 0; i < s.length(); i++) {
            int t = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    t++;
                }
            }
            if (!yeni.contains("" + s.charAt(i))) {
                yeni += "" + s.charAt(i) + t + " ";
            }
        }
        System.out.println("yeni = " + yeni);
    }
}

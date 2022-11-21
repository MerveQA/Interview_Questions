import java.util.ArrayList;

public class Q03_CreateRandomList_SetList {
    public static void main(String[] args) {

        // Q02_CreateRandomList_SetList
// int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer> ar = new ArrayList<>();

        randomEkle(ar);
    }

    private static void randomEkle(ArrayList<Integer> ar) {
        for (int i = 0; i < 10; i++) {
            ar.add((int) (Math.random() * 20));
        }
        System.out.println("ilk hal = "+ar);
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) % 2 == 0) {
                count++;
                ar.remove(ar.get(i));
                ar.add(111);
            }
        }
        System.out.println("son hal = "+ar);
        if (count == 0) {
            System.out.println("cift sayi yoktur");
        }

    }
}

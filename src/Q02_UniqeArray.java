import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q02_UniqeArray {
    public static void main(String[] args) {

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */

        // 1.yol
        ArrayList<Integer>list=new ArrayList<>();
        int arr[] = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        System.out.println("eski = "+Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        // Integer[]arr2=list.toArray(new Integer[0]);
        // System.out.println(Arrays.toString (arr2));

        int yeni[]=new int[list.size()];
        for (int i = 0; i <yeni.length ; i++) {
            yeni[i]=list.get(i);
        }
        System.out.println("yeni = " + Arrays.toString(yeni));

        // 2.yol ( array degil list olarak veriyor)
        HashSet<Integer> h = new HashSet<>(List.of(1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));
        System.out.println("tekrarsız list = "+h);

    }



}

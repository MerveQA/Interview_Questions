public class Q07_MultipleMethodVarargs {
    public static void main(String[] args) {

   /*
farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
yazdıran parametreli method yazınız
*/
       ortalama("Halit",100,100,100,100,100,100) ;
       ortalama("Hale",10,80,60,20) ;
       ortalama("Halit",45,45,78) ;
       ortalama("Halit",100,98,74,78,34) ;


    }

    private static void ortalama(String name, double ... notes ) {

        double sum = 0;
        for (double each: notes) {
            sum +=each;
        }
        System.out.println(name + "-> not ortalamasi : " + sum/notes.length);
    }
}

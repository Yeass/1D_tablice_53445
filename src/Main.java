import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //int[] tab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int licznik = 0;

        System.out.println("Przed: ");
        System.out.println(Arrays.toString(tab));
        boolean toSort = true;
        for (int j = 1; j < tab.length && toSort; j++) {
            toSort = false;
            for (int i = 0; i < tab.length - j; i++) {
                if (tab[i] > tab[i + 1]) {
                    int wieksza = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = wieksza;
                    toSort = true;
                    licznik++;
                }
                licznik++;
            }
            licznik++;
        }
        System.out.println("Po: ");
        System.out.println(Arrays.toString(tab));
        System.out.println("Liczba operacji: " + licznik);
    }
}
package list;

import java.util.ArrayList;

public class CreationList {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>(100);

        for (int i = 0; i< 100; i++ )
            entiers.add(i);
        System.out.println("Taille de la liste " + entiers.size());
    }

}

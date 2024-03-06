package Collections;

import java.util.*;
//Andrijo
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Momento");

        myList.forEach(j -> {
            System.out.println("j = " + j);
        });
    }

}

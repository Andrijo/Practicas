package Collections;

import java.util.HashSet;
import java.util.Set;

//Andrijo
public class HashSets {

    public static void main(String[] args) {
        Set mySet = new HashSet();
        mySet.add("Lunes");
        mySet.add("Martes");
        mySet.add("Miercoles");
        mySet.add("Jueves");
        mySet.add("Viernes");
        mySet.add("Sabado");
        mySet.add("Domingo");
        
        mySet.forEach(action -> {
            System.out.println("Día: " + action);
        });
    }

}

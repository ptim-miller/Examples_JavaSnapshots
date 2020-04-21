// All rights reserved (c) 2020 P. Tim Miller
// For academic use only

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Double[] array1 = { 100.99, 250.98, 499.99, 199.00 };
        Arrays.sort(array1);
        myArrayPrinter(array1);

        List<Double> myList = new ArrayList<Double>();
        myList.add(1099.50);
        myList.add(578.90);
        myList.add(100.01);
        myList.add(.56);
        Collections.sort(myList);
        myListPrinter(myList);

    }

    public static <E> void myArrayPrinter(E[] genericArray) {
        System.out.println("Printing for : " + genericArray.getClass().getSimpleName());
        for(E item : genericArray){
            if(genericArray.getClass().getSimpleName().equals("Character[]")){
                System.out.printf("%s", item);
            } else{
                System.out.printf("%s ", item);
            }
        }
        System.out.printf("\n");
    }

    public static <E> void myListPrinter(List<E> myList) {
        System.out.println("Printing for : " + myList.get(0).getClass().getSimpleName());
        for(int i = 0; i < myList.size(); i++){
            System.out.printf("%s ", myList.get(i).toString());
        }
    }
}


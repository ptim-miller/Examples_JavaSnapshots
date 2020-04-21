// All rights reserved (c) 2020 P. Tim Miller
// For academic use only


public class Generics2 {
    public static void main(String args[]) {
        Character array0[] = { 'G','e','n','e','r','i','c','s','!' };
        Double array1[] = { 100.99, 250.98, 499.99, 199.00 };
        String array2[] = { "Hello","Java","People" };
        myPrinter(array0);
        myPrinter(array1);
        myPrinter(array2);
    }

    public static <E> void myPrinter(E[] genericArray) {
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
}

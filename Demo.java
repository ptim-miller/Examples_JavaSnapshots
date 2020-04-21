// All rights reserved (c) 2020 P. Tim Miller
// For academic use only

public class Demo {
    public static void main(String args[]) {
        Character array0[] = { 'N','O','T',' ','G','e','n','e','r','i','c','s','!','\n' };
        myPrinter(array0);
    }

    public static void myPrinter(Character[] notGenericArray) {
        for(Character item : notGenericArray){
            System.out.printf("%c", item);
        }
        System.out.printf("\n");
    }
}

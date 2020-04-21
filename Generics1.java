// All rights reserved (c) 2020 P. Tim Miller
// For academic use only


import java.util.ArrayList;
import java.util.Collections;

public class Generics1 {

    public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hello world");
	    String sentence = list.get(0);
	    System.out.println(sentence);

    }
}

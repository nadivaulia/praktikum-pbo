/**
 * File : ArrayListTest.java
 * Desskripsi : program penggunaan objek ArrayList
 *              sebagai collection class
 * **/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main (String[] args){
        //inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //mengahpus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}
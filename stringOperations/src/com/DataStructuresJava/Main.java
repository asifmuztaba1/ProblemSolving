package com.DataStructuresJava;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String[] words={"Funk","Chunk","Furry","baconator"};
	    //startswith
        for (String w: words) {
            if(w.startsWith("Fu"))
                System.out.println(w);
        }
        //endsWith
        for (String w:
                words) {
            if (w.endsWith("nk"))
                System.out.println(w);
        }
        String s="Asif is owesome!";
        System.out.println(s.indexOf("if",0));
        String a="Becon";
        String b="Monster    ";
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a.replace('e','F'));
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(b.toUpperCase(Locale.ROOT));
        System.out.println(b.trim());
    }
}

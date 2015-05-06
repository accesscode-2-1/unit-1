package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DomesticCat[] cats = new DomesticCat[3];
        DomesticCat garfield = new DomesticCat("Garfield","Cat");
        DomesticCat felix = new DomesticCat("Felix","Cat");
        DomesticCat nyan= new DomesticCat("Nyan","Cat");
        cats[0]=garfield;
        cats[1]=felix;
        cats[2]=nyan;

        System.out.println(felix.compareTo(garfield));
        
    }
}

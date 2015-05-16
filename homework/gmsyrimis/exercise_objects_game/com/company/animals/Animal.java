package com.company;

/**
 * Created by c4q-george on 4/27/15.
 */
public class Animal implements Comparable<Animal> {

    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

        @Override
    public int compareTo(Animal a) {
        if(this.speciesName.compareTo(a.speciesName)>0){
            return 1;
        }
        else if(this.speciesName.compareTo(a.speciesName)<0){
            return -1;
        }
        else
        return 0;
    }


}

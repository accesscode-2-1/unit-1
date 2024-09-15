package com.company;

/**
 * Created by c4q-george on 4/27/15.
 */
public class DomesticCat extends Animal implements Domestic {

    private String name;

    public DomesticCat(String name) {
        super("Cat");
        this.name=name;
    }

    public DomesticCat(String name,String species) {
        super(species);
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int compareTo(Animal a) {
        DomesticCat c = (DomesticCat) a;
        if(this.getName().compareTo(c.getName())>0){
            return 1;
        }
        else if(this.getName().compareTo(c.getName())<0){
            return -1;
        }
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        DomesticCat c = (DomesticCat) obj;
        if(this.getName().equals(c.getName())){
            return true;
        }
        return false;
    }
}

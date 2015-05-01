package nyc.c4q.anthonyfermin;

import sun.misc.Sort;

public class Main {

    public static void sort(Animal[] animals){

        for(int i = 1; i < animals.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(animals[j-1].compareTo(animals[j]) > 0){
                    Animal toSwap = animals[j-1];
                    animals[j-1] = animals[j];
                    animals[j] = toSwap;
                }else
                {
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        Animal[] animals = {new Animal("Zebra"),new Animal("Dog"),new Animal("Cod Fish"), new Animal("Cat"), new Animal("Elephant"), new Animal("Deer")};

        System.out.println("Before sort: ");
        for(int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i].getSpeciesName());
        }

        sort(animals);

        System.out.println("\nAfter sort: ");
        for(int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i].getSpeciesName());
        }
    }
}

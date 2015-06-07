package nyc.c4q.ahhhlvin;

import java.util.List;



    public class Animal implements Comparable<Animal> {

        private String speciesname;


        public Animal(String speciesName) {
            this.speciesname = speciesName;
        }


        public String getSpeciesname()
        {
            return speciesname;
        }

        @Override
        public int compareTo(Animal o)
        {
            // return -1 if first one is EARLIER in alphabet than what comes after compareTo, return 0 if both are same, return +1 if LATER in alphabet
            return (this.speciesname.compareTo(o.getSpeciesname()));
        }

        public boolean equals(Animal o)
        {
            return (this.speciesname.equals(o.getSpeciesname()));
        }


    }

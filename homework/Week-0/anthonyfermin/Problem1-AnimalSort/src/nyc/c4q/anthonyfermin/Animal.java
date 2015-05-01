package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 4/30/15.
 */
public class Animal implements Comparable
{
    String speciesName;

    public Animal(String name){
        speciesName = name;
    }

    protected int compareStrings(String first, String second){

        int shortestWordLength;
        if(second.length() < first.length())
        {
            shortestWordLength = second.length();
        }
        else
        {
            shortestWordLength = first.length();
        }

        for(int i = 0; i < shortestWordLength; i++)
        {
            /** return 1 if ASCII value of char at i for first word is greater than char at i for second word,
             *  continues to next char comparison if current chars are equal
             *  otherwise it breaks out of comparison loop and returns -1
             */

            if(first.charAt(i) > second.charAt(i))
            {
                return 1;
            }
            else if(first.charAt(i) == second.charAt(i))
            {
                continue;
            }
            else
            {
                break;
            }
        }
        return -1;
    }

    @Override
    public int compareTo(Object o)
    {
        if(! (o instanceof Animal)){
            throw new TypeNotPresentException("Must compare Animal to Animal", new Throwable());
        }

        Animal animal = (Animal) o;

        if(this.equals(animal)){
            return 0;
        }

        String first = this.speciesName.toLowerCase();
        String second = animal.speciesName.toLowerCase();

        return compareStrings(first, second);

    }

    public boolean equals(Animal animal){
        return this.speciesName.equals(animal.speciesName);
    }

    public String getSpeciesName(){
        return speciesName;
    }


}

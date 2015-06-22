package nyc.c4q.personabe1984;
/**
 * Created by Hans on 5/4/15.
 */
public class Animal<T> implements Comparable<T> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Animal o) {
        String thisName = this.getName();
        String thatName = o.getName();

        if (thisName.length() != thatName.length()) {
            return false;
        }

        for (int i = 0; i < thisName.length(); i++)  {
            if (thisName.charAt(i) != thatName.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int compareTo(T o) {

        // finds the longer and shorter name
        int length, longer;
        String thisName = this.getName().toLowerCase();
        String thatName = ((Animal)o).getName().toLowerCase();

        if (thisName.equals(thatName)) {
            return 0;
        }

        if (thatName.length() > thisName.length()) {
            length = thisName.length();
            longer = 1;
        } else {
            length = thatName.length();
            longer = -1;
        }

        for (int i = 0; i < length; i++) {
            if (thisName.charAt(i) > thatName.charAt(i)) {
                return 1;
            }
            if (thisName.charAt(i) < thatName.charAt(i)) {
                return -1;
            }
        }

        return longer;

    }

}
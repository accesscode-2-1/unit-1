package nyc.c4q.m47bell;

public class Main {

    public static void main(String[] args) {
        // declares an array of integers
        Animal [] listAnimal;

        // allocates memory for 5 Animal objects
        listAnimal = new Animal[5];

        // initialize the elements
        listAnimal[0] = new Animal("dog");
        listAnimal[1] = new Animal("tiger");
        listAnimal[2] = new Animal("cat");
        listAnimal[3] = new Animal("elephant");
        listAnimal[4] = new Animal("dolphin");



    }
}

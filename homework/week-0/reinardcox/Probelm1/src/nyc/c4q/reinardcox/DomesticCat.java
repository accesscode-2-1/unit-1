package nyc.c4q.reinardcox;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Arrays;

/**
 *
 * 1. that inherits from Animal and implements the Domesitc interface.
 * 2. Implement the compareTo function for your Domestic animal
 * so that it compares two such animals by their given name
 * instead of their species name.
 *Implement equals to compare by given name.

 Create a constructor for your Domestic animal
 that takes in both the species name and given name.

 Test your compareTo function by creating an array and calling sort.
 */
public class DomesticCat extends Animal implements Domestic {
 private String nameOfPet;

 public DomesticCat(String speciesName, String nameOfPet) {
  super(speciesName);
  this.nameOfPet = nameOfPet;
 }

 @Override
 public void getName() {
  System.out.println(this.nameOfPet);
 }

 @Override
 public void setName(String nameOfPet) {
  this.nameOfPet = nameOfPet;
 }

 public int compareTo(DomesticCat o) {
  return this.nameOfPet.compareTo(o.nameOfPet);
 }

 public boolean equals(DomesticCat o) {
  return this.nameOfPet.equals(o.nameOfPet);
 }

 public static void main(String[] args) {
  DomesticCat [] group1 = new DomesticCat[2];
  group1[0] = new DomesticCat("Snake", "Joe");
  group1[1] = new DomesticCat("Vake", "Sue");

  Arrays.sort(group1);

  System.out.println(group1[1].compareTo(group1[0]));

  for (DomesticCat o : group1) {
   System.out.println(o.nameOfPet);
  }
 }
}

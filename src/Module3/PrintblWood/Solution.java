package Module3.PrintblWood;
/*
You must add a sing method to the Bird class, then modify the main
 method accordingly so that the code prints the following lines:
I am walking
I am flying
I am singing
I am Bird
 */
public class Solution {
    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.walk();

       Bird bird = new Bird();
       bird.fly();
       bird.sing();
       bird.bird();
    }
}

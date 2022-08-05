import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assigm {


    public static void main(String[] args) {

        Dogs firstDog = new Dogs("fluffy","staffy",5);
        
        
        
        
        firstDog.dogName = "fred";


        System.out.println(firstDog.dogName);


        // create a for loop that creates 5 dog with random names and breed
        Random random = new Random();
        int m, age;
        ArrayList<Dogs> dogList = new ArrayList<>();
        String[] breeds = {"Staffy", "Terrier", "Bulldog", "Labrador"};

        for (int y = 0; y < 5; y++) {
            m = 0;
            StringBuilder dogName = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                dogName.append((char)('a' + random.nextInt(26)));
            }
            m = 1 + random.nextInt(3);
            StringBuilder dogBreed = new StringBuilder();
            dogBreed.append(breeds[m]);
            age = random.nextInt(20);
            Dogs newDog = new Dogs(dogName.toString(), dogBreed.toString(), age);
            dogList.add(newDog);
        }

        for (Dogs dog : dogList) {
            System.out.println(dog.dogName + " " + dog.dogBreed + " " + dog.dogAge);
        }

    }




}

package com.csayer.DogMachine;
import Dog;
import DogDb;
import java.util.Scanner;
 
public class DogMachine
{
    public static void main(String []args)
    {
        DogDb db = new DogDb();
        Dog cDog = new Dog();
        Scanner scn = new Scanner(System.in);
        String breed = "";
        //TODO:
        //Add scanner stuff here
        System.out.println("name: ");
        cDog.name = scn.nextLine();

        //Dog.breed is set to an int so we set it to a local variable
        //named breed then set Dog.breed to the int version
        System.out.println("breed: ");
        breed = scn.nextLine();

        System.out.println("weight: ");
        cDog.weight = scn.nextFloat();

        System.out.println("age: ");
        cDog.age = scn.nextInt();
        switch(breed)
        {
            case "beagle":
                break;
            
            default:
                System.out.println("[ FATAL ] Breed not recognized. Falling back...");
                //Fallback breed is beagle
                cDog.breed = 1;
        }
        //Finally, call getDog()
        db.getDog(cDog);
    }
}


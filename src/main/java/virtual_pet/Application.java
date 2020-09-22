package virtual_pet;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO greet
        //TODO give instructions
        //TODO take user input
        System.out.print("Please enter a name for your new pet: ");
        String name = input.nextLine();
        VirtualPet myVirtualPet = new VirtualPet(name);
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet bobbo = new VirtualPet("Bobbo");
        VirtualPet mambo = new VirtualPet("Mambo");
        shelter.addToShelter(bobbo);
        shelter.addToShelter(mambo);

        System.out.println("PET NAME IS " + myVirtualPet.getName() +
                "\nStats: " + myVirtualPet.getBoredom() + ", " + myVirtualPet.getEnergy() + ", " + myVirtualPet.getHunger() + ", " +
                myVirtualPet.getPlayfulness() + ", " + myVirtualPet.getThirst() + ".");
        for (VirtualPet petToDisplay : shelter.retrievePets()){
            System.out.println(petToDisplay.toString());
        }


    }

}

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
        shelter.addToShelter(myVirtualPet);

        System.out.println("PET NAME IS " + myVirtualPet.getName() +
                "\nStats: " + myVirtualPet.getBoredom() + ", " + myVirtualPet.getEnergy() + ", " + myVirtualPet.getHunger() + ", " +
                myVirtualPet.getPlayfulness() + ", " + myVirtualPet.getThirst() + ".");
//        for (VirtualPet petToDisplay : shelter.retrievePets()){
//            System.out.println(petToDisplay.toString());
//        }
        shelter.getStatusOfAllPets();
        String petToPlayWith = "";
        while (!(petToPlayWith.equalsIgnoreCase("quit"))) {
            System.out.println("Which pet would you like to play with?" +
                    "\nType \"quit\" to exit");
            petToPlayWith = input.nextLine().toLowerCase();
            System.out.println();

            if (shelter.getShelter().containsKey(petToPlayWith)) {
                int decisionInputOption = 0;
                while (decisionInputOption != 4) {
                    System.out.println("What would you like to do with " + petToPlayWith + "?" +
                            "\nType 1 to play, 2 to feed, 3 to water, 4 to return to the main menu.");
                    decisionInputOption = input.nextInt();
                    input.nextLine();

                    switch (decisionInputOption) {
                        case 1:
                            shelter.retrievePet(petToPlayWith).play();
                            break;
                        case 2:
                            shelter.retrievePet(petToPlayWith).feed();
                            break;
                        case 3:
                            shelter.retrievePet(petToPlayWith).hydrate();
                            break;
                        case 4:
                            System.out.println(petToPlayWith + " waves goodbye. Goodbye sweet little " + petToPlayWith + "!");
                            break;
                        default:
                            System.out.println("Please choose 1, 2, 3, or 4");
                    }
                }
            } else if (petToPlayWith.equalsIgnoreCase("quit")){
                System.out.println("The shelter is closed for the day. We say goodbye to all our little friends." +
                        "\n We hope to see you again.");
            }
            else {
                System.out.println(petToPlayWith + " isn't here right now!");
            }
            System.out.println("");
        }


    }

}

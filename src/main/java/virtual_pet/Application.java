package virtual_pet;

import java.util.Collection;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.newPetForShelter();
        Scanner input = new Scanner(System.in);
        VirtualPet bobbo = new OrganicPet("Bobbo");
        VirtualPet mambo = new OrganicPet("Mambo");
        shelter.addToShelter(bobbo);
        shelter.addToShelter(mambo);
        //        System.out.println("Status of all pets:");
        //        shelter.getStatusOfAllPets();
        String petToPlayWith = "";
        while (!(petToPlayWith.equalsIgnoreCase("quit"))) {
            System.out.println("Which pet would you like to play with?" +
                    "\nType \"quit\" to exit");
            shelter.getStatusOfAllPets();
            petToPlayWith = input.nextLine().toLowerCase();
            System.out.println();

            if (shelter.getShelter().containsKey(petToPlayWith)) {
                int decisionInputOption = 0;

                if (shelter.retrievePet(petToPlayWith) instanceof OrganicPet) {
                    while (decisionInputOption != 5) {
                        System.out.println("What would you like to do with " + petToPlayWith + "?" +
                                        "\n" + shelter.retrievePet(petToPlayWith) +
                                "\nType 0 to walk, 1 to play, 2 to feed, 3 to water, 4 to clean their cage, or 5 to return to the main menu.");
                        decisionInputOption = input.nextInt();
                        input.nextLine();
                        switch (decisionInputOption) {
                            case 0:
                                if (shelter.retrievePet(petToPlayWith) instanceof Dog) {
                                    ((Dog) shelter.retrievePet(petToPlayWith)).takeOnWalk();
                                } else
                                    System.out.println(petToPlayWith + " did not appreciate you trying to put a leash on them!");
                                break;
                            case 1:
                                shelter.retrievePet(petToPlayWith).play();
                                break;
                            case 2:
                                ((OrganicPet) shelter.retrievePet(petToPlayWith)).feed();
                                break;
                            case 3:
                                ((OrganicPet) shelter.retrievePet(petToPlayWith)).hydrate();
                                break;
                            case 4:
                                ((OrganicPet) shelter.retrievePet(petToPlayWith)).cleanCage();
                                break;
                            case 5:
                                System.out.println(petToPlayWith + " waves goodbye. Goodbye sweet little " + petToPlayWith + "!");
                                break;
                            default:
                                System.out.println("Please choose 1, 2, 3, or 4");
                        }
                        shelter.tickAllPets();
                    }
                } else if (shelter.retrievePet(petToPlayWith) instanceof RoboticPet) {
                    while (decisionInputOption != 4) {
                        System.out.println("What would you like to do with " + petToPlayWith + "?" +
                                "\n" + shelter.retrievePet(petToPlayWith) +
                                "\nType 0 to walk, 1 to play, 2 to maintain, 3 to oil, 4 to return to the main menu.");
                        decisionInputOption = input.nextInt();
                        input.nextLine();
                        switch (decisionInputOption) {
                            case 0:
                                if (shelter.retrievePet(petToPlayWith) instanceof Dog) {
                                    ((Dog) shelter.retrievePet(petToPlayWith)).takeOnWalk();
                                } else {
                                    System.out.println(petToPlayWith + " did not appreciate you trying to put a leash on them!");
                                }
                                break;
                            case 1:
                                shelter.retrievePet(petToPlayWith).play();
                                break;
                            case 2:
                                ((RoboticPet) shelter.retrievePet(petToPlayWith)).maintainRobot();
                                break;
                            case 3:
                                ((RoboticPet) shelter.retrievePet(petToPlayWith)).oilRobot();
                                break;
                            case 4:
                                System.out.println(petToPlayWith + " waves goodbye. Goodbye sweet little " + petToPlayWith + "!");
                                break;
                            default:
                                System.out.println("Please choose 1, 2, 3, or 4");
                        }
                        shelter.tickAllPets();
                    }
                    shelter.tickAllPets();
                }
            } else if (petToPlayWith.equalsIgnoreCase("quit")) {
                System.out.println("The shelter is closed for the day. We say goodbye to all our little friends." +
                        "\n We hope to see you again.");
            } else {
                System.out.println(petToPlayWith + " isn't here right now!");
            }
            System.out.println("");
        }


    }

}

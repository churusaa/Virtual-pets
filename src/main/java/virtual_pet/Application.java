package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a name for your new pet: ");
        String name = input.nextLine();
        VirtualPet myVirtualPet = new VirtualPet(
                name, //name
                (int)(Math.random()*100), //hunger
                (int)(Math.random()*100), //thirst
                (int)(Math.random()*100), //boredom
                (int)(Math.random()*100), //playfulness
                (int)(Math.random()*100)); //energy


        System.out.println("PET NAME IS "+myVirtualPet.getName()+
                "\nStats: "+ myVirtualPet.getBoredom()+", "+ myVirtualPet.getEnergy()+", "+ myVirtualPet.getHunger()+", "+
                myVirtualPet.getPlayfulness()+", "+ myVirtualPet.getThirst()+".");


    }

}
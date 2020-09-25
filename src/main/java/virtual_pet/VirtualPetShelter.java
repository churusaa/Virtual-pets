package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets;

//    Collection<VirtualPet> virtualPetShelter = new Collection<VirtualPet>();
//    virtualPetShelter.put();

public void newPetForShelter() {
    Scanner newPetInput = new Scanner(System.in);
    System.out.println("Create a virtual pet!" +
            "\nEnter 1 for Robotic Dog" +
            "\nEnter 2 for Robotic Cat" +
            "\nEnter 3 for Organic Cat" +
            "\nEnter 4 for Organic Dog");
    int myVirtualPetClass = newPetInput.nextInt();
    newPetInput.nextLine();
    System.out.print("Please enter a name for your new pet: ");
    String name = newPetInput.nextLine();
    VirtualPet myVirtualPet;
    switch (myVirtualPetClass) {
        case 1:
            myVirtualPet = new RoboticDog(name);
            break;
        case 2:
            myVirtualPet = new RoboticCat(name);
            break;
        case 3:
            myVirtualPet = new OrganicCat(name);
            break;
        case 4:
            myVirtualPet = new OrganicDog(name);
            break;
        default:
            myVirtualPet = new OrganicDog(name);
            break;
    }
    this.addToShelter(myVirtualPet);
    System.out.println("PET NAME IS " + name + "\n" + myVirtualPet.toString());
    System.out.println();
}

    public VirtualPetShelter() {
        pets = new HashMap<String, VirtualPet>();
    }

    public Map getShelter() {
        return pets;
    }

    public void addToShelter(VirtualPet petToAdd) {
        pets.put(petToAdd.getName().toLowerCase(), petToAdd);
    }

    public void removePet(String petName) {
        pets.remove(petName.toLowerCase());
    }

    public Collection<VirtualPet> retrievePets() {
        return pets.values();
    }

    public VirtualPet retrievePet(String name) {
        return pets.get(name);
    }

    public void feedAllOrganicPets() {
        for (VirtualPet petToFeed : pets.values()) {
            if (petToFeed instanceof OrganicPet) {
                ((OrganicPet) petToFeed).feed();
            }
        }
    }

    public void tickAllPets() {
        for (VirtualPet petToTick : pets.values()) {
            petToTick.tick();
        }
    }

    public void hydrateAllOrganicPets() {
        for (VirtualPet petToHydrate : pets.values()) {
            if (petToHydrate instanceof OrganicPet) {
                ((OrganicPet) petToHydrate).hydrate();
            }
        }
    }

    public void playWithAllPets() {
        for (VirtualPet petToPlayWith : pets.values()) {
            petToPlayWith.play();
        }
    }

    public void getStatusOfAllPets() {
        System.out.println();
        for (VirtualPet petToDisplay : this.retrievePets()) {
            System.out.println(petToDisplay.toString());
        }
    }
}

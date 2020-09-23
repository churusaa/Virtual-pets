package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets;

//    Collection<VirtualPet> virtualPetShelter = new Collection<VirtualPet>();
//    virtualPetShelter.put();

    public VirtualPetShelter() {
        pets = new HashMap<String, VirtualPet>();
    }

    public Map getShelter(){
        return pets;
    }

    public void addToShelter(VirtualPet petToAdd) {
        pets.put(petToAdd.getName().toLowerCase(), petToAdd);
    }

    public void removePet(String petName){
        pets.remove(petName);
    }

    public Collection<VirtualPet> retrievePets() {
        return pets.values();
    }

    public VirtualPet retrievePet(String name){
        return pets.get(name);
    }

    public void feedAllPets() {
        for (VirtualPet petToFeed : pets.values()){
          petToFeed.feed();
        }
    }

    public void tickAllPets(){
        for (VirtualPet petToTick : pets.values()){
            petToTick.tick();
        }
    }

    public void hydrateAllPets() {
        for (VirtualPet petToHydrate : pets.values()){
            petToHydrate.hydrate();
        }
    }

    public void playWithAllPets() {
        for (VirtualPet petToPlayWith : pets.values()){
            petToPlayWith.play();
        }
    }

    public void getStatusOfAllPets() {
        System.out.println();
        for (VirtualPet petToDisplay : this.retrievePets()){
            System.out.println(petToDisplay.toString());
        }
    }
}

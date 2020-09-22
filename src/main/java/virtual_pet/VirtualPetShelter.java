package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets;

//    Collection<VirtualPet> virtualPetShelter = new Collection<VirtualPet>();

//    virtualPetShelter.put();

    public VirtualPetShelter() {
        pets = new HashMap<String, VirtualPet>();
    }

    public Map getShelter(){
        return pets;
    }


    public void addToShelter(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public Collection<VirtualPet> retrievePets() {
        return pets.values();
    }


    public void feedAll() {
    }
}

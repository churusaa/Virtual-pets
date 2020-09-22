package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Map.Entry;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class VirtualPetShelterTest {

    @BeforeEach
    void setUp(){
        VirtualPetShelter franklinCounty = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Test Name", 12, 10, 35, 255, 128);

    }

//    @Test
//    public void shouldBeAbleToCreateVirtualPetShelterObject() {
//        VirtualPetShelter franklinCounty = new VirtualPetShelter();
//    }

    @Test
    public void shouldBeAbleToAddVirtualPetToShelter() {
        VirtualPetShelter franklinCounty = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Test Name", 12, 10, 35, 255, 128);

        franklinCounty.addToShelter(pet);

        assertThat(franklinCounty.retrievePets()).contains(pet);

    }

    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter franklinCounty = new VirtualPetShelter();
        VirtualPet petA = new VirtualPet("A", 12, 10, 35, 255, 128);
        VirtualPet petB = new VirtualPet("B", 12, 10, 35, 255, 128);


        franklinCounty.feedAll();

        for(Entry<String, String> entry: franklinCounty.getShelter().entrySet()) {
            System.out.println("The student's id is " + entry.getKey());
            System.out.println("The student's name is " + entry.getValue());
        }
    }

}

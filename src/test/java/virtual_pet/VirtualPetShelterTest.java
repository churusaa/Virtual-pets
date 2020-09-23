package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class VirtualPetShelterTest {

    @BeforeEach
    void setUp() {
        //TODO create test shelter to replace boilerplate in test methods
        VirtualPetShelter testShelter = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Test Name");
    }

    @Test
    public void shouldBeAbleToAddPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Bobbo");
        underTest.addToShelter(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                .contains(testPet);
    }

    @Test
    public void shouldBeAbleToRemovePet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Bobbo");
        underTest.addToShelter(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                .isEmpty();
    }

    @Test
    public void shouldBeAbleToFeedAllPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new VirtualPet("A");
        VirtualPet petB = new VirtualPet("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their hunger before feeding
        int hungerBeforeFeedA = petA.getHunger();
        int hungerBeforeFeedB = petB.getHunger();
        //Feed all pets
        underTest.feedAllPets();
        //Make sure pets return a lower hunger value after feeding
        assertThat(petA.getHunger()).isLessThan(hungerBeforeFeedA);
        assertThat(petB.getHunger()).isLessThan(hungerBeforeFeedB);
    }

    @Test
    public void shouldBeAbleToHydrateAllPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new VirtualPet("A");
        VirtualPet petB = new VirtualPet("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their thirst before Hydrating
        int thirstBeforeHydrateA = petA.getThirst();
        int thirstBeforeHydrateB = petB.getThirst();
        //Hydrate all pets
        underTest.hydrateAllPets();
        //Make sure pets return a lower thirst value after Hydrating
        assertThat(petA.getThirst()).isLessThan(thirstBeforeHydrateA);
        assertThat(petB.getThirst()).isLessThan(thirstBeforeHydrateB);
    }

    @Test
    public void shouldBeAbleToTickAllPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new VirtualPet("A");
        VirtualPet petB = new VirtualPet("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their hunger before ticking
        int hungerBeforeTickA = petA.getHunger();
        int hungerBeforeTickB = petB.getHunger();
        //Feed all pets
        underTest.tickAllPets();
        //Make sure pets return a higher hunger value after ticking
        assertThat(petA.getHunger()).isGreaterThan(hungerBeforeTickA);
        assertThat(petB.getHunger()).isGreaterThan(hungerBeforeTickB);
    }

    @Test
    public void shouldBeAbleToPlayWithAllPets(){
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new VirtualPet("A");
        VirtualPet petB = new VirtualPet("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check energy before play
        underTest.tickAllPets();
        int boredomBeforePlayA = petA.getBoredom();
        int boredomBeforePlayB = petB.getBoredom();
        //Play with all pets
        underTest.playWithAllPets();
        assertThat(petA.getBoredom()).isLessThan(boredomBeforePlayA);
        assertThat(petB.getBoredom()).isLessThan(boredomBeforePlayB);
    }

    //TODO Test to get status of all pets
    @Test
    public void shouldBeAbleToShowAllPetsStatus(){
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new VirtualPet("A");
        VirtualPet petB = new VirtualPet("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Display status of all pets in shelter
//        underTest.getStatusOfAllPets();
//        assertThat(underTest.getStatusOfAllPets()).isNotNull();
    }
}

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
        VirtualPet pet = new OrganicDog("Test Name");
    }

    @Test
    public void shouldBeAbleToAddPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Bobbo");
        underTest.addToShelter(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                .contains(testPet);
    }

    @Test
    public void shouldBeAbleToRemovePet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Bobbo");
        underTest.addToShelter(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                .isEmpty();
    }

    @Test
    public void shouldBeAbleToFeedAllOrganicPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        OrganicPet petA = new OrganicCat("A");
        RoboticPet petB = new RoboticDog("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their hunger before feeding
        int hungerBeforeFeedA = petA.getHunger();
//        int hungerBeforeFeedB = petB.getHunger();
        //Feed all pets
        underTest.feedAllOrganicPets();
        //Make sure pets return a lower hunger value after feeding
        assertThat(petA.getHunger()).isLessThan(hungerBeforeFeedA);
//        assertThat(petB.getHunger()).isLessThan(hungerBeforeFeedB);
    }

    @Test
    public void shouldBeAbleToHydrateAllOrganicPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        OrganicPet petA = new OrganicDog("A");
        OrganicPet petB = new OrganicDog("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their thirst before Hydrating
        int thirstBeforeHydrateA = petA.getThirst();
        int thirstBeforeHydrateB = petB.getThirst();
        //Hydrate all pets
        underTest.hydrateAllOrganicPets();
        //Make sure pets return a lower thirst value after Hydrating
        assertThat(petA.getThirst()).isLessThan(thirstBeforeHydrateA);
        assertThat(petB.getThirst()).isLessThan(thirstBeforeHydrateB);
    }

    @Test
    public void shouldBeAbleToTickAllPets() {
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new OrganicDog("A");
        VirtualPet petB = new RoboticDog("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Check their energy before ticking
        int energyBeforeTickA = petA.getEnergy();
        int energyBeforeTickB = petB.getEnergy();
        //Feed all pets
        underTest.tickAllPets();
        //Make sure pets return a lower energy value after ticking
        assertThat(petA.getEnergy()).isLessThan(energyBeforeTickA);
        assertThat(petB.getEnergy()).isLessThan(energyBeforeTickB);
    }

    @Test
    public void shouldBeAbleToPlayWithAllPets(){
        //Create Shelter
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Create Pets
        VirtualPet petA = new OrganicDog("A");
        VirtualPet petB = new RoboticDog("B");
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
        VirtualPet petA = new OrganicDog("A");
        VirtualPet petB = new OrganicDog("B");
        //Add pets to shelter
        underTest.addToShelter(petA);
        underTest.addToShelter(petB);
        //Display status of all pets in shelter
//        underTest.getStatusOfAllPets();
//        assertThat(underTest.getStatusOfAllPets()).isNotNull();
    }
}

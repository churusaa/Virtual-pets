package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new OrganicPet("Test Name");
    }

    @Test
    public void petShouldHaveName() {
        //arrangement
        VirtualPet underTest = new OrganicPet("Jeff");
        //action
        String result = underTest.getName();
        //assertion
        assertEquals("Jeff", result);
    }

    @Test
    public void shouldTick() {
        VirtualPet pet = new OrganicCat("Brenda");
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();

        pet.tick();

        int boredomAfterTick = pet.getBoredom();
        int playfulnessAfterTick = pet.getPlayfulness();
        int playEnergyAfterTick = pet.getEnergy();

        assertEquals(boredom + 10, boredomAfterTick);
        assertEquals(playfulness + 10, playfulnessAfterTick);
        assertTrue(playEnergyAfterTick < playEnergy);
    }

    @Test
    public void shouldFeedDecreaseHungerForOrganicPets() {
        OrganicPet dogA = new OrganicDog("Bowser");
        OrganicPet catA = new OrganicCat("Mittens");
        dogA.tick();
        catA.tick();
        int initialHungerDog = dogA.getHunger();
        int initialHungerCat = catA.getHunger();
        dogA.feed();
        catA.feed();

        int hungerAfterFeedDog = dogA.getHunger();
        int hungerAfterFeedCat = catA.getHunger();
        assertTrue((hungerAfterFeedDog < initialHungerDog) && (hungerAfterFeedCat < initialHungerCat));
    }

    @Test
    public void shouldHydrateDecreaseThirstForOrganicPets(){
        OrganicPet pet = new OrganicCat("Brenda");
        int initialThirst = pet.getThirst();
        pet.hydrate();
        int thirstAfterHydrate = pet.getThirst();

        assertTrue(thirstAfterHydrate < initialThirst);
    }

    @Test
    public void shouldPlayUpdateAttitude() {
        VirtualPet pet = new RoboticDog("Bailey");
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();

        pet.play();

        int boredomAfterPlay = pet.getBoredom();
        int playfulnessAfterPlay = pet.getPlayfulness();
        int playEnergyAfterPlay = pet.getEnergy();

        assertFalse(playEnergy == playEnergyAfterPlay);
        assertFalse(boredom == boredomAfterPlay);
        assertFalse(playfulness == playfulnessAfterPlay);

    }

    @Test
    public void shouldRoboticAttributesNotBeOutOfBounds() {
        RoboticPet pet = new RoboticCat("Gertude");
        //TODO make this method use setters
        pet.play();
        pet.oilRobot();
        pet.maintainRobot();
        assertTrue(pet.getMaintenanceLevel() <= 100);
        assertTrue(pet.getOilLevel() >= 0);
        assertTrue(pet.getBoredom() >= 0);
        assertTrue(pet.getEnergy() >= 0);
        assertTrue(pet.getPlayfulness() >= 0);
    }

    @Test
    public void shouldOrganicAttributesNotBeNegative(){
        OrganicPet pet = new OrganicCat("Gertie");
        //TODO make this method use setters
        pet.play();
        pet.feed();
        pet.hydrate();

        assertTrue(pet.getHunger() >= 0);
        assertTrue(pet.getThirst() >= 0);
        assertTrue(pet.getBoredom() >= 0);
        assertTrue(pet.getEnergy() >= 0);
        assertTrue(pet.getPlayfulness() >= 0);
    }


}

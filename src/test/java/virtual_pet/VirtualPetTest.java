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

//    @Test
//    public void shouldHaveDefaultHunger() {
//        VirtualPet underTest = new OrganicPet("Steve");
//
//        int expected = underTest.getHunger();
//
//        assertEquals(expected, 10);
//    }

//    @Test
//    public void shouldHaveDefaultThirst() {
//        VirtualPet underTest = new OrganicPet("Brenda");
//
//        int expected = underTest.getThirst();
//
//        assertEquals(expected, 8);
//    }

//    @Test
//    public void shouldHaveDefaultBoredom() {
//        VirtualPet underTest = new OrganicPet("Gerdie");
//
//        int expected = underTest.getBoredom();
//
//        assertEquals(expected, 20);
//    }
//
//    @Test
//    public void shouldHaveDefaultPlayfulness() {
//        VirtualPet underTest = new OrganicPet("Rock");
//
//        int expected = underTest.getPlayfulness();
//
//        assertEquals(expected, 255);
//    }
//
//    @Test
//    public void shouldHaveDefaultEnergy() {
//        VirtualPet underTest = new OrganicPet("Brenda");
//
//        int expected = underTest.getEnergy();
//
//        assertEquals(expected, 128);
//    }

    @Test
    public void shouldTick() {
        VirtualPet pet = new OrganicPet("Brenda");
//        int thirst = pet.getThirst();
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();

//        int initialHunger = pet.getHunger();
        pet.tick();

//        int hungerAfterTick = pet.getHunger();
//        int thirstAfterTick = pet.getThirst();
        int boredomAfterTick = pet.getBoredom();
        int playfulnessAfterTick = pet.getPlayfulness();
        int playEnergyAfterTick = pet.getEnergy();

//        assertEquals(initialHunger + 10, hungerAfterTick);
//        assertEquals(thirst + 10, thirstAfterTick);
        assertEquals(boredom + 10, boredomAfterTick);
        assertEquals(playfulness + 10, playfulnessAfterTick);
        assertTrue(playEnergyAfterTick < playEnergy);


    }

//    @Test
//    public void shouldFeedDecreaseHunger() {
//        VirtualPet pet = new OrganicPet("Brenda");
//        int initialHunger = pet.getHunger();
//        pet.feed();
//
//        int hungerAfterFeed = pet.getHunger();
//        assertTrue(hungerAfterFeed < initialHunger);
//
//    }

//    @Test
//    public void shouldHydrateDecreaseThirst(){
//        VirtualPet pet = new OrganicPet("Brenda");
//        int initialThirst = pet.getThirst();
//        pet.hydrate();
//        int thirstAfterHydrate = pet.getThirst();
//
//        assertTrue(thirstAfterHydrate < initialThirst);
//    }

    @Test
    public void shouldPlayUpdateAttitude() {
        VirtualPet pet = new OrganicPet("Brenda");
//        int thirst = pet.getThirst();
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();
//
//        int initialHunger = pet.getHunger();
        pet.play();
//
//        int hungerAfterPlay = pet.getHunger();
//        int thirstAfterPlay = pet.getThirst();
        int boredomAfterPlay = pet.getBoredom();
        int playfulnessAfterPlay = pet.getPlayfulness();
        int playEnergyAfterPlay = pet.getEnergy();

//        assertFalse(initialHunger == hungerAfterPlay);
//        assertFalse(thirst == thirstAfterPlay);
        assertFalse(playEnergy == playEnergyAfterPlay);
        assertFalse(boredom == boredomAfterPlay);
        assertFalse(playfulness == playfulnessAfterPlay);

    }

    @Test
    public void shouldAttributesNotBeNegative(){
        VirtualPet pet = new OrganicPet("Gertude");
        //TODO make this method use setters
        pet.play();
//        pet.feed();
//        pet.hydrate();
//        assertTrue(pet.getHunger() >= 0);
//        assertTrue(pet.getThirst() >=0);
        assertTrue(pet.getBoredom() >= 0);
        assertTrue(pet.getEnergy() >= 0);
        assertTrue(pet.getPlayfulness() >= 0);


    }



}

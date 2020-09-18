package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name", 12, 10, 35, 255, 128);
    }

    @Test
    public void petShouldHaveName() {
        //arrangement
        VirtualPet underTest = new VirtualPet("Jeff", 15, 14, 50, 255, 128);

        //action
        String result = underTest.getName();

        //assertion
        assertEquals("Jeff", result);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 1, 11, 255, 128);

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Brenda", 10, 8, 15, 255, 128);

        int expected = underTest.getThirst();

        assertEquals(expected, 8);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Gerdie", 10, 8, 20, 255, 128);

        int expected = underTest.getBoredom();

        assertEquals(expected, 20);
    }

    @Test
    public void shouldHaveDefaultPlayfulness() {
        VirtualPet underTest = new VirtualPet("Rock", 10, 8, 100, 255, 128);

        int expected = underTest.getPlayfulness();

        assertEquals(expected, 255);
    }

    @Test
    public void shouldHaveDefaultEnergy() {
        VirtualPet underTest = new VirtualPet("Brenda", 10, 8, 64, 255, 128);

        int expected = underTest.getEnergy();

        assertEquals(expected, 128);
    }

    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("Brenda", 10, 8, 64, 255, 9);
        int thirst = pet.getThirst();
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();

        int initialHunger = pet.getHunger();
        pet.tick();

        int hungerAfterTick = pet.getHunger();
        int thirstAfterTick = pet.getThirst();
        int boredomAfterTick = pet.getBoredom();
        int playfulnessAfterTick = pet.getPlayfulness();
        int playEnergyAfterTick = pet.getEnergy();

        assertEquals(initialHunger + 10, hungerAfterTick);
        assertEquals(thirst + 10, thirstAfterTick);
        assertEquals(boredom + 10, boredomAfterTick);
        assertEquals(playfulness + 10, playfulnessAfterTick);
        assertTrue(playEnergyAfterTick < playEnergy);


    }

    @Test
    public void shouldFeedDecreaseHunger() {
        VirtualPet pet = new VirtualPet("Brenda", 10, 8, 64, 255, 128);
        int initialHunger = pet.getHunger();
        pet.feed();

        int hungerAfterFeed = pet.getHunger();
        assertTrue(hungerAfterFeed < initialHunger);

    }

    @Test
    public void shouldHydrateDecreaseThirst(){
        VirtualPet pet = new VirtualPet("Brenda", 10, 8, 64, 255, 128);
        int initialThirst = pet.getThirst();
        pet.hydrate();
        int thirstAfterHydrate = pet.getThirst();

        assertTrue(thirstAfterHydrate < initialThirst);
    }

    @Test
    public void shouldPlayUpdateAttitude() {
        VirtualPet pet = new VirtualPet("Brenda", 10, 8, 9, 39, 29);
        int thirst = pet.getThirst();
        int boredom = pet.getBoredom();
        int playfulness = pet.getPlayfulness();
        int playEnergy = pet.getEnergy();

        int initialHunger = pet.getHunger();
        pet.play();

        int hungerAfterPlay = pet.getHunger();
        int thirstAfterPlay = pet.getThirst();
        int boredomAfterPlay = pet.getBoredom();
        int playfulnessAfterPlay = pet.getPlayfulness();
        int playEnergyAfterPlay = pet.getEnergy();

        assertFalse(initialHunger == hungerAfterPlay);
        assertFalse(thirst == thirstAfterPlay);
        assertFalse(playEnergy == playEnergyAfterPlay);
        assertFalse(boredom == boredomAfterPlay);
        assertFalse(playfulness == playfulnessAfterPlay);

    }

    @Test
    public void shouldAttributesNotBeNegative(){
        VirtualPet pet = new VirtualPet("Gertude" , 0 , 0 , 0 , 0 , 0);
        pet.play();
        pet.feed();
        pet.hydrate();
        assertTrue(pet.getHunger() >= 0);
        assertTrue(pet.getThirst() >=0);
        assertTrue(pet.getBoredom() >= 0);
        assertTrue(pet.getEnergy() >= 0);
        assertTrue(pet.getPlayfulness() >= 0);


    }



}

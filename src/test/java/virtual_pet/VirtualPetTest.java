package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name", 12, 10, 35, 255);
    }

    @Test
    public void petShouldHaveName() {
        //arrangement
        VirtualPet underTest = new VirtualPet("Jeff", 15, 14, 50, 255);

        //action
        String result = underTest.getName();

        //assertion
        assertEquals("Jeff", result);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 1, 11, 255);

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Brenda", 10, 8, 15, 255);

        int expected = underTest.getThirst();

        assertEquals(expected, 8);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Gerdie", 10, 8, 20, 255);

        int expected = underTest.getBoredom();

        assertEquals(expected, 20);
    }

    //TODO add Playfulness
    @Test
    public void shouldHaveDefaultPlayfulness() {
        VirtualPet underTest = new VirtualPet("Rock", 10, 8, 100, 255);

        int expected = underTest.getPlayfulness();

        assertEquals(expected, 255);
    }
/*
    //TODO add Energy
    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Brenda", 10, 8, 64);

        int expected = underTest.getThirst();

        assertEquals(expected, 8);
    }

*/
}

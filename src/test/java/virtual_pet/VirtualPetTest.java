package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name", 12, 10);
    }

    @Test
    public void petShouldHaveName() {
        //arrangement
        VirtualPet underTest = new VirtualPet("Jeff", 15, 14);

        //action
        String result = underTest.getName();

        //assertion
        assertEquals("Jeff", result);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 1);

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Brenda", 10, 8);

        int expected = underTest.getThirst();

        assertEquals(expected, 8);
    }

    //TODO add Boredom

    //TODO add Playfulness

    //TODO add Energy


}

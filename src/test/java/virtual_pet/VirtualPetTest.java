package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        VirtualPet pet = new VirtualPet( "Brenda", 10, 8, 64, 255, 128);
        int thirst=pet.getThirst();
        int boredom=pet.getBoredom();
        int playfulness=pet.getPlayfulness();
        int playEnergy=pet.getEnergy();




        int initialHunger = pet.getHunger();
        pet.tick();

        int hungerAfterTick = pet.getHunger();
        int thirstAfterTick=pet.getThirst();
        int boredomAfterTick=pet.getBoredom();
        int playfulnessAfterTick=pet.getPlayfulness();
        int playEnergyAfterTick=pet.getEnergy();

        assertEquals(initialHunger + 10, hungerAfterTick);

        assertEquals(thirst + 10, thirstAfterTick);
        assertEquals(boredom + 10, boredomAfterTick);
        assertEquals(playfulness+ 10, playfulnessAfterTick);
        assertEquals(playEnergy-10, playEnergyAfterTick);

    }
  @Test
  public void shouldFeedDecreaseHunger(){
     VirtualPet pet=new VirtualPet("Brenda", 10, 8, 64, 255, 128);
      int initialHunger = pet.getHunger();
      pet.feed();

      int hungerAfterFeed = pet.getHunger();
      if (initialHunger<51){
          assertEquals(0, hungerAfterFeed);
      }
      else {assertEquals(initialHunger -50, hungerAfterFeed);
      }

      }

  @Test
    public void shouldPlayUpdateAttitude(){
      VirtualPet pet=new VirtualPet("Brenda", 10, 8, 64, 255, 128);
      int thirst=pet.getThirst();
      int boredom=pet.getBoredom();
      int playfulness=pet.getPlayfulness();
      int playEnergy=pet.getEnergy();




      int initialHunger = pet.getHunger();
      pet.play();

      int hungerAfterPlay= pet.getHunger();
      int thirstAfterPlay=pet.getThirst();
      int boredomAfterPlay=pet.getBoredom();
      int playfulnessAfterPlay=pet.getPlayfulness();
      int playEnergyAfterPlay=pet.getEnergy();

      assertEquals(initialHunger + 15, hungerAfterPlay);

      assertEquals(thirst + 15, thirstAfterPlay);
      assertEquals(boredom -10, boredomAfterPlay);
      assertEquals(playfulness-40, playfulnessAfterPlay);
      assertEquals(playEnergy-30, playEnergyAfterPlay);










  }






}

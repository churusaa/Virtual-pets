package virtual_pet;

public class OrganicPet extends VirtualPet {
    protected int hunger;
    protected int thirst;

    public OrganicPet(String name) {
        super(name);
    }

    @Override
    public void tick() {
        hunger += 10;
        thirst += 10;
        boredom += 10;
        playfulness += 10;
        energy -= 10;

        if (energy < 0) {
            energy = 0;
        }
    }

    public void feed() {
        hunger -= 50;
        if (hunger < 0) {
            hunger = 0;
        }

    }

    public void hydrate() {
        thirst -= 50;
        if (thirst < 0) {
            thirst = 0;
        }

    }
        @Override
    //nice up the output by calling our homebrew class .toString()
    public String toString(){
        return name + ":\nHunger: " + hunger + " | Thirst: " + thirst + " | Energy: " + energy + " | Playfulness: " + playfulness + " | Boredom: " + boredom;
    }

}

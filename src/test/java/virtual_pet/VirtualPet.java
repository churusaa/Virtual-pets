package virtual_pet;


public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int playfulness;
    private int energy;

    public VirtualPet(String name, int hunger, int thirst, int boredom, int playfulness, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.playfulness = playfulness;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getPlayfulness() {
        return playfulness;
    }

    public int getEnergy() {
        return energy;
    }
}

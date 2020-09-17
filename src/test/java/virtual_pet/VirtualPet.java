package virtual_pet;


public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int playfulness;

    public VirtualPet(String name, int hunger, int thirst, int boredom, int playfulness) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.playfulness = playfulness;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst; }

    public int getBoredom() {
        return boredom;
    }

    public int getPlayfulness() {
        return playfulness;
    }
}

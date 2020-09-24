package virtual_pet;

public class OrganicPet extends VirtualPet {
    protected int hunger;
    protected int thirst;
    protected int ticksUntilSoiled;
    protected boolean isCageSoiled;

    public OrganicPet(String name) {
        super(name);
        this.hunger = (int) (Math.random() * 100);
        this.thirst = (int) (Math.random() * 100);
        this.ticksUntilSoiled = 5;
        this.isCageSoiled = false;

    }
    public void cleanCage(){
        isCageSoiled = false;
    }
    public boolean getCageStatus(){
        return isCageSoiled;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    @Override
    public void tick() {
        hunger += 10;
        thirst += 10;
        boredom += 10;
        playfulness += 10;
        energy -= 10;
        ticksUntilSoiled -= 1;
        if (ticksUntilSoiled <= 0) {
            ticksUntilSoiled = 10;
            isCageSoiled = true;
        }

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

    public void play() {
        hunger += 15;
        thirst += 15;
        boredom -= 10;
        playfulness -= 40;
        energy -= 30;
        if (energy < 0) {
            energy = 0;
        }
        if (boredom < 0) {
            boredom = 0;
        }
        if (playfulness < 0) {
            playfulness = 0;
        }
    }

    @Override
    //nice up the output by calling our homebrew class .toString()
    public String toString() {
        return name + ":\nHunger: " + hunger + " | Thirst: " + thirst + " | Energy: " + energy + " | Playfulness: " + playfulness + " | Boredom: " + boredom;
    }

}

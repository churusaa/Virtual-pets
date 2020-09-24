package virtual_pet;

public abstract class VirtualPet {

    protected String name;
    protected int boredom;
    protected int playfulness;
    protected int energy;

    public VirtualPet(String name) {
        this.name = name;
        this.boredom = (int) (Math.random() * 100);
        this.playfulness = (int) (Math.random() * 100);
        this.energy = (int) (Math.random() * 100);
    }

    public String getName() {
        return name;
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

    public abstract void tick();

    public abstract void play();

}

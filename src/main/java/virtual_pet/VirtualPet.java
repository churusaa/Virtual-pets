package virtual_pet;

public abstract class VirtualPet {

    protected String name;
//    private int hunger;
//    private int thirst;
    protected int boredom;
    protected int playfulness;
    protected int energy;

    public VirtualPet(String name) {
        this.name = name;
//        this.hunger = (int)(Math.random()*100);
//        this.thirst = (int)(Math.random()*100);
        this.boredom = (int)(Math.random()*100);
        this.playfulness = (int)(Math.random()*100);
        this.energy = (int)(Math.random()*100);
    }

    public String getName() {
        return name;
    }

//    public int getHunger() {
//        return hunger;
//    }
//
//    public int getThirst() {
//        return thirst;
//    }

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
//        hunger += 10;
//        thirst += 10;
//        boredom += 10;
//        playfulness += 10;
//        energy -= 10;
//
//        if (energy < 0) {
//            energy = 0;
//        }


//    public void feed() {
//        hunger -= 50;
//        if (hunger < 0) {
//            hunger = 0;
//        }
//
//    }

    public void play() {
//        hunger += 15;
//        thirst += 15;
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


//    @Override
    //nice up the output by calling our homebrew class .toString()
//    public String toString(){
//        return name + ":\nHunger: " + hunger + " | Thirst: " + thirst + " | Energy: " + energy + " | Playfulness: " + playfulness + " | Boredom: " + boredom;
//    }
}

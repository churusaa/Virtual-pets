package virtual_pet;



public class VirtualPet {

    private String name;
    private int hunger;

    public VirtualPet(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return this.name;
    }

    public int getHunger() {
        return hunger;
    }
}

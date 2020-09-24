package virtual_pet;

public class OrganicDog extends OrganicPet implements Dog {
    public OrganicDog(String name) {
        super(name);
    }

    @Override
    public void takeOnWalk() {
        ticksUntilSoiled = 10;
    }


}

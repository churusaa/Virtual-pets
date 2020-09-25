package virtual_pet;

public class RoboticDog extends RoboticPet implements Dog {


    public RoboticDog(String name) {
        super(name);
    }

    @Override
    public void takeOnWalk() {
        oilLevel -= 10;
        maintenanceLevel += 10;
    }

    @Override
    public void bark() {
        System.out.println(name+" Barks!");
    }


}

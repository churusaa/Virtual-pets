package virtual_pet;

public class RoboticPet extends VirtualPet {
    private int oilLevel = 100;
    private int maintenanceLevel = 0;

    public RoboticPet(String name) {
        super(name);
    }

    @Override
    public void tick() {
        boredom += 10;
        playfulness += 10;
        energy -= 10;
        maintenanceLevel += 1;
        oilLevel -= 1;

        if (energy < 0) {
            energy = 0;
        }
        if (oilLevel < 0) {
            oilLevel = 0;
        }
        if (maintenanceLevel > 100) {
            maintenanceLevel = 100;
        }
    }

    @Override
    public void play() {
        maintenanceLevel += 4;
        oilLevel -= 4;
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
        if (oilLevel < 0) {
            oilLevel = 0;
        }
        if (maintenanceLevel > 100) {
            maintenanceLevel = 100;
        }
    }
}


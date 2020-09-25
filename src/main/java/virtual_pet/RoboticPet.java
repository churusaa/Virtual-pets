package virtual_pet;

public class RoboticPet extends VirtualPet {
    protected int oilLevel;
    protected int maintenanceLevel;

    public RoboticPet(String name) {
        super(name);
        this.oilLevel = 100;
        this.maintenanceLevel = 0;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void oilRobot() {
        oilLevel = 100;
    }

    public void maintainRobot() {
        maintenanceLevel -= 20;
        if (maintenanceLevel < 0) {
            maintenanceLevel = 0;
        }
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

    @Override
    //nice up the output by calling our homebrew class .toString()
    public String toString() {
        return name + ":\nMaintenance: " + maintenanceLevel + " | Oil: " + oilLevel + " | Energy: " + energy + " | Playfulness: " + playfulness + " | Boredom: " + boredom;
    }

}


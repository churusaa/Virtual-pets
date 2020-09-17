package virtual_pet;

public class Application {
    public static void main(String[] args) {

        VirtualPet myVirtualPet = new VirtualPet(
                "Ilya", //name
                1, //hunger
                2, //thirst
                3, //boredom
                42, //playfulness
                65535); //energy
    }

}

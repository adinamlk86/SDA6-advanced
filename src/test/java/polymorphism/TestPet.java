package polymorphism;

import org.junit.Test;

public class TestPet {

    @Test
    public void testIfPetPolyWorks(){

        Pet spike = new Dog();
        Pet kitty = new Cat();
        Pet bessy = new Cow();
        Pet simba = new Lion();
        Pet fatty = new Hamster();

        Pet[] pets = {spike, kitty, bessy, simba, fatty};

        for(Pet p : pets){
            p.talk();
        }


    }
}

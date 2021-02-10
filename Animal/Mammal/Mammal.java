package Animal.Mammal;

import Animal.Animal;
import Animal.AnimalType;

public abstract class Mammal extends Animal implements IMammal {

    protected String fur;

    public Mammal(String animalName, int animalAge, String fur) {
        super(animalName, animalAge);
        // TODO Auto-generated constructor stub
        this.animalType = AnimalType.FISH;
    }
    
    @Override
    public String getFurType()
    {
        return this.fur;
    }
}

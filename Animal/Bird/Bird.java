package Animal.Bird;

import Animal.Animal;
import Animal.AnimalType;

public abstract class Bird extends Animal implements IBird {

    protected String featherType;
    protected int wingspan;

    public Bird(String animalName, int animalAge, int wingspan, String featherType)
    {
        super(animalName, animalAge);
        
        this.wingspan = wingspan;
        this.featherType = featherType;
        this.animalType = AnimalType.BIRD;
    }

    @Override
    public int getWingspan()
    {
        return this.wingspan;
    }

    @Override
    public String getFeatherType()
    {
        return this.featherType;
    }

}

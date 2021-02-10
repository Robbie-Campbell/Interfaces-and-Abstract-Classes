package Animal.Fish;

import Animal.Animal;
import Animal.AnimalType;

public abstract class Fish extends Animal implements IFish
{

    private String waterType;

    public Fish(String animalName, int animalAge, String waterType) {
		super(animalName, animalAge);
		this.animalType = AnimalType.FISH;
        this.waterType = waterType;
	}
    
    @Override
    public String getWaterType()
    {
        return this.waterType;
    }
}

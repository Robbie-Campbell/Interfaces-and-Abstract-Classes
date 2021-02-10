package Animal;

public abstract class Animal implements IAnimal{
    
    protected String animalName;
    protected int animalAge;
    protected AnimalType animalType;

    public Animal(String animalName, int animalAge)
    {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    @Override
    public AnimalType getAnimalType() 
    {
        return this.animalType;
    }

    @Override
    public String getAnimalName() 
    {
        return this.animalName;
    }

    @Override
    public int getAnimalAge()
    {
        return this.animalAge;
    }
}

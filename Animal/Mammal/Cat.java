package Animal.Mammal;

public class Cat extends Mammal 
{

    public Cat(String animalName, int animalAge, String fur) 
    {
        super(animalName, animalAge, fur);
    }

    public String getMeow()
    {
        return "The cat goes Meow!";
    }
    
}

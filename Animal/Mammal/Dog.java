package Animal.Mammal;


public class Dog extends Mammal 
{

    public Dog(String animalName, int animalAge, String fur) 
    {
        super(animalName, animalAge, fur);
    }

    public String getWoof()
    {
        return "The dog goes woof!";
    }
    
}

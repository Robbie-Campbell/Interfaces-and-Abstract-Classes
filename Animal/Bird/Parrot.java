package Animal.Bird;

public class Parrot extends Bird{

    public Parrot(String animalName, int animalAge, int wingspan, String featherType) {
        super(animalName, animalAge, wingspan, featherType);
        // TODO Auto-generated constructor stub
    }
    
    public String squawk()
    {
        return "Squawk! I am a Parrot";
    }
}

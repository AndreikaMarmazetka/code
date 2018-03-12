package ShopInfo;

/**
 * Created by apopov on 28.02.2018.
 */
public class PrintingService {
    private static PrintingService ourInstance = new PrintingService();

    public static PrintingService getInstance() {
        return ourInstance;
    }

    private PrintingService() {
    }
    public void PrintingAct(Animal animal, String Act){
        System.out.println("We are"+Act+ "Animal now : \n Animal: "+ animal.getAnimal() + "\n _____Breed: "+ animal.getBreed() + "\n _____Name: "+ animal.getName() + "\n " +
                "_____Cost: " + animal.getCost() + "\n _____Character: "+ animal.getCharacted());
    }

}

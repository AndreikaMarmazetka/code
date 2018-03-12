package ShopInfo;
import java.util.List;
import java.util.ArrayList;

public class PetShopStorage extends AbstractAnimal{
    private List<Animal> ListAnimals = new ArrayList<Animal>();
    private static PetShopStorage ourInstance = new PetShopStorage();

    public static PetShopStorage getInstance() {

        return ourInstance;
    }

    private PetShopStorage() {
    }

    public int getSizeList(){
        return ListAnimals.size();
    }

    public Animal getListAnimal(int i){
        return ListAnimals.get(i);
    }

    public void AddListAnimal(Animal animal){
        ListAnimals.add(animal);
    }

    public void DeletedListAnimal(Animal animal)
    {
        ListAnimals.remove(animal);
    }


}

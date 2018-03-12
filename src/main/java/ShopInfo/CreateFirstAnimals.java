package ShopInfo;

/**
 * Created by apopov on 10.01.2018.
 */
public class CreateFirstAnimals {
    public void CreateFirstAnimal(){
    BuySellService createAnimal = BuySellService.getInstance();
        for(int i=0 ;  i<=10; i++) {
            createAnimal.createAnimal(createAnimal.createAnimal());
        }
    }
}

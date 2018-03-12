package ShopInfo;

public class BuySellService extends AbstractAnimal{
    private static BuySellService ourInstance = new BuySellService();
    private String Act;
    public static BuySellService getInstance() {
        return ourInstance;
    }

    private BuySellService(){
}
    PrintingService PrintAct = PrintingService.getInstance();

    public void buy(Animal animal){
        Act="Buy";
        PetShopStorage add = PetShopStorage.getInstance();
        add.AddListAnimal(animal);
        PrintAct.PrintingAct(animal,Act);
    }

    public void createAnimal(Animal animal){
        PetShopStorage add = PetShopStorage.getInstance();
        add.AddListAnimal(animal);
            }

    public void sell(Animal animal){
        Act ="Sell";
        PetShopStorage delete = PetShopStorage.getInstance();
        delete.DeletedListAnimal(animal);
        PrintAct.PrintingAct(animal,Act);
    }

    public void runAway(Animal animal){
        Act="lost";
        PetShopStorage delete = PetShopStorage.getInstance();
        delete.DeletedListAnimal(animal);
        PrintAct.PrintingAct(animal,Act);
    }
}

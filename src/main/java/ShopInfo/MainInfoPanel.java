package ShopInfo;

import java.util.List;
import java.util.Scanner;

/**
 * Created by apopov on 10.01.2018.
 */
public class MainInfoPanel {
    public int InfoPanel() {
        int NumberFunction;
        Scanner in = new Scanner(System.in);
        System.out.print(" \n SelectFunction: \n");
        System.out.print("1 - RealLifeEmulator \n");
        System.out.print("2 - Search \n");
        System.out.print("3 - WatchAllAnimal \n");
        System.out.print("Select: \n");
        NumberFunction = in.nextInt();
        return NumberFunction;
    }

    public void runRealLifeEmulator() {
        RealLifeEmulator yep = RealLifeEmulator.getInstance();
        yep.run();
    }

    public void runSearch() {
        Scanner in = new Scanner(System.in);
        SearchService Search = SearchService.getInstance();
        String String1;
        int cost;
        System.out.print("1 - Breed, Name, Characted \n");
        System.out.print("2 - cost \n");
        System.out.print("Select: \n");
        int code = in.nextInt();
        switch (code) {
            case 1:
                System.out.print("Value - \n");
                String1 = in.next();
                for (int i=0; i<=Search.Search(String1).size()-1;i++) {
                    System.out.print("\n Animal: "+ Search.Search(String1).get(i).getAnimal()+
                            "\n _____Breed: "+ Search.Search(String1).get(i).getBreed()+
                            "\n _____Name: "+ Search.Search(String1).get(i).getName()+ "\n _____Cost: "+ Search.Search(String1).get(i).getCost()+
                            "\n _____Character: "+ Search.Search(String1).get(i).getCharacted());
                }
                break;

            case 2:
                System.out.print("Cost>= - \n");
                cost = in.nextInt();
                for (int i=0; i<=Search.Search(cost).size()-1;i++) {
                    System.out.print("\n Animal: "+ Search.Search(cost).get(i).getAnimal()+
                            "\n _____Breed: "+ Search.Search(cost).get(i).getBreed()+
                            "\n _____Name: "+ Search.Search(cost).get(i).getName()+ "\n _____Cost: "+ Search.Search(cost).get(i).getCost()+
                            "\n _____Character: "+ Search.Search(cost).get(i).getCharacted());
                }
                break;
        }
    }

    public void runWatchAll() {
        PetShopStorage PetShop = PetShopStorage.getInstance();
        for (int i = 0; i <= PetShop.getSizeList() - 1; i++) {
           System.out.print("\n Animal: "+ PetShop.getListAnimal(i).getAnimal()+
                   "\n _____Breed: "+ PetShop.getListAnimal(i).getBreed()+
                   "\n _____Name: "+ PetShop.getListAnimal(i).getName()+ "\n _____Cost: "+ PetShop.getListAnimal(i).getCost()+
                   "\n _____Character: "+ PetShop.getListAnimal(i).getCharacted());
        }
    }

    public void runSave(){
        DataStoringJob Save = DataStoringJob.getInstance();
        Save.SaveData();
    }
}

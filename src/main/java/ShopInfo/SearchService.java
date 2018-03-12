package ShopInfo;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    private static SearchService ourInstance = new SearchService();

    public static SearchService getInstance() {
        return ourInstance;
    }

    private SearchService() {
    }

    public List<Animal> Search(String Breed, String Name, int cost, String Character){
        List <Animal> SearchAnimals= new ArrayList<Animal>();
        PetShopStorage Search =  PetShopStorage.getInstance();
        for(int i=0; i<=Search.getSizeList()-1; i++) {
            if (Breed.equals(Search.getListAnimal(i).getBreed()) | Name.equals(Search.getListAnimal(i).getName())
                    | cost >= Search.getListAnimal(i).getCost() | Character.equals(Search.getListAnimal(i).getCharacted())) {
                SearchAnimals.add(Search.getListAnimal(i));
            }
        }
        return SearchAnimals;
    }


    public List<Animal> Search(String Str){
        List <Animal> SearchAnimals= new ArrayList<Animal>();
        PetShopStorage Search =  PetShopStorage.getInstance();
        for(int i=0; i<=Search.getSizeList()-1; i++) {
            if (Str.equals(Search.getListAnimal(i).getBreed()) || Str.equals(Search.getListAnimal(i).getName())|| Str.equals(Search.getListAnimal(i).getCharacted())) {
                SearchAnimals.add(Search.getListAnimal(i));
            }
        }
        return SearchAnimals;
    }


    public List<Animal> Search(int cost){
        List <Animal> SearchAnimals= new ArrayList<Animal>();
        PetShopStorage Search =  PetShopStorage.getInstance();
        for(int i=0; i<=Search.getSizeList()-1; i++) {
            if (cost>Search.getListAnimal(i).getCost()){
                SearchAnimals.add(Search.getListAnimal(i));
            }
        }
        return SearchAnimals;
    }


}

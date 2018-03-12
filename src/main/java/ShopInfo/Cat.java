package ShopInfo;

import java.util.Random;

public class Cat extends Pet {
    private Random Rand= new Random();

    private CatBreed randomCatBreed( ) {
        int pick = Rand.nextInt(CatBreed.values().length);
        return CatBreed.values()[pick];
    }

    Cat(){
        Animal = "Cat";
        breed = String.valueOf(randomCatBreed());
        name = String.valueOf(randomAnimalName());
        cost = Rand.nextInt(100000);
        characted = String.valueOf(randomCharacted());
    }
}

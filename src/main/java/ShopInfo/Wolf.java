package ShopInfo;

public class Wolf extends Predator {

    private WolfBreed randomWolfBreed( ) {
        int pick = Rand.nextInt(WolfBreed.values().length);
        return WolfBreed.values()[pick];
    }

    Wolf(){
        Animal = "Wolf";
        breed = String.valueOf(randomWolfBreed());
        name = String.valueOf(randomAnimalName());
        cost = Rand.nextInt(100000);
        characted = String.valueOf(randomCharacted());
    }

}

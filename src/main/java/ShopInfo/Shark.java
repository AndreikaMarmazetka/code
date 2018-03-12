package ShopInfo;

public class Shark extends Predator {
    private SharkBreed randomSharkBreed( ) {
        int pick = Rand.nextInt(SharkBreed.values().length);
        return SharkBreed.values()[pick];
    }

    Shark(){
        Animal = "Shark";
        breed = String.valueOf(randomSharkBreed());
        name = String.valueOf(randomAnimalName());
        cost = Rand.nextInt(100000);
        characted = String.valueOf(randomCharacted());
    }

}

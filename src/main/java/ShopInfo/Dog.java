package ShopInfo;

public class Dog extends Pet {

    private DogBreed randomDogBreed( ) {
        int pick = Rand.nextInt(DogBreed.values().length);
        return DogBreed.values()[pick];
    }

    Dog(){
        Animal = "Dog";
        breed = String.valueOf(randomDogBreed());
        name = String.valueOf(randomAnimalName());
        cost = Rand.nextInt(100000);
        characted = String.valueOf(randomCharacted());
    }


}

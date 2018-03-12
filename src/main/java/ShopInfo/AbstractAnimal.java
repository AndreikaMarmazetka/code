package ShopInfo;

import java.util.Random;

abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected Integer cost;
    protected String characted;
    protected String Animal ;

    public String getAnimal() {
        return Animal;
    }


    Random Rand= new Random();


    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getCharacted() {
        return characted;
    }

    protected AnimalName randomAnimalName() {
        int pick = Rand.nextInt(CatBreed.values().length);
        return AnimalName.values()[pick];
    }

    protected AnimalCharacted randomCharacted() {
        int pick = Rand.nextInt(CatBreed.values().length);
        return AnimalCharacted.values()[pick];
    }


    public Animal createAnimal() {

        int Type = Rand.nextInt(4);
        if (Type == 1) {
            Cat NewCat = new Cat();
            return NewCat;
        } else if (Type == 2) {
            Dog NewDog = new Dog();
            return NewDog;
        } else if (Type == 3) {
            Shark NewShark = new Shark();
            return NewShark;
        } else {
            Wolf NewWolf = new Wolf();
            return NewWolf;
        }
        }


}

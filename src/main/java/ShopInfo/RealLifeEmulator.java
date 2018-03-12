package ShopInfo;

import java.lang.Thread;
import java.util.Random;



public class RealLifeEmulator extends Thread{
    private static RealLifeEmulator ourInstance = new RealLifeEmulator();

    public static RealLifeEmulator getInstance() {
        return ourInstance;
    }

    private RealLifeEmulator() {
        start();
    }



    @Override
    public void run(){
        BuySellService BuyAndSell = BuySellService.getInstance();
        PetShopStorage ListPet =  PetShopStorage.getInstance();
        while(true){
            int code = new Random().nextInt(100);
            switch(code){
                case 44 :
                    BuyAndSell.buy(BuyAndSell.createAnimal());
                    break;
                case 55 :
                    BuyAndSell.buy(BuyAndSell.createAnimal());
                    break;
                case 66 :
                    BuyAndSell.sell(ListPet.getListAnimal(new Random().nextInt(ListPet.getSizeList()-1)));
                    break;
                case 88 :
                    BuyAndSell.runAway(ListPet.getListAnimal(new Random().nextInt(ListPet.getSizeList()-1)));
                    break;
            }
            try {
                sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}

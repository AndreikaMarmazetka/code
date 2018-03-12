package ShopInfo;


/**
 * Created by apopov on 10.01.2018.
 */
public class Main {
    public static void main(String[] args) {
        CreateFirstAnimals create = new CreateFirstAnimals();
        create.CreateFirstAnimal();

        MainInfoPanel createInfoPanel = new MainInfoPanel();
        createInfoPanel.runSave();
        while (true) {
            int codes = createInfoPanel.InfoPanel();
            switch (codes) {
                case 1:
                    createInfoPanel.runRealLifeEmulator(); break;
                case 2:
                    createInfoPanel.runSearch(); break;
                case 3:
                    createInfoPanel.runWatchAll(); break;
            }

        }

    }
}

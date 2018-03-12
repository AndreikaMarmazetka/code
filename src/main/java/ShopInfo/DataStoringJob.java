package ShopInfo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Created by apopov on 11.01.2018.
 */
public class DataStoringJob {
    private static DataStoringJob ourInstance = new DataStoringJob();

    public static DataStoringJob getInstance() {
        return ourInstance;
    }

    private DataStoringJob() {
    }
    private static final String File= System.getProperty("user.dir")+"\\PitShop.json";

    public void SaveData(){

        PetShopStorage Storage = PetShopStorage.getInstance();

        JSONObject object = new JSONObject();
        JSONArray value = new JSONArray();
        for(int i=0; i<=Storage.getSizeList()-1; i++) {
            object.put("name", Storage.getListAnimal(i).getAnimal());
            value.add(Storage.getListAnimal(i).getBreed());
            value.add(Storage.getListAnimal(i).getName());
            value.add(Storage.getListAnimal(i).getCost());
            value.add(Storage.getListAnimal(i).getCharacted());
            object.put("values", value);
        }
            try (FileWriter writer = new FileWriter(File)) {
                writer.write(object.toJSONString());
                writer.flush();
                writer.close();
            } catch (IOException ex) {
            }



    }



}

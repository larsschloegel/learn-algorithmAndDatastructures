package Schleifen;
import java.util.ArrayList;

public class Detective {

    public int countTomatoes(ArrayList<String> items){

        int count = 0;
        for(String item : items){
            if (item.equals("Tomate")){
                count = count +1;
            }
        }
        return count;
    }

}
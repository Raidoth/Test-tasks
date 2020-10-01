import java.util.ArrayList;
import java.util.HashMap;

class countWord {

    public static HashMap<String, Integer> countWord(ArrayList<String> list){
        HashMap<String,Integer> Map = new HashMap<>();

        for (String word:list
        ) {
            int counter=0;
            for(int i = 0; i<list.size();i++){

                if(word.equals(list.get(i))){
                    counter++;
                }
                Map.put(word,counter);
            }
        }
        return Map;
    }
}

import java.util.*;
public class Map {
    public static void main(String[] args){
   
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("om kolthom", "Sert al hob");
        trackList.put("enrique", "can you hear me");
        trackList.put("maluma", "mla mia");
        trackList.put("amr diab", "amentak");
        String lyrics =trackList.get("amr diab");
        System.out.println(" Amr diab: " + lyrics);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ":" + trackList.get(key));
     
        }

        
    }
}

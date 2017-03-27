package basic;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

    /**
     * @param args
     */
    public static void main(String[] args) {
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("张三", 80);
       
       map.put("李四", 90);
       showMap(map);
       map.put("李四", 85);
       showMap(map);
       

    }
    
    public static void showMap(Map<String,Object> map)
    {
        for(String key:map.keySet())
        {
            System.out.println(key+":"+map.get(key));
        }
    }

}

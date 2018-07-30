package Container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("01","bYd");
        map.put("02","FYY");
        map.put("03","YYF");

        Set<String> keySet = map.keySet();
        Iterator it = keySet.iterator();

        while(it.hasNext()){
            String key = it.next().toString();
            String value = map.get(key);
            System.out.println("key:"+key+"----->"+"value:"+value);
        }
    }
}

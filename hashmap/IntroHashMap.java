package hashmap;

import java.util.HashMap;

public class IntroHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"vinay");
        map.put(2,"coco");
        map.put(3,"donald");
        map.put(4,"mickey");
        map.put(5,"minnie");
        System.out.println("map :: "+map);
        map.remove(2);
        System.out.println("map after removing key 2 :: "+map);
        System.out.println("value at key 1 :: "+map.get(1));
        System.out.println("size of map :: "+map.size());
        System.out.println("is key 3 present in map :: "+map.containsKey(3));
        System.out.println("is value donald present in map :: "+map.containsValue("donald"));
        System.out.println("is map empty :: "+map.isEmpty());

        for(Integer key:map.keySet()){
            System.out.println("key :: "+key+" value :: "+map.get(key));
        }

        for(HashMap.Entry<Integer,String> e :map.entrySet()){
            System.out.println("key :: "+e.getKey()+" Key corresponding value :: "+e.getValue());
        }
    }
}

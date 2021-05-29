package other;

import java.util.LinkedHashMap;

public class Question2 {
    /*
    * find non repeating first String
    * */
    public String firstUniqueString(String[] input){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String elem : input){
            int frequency = map.getOrDefault(elem, 0);
            map.put(elem, frequency + 1);
        }
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return "No unique string";
    }

    public static void main(String[] args) {
        String[] input = {"abc", "abc", "ab", "ab", "ab", "de", "X", "de", "abc", "Y"};
        Question2 test = new Question2();
        System.out.println(test.firstUniqueString(input));
    }

}

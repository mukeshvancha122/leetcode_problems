package hashing;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        
        Map<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        String data="III";
        int result=0;
        for(int i=data.length()-1;i>=0;i--){
            int current=romanMap.get(data.charAt(i));
            result=result+current;
        }
        System.out.println(result);
        
    }
}

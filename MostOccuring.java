package assignment;

import java.util.HashMap;
import java.util.Map;

public class MostOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getMaxOccurringChar("siddardhaadd"));;
	}
	public static char getMaxOccurringChar(String str) {
    
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        char maxChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxChar = ch;
                maxFrequency = frequency;
            }
        }

        return maxChar;
    }

}

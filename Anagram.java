package assignment;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkAnagram("silent","tnelil"));;
	}
	public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];


        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            frequency1[ch1 - 'a']++;
            frequency2[ch2 - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

}

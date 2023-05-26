package assignment;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));
	}
	public static boolean checkPangram(String sentence) {

        boolean[] alphabets = new boolean[26];
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabets[ch - 'a'] = true;
            }
        }
        for (boolean isPresent : alphabets) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

}

package assignment;

public class CharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
check("sid@123");
	}
	public static void check(String s) {
		int vowels=0;
		int consonants=0;
		int specialCharacters=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					vowels++;
				}
					else {
						consonants++;
					}
			}else if(!Character.isWhitespace(s.charAt(i))) {
				specialCharacters++;
			}
		}
		System.out.println(vowels);
System.out.println(consonants);
System.out.println(specialCharacters);
	}

}

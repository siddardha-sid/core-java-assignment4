package assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
duplicates("gautham");
	}
	public static void duplicates(String s) {
		Set<Character> set=new LinkedHashSet<>();
		Set<Character> dup=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				dup.add(s.charAt(i));
			}else {
				set.add(s.charAt(i));
			}
		}
		System.out.println(dup);
	}

}

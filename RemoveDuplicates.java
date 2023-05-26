package assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Remove("siddardha"));
	}
	public static String Remove(String s) {
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
		}
		
	}



package assignment;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isUnique("sidwrtycvv"));;
	}
	public static boolean isUnique(String s) {
		Set<Character> set=new HashSet<>();
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				flag=false;
				return flag;
			}
			set.add(s.charAt(i));
		}
		return flag;
	}

}

package StringsAndArrays.Problem1;

/**
 * Write an algorithm to detect if all the characters in a string are unique.
 */
public class Problem1 {

	public static boolean isStringCharsUnique(String s){
		boolean[] array = new boolean[256];
		
		for(int i = 0; i < s.length(); i++){
			int val = s.charAt(i);
			if(array[val] && val != ' ')
				return false;
			array[val] = true;
		}
		return true;
	}
}

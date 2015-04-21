package org.cci_array_string.prac;

public class Strings {
	
	
	public static boolean isAllUnique(String str) {
		boolean[] char_set = new boolean[256];
		for(int i=0;i < str.length(); i++ ) {
			int val = str.charAt(i);
			if(char_set[val])
				return false;
			else
				char_set[val]=true;
		}
		return true;
	}
	

	public static void removeDuplicate(char[] str) {
		int len=str.length;
		boolean keepStrI=true;
		int index=1;
		for(int i=1;i<len;i++) {
			keepStrI=true;
			for(int j=0;j<i;j++){
				if(str[j]==str[i]){
					keepStrI=false;
				}
			}
			if(keepStrI){
				str[index]=str[i];
				index++;
			}
		}
		str[index]=0;
	}

	public static void main(String[] args) {
//		boolean result = isAllUnique("abcd efg");
		String testString="ABBCDBGBBAWA";
		char[] test=testString.toCharArray();
		removeDuplicate(test);
		System.out.println("result is:"+String.copyValueOf(test));
		

	}

}

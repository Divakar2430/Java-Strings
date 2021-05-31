package org.test;

public class String5 {
	public static void main(String[] args) {
		String s ="Hello Java";
		int count = 0;
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]){
					System.out.println(c[j]);
					count++;
				}
			}
			/*private static String removeDuplicates(String str) {
				StringBuilder sb = new StringBuilder();
    char[] arr = str.toCharArray();
 
    for (char ch : arr) {
        if (sb.indexOf(String.valueOf(ch)) != -1)
            continue;
        else
            sb.append(ch);
    }
    return sb.toString();
	}*/
		}
}
}

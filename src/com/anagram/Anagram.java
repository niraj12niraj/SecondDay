package com.anagram;

import java.util.Arrays;

public class Anagram {

	public static String anaramPrint(String str, String str1) {
		int len = str.length();
		int len1 = str1.length();
		char[] c = str.toCharArray();
		char[] c1 = str1.toCharArray();
		if (len == len1) {
			Arrays.sort(c);
			Arrays.sort(c1);
			for (int i = 0; i < len; i++) {
				if (c[i] != c1[i]) {
					 System.out.println(str+" & "+str1+" Not A anagram");
					 return null;
				}
			}
		System.out.println(str+" & "+str1+" A anagram");
		} else {
			System.out.println(str + " & " + str1 + " Not A anagram");
		}
		return null;
	}

	public static void main(String[] args) {
		anaramPrint("ppp", "ppn");
		 anaramPrint("ntt", "not");
		 anaramPrint("not", "not");
		 anaramPrint("pon", "nop");
		 anaramPrint("ponu", "nop");
		anaramPrint("pon", "opn");
		 anaramPrint("pon", "nopt");
		 anaramPrint("pon", "mop");
		 anaramPrint("pon", "mop");
		 anaramPrint("ppn", "ppp");
		 anaramPrint("ppc", "cpp");
		 anaramPrint("ppp", "pnn");

	}

}

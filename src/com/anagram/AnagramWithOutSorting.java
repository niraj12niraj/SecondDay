package com.anagram;

public class AnagramWithOutSorting {

	public static void anagramPrint(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count, count1 = 0;
		if (l1 == l2) {
			for (int i = 0; i < l1; i++) {
				count = 0;
				for (int j = 0; j < l1; j++) {
					if (c1[i] == c2[j]) {
						count++;
						break;
					}

				}
				if (count == 0) {
					count1 = 1;
					break;
				}
			}
			if (count1 == 1) {
				System.out.println(s1 + " & " + s2 + " Not A anagram");
			} else {
				System.out.println(s1 + " & " + s2 + "  A anagram");
			}
		} else {
			System.out.println(s1 + " & " + s2 + " Not A anagram");
		}

	}

	public static void main(String[] args) {
		anagramPrint("abcd", "bcab");
		anagramPrint("abc", "bcc");
		 anagramPrint("abc", "baa");
		 anagramPrint("abc", "bbb");
		 anagramPrint("abc", "aaa");
		anagramPrint("abc", "ccc");
		anagramPrint("abc", "cba");
		anagramPrint("abc", "bac");
		anagramPrint("abc", "abc");
		
	}
	
	
}

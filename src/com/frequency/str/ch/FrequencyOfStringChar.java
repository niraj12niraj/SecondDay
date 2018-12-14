package com.frequency.str.ch;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfStringChar {
	
	public static void frequencyOfStringChar(String s1) {
		int len = s1.length();
		Map<Character, Integer>map=new HashMap<>();
		int count;
		for(int i=0;i<len;i++) {
			count=0;
			for(int j=0;j<len;j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					count++;
					//break;
				}
			}
			//System.out.println(s1.charAt(i)+"==>"+count);
			map.put(s1.charAt(i), count);
		}
		for(Map.Entry<Character, Integer>e:map.entrySet()) {
			System.out.println(e.getKey()+"==>"+e.getValue());
		}
	}
	public static void main(String[] args) {
		frequencyOfStringChar("abcdcebabdeeweyhtgbe");
	}

}

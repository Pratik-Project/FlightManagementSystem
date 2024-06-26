package com.test;

public class Unity {
	
	
	   public static int countOccurrences(String str, char ch) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (c == ch) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            sb.append(str.charAt(i));
	        }
	        return sb.toString();
	    }

	    public static boolean isPalindrome(String str) {
	        int len = str.length();
	        for (int i = 0; i < len / 2; i++) {
	            if (str.charAt(i) != str.charAt(len - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static String capitalizeWords(String str) {
	        StringBuilder sb = new StringBuilder();
	        boolean capitalize = true;
	        for (char c : str.toCharArray()) {
	            if (Character.isSpaceChar(c)) {
	                capitalize = true;
	            } else if (capitalize) {
	                sb.append(Character.toUpperCase(c));
	                capitalize = false;
	            } else {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }
	

}

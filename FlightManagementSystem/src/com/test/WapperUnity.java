package com.test;

public class WapperUnity {
	
	

    public static int findMax(Integer[] numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static double calculateAverage(Double[] numbers) {
        double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static boolean[] convertToBooleanArray(String binaryString) {
        boolean[] boolArray = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            boolArray[i] = binaryString.charAt(i) == '1';
        }
        return boolArray;
    }

    public static String convertToBinaryString(Boolean[] booleanArray) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : booleanArray) {
            sb.append(b ? '1' : '0');
        }
        return sb.toString();
    }
}



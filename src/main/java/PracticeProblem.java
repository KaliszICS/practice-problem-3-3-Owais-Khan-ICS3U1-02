/**
 * File: Else if
 * Author: Owais Ali Khan
 * Date Created: March 26, 2026
 * Date Last Modified: March 26, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int num) {
	    if (num==0) {
	        return "Zero";
	    } else if (num%2==0) {
	        return "Even";
	    }
	    return "Odd";
	}
	
	public static String positiveOrNegative(int num) {
	    if (num>0) {
	        return "Positive";
	    } else if (num==0) {
	        return "Zero";
	    }
	    return "Negative";
	}
	
	public static String pluralize(String str) {
	    str = str.toLowerCase();
	    if (str.endsWith("ey")) {
	        return "eys";
	    } else if (str.endsWith("y")) {
	        return "ies";
	    } else if (str.endsWith("ife")) {
	        return "ives";
	    }
	    return "s";
	}

}

package com.prashant.hacker.rank.problem.algorithm.implementation;

public class Kangaroo {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "";
        long countX1 = x1 + v1, countX2 = x2 + v2;
        if ((x1 == x2 && v2 > v1) || (x1 != x2 && v1 == v2) || (x1 < 0 || x2 < 0) 
            || (v1 < 1 || v2 < 1) || (x1 > 10000 || x2 > 10000 || v1 > 10000 || v2 > 10000)
            || (x1 == x2 && v1 != v2) || (x1 < x2 && v1 == v2)) {
            result = "NO";
            return result;
        }
        while (countX1 != countX2) {
            countX1 = countX1 + v1;
            countX2 = countX2 + v2;
            if(countX2 > 10000000 && countX2 > 100000000){
                result = "NO";
                break;
            }
        }
        if (countX1 == countX2)
            result = "YES";
        return result;
	}

	public static void main(String[] args) {
		System.out.println(kangaroo(4523, 8092, 9419, 8076));
		
		
	}
	
	/*// (x1 < x2 && v1 < v2) || (v1 == v2) || (x1 < 0 || x2 < 0) || (v1 < 1 || v2 < 1)
    || ((x2 + v2) % (x1 + v1) != 0) || (x1 > 10000 || x2 > 10000 || v1 > 10000 || 
    v2 > 10000) || ( x1 == x2 && v1 != v2) || (x1 < x2 && v1 == v2)*/

}

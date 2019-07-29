package com.prashant.hacker.rank.problem.algorithm.warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	int alice = 0, bob = 0;
        for(int i = 0; i < 3;i++){
            if(a.get(i) > b.get(i))
            	alice++;
            else if(a.get(i) < b.get(i))
            	bob++;
        }
        
        List<Integer> arr = new ArrayList();
        arr.add(alice);
        arr.add(bob);
        return arr;

    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

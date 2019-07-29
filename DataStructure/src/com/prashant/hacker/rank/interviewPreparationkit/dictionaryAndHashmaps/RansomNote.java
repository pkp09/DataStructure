package com.prashant.hacker.rank.interviewPreparationkit.dictionaryAndHashmaps;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=dictionaries-hashmaps
public class RansomNote {

	public static void main(String[] args) {
		String[] magazine = {"two", "times", "three", "is", "not", "four"};
		String [] note = {"two", "times", "two", "is", "four"};
		checkMagazineWithAL(magazine, note);
		
		Scanner sc = new Scanner(System.in);
		int magCount = sc.nextInt();
		int noteCount = sc.nextInt();
		String[] magazine1 = new String[magCount];
		for(int i = 0; i < magCount; i++) {
			magazine1[i] = sc.nextLine();
		}
		
		String[] note1 = new String[noteCount];
		for(int i = 0; i < noteCount; i++) {
			note1[i] = sc.nextLine();
		}
		checkMagazineWithAL(magazine1, note1);
		sc.close();
	}

    
    static void checkMagazineWithAL(String[] magazine, String[] note) {
    	ArrayList<String> al = new ArrayList<>();
    	for(long i = 0; i < magazine.length; i++)
    		al.add(magazine[(int) i]);

    	boolean bNote = false;
    	for(int i = 0; i < note.length; i++) {
    		if(!al.contains(note[i])) {
    			bNote=false;
    			break;
    		}
    		else {
    			bNote = true;
    			al.remove(note[i]);
    		}
    		
    	}
    	if(bNote)
    		System.out.println("Yes");
    	else
    		System.out.println("No");
    	
    }
}

package com.prashant.hacker.rank.problem.algorithm.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author pkp09
 *
 */
// https://www.hackerrank.com/challenges/save-the-prisoner/problem?h_r=next-challenge&h_v=zen
public class SaveTePrisoner {
    static int saveThePrisoner(int numOfPrisoner, int numOfSweets, int chairNumber) {
    	int result = 0;
    	int remainder = numOfSweets % numOfPrisoner;
    	if((remainder + chairNumber -1) > numOfPrisoner )
    		result = remainder - (numOfPrisoner - chairNumber) - 1;
    	else
    		result = chairNumber + remainder - 1;
    	
    	if(result == 0)
    		result = numOfPrisoner;
    	
    	System.out.println(result);
    	return result;
    }
    
    public static void main(String ...args) {
    	saveThePrisoner(36, 68, 10);
    	saveThePrisoner(5, 2, 1);
    	saveThePrisoner(0, 19, 2);
    	saveThePrisoner(7, 0, 2);
    	saveThePrisoner(7, 19, 0);
    	saveThePrisoner(7, 19, 2);
    	saveThePrisoner(3, 7, 3);
    	saveThePrisoner(7, 7, 2);
    	saveThePrisoner(5, 2, 2);
    	saveThePrisoner(352926151, 380324688, 94730870);
    	//	122129406
    	saveThePrisoner(94431605, 679262176, 5284458);
    	// 23525398
    	saveThePrisoner(368127406, 680428368, 105517295);
    	// 49690850
    	saveThePrisoner(208526924, 756265725, 150817879);
    	//72975907
    	saveThePrisoner(999999999, 999999999, 1);
    	//File file = new File("C:\\Users\\Saurabh\\Desktop\\Hackerrank\\SavThePrisoner\\TestCase0.txt");
    	// read(file);
    }
    
    
    public static void read(File file) {
    	BufferedReader br = null;
    	FileReader fr = null;
    	try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine()) != null) {
				String [] str = line.split(" ");
				saveThePrisoner(Integer.valueOf(str[0]), Integer.valueOf(str[1]), Integer.valueOf(str[2]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	finally{
    		try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
}
package com.prashant.hacker.rank.problem.algorithm.implementation;

/**
 * @author pkp09
 *
 */
// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignerPDFViewer {
	static int designerPdfViewer(int[] h, String word) {
		int height = 0;
		// word = aba
		char w = 'a';
		for(int i = 0; i < word.length(); i++) {
			w = word.charAt(i);
			int ascii = w;
			switch (ascii) {
				//97 = a
				case 97 :{
					if(height < h[0])
						height = h[0];
					break;
				}
				//98 = b
				case 98 :{
					if(height < h[1])
						height = h[1];
					break;
				}
				// 99 = c
				case 99 :{
					if(height < h[2])
						height = h[2];
					break;
				}
				// 100 = d
				case 100 :{
					if(height < h[3])
						height = h[3];
					break;
				}
				// 101 = e
				case 101 :{
					if(height < h[4])
						height = h[4];
					break;
				}
				case 102 :{
					if(height < h[5])
						height = h[5];
					break;
				}
				case 103 :{
					if(height < h[6])
						height = h[6];
					break;
				}
				case 104 :{
					if(height < h[7])
						height = h[7];
					break;
				}
				case 105 :{
					if(height < h[8])
						height = h[8];
					break;
				}
				case 106 :{
					if(height < h[9])
						height = h[9];
					break;
				}
				case 107 :{
					if(height < h[10])
						height = h[10];
					break;
				}
				case 108 :{
					if(height < h[11])
						height = h[11];
					break;
				}
				case 109 :{
					if(height < h[12])
						height = h[12];
					break;
				}
				case 110 :{
					if(height < h[13])
						height = h[13];
					break;
				}
				case 111 :{
					if(height < h[14])
						height = h[14];
					break;
				}
				case 112 :{
					if(height < h[15])
						height = h[15];
					break;
				}
				case 113 :{
					if(height < h[16])
						height = h[16];
					break;
				}
				case 114 :{
					if(height < h[17])
						height = h[17];
					break;
				}
				case 115 :{
					if(height < h[18])
						height = h[18];
					break;
				}
				case 116 :{
					if(height < h[19])
						height = h[19];
					break;
				}
				case 117 :{
					if(height < h[20])
						height = h[20];
					break;
				}
				case 118 :{
					if(height < h[21])
						height = h[21];
					break;
				}
				case 119 :{
					if(height < h[22])
						height = h[22];
					break;
				}
				case 120 :{
					if(height < h[23])
						height = h[23];
					break;
				}
				case 121 :{
					if(height < h[24])
						height = h[24];
					break;
				}
				case 122 :{
					if(height < h[25])
						height = h[25];
					break;
				}
			}
		}
		int area = height * word.length();
		return area;
    }
	
}

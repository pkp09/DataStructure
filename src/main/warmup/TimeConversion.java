package com.prashant.hacker.rank.problem.algorithm.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	 /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	String hour = "";
        int h = 0;
        if(s.contains("PM")) {
            hour = s.substring(0, s.indexOf(":"));
            h = Integer.parseInt(hour) + 12;
            if(h == 24)
            	h= 00;
            s = h + s.substring(s.indexOf(":"), s.indexOf("PM"));
            
        }else if(s.contains("AM")){
            s = s.substring(0, s.length()-2);
        }
        return s;
    }
	
    static String timeConversion1(String s) {
        /*
         * Write your code here.
         */
    	SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
    	SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
    	Date inDate = null;
    	try {
			inDate = inFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return outFormat.format(inDate);
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// timeConversion("12:05:45PM");
		timeConversion1("7:05:45PM");
	}

}

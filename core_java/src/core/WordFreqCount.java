package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class WordFreqCount {

	public static void main(String[] args) {
		HashMap<String, Integer> wordCount = new HashMap();
		try {
			String s = "marvel mcu bmw mercedes kia cricket ab marvel dc mcu dc marvel";
			ArrayList<String> words = new ArrayList<String>(); 
			File f = new File("C:/text");
			FileReader fr = new FileReader(s);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] wrds = line.split(" ");
			System.out.println(wrds);
			
			 while(line != null) {    
		            String string[] = line.toLowerCase().split("([,.\\s]+) ");    
		            //Adding all words generated in previous step into words    
		            for(String str : string){    
		                words.add(str);    
		            }    
		        }    
			
			
			
			int count,maxCount=0;
			String word="";
			 
			String[] sar = s.split(" ");
			for(String st: sar) {
				words.add(st);
			}
			for(int i = 0; i < words.size(); i++){    
	            count = 1;    
	            //Count each word in the file and store it in variable count    
	            for(int j = i+1; j < words.size(); j++){    
	                if(words.get(i).equals(words.get(j))){    
	                    count++;    
	                }     
	            }    
	            //If maxCount is less than count then store value of count in maxCount     
	            //and corresponding word to variable word    
	            if(count > maxCount){    
	                maxCount = count;    
	                word = words.get(i);    
	            }    
	        }    
			System.out.println("Most repeated word: " + word);  
			br.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}

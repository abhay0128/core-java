package core;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class WrdFreq2 {

	public static void main(String[] args) {
		try {
			String str="marvel mcu bmw mercedes kia cricket ab marvel dc mcu dc marvel";
			FileReader fr = new FileReader(str);
			BufferedReader br = new BufferedReader(fr);
			String line = BoundedLineReader.readLine(br, 5_000_000);
			List<String> words = new ArrayList<>();
			String word="";
			while(line!=null) {
				String[] arr = line.split(" ");
				for(String s: arr) {
					words.add(s);
				}
				
			}
			System.out.println(words);
			int count,maxCount=0;
			
			for(int i = 0; i < words.size(); i++){    
	            count = 1;    
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
			e.printStackTrace();
		}

	}

}

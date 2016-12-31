package hacker;

import java.util.HashMap;
import java.util.Map.Entry;

public class test1 
{

	
	
	public static void main(String[] args) 
	{
		
		
		String a = "" ;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int count = 0;
		String phone = "aaaaabbbbbbbbbccccpqrstuv";
		String[] output = phone.split("");
		String str_output = " ";
		for (int i =0;i < output.length ;i++)
		{
			if(str_output.indexOf(output[i]) < 0){
				for (int j =0; j < output.length ;j++)
				{
				
					if (output[i].equalsIgnoreCase(output[j]))
					{
						count+= 1;
					
					}
					else
					{
					
						continue;
					}
				
				}

				if (count > 1)
					str_output+=output[i]+count;
				else
					str_output+=output[i];
				count = 0;
			}
			else{
				continue;
			}
		}
		
		System.out.println (str_output);

} 
	}
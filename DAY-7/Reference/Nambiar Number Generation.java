import java.util.*;
import java.io.*;
public class UserMainCode {
	
	public int nnGenerator(String input1) {
		boolean process=false,isOdd=false;
		int sum=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<input1.length();i++){
			int n=Integer.parseInt(String.valueOf(input1.charAt(i)));
			if(!process){
				if(n % 2==0){
					isOdd=false;
				}
				else{
					isOdd=true;
				}
				process=true;
			}
			if(isOdd){
				sum+=n;
				if(sum%2==0){
					arr.add(sum);
					sum=0;
					process=false;
				}
			}
			else{
				sum+=n;
				if(sum%2 != 0){
					arr.add(sum);
					sum=0;
					process=false;
				}
			}

		}
		
		if (process){
			arr.add(sum);
		}
		String result="";
		for(int i:arr){
			result+=String.valueOf(i);
		}
		int g=Integer.parseInt(result);
		return g;

	}
	}

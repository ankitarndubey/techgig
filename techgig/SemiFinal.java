package in.ankita.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SemiFinal {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int H =sc.nextInt();
	        int[] HC= new int[H];
	       
	        for(int i =0;i<HC.length;i++) {
	        	HC[i]=sc.nextInt();
	        }
	        
	        System.out.println(N+" "+H);
	        for(int i =0;i<HC.length;i++) {
	        	System.out.print(HC[i]+" ");
	        }
	       
	}

}

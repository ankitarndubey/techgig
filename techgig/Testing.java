package in.ankita.techgig;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Testing {

	public static void main(String[] args) {
		String A="1,A1";
		String B="2,A2";
		String C="3,A3";
		String D="1,D1";
		String E="3,C1";
		
		
		
		HashMap<String, ArrayList<String>> mapStr= new HashMap<>();
		ArrayList<String> arrayList=new ArrayList<>();
		if(mapStr.containsKey(A.split("","")))
		{
			mapStr.put(A.split(","),arrayList.add(A.split(",")) )
		}
		
		else
			mapStr.put(A.split(","), arrayList.add(A.split(",")))

	}

}

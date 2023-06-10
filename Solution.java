import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int row) {
		    ArrayList<ArrayList<Long>> result=new ArrayList();
	    
		for(int i=1;i<=row;i++){
			ArrayList<Long> list=new ArrayList<>();
			for(int j=1;j<=i;j++){
				if(j==1 || j==i ){
					list.add(1L);
				}
				else{
					list.add(result.get(i-2).get(j-2)+ result.get(i-2).get(j-1));
		
				}
			}
			result.add(list);
		}
		return result;
	}
}

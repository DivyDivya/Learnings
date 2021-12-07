package Simple;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] st= new String[2];
		System.out.println("Enter comma saperated numbers for arr[0]");
		st[0] = s.nextLine();
		System.out.println("Enter comma saperated numbers for arr[1]");
		st[1] = s.nextLine();
		
		System.out.println(findIntersection(st));
		
	}
	
	public static String findIntersection(String []strarr) {
		
		String[] arr1;
		String[] arr2;
		String result="";
		arr1 = strarr[0].split(",");
		arr2 = strarr[1].split(",");
		
		for (String s1:arr1) {
			for(String s2:arr2) {
				if (s1.compareTo(s2)==0)
				{result = result + s1;
				break;
				}
			}
		}
		if (result.isEmpty()) 
		return "false";
		else
			return result;
	}

}

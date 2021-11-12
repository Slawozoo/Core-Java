package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachMutipleStmt {

	public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Enter the no to be add in the list: ");
        n = scn.nextInt();
        System.out.println("Enter the elements of list: ");
        String[] str = new String[50];
        List<String> list=new ArrayList<String>();
        for(int i = 0; i< n; i++) {
        	str[i] = scn.next();
        	list.add(str[i]);
        }
     
        list.forEach(  
            (no)->System.out.println(no)  
        );  
    }  
}

package com.company;

import java.util.Scanner;

public class StringBuilderLowerCase {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        StringBuilder str= new StringBuilder();
        System.out.print("text = ");
        str.append(sc.next());
       System.out.println(toLowerCase(str));

    }
    static  StringBuilder toLowerCase(StringBuilder str){
        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            if(c>='a' && c<='z' ) {
                c= (char)((int)c-32);
                str.setCharAt(i, c);
            }


        }
        return str;
    }
}

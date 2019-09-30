package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        Scanner sc= new Scanner(System.in);

        while(true){
            String s =sc.nextLine();
            if(s.length()==0)
                break;
            list.add(s);
        }
        int j=0;
        for(String str:list)
        {
            System.out.print("Place Name without Vowels:"+(j++)+" ");
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'
                        ||str.charAt(i)=='o'||str.charAt(i)=='u')
                    continue;
                else
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}

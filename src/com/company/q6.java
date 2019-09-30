package com.company;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String query=sc.nextLine();

        String[] string=query.split(",");
        int len=string.length;

        int temp1,flag=0;
        int temp2=Integer.parseInt(string[0]);;
        for(int i=1;i<len;i++) {
            temp1 = temp2;
            temp2 = Integer.parseInt(string[i]);
            if(temp1-temp2 ==1 || temp2-temp1==1)
                continue;
            else
            {   flag=1;
                break;}
        }
        if(flag==0)
            System.out.println(query+" are consecutive numbers");
        else
            System.out.println(query+" non consecutive numbers");
    }
}

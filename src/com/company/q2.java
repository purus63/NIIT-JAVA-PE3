package com.company;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int rows,columns;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        columns=sc.nextInt();

        int mat1[][] =new int[rows][columns];
        int mat2[][] =new int[rows][columns];
        int sum[][] =new int[rows][columns];

        for(int i=0;i<rows;i++)
        {  for(int j=0;j<columns;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {  for(int j=0;j<columns;j++)
            {
                 mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {  for(int j=0;j<columns;j++)
         {
                sum[i][j]=mat1[i][j]+mat2[i][j];
                if(j==columns)
                    System.out.print(sum[i][j]);
                else
                 System.out.print(sum[i][j]+" ");
         }
                System.out.println();
        }

    }
}

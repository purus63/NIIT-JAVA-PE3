package com.company;

public class q5 {
    public static void main(String[] args) {
        String[][] str= new String[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                    str[i][j]="WW";
                else
                    str[i][j]="BB";
            }
        }

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(j<7)
                    System.out.print(str[i][j]+"|");
                else
                    System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
}

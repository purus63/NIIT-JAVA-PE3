package com.company;
import java.util.Scanner;

class StudentMarks{
    int numOfStudents;
    int stuGrades[];
    public void call(){
        int x=1;
        System.out.println("Enter number of Students");
        do {
            try{
                Scanner sc = new Scanner(System.in);
                numOfStudents = sc.nextInt();
                if(numOfStudents<=0)
                {throw new Exception();}
                x=2;
            }
            catch (Exception e){
                System.out.println("Enter valid number");
            }
        }while (x==1);

        int j=0, grade;
        stuGrades= new int[numOfStudents];
        for(int i=1;i<=numOfStudents;i++){
            x=1;
            System.out.println("Enter grade for student " +i);
            do {
                try{
                    Scanner sc1 = new Scanner(System.in);
                    grade= sc1.nextInt();
                    if(grade<0 || grade>100)
                        throw new Exception();
                    stuGrades[j++]=grade;
                    System.out.println(stuGrades[j-1]);
                    x=2;
                }
                catch (Exception e){
                    System.out.println("Enter valid grade for "+i);
                }
            }while (x==1);
        }

    }
    void display(){
        for(int i=0;i<numOfStudents;i++)
        {
            if(stuGrades[i]<0 || stuGrades[i]>100)
                System.out.println("Invalid");
            else
            System.out.println(stuGrades[i]);
        }
    }
}

public class q1 {

    public static void main(String[] args) {
        StudentMarks sm= new StudentMarks();
        sm.call();
        sm.display();
    }
}

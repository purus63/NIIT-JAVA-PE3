package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class q3{

    public static void main(String args[]){

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("E,dd/MM/yyyy");
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("First Date of week: "+sdf.format(cal.getTime()));


        //cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        cal.add(Calendar.DATE,6);
        System.out.println("Last date of Week: "+sdf.format(cal.getTime()));



    }
}
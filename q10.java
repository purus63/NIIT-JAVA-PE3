package com.company;


import java.io.File;
import java.io.FilenameFilter;

public class q10 {

    public static void main(String a[]){
        File file = new File("/home/cgi/udacity/");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}

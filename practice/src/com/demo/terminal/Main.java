package com.demo.terminal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if(args.length == 2){
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        else{
            System.out.println("None");
        }
    }
}

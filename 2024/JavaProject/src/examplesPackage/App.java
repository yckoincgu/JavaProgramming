package examplesPackage;

import java.util.Scanner;


import calculatorPackage.CalculatorOperationFlow;

enum EX {xbasic, xarray, xterminated, calcuatorV1, xcalculator, ycalculator}

public class App {

	public static void main(String[] args) {

		
		EX[] ex=EX.values();

        for(int i=0; i< EX.values().length; i++) {
        	System.out.println(i+" "+ex[i].name()); 
        }
        System.out.println("Choose an integer to run x_application");        
    
        Scanner reader = new Scanner(System.in);
        int choice;    	
        choice = reader.nextInt();  
        switch(choice) {
	        case 3->{
	        	CalculatorV1 a = new CalculatorV1();
	        	a.calEntrancec();
	        }
	        case 4->{
	        	CalculatorOperationFlow a=new CalculatorOperationFlow();
	    		a.yFlow();     	        	
	        }
	        case 5->{    }	        
	
        }
        
        
				
		
        reader.close();
       
	}

}

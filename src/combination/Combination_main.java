package combination;

import java.util.Scanner;

import combination.Combination_lib;

class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
	       System.out.println("Input Number s >");
	       int s = Integer.parseInt(scan.next()) ;
	       
	       System.out.println("Input Number r  >");
	       int r = Integer.parseInt(scan.next()) ;
	       
	       Combination_lib clib = new Combination_lib();
	       int a,b,c;
	       a = +clib.getFactorial(s);
	       b = +clib.getFactorial(r);
	       c = +clib.getFactorial(s-r);
	       System.out.println(s + "C" + r +"= " + (a / (b * c))); 
	}

}

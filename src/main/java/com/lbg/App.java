package com.lbg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	VATCalculator VAT = new VATCalculator();
        System.out.println( "The VAT is £" + VAT.calculateVATToPay(100, 20) );

        Accumulator Add = new Accumulator();
        System.out.println("The sum is: " + Add.sum(5.7, 308));

	System.out.println("Program has complete.");

    }
}

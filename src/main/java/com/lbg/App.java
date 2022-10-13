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
    }
}

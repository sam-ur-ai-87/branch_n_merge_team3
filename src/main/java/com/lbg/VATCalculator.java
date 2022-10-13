package com.lbg;

public class VATCalculator
{
    public  double  calculateVATToPay( double value, double vatRate )
    {
        return value * vatRate/100;
    }
}
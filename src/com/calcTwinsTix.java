package com;

import javax.swing.JOptionPane;

public class calcTwinsTix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_tix_int;
		final int TICKET = 75;
		final int FEE = 20;
	    final double TAX = .07;
	   // float TOTAL = (float) (TICKET + FEE * TAX);
	    
	    String ticket_number = JOptionPane.showInputDialog("How many tickets?");
	    number_tix_int = Integer.parseInt(ticket_number);
	    int ticket_prices = (TICKET * number_tix_int);
	    int subtotal = (ticket_prices + FEE);
	    double taxes = (subtotal * TAX);
	    double total = (subtotal + taxes);
	    System.out.println("Total cost of tickets..." + total);
	    

	    
	    
	    
	    
	    
	   //System.out.println(TOTAL);
	    
	    

	    
	
	    

	}

}

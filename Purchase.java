import java.util.Scanner;
import java.text.NumberFormat;
public class Purchase{
   // Calculates the values by the inputs from the user
   public static void main (String args[]){
      final double TAX_RATE = 0.06; //%6 tax
      int quantity;
      double subTotal,tax,totalCost,unitPrice;
      //define the scanner class with the new object
      Scanner sam = new Scanner(System.in);
      
      //define new objects from the NumberFormat class
      NumberFormat fmt1 =  NumberFormat.getCurrencyInstance();
      NumberFormat fmt2 =  NumberFormat.getPercentInstance();
      //getting the inputs from the user
      System.out.print(" Enter the quantity : ");
      quantity=sam.nextInt();
      
      System.out.print("Enter the unit price : ");
      unitPrice=sam.nextDouble();
      //define the variable equations
      subTotal = quantity*unitPrice;
      tax = subTotal*TAX_RATE;
      totalCost =subTotal+tax;
      //print output with appropriate formatting
      System.out.println("Subtotal : "+fmt1.format(subTotal));
      System.out.println("Tax : " +fmt1.format(tax)+ "at" + fmt2.format(TAX_RATE));
      System.out.println("Total Cost : " +fmt1.format(totalCost));
      }
      }
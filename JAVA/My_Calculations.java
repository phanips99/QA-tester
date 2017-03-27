/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Battulamanindrareddy
 */
public class My_Calculations extends Calculations {
  public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
}
   
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculations demo = new My_Calculations();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
    
}













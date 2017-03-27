/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKeyword;

/**
 *
 * @author Battulamanindrareddy
 */
public class SuperClass {
   int num = 20;

   // display method of superclass
   public void display() {
      System.out.println("This is the display method of superclass");
   }
   public static void main(String args[]) {
      Subclass obj = new Subclass();
      obj.my_method();
   }
}

    


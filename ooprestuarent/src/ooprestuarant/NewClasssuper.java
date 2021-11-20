/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooprestuarant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ICT_LAB
 */
public class NewClasssuper {
    public Double Chicken_burger; 
    public Double Filet_o_Fish;
         public Double    Chicken_Legend;
           public Double  Chicken_Burger_Meal;
           public Double  Bacon_and_Cheese_Burger;
    
           public Double Milk_Shake; 
             public Double Vanila_Cone;
         public Double    Classic_vanila;
           public Double  Vanila_Milk_Shake;
           public Double  Chocolate_Milk_Shake;
           
           
           
           
           
           public Double Meals;
     public Double Drinks;
     
     public Double TotallofMD;
     public Double   AllTotalofMD;
      public Double GetAmount()
      {
          Meals=Chicken_burger+Filet_o_Fish+Chicken_Legend+Chicken_Burger_Meal+ Bacon_and_Cheese_Burger;
      Drinks=Milk_Shake +Vanila_Cone+Classic_vanila+Vanila_Milk_Shake+Chocolate_Milk_Shake;
       
        TotallofMD=Meals+Drinks;
           
          AllTotalofMD = Meals;
      return   AllTotalofMD+Drinks;
      
      
      }
      private JFrame  frame;
      public void iExitSystem()
      {
          frame = new JFrame("Exit");
          if(JOptionPane.ShowConfirmDialog(frame,"confirm if you want ot exit","Restuarent Managment System",
      JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
      } 
             
        }
              
              
              }
      
      
      
      
      
      
        
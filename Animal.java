/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbasic;

/**
 *
 * @author gasela
 */
public class Animal {
   private String name;
    
      Animal(){
          
      }
      
      public String getName(){
          
          return this.name;
          
      }
      
      public boolean setName(String name){
          
          if(name!=null){
              
              this.name=name;
              return true;
          }
          
      
       return false;
       
      }
      
      protected void sound(){
       System.out.println("sounds ");
          
        
    } 
    
    protected void eat(){
        
        System.out.println(name +" eats ");
        
        
    }
}

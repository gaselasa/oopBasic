/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbasic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gasela
 */
public class Home {
    
    List<Animal> adoptedList=new ArrayList();
    
    
   public void adoptPet(Animal animal)throws  AdopteSameAnimalException{
          if(adoptedList.contains(animal)){
           throw new AdopteSameAnimalException("Trying to adopte the same animal twice "+animal.getName());
       }
       
       
       if(animal!=null)
          this.adoptedList.add(animal);
       
       
    
   } 
   public void makeAllSounds(){
     for(Animal animal : adoptedList){
         
         animal.sound();
         
         
     }
   }
    
}

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
public class MainRun {

    /**
     * @param args the command line arguments
     */
    
    
    static boolean k(){
        
        return false;
        
    }
    public static void main(String[] args) throws AdopteSameAnimalException {
        // TODO code application logic here
        
     //   assert k():"dsfsffsddfsf";
        
        Home home = new Home();
Animal dog1 = new Dog();
 boolean status =dog1.setName("raxs");
Animal dog2 = new Dog();
 status =dog2.setName("tiger");
Animal cat = new Cat();
 status =cat.setName("smooth");
 
home.makeAllSounds(); // this doesn't do anything
home.adoptPet(dog1);
//assert 1>2:"one great";
home.adoptPet(dog1);
home.makeAllSounds();
home.adoptPet(cat);
home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows

home.adoptPet(dog2);
home.makeAllSounds();

/*
        Animal dog=new Dog();
  
         
        dog.sound();
        dog.eat();
       
       // Animal cat=new Cat();
        status =cat.setName("storm");
        cat.eat();
        cat.sound();*/
            
       
    }
    
}

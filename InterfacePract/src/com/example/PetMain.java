package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        
        
        Animal f = new Fish();
        Animal c = new Cat();
        Animal c1 = new Cat("Spot");
        
        Pet fish = new Fish();
        Pet cat = new Cat();
        
        f.eat();
        c.eat();
        c1.eat();
        
        
        fish.play();
        cat.play();
        
        if(fish instanceof Pet) {
        	System.out.println("its a pet");
        } else{
        	System.out.println("its dangerous, not a pet");
        }
        
    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Lenovo
 */
public class Cat extends Wolf implements Animal , Mouse {
    @Override
    public void Sleep(){
        System.out.println("Cat is sleeping");
    }
    @Override
    public void Walk(){
        System.out.println("Cat is Walking");
    }
    @Override
    public void eat(){
        System.out.println("Cat is Eating");
    }
    void bite(){ //  هذه تخص الذئب
        System.out.println("Cat is biting when she Scared"); 
    }
    @Override
    public void small(){
        System.out.println("Cat is Small");
     }

    // shewayet function for CAT
    void meow(){
        System.out.println("Meowwww");
    }
    
    
}

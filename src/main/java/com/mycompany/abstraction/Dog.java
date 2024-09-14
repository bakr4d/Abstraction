/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author Lenovo
 */
public class Dog extends Wolf implements Animal , Mouse{
    
    //shewayet function 
    void ho_ho_ho(){
        System.out.println("HoHOHOHOHO");
    }

    @Override
    public void Sleep() {
        System.out.println("Dog is Sleeping"); 
    }

    @Override
    public void Walk() {
        System.out.println("Dog is Walking"); 
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override // from Wolf
    void bite(){
        System.out.println("Dog is bite Like Wolf");
    }
    
     
        
    

    
    
     @Override // from Mouse
    public void small(){
        System.out.println("Dog is Small");
     }


}

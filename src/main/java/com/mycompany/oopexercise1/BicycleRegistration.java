/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopexercise1;

/**
 *
 * @author Stephen Janseen Balo
 */
public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle bike1, bike2, bike3;
        String owner1, owner2;
        
        bike1 = new Bicycle();
        bike1.setOwnerName("Stephen Janseen Balo");
        
        bike2 = new Bicycle();
        bike2.setOwnerName("Cardo Dalisay");
        
        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();
        
        System.out.println(owner1 + " owns a bicycle.");
        //shortcut to print: sout<press TAB>
        bike2.setTagNo("XYZ");
        String tagNo = bike2.getTagNo();
        System.out.println(owner2 + " also owns a bicycle with tag #: " + tagNo);
        // creating another Bicycle object using the other constructor
        bike3 = new Bicycle("Jose Marie Chan", "BIPSU-123"); 
        String owner3 = bike3.getOwnerName();
        String tagNo3 = bike3.getTagNo();
        System.out.println(owner3 + " owns a bicycle with tag number:" + tagNo3);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopexercise1;

public class Bicycle {
    private String ownerName;
    private String tagNo;

    public Bicycle() {
        ownerName = "Unknown";
        tagNo = "XXX";
    }

    public Bicycle(String ownerName, String tagNo) {
        this.ownerName = ownerName;
        this.tagNo = tagNo;
    }
    
    public String getOwnerName() {  // accessor
        return ownerName;
    }

    public void setOwnerName(String ownerName) {    //mutator
        this.ownerName = ownerName;
    }

    public String getTagNo() {  // accessor
        return tagNo;
    }
    
    public void setTagNo(String tagNo) {    // mutator
        this.tagNo = tagNo;
    }
    
    
}

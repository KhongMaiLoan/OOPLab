/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ngao
 */
public class PersonParent extends PersonComponent{
    private PersonParent spouse;
    private ArrayList kids = new ArrayList();
    
    /*
    * Ham khoi tao 2 tham so
    */
    public PersonParent(String name, String gioitinh)
    {
        this.name=name;
        this.gioitinh=gioitinh;
   
        if( gioitinh=="male")
        {
            
            spouse=new PersonParent();
            spouse.setName("Mrs. "+this.name);
            spouse.setGioiTinh("female");
            spouse.setAllKid(kids);
            this.name = "Mr. "+this.name;
            
        }
        if( gioitinh=="female")
        {
            
            spouse=new PersonParent();
            spouse.setName("Mr. "+this.name);
            spouse.setGioiTinh("male");
            spouse.setAllKid(kids);
            this.name = "Mrs. "+this.name;
            
        }
    }
    
    private void setAllKid(ArrayList<PersonComponent> newkids)
    {
        this.kids=newkids;
    }
    
    public ArrayList<PersonComponent> getAllKid()
    {
        return kids;
    }
    
    public PersonParent()
    {
        
    }
    
    
    public void add(PersonComponent newkid)
    {
        kids.add(newkid);
    }
    
    public void remove(PersonComponent newkid)
    {
        kids.remove(newkid);
    }
    
    public PersonComponent getKid(int index)
    {
        return (PersonComponent)kids.get(index);
    }
    
   

    @Override
    public void displayPersonInfo() {
        displayCoupleInfo();
        Iterator kidIterator = kids.iterator();
        while (kidIterator.hasNext()) {
            PersonComponent kidInfo = (PersonComponent)kidIterator.next();
            kidInfo.displayPersonInfo();
        }
    }

    //Chi in thong tin cua cap vo chong
    public void displayCoupleInfo()
    {
        System.out.println("Parent's name: " + this.name + ", Parent's gioi tinh: " + this.gioitinh);
        System.out.println("Spouse's name: "+spouse.name + ", Spouse's gioi tinh: "+spouse.gioitinh);
    }
}

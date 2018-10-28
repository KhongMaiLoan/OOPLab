/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author ngao
 */
public class PersonLeaf extends PersonComponent{
    public PersonLeaf(String name, String gioitinh)
    {
        this.name=name;
        this.gioitinh=gioitinh;
    
    }
    @Override
    public void displayPersonInfo()
    {
        System.out.println("Name: "+this.name+", Gioi tinh: "+this.gioitinh);
    }
}

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
public abstract class PersonComponent {

    protected String name, gioitinh;
    protected int age;

    /*
    * Getter & Setter
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String GioiTinh() {
        return gioitinh;
    }

    public void setGioiTinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    /*
    * Cac ham chung o ca 2 lop PersonLeaf va PersonParent
    */
    
    public abstract void displayPersonInfo();

    public void add(PersonComponent newPersonComponent) {
        throw new UnsupportedOperationException();

    }

    public void remove(PersonComponent newPersonComponent) {
        throw new UnsupportedOperationException();

    }

    public PersonComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

}

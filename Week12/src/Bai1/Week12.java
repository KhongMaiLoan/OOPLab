/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;

/**
* Week12 la 1 ung dung cua Composite design pattern
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-14
*/
public class Week12 {
    
     /**
     * Sau đây là hàm main 
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */

    public static void main(String[] args) {
        //PersonComponent James = new PersonParent("James", "male");
        PersonComponent Kai = new PersonParent("Kai", "male");
        PersonComponent Andy = new PersonParent("Andy", "female");
        PersonComponent Justine = new PersonParent("Justine","male");
        
        PersonComponent James = new PersonParent("James","male");
        James.add(Kai);
        James.add(new PersonLeaf("Ryan","male"));
        Kai.add(Andy);
        Kai.add(Justine);
        Kai.add(new PersonLeaf("Bella", "femal"));
        Kai.add(new PersonLeaf("Thomas", "male"));
        Andy.add(new PersonLeaf("Linda", "female"));
        Andy.add(new PersonLeaf("Rachel", "male"));
        
        
        printout(James);
        twoKid(James);
    }
    
    /**
     * printout là 1 phương thức dùng để in ra cac ca nhan khong ket hon
     *
     * @param p la ..
     * @return khong co
     */

    public static void printout(PersonComponent p)
    {
        if(p==null) return;
        if(p instanceof PersonLeaf)
        {
            ((PersonLeaf)p).displayPersonInfo();
            return;
        }
        
        if(p instanceof PersonParent)
        for(int i=0; i < ( ((PersonParent)p).getAllKid().size());i++)
        {
            printout(((PersonParent)p).getAllKid().get(i));
        }
    }
    
    /**
     * twokid là 1 phương thức dùng để in ra cac cap vo chong co 2 con
     *
     * @param p la ..
     * @return khong co
     */
    public static void twoKid(PersonComponent p) {
        if (p == null || (p instanceof PersonLeaf)) {
            return;
        }

        if (p instanceof PersonParent) {
            if ((((PersonParent) p).getAllKid().size()) == 2) {
                ((PersonParent) p).displayCoupleInfo();

            }
            for (int i = 0; i < (((PersonParent) p).getAllKid().size()); i++) {

                twoKid(((PersonParent) p).getAllKid().get(i));

            }
        }
    }
}

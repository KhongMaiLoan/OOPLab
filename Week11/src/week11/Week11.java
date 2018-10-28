/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
* Week11 là 1 ứng dụng cho phép người dùng thu nghiem code
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-16
*/
public class Week11 {

    /**
     * Sau đây là hàm main để thu nghiem code
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        Integer a[] = new Integer[100];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100)+1;
        }
        a = MyStack.<Integer>sortArray(a);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(new Integer(rand.nextInt(100)+1));
        
        }
        System.out.println(MyStack.<Integer>findMax(arr));
        
    }
    
    
}

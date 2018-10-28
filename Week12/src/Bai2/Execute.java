/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.*;

/**
* Execute la 1 ung dung cua Strategy design pattern
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-14
*/
public class Execute {
    /**
     * Sau đây là hàm main để thực thi Strategy design patter
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arr.add(rand.nextInt(100)+1);
        }
        
        AlgorithmPicker picker = new AlgorithmPicker();
        picker.setAlgorithm(new descendingBubbleSort());
        picker.implementAlgorithm(arr);
        for (int i = 0; i < 100; i++) {
            System.out.println(arr.get(i));
        }
                
    }
}

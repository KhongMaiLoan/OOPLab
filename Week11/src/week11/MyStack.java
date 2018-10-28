/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngao
 */
class MyStack {

    /**
     * sortArray là 1 phương thức dùng de sort array
     *
     * @param mang can sort
     * @return mang can sort
     */
    public static <T extends Comparable > T[] sortArray(T[] array) {
        T temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) <0 ) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        return array;
    }
    
    /**
     * findMax là 1 phương thức dùng de tim so lon nhat
     *
     * @param mang can tim
     * @return so lon nhat
     */
    public static <T extends Comparable> T findMax(ArrayList<T> arr)
    {
        T max = arr.get(0);
        for(T t : arr)
        {
            if(t.compareTo(max)>0) max=t;
        }
        return max;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

/**
 *
 * @author ngao
 */
public class ascendingBubbleSort implements sortStrategy{

   

    @Override
    public void sorting(ArrayList<Integer> arr) {
        int n = arr.size();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr.get(j-1) > arr.get(j)) {

                    temp = arr.get(j-1);
                    //arr[j - 1] = arr[j];
                    arr.set(j-1, arr.get(j));
                    //arr[j] = temp;
                    arr.set(j,temp);
                }

            }
        }
    }
}

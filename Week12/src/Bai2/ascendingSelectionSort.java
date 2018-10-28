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
public class ascendingSelectionSort implements sortStrategy
{
    private static void hoan_vi(ArrayList<Integer> A, int a, int b) {
        int temp = A.get(a);
        //A[a] = A[b];
        A.set(a, A.get(b));
        //A[b] = temp;
        A.set(b,temp);
    }


    @Override
    public void sorting(ArrayList<Integer> arr) {
        int n=arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minArr = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(minArr)  > arr.get(j)) {
                    minArr = j;
                }
            }
            if (i != minArr) {
                hoan_vi(arr, minArr, i);
            }
        }
    }
}

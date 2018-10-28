/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.*;

/**
 *
 * @author ngao
 */
public class AlgorithmPicker {
    private sortStrategy sortstrategy;
    
    public void setAlgorithm(sortStrategy sortstrategy)
    {
        this.sortstrategy = sortstrategy;
    }
    
    public void implementAlgorithm(ArrayList<Integer> arr)
    {
        sortstrategy.sorting(arr);
    }
}

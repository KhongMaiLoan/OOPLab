/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8ver1;

/**
 *
 * @author CCNE
 */
public class Numeral extends Expression{
    private int value;
    Numeral(int value)
    {
        this.value=value;
    }
    Numeral()
    {
        value=0;
    }

    @Override
    public String toString() {
        return (new Integer(value).toString());
    }

    @Override
    public int evaluate() {
        return value;
    }
}

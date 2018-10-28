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
public class Subtraction extends BinaryExpression {

    //khoi tao left va right
    private Expression left, right;
    
    //Ham khoi tao 2 tham so
    
    Subtraction(Expression left, Expression right)
    {
        this.left=left;
        this.right=right;
    } 
    
    /*
    *override cac phuong thu tu lop BinaryExpression
    */
    @Override
    public String toString() {
        return  (new Integer(evaluate()).toString());
    }

    @Override
    public int evaluate() {
        if(left instanceof Numeral && right instanceof Numeral)
        {
            Numeral x = (Numeral)left;
            Numeral y = (Numeral)right;
            return x.evaluate()-y.evaluate();
        }
        return 0;
    }
    
    

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }
    
}

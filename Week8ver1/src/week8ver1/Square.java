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
public class Square extends Expression {
    Expression expression;
    
    Square(Expression e)
    {
        expression=e;
    
    }

    @Override
    public String toString() {
     return (new Integer(this.evaluate()).toString())+"^2";
    }

    @Override
    public int evaluate() {
        if(expression instanceof Numeral)
        {
            Numeral x = (Numeral)expression;
            return x.evaluate()*x.evaluate();
        }
        return 0;
    }
}

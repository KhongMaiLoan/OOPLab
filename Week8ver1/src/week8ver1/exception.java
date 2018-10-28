/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8ver1;

import java.io.*;

/**
 *
 * @author CCNE
 */
public class exception {

    public int readInt() throws IOException, NumberFormatException {

        InputStreamReader reader;

        reader = new InputStreamReader(System.in);

        BufferedReader buf = new BufferedReader(reader);

        String str = buf.readLine();

        return Integer.valueOf(str).intValue();

    }

    public boolean checkEqual() throws NullPointerException {
        String ptr = null;

        if (ptr.equals("abc")) {
            System.out.print("Same");
        } else {
            System.out.print("Not Same");
        }
        throw new NullPointerException("Empty String");

    }

    public int getInt() throws ArrayIndexOutOfBoundsException {
        double[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double x = myList[11];
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
    }

    public double division() throws ArithmeticException {

        double a = 1, b = 0;
        if (b == 0) {

            throw new ArithmeticException("Can not divide for zero");

        }
        return a / b;
    }

    void casting() throws ClassCastException {
        Object x = new Integer(0);
        System.out.println((String) x);
        throw new ClassCastException("Can not cast Integer to String");
    }

    public void writeFile() throws FileNotFoundException {
        FileInputStream fis = null;
        fis = new FileInputStream("abc.txt");
        throw new FileNotFoundException("Can not find the file");

    }
}

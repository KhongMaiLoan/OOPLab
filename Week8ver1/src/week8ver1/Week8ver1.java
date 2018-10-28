/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8ver1;
import java.util.*;

/**
* Week8ver1 là 1 ứng dụng cho phép người dùng tinh toan qua cac lop co san
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-16
*/

public class Week8ver1 {

    /**
     * Sau đây là hàm main để thực thi hàm cộng phep tinh
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeral num1  = new Numeral(10);
        Square num2 = new Square(num1);
        System.out.println(num2.toString());
        Numeral num2_2 = new Numeral(num2.evaluate());
        System.out.println("num 2"+num2_2.toString());
        Numeral num3 = new Numeral(-1);
        System.out.println("num 3"+num3.toString());
        Addition num4 = new Addition((Expression)num2_2,(Expression) num3);
        System.out.println("num 4"+num4.toString());
        
        
        Multiplication num5 = new Multiplication((Expression)new Numeral(2), (Expression)new Numeral(3));
        System.out.println("num 5"+num5.toString());
        Numeral num4_2 = new Numeral(num4.evaluate());
        Numeral num5_2 = new Numeral(num5.evaluate());
        Addition num6 = new Addition((Expression)num4_2, (Expression)num5_2);
        Numeral num6_2 = new Numeral(num6.evaluate());
        System.out.println("num 6"+num6.toString());
        //
        Square result = new Square((Expression)num6_2);
        System.out.println(result.toString());
    }
   
}
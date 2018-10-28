/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
* Week9 là 1 ứng dụng cho phép người dùng doc,ghi file
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-16
*/

public class Week9 {

    /**
     * Sau đây là hàm main để thực thi hàm doc ghi file
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Util.readContentFromFile("abc.txt");
        Util.writeContentToFile("output.txt");
        Util.writeContentToFile2("writefile.txt");
        
       
        BufferedReader br = null;
        String textInALine = "";
        try {   
            String cwd = System.getProperty("user.dir");
        System.out.println("Current working directory : " + cwd);
            File file = Util.findFileByName("/home/ngao/NetBeansProjects/Week9", "/home/ngao/NetBeansProjects/Week9/output.txt");
             String path = file.getAbsolutePath();
            br = new BufferedReader(new FileReader(path));       
                textInALine = br.readLine();
                System.out.println(textInALine);
          
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
}

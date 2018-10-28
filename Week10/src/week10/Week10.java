/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
* Week10 là 1 ứng dụng cho phép người dùng thu nghiem code
* in kết quả ra màn hình
* @author  Khong Thi Mai Loan
* @version 1.0
* @since   2018-10-16
*/
public class Week10 {

    /**
     * Sau đây là hàm main để thực thi hàm doc ghi file
     *
     * @param args không sử dụng.
     * @return hàm main thì không trả về giá trị nào cả
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = getAllFunctions(new File("/home/ngao/NetBeansProjects/Week9/src/week9/Util.java"));
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        String s = findFunctionByName("findFileByName(String,String)");
        System.out.println(s);
        
        double[] x = bubbleSort();
       
    }
    
    /**
     * bublesort là 1 phương thức dùng sap xep mang
     *
     * @param khong co
     * @return day double
     */
    
    static double[] bubbleSort() {
        double[] arr = new double[1000];
        for (int i = 0; i < 1000; i++) {
            Random rand = new Random();
            arr[i] = rand.nextDouble();
        }
        int n = arr.length;
        double temp = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }
    
    /**
     * getAllfunction là 1 phương thức dùng tra ve cac ham static
     *
     * @param file can tim
     * @return day String
     */
    
    public static List<String> getAllFunctions(File path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.contains("static"))
                {
                    list.add(line);
                    while((line = br.readLine()) != null)
                    {
                        list.add(line);
                    }
                    return list;
                }
 
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
    /**
     * findFuntionbyname là 1 phương thức dùng tim ham
     *
     * @param name la duong dan den file
     * @return day String
     */
    public static String findFunctionByName(String name) {
        String s[] = name.split("\\(");

        if (s.length > 0) {
            String namemethod = s[0];
            try (BufferedReader br = new BufferedReader(new FileReader(new File("/home/ngao/NetBeansProjects/Week9/src/week9/Util.java")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("/*") && line.contains("*/")) {
                        String result = line.substring(line.indexOf("/*") + 1, line.indexOf("*/"));
                        if (result.contains(namemethod)) {
                            continue;
                        }

                    } else if (line.contains(namemethod)) {
                        int count = 0;
                        int idx = 0;

                        while ((idx = line.indexOf("String", idx)) != -1) {
                            idx++;
                            count++;
                        }
                        if (count == 2) {
                            return line;
                        }

                    }
                }
            }
                catch(IOException e)
        {
            e.printStackTrace();
        }
            }

            return "The java file doesn't contains this method";

        }
    }


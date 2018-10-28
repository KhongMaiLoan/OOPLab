/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.*;
import java.util.*;


public class Util {

    /**
     * readContentFromFile là 1 phương thức dùng de doc file
     *
     * @param path la duong dan den file can doc
     * @return String la chuoi trong file
     */

    static String readContentFromFile(String path)
    {
        BufferedReader br = null;
        String textInALine = "";
        try {   
            br = new BufferedReader(new FileReader(path));       
                textInALine = br.readLine();
                System.out.println(textInALine);
            return textInALine;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return textInALine;
    }
    
    /**
     * writeContentToFile là 1 phương thức dùng de ghi file
     *
     * @param path la duong dan den file can doc
     * @return khong tra ve
     */
    
    static void writeContentToFile(String path)
    {
        try {
     File f = new File(path);
     FileWriter fw = new FileWriter(f);

     //Bước 2: Ghi dữ liệu
     fw.write("Ghi dữ liệu bằng luồng character");

     //Bước 3: Đóng luồng
     fw.close(); 
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
    }
    
    /**
     * writeContentToFile là 1 phương thức dùng de ghi vao cuoi file
     *
     * @param path la duong dan den file can doc
     * @return khong tra ve
     */
    
    static void writeContentToFile2(String path)
{
    try(FileWriter fw = new FileWriter("writefile.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println("the text");
    
} catch (IOException e) {
    e.printStackTrace();
}
}
    /**
     * findFileByName là 1 phương thức dùng de tim file trong thu muc
     *
     * @param folderpath la duong dan den folder 
     * @param fileName la duong dan den file can tim
     * @return file can tim
     */
    
    static File findFileByName(String folderPath, String fileName) {
        try {
            File dir = new File(folderPath);

            File[] f = dir.listFiles();
            for (int i = 0; i < f.length; i++) {
                if (f[i].getPath().equals(fileName)) {
                    return f[i];
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }

}



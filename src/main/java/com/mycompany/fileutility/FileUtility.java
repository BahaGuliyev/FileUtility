/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Bahadur.Guliyev
 */
public class FileUtility {

    public static void main(String[] args) throws IOException {
        byte[] bytes=readFileByteArray("C:\\Users\\bahadur.guliyev\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
        writeByteArrayToFile("C:\\Users\\bahadur.guliyev\\Downloads\\as.jpg", bytes);
    }
    public static byte[] readFileByteArray(String path) throws FileNotFoundException, IOException{
        File file=new File(path);
        try(FileInputStream fis=new FileInputStream(file)){
        byte[] bytes=fis.readAllBytes();
        return bytes;
        }
    }
    
    public static void writeByteArrayToFile(String path,byte[] bytes) throws FileNotFoundException, IOException{
        File file=new File(path);
        try(FileOutputStream fos=new FileOutputStream(file)){
        fos.write(bytes);
        }
        }
            
        
}

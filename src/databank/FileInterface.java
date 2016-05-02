/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Gilles
 */
public class FileInterface {
    
    //public void 
    
    public static void createDirectorys() throws IOException{

         // the folders "000/111/222" don't exist initially
        File dir = new File("D:\\Directory2\\Sub2\\Sub-Sub2");

        // create multiple directories at one time
        boolean successful = dir.mkdirs();
        if (successful)
        {
          // created the directories successfully
          System.out.println("directories were created successfully");
        }
        else
        {
          // something failed trying to create the directories
          System.out.println("failed trying to create the directories");
        }
    }
    
    
    public static void createProfil(String fileName, String Path){
        
    }
    
    
 
    
}

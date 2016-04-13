/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank;

/**
 *
 * @author Gilles
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    String path;
    boolean appandToFile;
        
    public WriteFile(String path){
        this.path = path;
    }
    public WriteFile( String path , boolean app ) {
        this.path = path;
        this.appandToFile = app;
    }
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter(path, appandToFile);
        PrintWriter printLine = new PrintWriter(path);
        
        printLine.println(textLine);

        //printLine.printf( "%s" + "%n" , textLine);
        printLine.close();
       
    }
}

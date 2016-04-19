/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank;

/**
 *
 * @author Martijn Festjens
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;
    public ReadFile (String path){
        this.path = path;
    }
    public String[] OpenFile() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = ReadLines();
        String[] textData = new String[numberOfLines];
        int i;

        for (i=0; i < numberOfLines; i++) {
            textData[ i ] = textReader.readLine();
        }
        textReader.close( );
        return textData;
    }
    int ReadLines() throws IOException{
        FileReader File_To_Read = new FileReader(path);
        BufferedReader bf = new BufferedReader(File_To_Read);
        
        String aLine;
        int numberOfLines = 0;
        
        while((aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
    
}

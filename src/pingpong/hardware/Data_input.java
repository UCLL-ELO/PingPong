/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.hardware;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gilles
 */
public class Data_input implements SerialPortEventListener{
    
    private SerialPort serialPort;
    private BufferedReader input;
    private OutputStream output;
    private CommPortIdentifier portId = null; // port ID that we will be using
    private Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
    
    // SETTINGS:
    /** Milliseconds to block while waiting for port open */
    private static final int TIME_OUT = 2000;
    private static int DATA_RATE;
    
    private Boolean connection;
    
     private LinkedList<String> comPortList;
     private LinkedList<CommPortIdentifier> comPortNumberList;
    
    public Data_input(){
        this.DATA_RATE = 9600;
        
        comPortList = new LinkedList();
        comPortNumberList = new LinkedList();
        
        connection = false;
    }
 
    
  

    public synchronized void serialEvent(SerialPortEvent oEvent) {    
    if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
     try {
       //   System.out.println(input.read());
        System.out.println(input.readLine());
     } catch (Exception e) {
        System.err.println(e.toString());
     }
    }
   }
    
    public void init(){
       if (portId != null){ 
        // if there is a port open this will close them, so you can not open 2 at the time   
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }    
        
        try {
         // open serial port, and use class name for the appName.
         serialPort = (SerialPort) portId.open(this.getClass().getName(),TIME_OUT);
         // set port parameters
         serialPort.setSerialPortParams(DATA_RATE,
           SerialPort.DATABITS_8,
           SerialPort.STOPBITS_1,
           SerialPort.PARITY_NONE);

         // open the streams
         input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
         output = serialPort.getOutputStream();

         // add event listeners
         serialPort.addEventListener(this);
         serialPort.notifyOnDataAvailable(true);
         
         connection = true;
         
        } catch (Exception e) {
         System.err.println(e.toString());
        }
      }
    }
    public char[] getBuffer() { 
        char[] buffer = new char[3];
        try {   
            input.read(buffer, 0, 3);
        } catch (IOException ex) {
            Logger.getLogger(Data_input.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buffer;
    }
    public Boolean getConnection() { return this.connection; }
        
    public LinkedList<String> getComPort() {
        comPortList.clear();    
       while (portEnum.hasMoreElements()) {
         CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();  
         comPortList.add(currPortId.getName());
         comPortNumberList.add(currPortId);
       }
      return comPortList;  
    } 
    
    public void setComPoort(String portName){  
        for (int i = 0; i < comPortList.size(); i++){
            if (comPortList.get(i).equals(portName)){
                portId = comPortNumberList.get(i);
                break;
            }
        }
    } 
}



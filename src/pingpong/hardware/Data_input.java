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
import java.util.Enumeration;
import java.util.LinkedList;

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
    private static int DATA_RATE = 9600;
    
   private LinkedList<String> comPortList = new LinkedList();

    public synchronized void serialEvent(SerialPortEvent oEvent) {
    if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
     try {
        String inputLine=input.readLine();
        System.out.println(inputLine);
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
        } catch (Exception e) {
         System.err.println(e.toString());
        }
      }
    }
    
    public void changeBaud(int value){
        
        System.out.println("");
      //   System.out.println(value);
        
       // this.DATA_RATE = value; 
    }
        
    public LinkedList<String> getComPort() {
        comPortList.clear();    
       while (portEnum.hasMoreElements()) {
         CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();  
         comPortList.add(currPortId.getName());
       }
      return comPortList;  
    } 
    
    public void setComPoort(String portName){
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier setCurrPortId = (CommPortIdentifier) portEnum.nextElement();  
            if (setCurrPortId.getName().equals(portName)){
                portId = setCurrPortId;
            }
        }       
    }  
}



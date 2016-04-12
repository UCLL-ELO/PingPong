/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;
import pingpong.hardware.Data_input;
import pingpong.math.Sensor;
import pingpong.visual.*;

/**
 *
 * @author Gilles
 */
public class Window extends javax.swing.JFrame {

    private Pallet pallet;
    private Graph graph1,graph2,graph3;
    private Sensor s1,s2,s3;
    private LinkedList<Sensor> sensorList;
    private Timer timer;
    private Data_input serialCom;
    
    private ActionListener taskPerformer = new ActionListener() {
  
        @Override
        public void actionPerformed(ActionEvent e) {
         // this will check for updates for the graph 
         
         // get data
         
         s1.setRadius(1);
         s2.setRadius(0.5);
         s3.setRadius(0.2);
         
         graph1.update(s1.getRadius(), timer.getDelay());
         graph2.update(s2.getRadius(), timer.getDelay());
         graph3.update(s3.getRadius(), timer.getDelay());        

        }
    };
    
   
    public Window() {
        initComponents();

        sensorList = new LinkedList();
        
        s1 = new Sensor( new Vector(PalletPanel.getWidth()/2 -7, 30));
        s2 = new Sensor( new Vector(18, PalletPanel.getHeight()/3 + 10));
        s3 = new Sensor( new Vector(PalletPanel.getHeight()/3 + 133,
                                        PalletPanel.getHeight()/3 + 10));
        
        
        
        sensorList.add(s1);
        sensorList.add(s2);
        sensorList.add(s3);

        pallet = new Pallet(PalletPanel, sensorList);
        
        graph1 = new Graph(graphPanel1, 10000);
        graph2 = new Graph(graphPanel2, 10000);
        graph3 = new Graph(graphPanel3, 10000);
        
       this.setTitle("Project Ping Pong -  A new look at the game through the eyes of an electronicus");
       
       timer = new Timer(100 ,taskPerformer);
       timer.setRepeats(true);
       timer.start();
       
       serialCom = new Data_input();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PalletPanel = new javax.swing.JPanel();
        graphPanel1 = new javax.swing.JPanel();
        graphPanel2 = new javax.swing.JPanel();
        graphPanel3 = new javax.swing.JPanel();
        AwsomeTitel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BaudRate = new javax.swing.JLabel();
        infoTitel = new javax.swing.JLabel();
        baudRateList = new javax.swing.JComboBox<>();
        comList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SearchComButton = new javax.swing.JButton();
        connectButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PalletPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PalletPanelLayout = new javax.swing.GroupLayout(PalletPanel);
        PalletPanel.setLayout(PalletPanelLayout);
        PalletPanelLayout.setHorizontalGroup(
            PalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        PalletPanelLayout.setVerticalGroup(
            PalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        graphPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graphPanel1Layout = new javax.swing.GroupLayout(graphPanel1);
        graphPanel1.setLayout(graphPanel1Layout);
        graphPanel1Layout.setHorizontalGroup(
            graphPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graphPanel1Layout.setVerticalGroup(
            graphPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        graphPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graphPanel2Layout = new javax.swing.GroupLayout(graphPanel2);
        graphPanel2.setLayout(graphPanel2Layout);
        graphPanel2Layout.setHorizontalGroup(
            graphPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graphPanel2Layout.setVerticalGroup(
            graphPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        graphPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graphPanel3Layout = new javax.swing.GroupLayout(graphPanel3);
        graphPanel3.setLayout(graphPanel3Layout);
        graphPanel3Layout.setHorizontalGroup(
            graphPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graphPanel3Layout.setVerticalGroup(
            graphPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        AwsomeTitel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AwsomeTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AwsomeTitel.setText("This Is PingPong!");
        AwsomeTitel.setMaximumSize(new java.awt.Dimension(84, 14));
        AwsomeTitel.setMinimumSize(new java.awt.Dimension(84, 14));

        jLabel2.setText("made by 2ELO");

        BaudRate.setText("Baud rate");

        infoTitel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        infoTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTitel.setText("Info");
        infoTitel.setOpaque(true);
        infoTitel.setRequestFocusEnabled(false);

        baudRateList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9600", "14400", "19200", "28800", "38400", "56000", "57600", "115200" }));

        comList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Com" }));

        jLabel3.setText("Bith depht: 8 bit");

        jLabel4.setText("Pariteit bit:  NONE");

        jLabel5.setText("Stop bit: 1 bit");

        SearchComButton.setText("Search Com");
        SearchComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchComButtonActionPerformed(evt);
            }
        });

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem2.setText("New");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Config");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PalletPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(graphPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graphPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graphPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AwsomeTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(infoTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BaudRate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(baudRateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchComButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PalletPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AwsomeTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(infoTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(graphPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(graphPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BaudRate)
                                    .addComponent(baudRateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SearchComButton)
                                    .addComponent(comList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(connectButton)))
                        .addGap(18, 18, 18)
                        .addComponent(graphPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchComButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchComButtonActionPerformed
        LinkedList<String> comPortList = new LinkedList();
        comPortList = serialCom.getComPort();
        comList.removeAllItems();
        
        if (comPortList.size() == 0) {
          comList.addItem("No Com");
        } else {
            for (int i = 0; i<comPortList.size(); i++){
                comList.addItem(comPortList.get(i));
            }
        } 
    }//GEN-LAST:event_SearchComButtonActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed

        serialCom.changeBaud(Integer.parseInt(baudRateList.getSelectedItem().toString()));
        serialCom.setComPoort(comList.getSelectedItem().toString());
        serialCom.init();
    }//GEN-LAST:event_connectButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Window window = new Window();
        window.setVisible(true);
        window.pallet.draw();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               window.pallet.draw();
               window.graph1.draw();
               window.graph2.draw();
               window.graph3.draw();
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AwsomeTitel;
    private javax.swing.JLabel BaudRate;
    private javax.swing.JPanel PalletPanel;
    private javax.swing.JButton SearchComButton;
    private javax.swing.JComboBox<String> baudRateList;
    private javax.swing.JComboBox<String> comList;
    private javax.swing.JButton connectButton;
    private javax.swing.JPanel graphPanel1;
    private javax.swing.JPanel graphPanel2;
    private javax.swing.JPanel graphPanel3;
    private javax.swing.JLabel infoTitel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}

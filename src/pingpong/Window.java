/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;


import databank.FileInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;
import pingpong.hardware.Data_input;
import pingpong.math.ApolloniusSolver;
import pingpong.visual.Sensor;
import pingpong.visual.*;

/**
 *
 * @author Gilles
 */
public class Window extends javax.swing.JFrame {

    private Pallet pallet;
    private Sensor s1,s2,s3;
    private Ball ball;
    private LinkedList<Visual> drawList;
    
    private Timer timer;
    private Data_input serialCom;
    private Boolean makePalletVisual = false;
    
    
    private ActionListener taskPerformer = new ActionListener() {
  
        @Override
        public void actionPerformed(ActionEvent e) {
         if (makePalletVisual == true){    
            for ( Visual visual : drawList){
                   visual.paintComponent(PalletPanel.getGraphics());
             }    

             if (serialCom != null && serialCom.getBuffer() != null) {
                s1.setRadiusDiff(serialCom.getBuffer()[0]);
                s2.setRadiusDiff(serialCom.getBuffer()[1]);
                s3.setRadiusDiff(serialCom.getBuffer()[2]); 
                       
                ball.setVector(ApolloniusSolver.calculateRange(s1, s2, s3));
                ball.paintComponent(PalletPanel.getGraphics()); 
               }
           } 
        }
    };
    
   
    public Window() {
       initComponents();
       this.setTitle("Project Ping Pong -  A new look at the game through the eyes of an electronicus");
        
       s1 = new Sensor( new Vector(PalletPanel.getWidth()/2 -7, 5));
       s2 = new Sensor( new Vector(25, PalletPanel.getHeight()/3 + 10));
       s3 = new Sensor( new Vector(PalletPanel.getHeight()/3 + 165,
                                        PalletPanel.getHeight()/3 + 10));
        
       pallet = new Pallet(PalletPanel);
       ball = new Ball();
        
       drawList = new LinkedList();
        
       drawList.add(pallet);
       drawList.add(s1);
       drawList.add(s2);
       drawList.add(s3);

       timer = new Timer(100 ,taskPerformer);
       timer.setRepeats(true);
       timer.start();
       
       serialCom = new Data_input();
       
       makePalletVisual = true;
       
       // FileInterface.createDirectorys();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        AboutButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        VisualButton = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        VisualPanel = new javax.swing.JPanel();
        PalletPanel = new javax.swing.JPanel();
        AwsomeTitel = new javax.swing.JLabel();
        SettingPanel = new javax.swing.JPanel();
        comList = new javax.swing.JComboBox<>();
        connectButton = new javax.swing.JButton();
        SearchComButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LenghtPalletSteleInputBox = new javax.swing.JTextField();
        LenghtSteleInputBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        WidthPalletInputBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        WidthSteleInputBox = new javax.swing.JTextField();
        AwsomeTitel1 = new javax.swing.JLabel();
        connectionLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        LenghtS1S2InputBox = new javax.swing.JTextField();
        LenghtS2S3InputBox = new javax.swing.JTextField();
        LenghtS3S1InputBox = new javax.swing.JTextField();
        CreateProfileButton = new javax.swing.JButton();
        OpenProfileButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        AboutPanel = new javax.swing.JPanel();
        AwsomeTitel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));

        MenuPanel.setBackground(new java.awt.Color(153, 153, 153));
        MenuPanel.setForeground(new java.awt.Color(255, 255, 255));
        MenuPanel.setPreferredSize(new java.awt.Dimension(128, 228));

        AboutButton.setBackground(new java.awt.Color(204, 204, 204));
        AboutButton.setText("About");
        AboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutButtonMousePressed(evt);
            }
        });

        SettingsButton.setBackground(new java.awt.Color(204, 204, 204));
        SettingsButton.setText("Settings");
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsButtonMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        VisualButton.setBackground(new java.awt.Color(204, 204, 204));
        VisualButton.setText("Visual");
        VisualButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VisualButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VisualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(AboutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(AboutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SettingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VisualButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DynamicPanel.setPreferredSize(new java.awt.Dimension(700, 620));
        DynamicPanel.setLayout(new java.awt.CardLayout());

        VisualPanel.setBackground(new java.awt.Color(204, 204, 204));
        VisualPanel.setPreferredSize(new java.awt.Dimension(700, 620));
        VisualPanel.setRequestFocusEnabled(false);

        PalletPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PalletPanelLayout = new javax.swing.GroupLayout(PalletPanel);
        PalletPanel.setLayout(PalletPanelLayout);
        PalletPanelLayout.setHorizontalGroup(
            PalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PalletPanelLayout.setVerticalGroup(
            PalletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        AwsomeTitel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AwsomeTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AwsomeTitel.setText("Visual");
        AwsomeTitel.setMaximumSize(new java.awt.Dimension(84, 14));
        AwsomeTitel.setMinimumSize(new java.awt.Dimension(84, 14));

        javax.swing.GroupLayout VisualPanelLayout = new javax.swing.GroupLayout(VisualPanel);
        VisualPanel.setLayout(VisualPanelLayout);
        VisualPanelLayout.setHorizontalGroup(
            VisualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(VisualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AwsomeTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(PalletPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        VisualPanelLayout.setVerticalGroup(
            VisualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AwsomeTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PalletPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        DynamicPanel.add(VisualPanel, "card2");

        SettingPanel.setBackground(new java.awt.Color(204, 204, 204));
        SettingPanel.setMaximumSize(new java.awt.Dimension(700, 620));
        SettingPanel.setPreferredSize(new java.awt.Dimension(700, 620));
        SettingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Com" }));
        SettingPanel.add(comList, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 435, 87, 22));

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });
        SettingPanel.add(connectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 476, 238, -1));

        SearchComButton.setText("Search Com");
        SearchComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchComButtonActionPerformed(evt);
            }
        });
        SettingPanel.add(SearchComButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 435, -1, -1));

        jLabel2.setText("Lenght of pallet + stele: ");
        SettingPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 156, -1, -1));

        jLabel3.setText("width of pallet: ");
        SettingPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 205, -1, -1));
        SettingPanel.add(LenghtPalletSteleInputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 150, 70, -1));

        LenghtSteleInputBox.setText(" ");
        SettingPanel.add(LenghtSteleInputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 176, 70, -1));

        jLabel4.setText("Lenght of stele: ");
        SettingPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 179, -1, -1));
        SettingPanel.add(WidthPalletInputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 202, 70, -1));

        jLabel5.setText("width of stele: ");
        SettingPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 231, -1, -1));
        SettingPanel.add(WidthSteleInputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 228, 70, -1));

        AwsomeTitel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AwsomeTitel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AwsomeTitel1.setText("Settings");
        AwsomeTitel1.setMaximumSize(new java.awt.Dimension(84, 14));
        AwsomeTitel1.setMinimumSize(new java.awt.Dimension(84, 14));
        SettingPanel.add(AwsomeTitel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 552, 51));

        connectionLabel.setText("There is no connected device");
        SettingPanel.add(connectionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 522, -1, -1));

        jLabel20.setText("Lenght between s1 - s2: ");
        SettingPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel21.setText("Lenght between s2 - s3: ");
        SettingPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel22.setText("Lenght between s3 - s1: ");
        SettingPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));
        SettingPanel.add(LenghtS1S2InputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, -1));
        SettingPanel.add(LenghtS2S3InputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 70, -1));
        SettingPanel.add(LenghtS3S1InputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, -1));

        CreateProfileButton.setText("Create new profile");
        CreateProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CreateProfileButtonMousePressed(evt);
            }
        });
        SettingPanel.add(CreateProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 277, -1, 31));

        OpenProfileButton.setText("Open profile");
        OpenProfileButton.setPreferredSize(new java.awt.Dimension(121, 23));
        SettingPanel.add(OpenProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 277, -1, 31));
        SettingPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 326, 530, 12));

        DynamicPanel.add(SettingPanel, "card3");

        AboutPanel.setBackground(new java.awt.Color(204, 204, 204));
        AboutPanel.setMaximumSize(new java.awt.Dimension(700, 620));

        AwsomeTitel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AwsomeTitel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AwsomeTitel2.setText("About");
        AwsomeTitel2.setMaximumSize(new java.awt.Dimension(84, 14));
        AwsomeTitel2.setMinimumSize(new java.awt.Dimension(84, 14));

        jLabel7.setText("Project: ");

        jLabel8.setText("Teams: ");

        jLabel9.setText("Software: ");

        jLabel10.setText("Hardware:");

        jLabel11.setText("Research: ");

        jLabel12.setText("Festjens Martijn");

        jLabel13.setText("Pelegrin Gilles");

        jLabel14.setText("Vangeneugden Thomas");

        jLabel15.setText("Thijs Erwin");

        jLabel16.setText("Ritzen Arnout");

        jLabel17.setText("Gybels Dylan");

        jLabel18.setText("Pieters Michiel");

        jLabel19.setText("Deferme Nico");

        javax.swing.GroupLayout AboutPanelLayout = new javax.swing.GroupLayout(AboutPanel);
        AboutPanel.setLayout(AboutPanelLayout);
        AboutPanelLayout.setHorizontalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutPanelLayout.createSequentialGroup()
                .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(AwsomeTitel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AboutPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel8)))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPanelLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(281, 281, 281))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPanelLayout.createSequentialGroup()
                            .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12))
                            .addGap(185, 185, 185)))
                    .addComponent(jLabel11)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(232, 232, 232))
        );
        AboutPanelLayout.setVerticalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(AwsomeTitel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        DynamicPanel.add(AboutPanel, "card4");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutButtonMousePressed
        makePalletVisual = false;
        
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
        
        
        DynamicPanel.add(AboutPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
        
    }//GEN-LAST:event_AboutButtonMousePressed

    private void SettingsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMousePressed
         makePalletVisual = false;
        
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
        
        
        DynamicPanel.add(SettingPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
        
       
    }//GEN-LAST:event_SettingsButtonMousePressed

    private void VisualButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualButtonMousePressed
        makePalletVisual = true;
        
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
              
        DynamicPanel.add(VisualPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
        
        ball.setVector(ApolloniusSolver.calculateRange(s1, s2, s3));
        for ( Visual visual : drawList){
            visual.paintComponent(PalletPanel.getGraphics());
        } 
    }//GEN-LAST:event_VisualButtonMousePressed

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

        serialCom.setComPoort(comList.getSelectedItem().toString());
        serialCom.init();
        if (serialCom.getConnection() == true){
            connectionLabel.setText("connected to Ping Pong hardware");
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void CreateProfileButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateProfileButtonMousePressed
        
        
        
        
        
    }//GEN-LAST:event_CreateProfileButtonMousePressed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JPanel AboutPanel;
    private javax.swing.JLabel AwsomeTitel;
    private javax.swing.JLabel AwsomeTitel1;
    private javax.swing.JLabel AwsomeTitel2;
    private javax.swing.JButton CreateProfileButton;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JTextField LenghtPalletSteleInputBox;
    private javax.swing.JTextField LenghtS1S2InputBox;
    private javax.swing.JTextField LenghtS2S3InputBox;
    private javax.swing.JTextField LenghtS3S1InputBox;
    private javax.swing.JTextField LenghtSteleInputBox;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton OpenProfileButton;
    private javax.swing.JPanel PalletPanel;
    private javax.swing.JButton SearchComButton;
    private javax.swing.JPanel SettingPanel;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton VisualButton;
    private javax.swing.JPanel VisualPanel;
    private javax.swing.JTextField WidthPalletInputBox;
    private javax.swing.JTextField WidthSteleInputBox;
    private javax.swing.JComboBox<String> comList;
    private javax.swing.JButton connectButton;
    private javax.swing.JLabel connectionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

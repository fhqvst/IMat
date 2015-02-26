/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author kakan
 */
public class ProfilePanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer ProfilePanel
     */
    public ProfilePanel() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileLeftPanel = new javax.swing.JPanel();
        storedPersonalInformationPanel = new javax.swing.JPanel();
        contactInformationLabel = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        reminderPanel = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jButton17 = new javax.swing.JButton();
        myPreviousShoppingPanel = new javax.swing.JPanel();
        myStoredListsScrollPane = new javax.swing.JScrollPane();
        myStoredListsPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        myPreviousBuysScrollPane = new javax.swing.JScrollPane();
        myPreviousBuysPanel = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        myPreferenses = new javax.swing.JPanel();
        myFavouritesScrollPane = new javax.swing.JScrollPane();
        myFavouritesPanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        myIgnoresScrollPane = new javax.swing.JScrollPane();
        myIgnoresPanel = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();

        setLayout(new java.awt.GridLayout(1, 3));

        profileLeftPanel.setLayout(new java.awt.BorderLayout());

        storedPersonalInformationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        contactInformationLabel.setText("Kontaktuppgifter");

        jLabel45.setText("Namn:");

        jLabel47.setText("Adress:");

        jTextField8.setText("Alexandra");

        jTextField9.setText("StreetIT 1337");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel46.setText("Postnummer:");

        jTextField10.setText("133 37");

        jLabel48.setText("Ort:");

        jTextField11.setText("Leet");

        jLabel49.setText("E-post:");

        jTextField12.setText("alexandra@grönIT.se");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel50.setText("Mobil:");

        jTextField13.setText("0703-12 13 17");

        jButton16.setText("Spara ändringar");

        javax.swing.GroupLayout storedPersonalInformationPanelLayout = new javax.swing.GroupLayout(storedPersonalInformationPanel);
        storedPersonalInformationPanel.setLayout(storedPersonalInformationPanelLayout);
        storedPersonalInformationPanelLayout.setHorizontalGroup(
            storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                        .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(contactInformationLabel))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        storedPersonalInformationPanelLayout.setVerticalGroup(
            storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storedPersonalInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storedPersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profileLeftPanel.add(storedPersonalInformationPanel, java.awt.BorderLayout.CENTER);

        reminderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reminderPanel.setPreferredSize(new java.awt.Dimension(301, 200));

        jLabel51.setText("Påminnelser");

        jLabel52.setText("Hur");

        jLabel53.setText("Frekvens");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton17.setText("Ny påminnelse");

        javax.swing.GroupLayout reminderPanelLayout = new javax.swing.GroupLayout(reminderPanel);
        reminderPanel.setLayout(reminderPanelLayout);
        reminderPanelLayout.setHorizontalGroup(
            reminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reminderPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel51)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(reminderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53))
            .addGroup(reminderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reminderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17))
        );
        reminderPanelLayout.setVerticalGroup(
            reminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reminderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(12, 12, 12)
                .addGroup(reminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        profileLeftPanel.add(reminderPanel, java.awt.BorderLayout.SOUTH);

        add(profileLeftPanel);

        myPreviousShoppingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myPreviousShoppingPanel.setLayout(new java.awt.GridLayout(2, 0));

        myStoredListsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel55.setText("Mina inköpslistor");

        jButton21.setText("+");

        jButton25.setText("Veckohandel");

        jButton26.setText("[shoppingCart]");
        jButton26.setToolTipText("Tryck för att lägga till i varukorgen");

        jButton27.setText("+");

        jButton28.setText("Middagsbjudning");

        jButton29.setText("[shoppingCart]");
        jButton29.setToolTipText("Tryck för att lägga till i varukorgen");

        jToggleButton4.setText("auto");
        jToggleButton4.setToolTipText("Lägg till som autoköp");

        jToggleButton5.setText("auto");
        jToggleButton5.setToolTipText("Lägg till som autoköp");

        jLabel54.setText("auto");

        jLabel56.setText("autoköp");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout myStoredListsPanelLayout = new javax.swing.GroupLayout(myStoredListsPanel);
        myStoredListsPanel.setLayout(myStoredListsPanelLayout);
        myStoredListsPanelLayout.setHorizontalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addComponent(jButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25))
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addComponent(jButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28)))
                        .addGap(56, 56, 56)
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton29)
                            .addComponent(jButton26))
                        .addGap(75, 75, 75)
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton5)
                            .addComponent(jToggleButton4)))
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel55))
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        myStoredListsPanelLayout.setVerticalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jToggleButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jButton29)
                    .addComponent(jToggleButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        myStoredListsScrollPane.setViewportView(myStoredListsPanel);

        myPreviousShoppingPanel.add(myStoredListsScrollPane);

        myPreviousBuysScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel57.setText("Mina senaste köp");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout myPreviousBuysPanelLayout = new javax.swing.GroupLayout(myPreviousBuysPanel);
        myPreviousBuysPanel.setLayout(myPreviousBuysPanelLayout);
        myPreviousBuysPanelLayout.setHorizontalGroup(
            myPreviousBuysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPreviousBuysPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(114, 114, 114))
            .addGroup(myPreviousBuysPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        myPreviousBuysPanelLayout.setVerticalGroup(
            myPreviousBuysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPreviousBuysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myPreviousBuysScrollPane.setViewportView(myPreviousBuysPanel);

        myPreviousShoppingPanel.add(myPreviousBuysScrollPane);

        add(myPreviousShoppingPanel);

        myPreferenses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myPreferenses.setLayout(new java.awt.GridLayout(2, 0));

        myFavouritesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel58.setText("Mina favoriter");

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout myFavouritesPanelLayout = new javax.swing.GroupLayout(myFavouritesPanel);
        myFavouritesPanel.setLayout(myFavouritesPanelLayout);
        myFavouritesPanelLayout.setHorizontalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addGroup(myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myFavouritesPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel58)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        myFavouritesPanelLayout.setVerticalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myFavouritesScrollPane.setViewportView(myFavouritesPanel);

        myPreferenses.add(myFavouritesScrollPane);

        myIgnoresScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel59.setText("Mina borttagna varor");

        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        javax.swing.GroupLayout myIgnoresPanelLayout = new javax.swing.GroupLayout(myIgnoresPanel);
        myIgnoresPanel.setLayout(myIgnoresPanelLayout);
        myIgnoresPanelLayout.setHorizontalGroup(
            myIgnoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myIgnoresPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(myIgnoresPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        myIgnoresPanelLayout.setVerticalGroup(
            myIgnoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myIgnoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myIgnoresScrollPane.setViewportView(myIgnoresPanel);

        myPreferenses.add(myIgnoresScrollPane);

        add(myPreferenses);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactInformationLabel;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JPanel myFavouritesPanel;
    private javax.swing.JScrollPane myFavouritesScrollPane;
    private javax.swing.JPanel myIgnoresPanel;
    private javax.swing.JScrollPane myIgnoresScrollPane;
    private javax.swing.JPanel myPreferenses;
    private javax.swing.JPanel myPreviousBuysPanel;
    private javax.swing.JScrollPane myPreviousBuysScrollPane;
    private javax.swing.JPanel myPreviousShoppingPanel;
    private javax.swing.JPanel myStoredListsPanel;
    private javax.swing.JScrollPane myStoredListsScrollPane;
    private javax.swing.JPanel profileLeftPanel;
    private javax.swing.JPanel reminderPanel;
    private javax.swing.JPanel storedPersonalInformationPanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class CheckoutPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private ProductListPanel plp = new ProductListPanel();
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();
    private List<JTextField> requiredTextFields;
    /**
     * Creates new customizer PageCard
     */
    public CheckoutPanel() {
        initComponents();
        page1Panel.add(plp, 0);
        showCard("page1");
        
        customerToTextFields();
        
        requiredTextFields = new ArrayList<JTextField>();
        requiredTextFields.add(firstNameTextField);
        requiredTextFields.add(lastNameTextField);
        requiredTextFields.add(addressTextField);
        requiredTextFields.add(postCodeTextField);
        requiredTextFields.add(postAddressTextField);
        requiredTextFields.add(mobileNumberTextField);
        requiredTextFields.add(cardNumberTextField);
        requiredTextFields.add(securityCodeTextField);
        requiredTextFields.add(holderNameTextField);
        
    }
    
    private void customerToTextFields(){
        firstNameTextField.setText(dataHandler.getCustomer().getFirstName());
        lastNameTextField.setText(dataHandler.getCustomer().getLastName());
        addressTextField.setText(dataHandler.getCustomer().getAddress());
        postCodeTextField.setText(dataHandler.getCustomer().getPostCode());
        postAddressTextField.setText(dataHandler.getCustomer().getPostAddress());
        phoneNumberTextField.setText(dataHandler.getCustomer().getPhoneNumber());
        mobileNumberTextField.setText(dataHandler.getCustomer().getMobilePhoneNumber());
        emailTextField.setText(dataHandler.getCustomer().getEmail());
        
        cardNumberTextField.setText(dataHandler.getCreditCard().getCardNumber());
        cardTypeComboBox.setSelectedItem(dataHandler.getCreditCard().getCardType());
        validMonthComboBox.setSelectedItem(dataHandler.getCreditCard().getValidMonth() + "");
        validYearComboBox.setSelectedItem(dataHandler.getCreditCard().getValidYear() + "");
        holderNameTextField.setText(dataHandler.getCreditCard().getHoldersName());
    }
    
    private void setConfirmText(){
        confirmTextArea.setText("Tack " + dataHandler.getCustomer().getFirstName() + " " + dataHandler.getCustomer().getLastName() + " för att du handlar dina produkter på iMat!\n\n"
                + "Dina varor kommer att levereras till " + dataHandler.getCustomer().getAddress() + ", " + dataHandler.getCustomer().getPostCode() + " " + dataHandler.getCustomer().getPostAddress() + ".\n"
                + "Leveransen kommer att anlända " + deliveryDateTextField.getText() + ", " + deliveryTimeComboBox.getSelectedItem().toString() + ".\n\n"
                + "Betalsätt:\n\n"
                + "Kortnummer: " + dataHandler.getCreditCard().getCardNumber() + "\n"
                + "Korttyp: " + dataHandler.getCreditCard().getCardType() + "\n"
                + "Giltigt t.o.m: " + dataHandler.getCreditCard().getValidMonth() + "/" + dataHandler.getCreditCard().getValidYear() + "\n"
                + "Kortinnehavarens namn: " + dataHandler.getCreditCard().getHoldersName() + "\n"
                + "CCV-kod: " + dataHandler.getCreditCard().getVerificationCode() + "\n\n"
                + "Antal varor: " + dataHandler.getShoppingCart().getItems().size() + ",  Totalkostnad: " + dataHandler.getShoppingCart().getTotal() + " kr.\n\n\n"
                + "Om problem uppstår kommer vi att kontakta dig via något av följande: \n\n"
                + "Mobilnummer: " + dataHandler.getCustomer().getMobilePhoneNumber() + "\n"
                + "Telefonnummer: " + dataHandler.getCustomer().getPhoneNumber() + "\n"
                + "Email: " + dataHandler.getCustomer().getEmail()
                
        );
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    public void showCard(String cardName) {
        CardLayout cards = (CardLayout) cardPanel.getLayout();
        cards.show(cardPanel, cardName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        wizardStep1ToggleButton = new javax.swing.JToggleButton();
        wizardStep2ToggleButton = new javax.swing.JToggleButton();
        wizardStep3ToggleButton = new javax.swing.JToggleButton();
        cardPanel = new javax.swing.JPanel();
        page1Panel = new javax.swing.JPanel();
        buttonPanel1 = new javax.swing.JPanel();
        page1NextButton = new javax.swing.JButton();
        listNameTextField = new javax.swing.JTextField();
        saveListCheckBox = new javax.swing.JCheckBox();
        page2Panel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        postCodeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        postAddressTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mobileNumberTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        saveCustomerCheckBox = new javax.swing.JCheckBox();
        middlePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cardTypeComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        validMonthComboBox = new javax.swing.JComboBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        validYearComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        securityCodeTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        holderNameTextField = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        saveCredentialsCheckBox = new javax.swing.JCheckBox();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jTextArea1 = new javax.swing.JTextArea();
        rightPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        deliveryDateTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        deliveryTimeComboBox = new javax.swing.JComboBox();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        errorLabel = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        page2NextButton = new javax.swing.JButton();
        page3Panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirmTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        completedLabel = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        page3BackButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        wizardStep1ToggleButton.setSelected(true);
        wizardStep1ToggleButton.setText("Varukorg");
        wizardStep1ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep1ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep1ToggleButton);

        wizardStep2ToggleButton.setText("Personuppgifter");
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep2ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep2ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep2ToggleButton);

        wizardStep3ToggleButton.setText("Bekräfta köp");
        wizardStep3ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep3ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep3ToggleButton);

        add(buttonPanel);

        cardPanel.setLayout(new java.awt.CardLayout());

        page1Panel.setLayout(new javax.swing.BoxLayout(page1Panel, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        page1NextButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        page1NextButton.setText("Nästa");
        page1NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page1NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1NextButtonActionPerformed(evt);
            }
        });

        listNameTextField.setText("Min inköpslista");

        saveListCheckBox.setText("Spara inköpslista");

        javax.swing.GroupLayout buttonPanel1Layout = new javax.swing.GroupLayout(buttonPanel1);
        buttonPanel1.setLayout(buttonPanel1Layout);
        buttonPanel1Layout.setHorizontalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel1Layout.createSequentialGroup()
                .addComponent(listNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveListCheckBox)
                .addGap(183, 183, 183)
                .addComponent(page1NextButton))
        );
        buttonPanel1Layout.setVerticalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page1NextButton)
                    .addComponent(listNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveListCheckBox)))
        );

        page1Panel.add(buttonPanel1);

        cardPanel.add(page1Panel, "page1");

        page2Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        page2Panel.setLayout(new javax.swing.BoxLayout(page2Panel, javax.swing.BoxLayout.LINE_AXIS));

        leftPanel.setLayout(new java.awt.GridLayout(9, 2, 10, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Förnamn:*");
        leftPanel.add(jLabel1);
        leftPanel.add(firstNameTextField);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Efternamn:*");
        leftPanel.add(jLabel2);
        leftPanel.add(lastNameTextField);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Gatuadress:*");
        leftPanel.add(jLabel3);
        leftPanel.add(addressTextField);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Postkod:*");
        leftPanel.add(jLabel4);
        leftPanel.add(postCodeTextField);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ort:*");
        leftPanel.add(jLabel5);
        leftPanel.add(postAddressTextField);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Mobilnummer:*");
        leftPanel.add(jLabel13);
        leftPanel.add(mobileNumberTextField);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Telefonnummer:");
        leftPanel.add(jLabel10);
        leftPanel.add(phoneNumberTextField);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("E-mail:");
        leftPanel.add(jLabel14);
        leftPanel.add(emailTextField);
        leftPanel.add(filler3);

        saveCustomerCheckBox.setText("Spara personuppgifter");
        leftPanel.add(saveCustomerCheckBox);

        page2Panel.add(leftPanel);

        middlePanel.setLayout(new java.awt.GridLayout(7, 2, 10, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Kortnummer:*");
        middlePanel.add(jLabel6);
        middlePanel.add(cardNumberTextField);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Korttyp:*");
        middlePanel.add(jLabel7);

        cardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "MasterCard", "American Express", "Visa Electron" }));
        middlePanel.add(cardTypeComboBox);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Giltigt t.o.m:*");
        middlePanel.add(jLabel8);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        validMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mån", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(validMonthComboBox);
        jPanel1.add(filler1);

        validYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "År", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jPanel1.add(validYearComboBox);

        middlePanel.add(jPanel1);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("CCV-kod**:");
        middlePanel.add(jLabel9);
        middlePanel.add(securityCodeTextField);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Kortinnehavarens namn:*");
        middlePanel.add(jLabel15);
        middlePanel.add(holderNameTextField);
        middlePanel.add(filler2);

        saveCredentialsCheckBox.setText("Spara betaluppgifter");
        middlePanel.add(saveCredentialsCheckBox);
        middlePanel.add(filler13);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("*Måste fyllas i\n**Sparas Ej");
        middlePanel.add(jTextArea1);

        page2Panel.add(middlePanel);

        rightPanel.setLayout(new java.awt.GridLayout(7, 2, 10, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Leveransdatum:*");
        rightPanel.add(jLabel11);

        deliveryDateTextField.setText("04-03-2015");
        rightPanel.add(deliveryDateTextField);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Leveranstid:*");
        rightPanel.add(jLabel12);

        deliveryTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hela dagen (8:00-16:00)", "Förmiddag (8:00-12:00)", "Eftermiddag (12:00-16:00)" }));
        rightPanel.add(deliveryTimeComboBox);
        rightPanel.add(filler4);
        rightPanel.add(filler5);
        rightPanel.add(filler6);
        rightPanel.add(filler7);
        rightPanel.add(filler8);
        rightPanel.add(filler9);
        rightPanel.add(filler10);

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        rightPanel.add(errorLabel);
        rightPanel.add(filler12);

        page2NextButton.setText("Nästa");
        page2NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2NextButtonActionPerformed(evt);
            }
        });
        rightPanel.add(page2NextButton);

        page2Panel.add(rightPanel);

        cardPanel.add(page2Panel, "page2");

        page3Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        page3Panel.setLayout(new javax.swing.BoxLayout(page3Panel, javax.swing.BoxLayout.Y_AXIS));

        confirmTextArea.setEditable(false);
        confirmTextArea.setColumns(20);
        confirmTextArea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        confirmTextArea.setRows(5);
        jScrollPane1.setViewportView(confirmTextArea);

        jPanel2.setLayout(new java.awt.BorderLayout());

        completedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        completedLabel.setForeground(new java.awt.Color(0, 204, 0));
        completedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedLabel.setText("Köp slutfört!");
        jPanel2.add(completedLabel, java.awt.BorderLayout.CENTER);

        buyButton.setText("Betala");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(buyButton, java.awt.BorderLayout.EAST);

        page3BackButton.setText("Tillbaka");
        page3BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3BackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(page3BackButton, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        page3Panel.add(jPanel4);

        cardPanel.add(page3Panel, "page3");

        add(cardPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void page1NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1NextButtonActionPerformed
        
        if(dataHandler.getShoppingCart().getItems().size() > 0){
            showCard("page2");
            wizardStep2ToggleButton.setEnabled(true);
            wizardStep2ToggleButton.setSelected(true);
            wizardStep1ToggleButton.setSelected(false);
            
        }
    }//GEN-LAST:event_page1NextButtonActionPerformed

    private void wizardStep1ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep1ToggleButtonActionPerformed
        showCard("page1");
        wizardStep2ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setSelected(false); 
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.setEnabled(false);
    }//GEN-LAST:event_wizardStep1ToggleButtonActionPerformed

    private void wizardStep2ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep2ToggleButtonActionPerformed
        showCard("page2");
        wizardStep1ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setEnabled(false);
    }//GEN-LAST:event_wizardStep2ToggleButtonActionPerformed

    private void page2NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2NextButtonActionPerformed
        int error = 0;
        
        for(int i = 0; i < requiredTextFields.size(); i++){
            if(requiredTextFields.get(i).getText().equals("")){
                errorLabel.setText("Var vänlig fyll i alla fält först.");
                error = 1;
            }
        }
        
        if(error == 0){
            
            errorLabel.setText("");
            
            dataHandler.getCustomer().setFirstName(firstNameTextField.getText());
            dataHandler.getCustomer().setLastName(lastNameTextField.getText());
            dataHandler.getCustomer().setAddress(addressTextField.getText());
            dataHandler.getCustomer().setPostCode(postCodeTextField.getText());
            dataHandler.getCustomer().setPostAddress(postAddressTextField.getText());
            dataHandler.getCustomer().setPhoneNumber(phoneNumberTextField.getText());
            dataHandler.getCustomer().setMobilePhoneNumber(mobileNumberTextField.getText());
            dataHandler.getCustomer().setEmail(emailTextField.getText());

            dataHandler.getCreditCard().setCardNumber(cardNumberTextField.getText());
            dataHandler.getCreditCard().setCardType(cardTypeComboBox.getSelectedItem().toString());
            dataHandler.getCreditCard().setHoldersName(holderNameTextField.getText());
            
            try{
                dataHandler.getCreditCard().setValidMonth(Integer.parseInt(validMonthComboBox.getSelectedItem().toString()));
                dataHandler.getCreditCard().setValidYear(Integer.parseInt(validYearComboBox.getSelectedItem().toString()));
                dataHandler.getCreditCard().setVerificationCode(Integer.valueOf(securityCodeTextField.getText()));
            }catch(NumberFormatException e){
                errorLabel.setText("Fel format angivet.");
                error = 2;
            }
        
            buyButton.setEnabled(true);
            page3BackButton.setEnabled(true);
            completedLabel.setVisible(false);
        }
        
        if(error == 0){
            showCard("page3");
            wizardStep3ToggleButton.setEnabled(true);
            wizardStep3ToggleButton.setSelected(true);
            wizardStep2ToggleButton.setSelected(false);
            setConfirmText();
        }
       
    }//GEN-LAST:event_page2NextButtonActionPerformed

    private void wizardStep3ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep3ToggleButtonActionPerformed
        
        showCard("page3");
        wizardStep1ToggleButton.setSelected(false);
        wizardStep2ToggleButton.setSelected(false);

    }//GEN-LAST:event_wizardStep3ToggleButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        dataHandler.placeOrder(true);
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.setEnabled(false);
        buyButton.setEnabled(false);
        page3BackButton.setEnabled(false);
        completedLabel.setVisible(true);
        
    }//GEN-LAST:event_buyButtonActionPerformed

    private void page3BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page3BackButtonActionPerformed
        showCard("page2");
        wizardStep1ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setEnabled(false);
    }//GEN-LAST:event_page3BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel buttonPanel1;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JComboBox cardTypeComboBox;
    private javax.swing.JLabel completedLabel;
    private javax.swing.JTextArea confirmTextArea;
    private javax.swing.JTextField deliveryDateTextField;
    private javax.swing.JComboBox deliveryTimeComboBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField holderNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField listNameTextField;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JButton page1NextButton;
    private javax.swing.JPanel page1Panel;
    private javax.swing.JButton page2NextButton;
    private javax.swing.JPanel page2Panel;
    private javax.swing.JButton page3BackButton;
    private javax.swing.JPanel page3Panel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField postAddressTextField;
    private javax.swing.JTextField postCodeTextField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JCheckBox saveCredentialsCheckBox;
    private javax.swing.JCheckBox saveCustomerCheckBox;
    private javax.swing.JCheckBox saveListCheckBox;
    private javax.swing.JTextField securityCodeTextField;
    private javax.swing.JComboBox validMonthComboBox;
    private javax.swing.JComboBox validYearComboBox;
    private javax.swing.JToggleButton wizardStep1ToggleButton;
    private javax.swing.JToggleButton wizardStep2ToggleButton;
    private javax.swing.JToggleButton wizardStep3ToggleButton;
    // End of variables declaration//GEN-END:variables
}

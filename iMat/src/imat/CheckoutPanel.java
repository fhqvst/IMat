/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class CheckoutPanel extends javax.swing.JPanel implements java.beans.Customizer, ShoppingCartListener {
    
    private Object bean;
    private ProductListPanel plp = new ProductListPanel();
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();
    private List<JTextField> page1RequiredTextFields;
    private List<JTextField> page2RequiredTextFields;
    private List<JLabel> page1RequiredLabels;
    private List<JLabel> page2RequiredLabels;
    /**
     * Creates new customizer PageCard
     */
    public CheckoutPanel() {
        initComponents();
        dataHandler.getShoppingCart().addShoppingCartListener(this);
        jPanel1.add(plp, 0);
        showCard("page1");
        errorLabel1.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel1.setForeground(Color.red);
        totalLabel1.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
        totalLabel2.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
        
        customerToTextFields();
        
        page1RequiredTextFields = new ArrayList<JTextField>();
        page1RequiredTextFields.add(firstNameTextField);
        page1RequiredTextFields.add(lastNameTextField);
        page1RequiredTextFields.add(addressTextField);
        page1RequiredTextFields.add(postCodeTextField);
        page1RequiredTextFields.add(postAddressTextField);
        page1RequiredTextFields.add(mobileNumberTextField);
        
        page1RequiredLabels = new ArrayList<JLabel>();
        page1RequiredLabels.add(firstNameLabel);
        page1RequiredLabels.add(lastNameLabel);
        page1RequiredLabels.add(addressLabel);
        page1RequiredLabels.add(postCodeLabel);
        page1RequiredLabels.add(postAddressLabel);
        page1RequiredLabels.add(mobileNumberLabel);
        
        page2RequiredTextFields = new ArrayList<JTextField>();
        page2RequiredTextFields.add(cardNumberTextField);
        page2RequiredTextFields.add(securityCodeTextField);
        page2RequiredTextFields.add(holderNameTextField);
        page2RequiredTextFields.add(deliveryDateTextField);
        
        page2RequiredLabels = new ArrayList<JLabel>();
        page2RequiredLabels.add(cardNumberLabel);
        page2RequiredLabels.add(securityCodeLabel);
        page2RequiredLabels.add(holderNameLabel);
        page2RequiredLabels.add(deliveryDateLabel);
        
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
        confirmTextArea.setText(dataHandler.getCustomer().getFirstName() + " " + dataHandler.getCustomer().getLastName() + ", var vänlig se över så att nedanstående uppgifter stämmer innan du betalar.\n\n"
                + "Dina varor kommer att levereras till " + dataHandler.getCustomer().getAddress() + ", " + dataHandler.getCustomer().getPostCode() + " " + dataHandler.getCustomer().getPostAddress() + ".\n"
                + "Leveransen kommer att anlända " + deliveryDateTextField.getText() + ", " + deliveryTimeComboBox.getSelectedItem().toString() + ".\n\n"
                + "Betalsätt:\n\n"
                + "Kortnummer: " + dataHandler.getCreditCard().getCardNumber() + "\n"
                + "Korttyp: " + dataHandler.getCreditCard().getCardType() + "\n"
                + "Giltigt t.o.m: " + dataHandler.getCreditCard().getValidMonth() + "/" + dataHandler.getCreditCard().getValidYear() + "\n"
                + "Kortinnehavarens namn: " + dataHandler.getCreditCard().getHoldersName() + "\n"
                + "CCV-kod: " + dataHandler.getCreditCard().getVerificationCode() + "\n\n\n"
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

        wizardButtonGroup = new javax.swing.ButtonGroup();
        buttonPanel = new javax.swing.JPanel();
        wizardStep1ToggleButton = new javax.swing.JToggleButton();
        wizardStep2ToggleButton = new javax.swing.JToggleButton();
        wizardStep3ToggleButton = new javax.swing.JToggleButton();
        cardPanel = new javax.swing.JPanel();
        page1Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        page1FormPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        postCodeLabel = new javax.swing.JLabel();
        postCodeTextField = new javax.swing.JTextField();
        postAddressLabel = new javax.swing.JLabel();
        postAddressTextField = new javax.swing.JTextField();
        mobileNumberLabel = new javax.swing.JLabel();
        mobileNumberTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        errorLabel1 = new javax.swing.JLabel();
        buttonPanel2 = new javax.swing.JPanel();
        page1NextButton = new javax.swing.JButton();
        saveCustomerCheckBox = new javax.swing.JCheckBox();
        totalLabel1 = new javax.swing.JLabel();
        page2Panel = new javax.swing.JPanel();
        page2FormsPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        middlePanel1 = new javax.swing.JPanel();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeComboBox = new javax.swing.JComboBox();
        validDateLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        validMonthComboBox = new javax.swing.JComboBox();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        validYearComboBox = new javax.swing.JComboBox();
        holderNameLabel = new javax.swing.JLabel();
        holderNameTextField = new javax.swing.JTextField();
        securityCodeLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        securityCodeTextField = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        rightPanel1 = new javax.swing.JPanel();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        deliveryDateLabel = new javax.swing.JLabel();
        deliveryDateTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        deliveryTimeComboBox = new javax.swing.JComboBox();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        errorLabel2 = new javax.swing.JLabel();
        buttonPanel3 = new javax.swing.JPanel();
        page2NextButton = new javax.swing.JButton();
        saveCredentialsCheckBox = new javax.swing.JCheckBox();
        jTextArea2 = new javax.swing.JTextArea();
        page2BackButton = new javax.swing.JButton();
        page3Panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirmTextArea = new javax.swing.JTextArea();
        buttonPanel4 = new javax.swing.JPanel();
        buyButton = new javax.swing.JButton();
        page3BackButton = new javax.swing.JButton();
        totalLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        wizardButtonGroup.add(wizardStep1ToggleButton);
        wizardStep1ToggleButton.setSelected(true);
        wizardStep1ToggleButton.setText("Personuppgifter");
        wizardStep1ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wizardStep1ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep1ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep1ToggleButton);

        wizardButtonGroup.add(wizardStep2ToggleButton);
        wizardStep2ToggleButton.setText("Betaluppifter");
        wizardStep2ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep2ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep2ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep2ToggleButton);

        wizardButtonGroup.add(wizardStep3ToggleButton);
        wizardStep3ToggleButton.setText("Bekräfta köp");
        wizardStep3ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wizardStep3ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep3ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep3ToggleButton);

        add(buttonPanel);

        cardPanel.setLayout(new java.awt.CardLayout());

        page1Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        page1Panel.setLayout(new javax.swing.BoxLayout(page1Panel, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        page1FormPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 100));
        page1FormPanel.setLayout(new java.awt.GridLayout(9, 2, 10, 20));

        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstNameLabel.setText("Förnamn:*");
        page1FormPanel.add(firstNameLabel);
        page1FormPanel.add(firstNameTextField);

        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastNameLabel.setText("Efternamn:*");
        page1FormPanel.add(lastNameLabel);
        page1FormPanel.add(lastNameTextField);

        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLabel.setText("Gatuadress:*");
        page1FormPanel.add(addressLabel);
        page1FormPanel.add(addressTextField);

        postCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        postCodeLabel.setText("Postkod:*");
        page1FormPanel.add(postCodeLabel);
        page1FormPanel.add(postCodeTextField);

        postAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        postAddressLabel.setText("Ort:*");
        page1FormPanel.add(postAddressLabel);
        page1FormPanel.add(postAddressTextField);

        mobileNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobileNumberLabel.setText("Mobilnummer:*");
        page1FormPanel.add(mobileNumberLabel);
        page1FormPanel.add(mobileNumberTextField);

        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumberLabel.setText("Telefonnummer:");
        page1FormPanel.add(phoneNumberLabel);
        page1FormPanel.add(phoneNumberTextField);

        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("E-mail:");
        page1FormPanel.add(emailLabel);
        page1FormPanel.add(emailTextField);
        page1FormPanel.add(filler3);

        errorLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        errorLabel1.setText("jLabel6");
        page1FormPanel.add(errorLabel1);

        jPanel1.add(page1FormPanel);

        page1Panel.add(jPanel1);

        buttonPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        page1NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        page1NextButton.setText("Nästa");
        page1NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page1NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1NextButtonActionPerformed(evt);
            }
        });

        saveCustomerCheckBox.setSelected(true);
        saveCustomerCheckBox.setText("Spara personuppgifter");

        totalLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel1.setText("Antal varor: 99 st   Totalkostnad: 9999 kr");

        javax.swing.GroupLayout buttonPanel2Layout = new javax.swing.GroupLayout(buttonPanel2);
        buttonPanel2.setLayout(buttonPanel2Layout);
        buttonPanel2Layout.setHorizontalGroup(
            buttonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(saveCustomerCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page1NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanel2Layout.setVerticalGroup(
            buttonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page1NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveCustomerCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel1))
                .addContainerGap())
        );

        page1Panel.add(buttonPanel2);

        cardPanel.add(page1Panel, "page1");

        page2Panel.setLayout(new javax.swing.BoxLayout(page2Panel, javax.swing.BoxLayout.Y_AXIS));

        page2FormsPanel.setLayout(new java.awt.GridLayout(1, 4));
        page2FormsPanel.add(filler2);

        middlePanel1.setLayout(new java.awt.GridLayout(8, 2, 10, 30));
        middlePanel1.add(filler25);
        middlePanel1.add(filler24);

        cardNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardNumberLabel.setText("Kortnummer:*");
        middlePanel1.add(cardNumberLabel);
        middlePanel1.add(cardNumberTextField);

        cardTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cardTypeLabel.setText("Korttyp:*");
        middlePanel1.add(cardTypeLabel);

        cardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "MasterCard", "American Express", "Visa Electron" }));
        middlePanel1.add(cardTypeComboBox);

        validDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        validDateLabel.setText("Giltigt t.o.m:*");
        middlePanel1.add(validDateLabel);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        validMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mån", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(validMonthComboBox);
        jPanel3.add(filler11);

        validYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "År", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jPanel3.add(validYearComboBox);

        middlePanel1.add(jPanel3);

        holderNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        holderNameLabel.setText("Kortinnehavarens namn:*");
        middlePanel1.add(holderNameLabel);
        middlePanel1.add(holderNameTextField);

        securityCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        securityCodeLabel.setText("CCV-kod**:");
        middlePanel1.add(securityCodeLabel);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));
        jPanel5.add(securityCodeTextField);
        jPanel5.add(filler4);

        middlePanel1.add(jPanel5);

        page2FormsPanel.add(middlePanel1);

        rightPanel1.setLayout(new java.awt.GridLayout(7, 2, 10, 30));
        rightPanel1.add(filler30);
        rightPanel1.add(filler23);

        deliveryDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        deliveryDateLabel.setText("Leveransdatum:*");
        rightPanel1.add(deliveryDateLabel);

        deliveryDateTextField.setText("04-03-2015");
        rightPanel1.add(deliveryDateTextField);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Leveranstid:*");
        rightPanel1.add(jLabel22);

        deliveryTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hela dagen (8:00-16:00)", "Förmiddag (8:00-12:00)", "Eftermiddag (12:00-16:00)" }));
        rightPanel1.add(deliveryTimeComboBox);
        rightPanel1.add(filler22);
        rightPanel1.add(filler28);
        rightPanel1.add(filler29);
        rightPanel1.add(filler31);
        rightPanel1.add(filler32);

        page2FormsPanel.add(rightPanel1);
        page2FormsPanel.add(filler1);

        page2Panel.add(page2FormsPanel);

        errorLabel2.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel2.setText("errorLabel");
        page2Panel.add(errorLabel2);

        buttonPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        page2NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        page2NextButton.setText("Nästa");
        page2NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page2NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2NextButtonActionPerformed(evt);
            }
        });

        saveCredentialsCheckBox.setText("Spara betaluppgifter");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("*Måste fyllas i\n**Sparas Ej");

        page2BackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        page2BackButton.setText("Tillbaka");
        page2BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page2BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanel3Layout = new javax.swing.GroupLayout(buttonPanel3);
        buttonPanel3.setLayout(buttonPanel3Layout);
        buttonPanel3Layout.setHorizontalGroup(
            buttonPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel3Layout.createSequentialGroup()
                .addComponent(page2BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveCredentialsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page2NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanel3Layout.setVerticalGroup(
            buttonPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(buttonPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buttonPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(page2NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveCredentialsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(page2BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        page2Panel.add(buttonPanel3);

        cardPanel.add(page2Panel, "page2");

        page3Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        page3Panel.setLayout(new javax.swing.BoxLayout(page3Panel, javax.swing.BoxLayout.Y_AXIS));

        confirmTextArea.setEditable(false);
        confirmTextArea.setBackground(new java.awt.Color(240, 240, 240));
        confirmTextArea.setColumns(20);
        confirmTextArea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        confirmTextArea.setRows(5);
        jScrollPane1.setViewportView(confirmTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        page3Panel.add(jPanel4);

        buttonPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buyButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buyButton.setText("Betala");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        page3BackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        page3BackButton.setText("Tillbaka");
        page3BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        page3BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3BackButtonActionPerformed(evt);
            }
        });

        totalLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel2.setText("Antal varor: 99 st   Totalkostnad: 9999 kr");

        javax.swing.GroupLayout buttonPanel4Layout = new javax.swing.GroupLayout(buttonPanel4);
        buttonPanel4.setLayout(buttonPanel4Layout);
        buttonPanel4Layout.setHorizontalGroup(
            buttonPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel4Layout.createSequentialGroup()
                .addComponent(page3BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonPanel4Layout.setVerticalGroup(
            buttonPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(buttonPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page3BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel2)))
        );

        page3Panel.add(buttonPanel4);

        cardPanel.add(page3Panel, "page3");

        add(cardPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void wizardStep1ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep1ToggleButtonActionPerformed
        showCard("page1");
    }//GEN-LAST:event_wizardStep1ToggleButtonActionPerformed

    private void wizardStep3ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep3ToggleButtonActionPerformed
        showCard("page3");
    }//GEN-LAST:event_wizardStep3ToggleButtonActionPerformed

    private void wizardStep2ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardStep2ToggleButtonActionPerformed
        showCard("page2");
    }//GEN-LAST:event_wizardStep2ToggleButtonActionPerformed

    private void page1NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1NextButtonActionPerformed
        boolean error = false;
        if(dataHandler.getShoppingCart().getItems().size() > 0){
            
            for(int i = 0; i < page1RequiredTextFields.size(); i++){
                if(page1RequiredTextFields.get(i).getText().equals("")){
                    page1RequiredLabels.get(i).setForeground(Color.red);
                    
                    error = true;
                    errorLabel1.setText("Var vänlig fyll i alla fält markerade med *");
                    errorLabel1.setVisible(true);
                }else{
                    page1RequiredLabels.get(i).setForeground(Color.black);
                }
            }
            
        }else{
            error = true;
            errorLabel1.setText("Välj först några varor att köpa.");
            errorLabel1.setVisible(true);
        }
        
        if(!error){
            showCard("page2");
            wizardStep2ToggleButton.setEnabled(true); 
            wizardStep2ToggleButton.setSelected(true); 
            errorLabel1.setVisible(false);
            
            if(saveCustomerCheckBox.isSelected()){
                dataHandler.getCustomer().setFirstName(firstNameTextField.getText());
                dataHandler.getCustomer().setLastName(lastNameTextField.getText());
                dataHandler.getCustomer().setAddress(addressTextField.getText());
                dataHandler.getCustomer().setPostCode(postCodeTextField.getText());
                dataHandler.getCustomer().setPostAddress(postAddressTextField.getText());
                dataHandler.getCustomer().setMobilePhoneNumber(mobileNumberTextField.getText());
                dataHandler.getCustomer().setPhoneNumber(phoneNumberTextField.getText());
                dataHandler.getCustomer().setEmail(emailTextField.getText());
            }
        }
    }//GEN-LAST:event_page1NextButtonActionPerformed

    private void page2NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2NextButtonActionPerformed
        boolean error = false;
        securityCodeLabel.setForeground(Color.black);
        validDateLabel.setForeground(Color.black);
        deliveryDateLabel.setForeground(Color.black);
        
        for(int i = 0; i < page2RequiredTextFields.size(); i++){
            if(page2RequiredTextFields.get(i).getText().equals("")){
                page2RequiredLabels.get(i).setForeground(Color.red);

                error = true;
                errorLabel2.setText("Var vänlig fyll i alla fält markerade med *");
                errorLabel2.setVisible(true);
            }else{
                page2RequiredLabels.get(i).setForeground(Color.black);
            }
        }
        
        if(!error){
            try{
                int formatTest = Integer.valueOf(securityCodeTextField.getText());

            }catch(NumberFormatException e){
                error = true;
                errorLabel2.setText("Fel format angivet");
                errorLabel2.setVisible(true);
                securityCodeLabel.setForeground(Color.red);
            }

            try{
                int formatTest = Integer.valueOf(validMonthComboBox.getSelectedItem().toString());
                formatTest = Integer.valueOf(validYearComboBox.getSelectedItem().toString());

            }catch(NumberFormatException e){
                error = true;
                errorLabel2.setText("Fel format angivet");
                errorLabel2.setVisible(true);
                validDateLabel.setForeground(Color.red);
            }
            
            
            if(deliveryDateTextField.getText().length() != 10){
                error = true;
                errorLabel2.setText("Fel format angivet");
                errorLabel2.setVisible(true);
                deliveryDateLabel.setForeground(Color.red);
            }
        }
        
        
        
        if(!error){
            showCard("page3");
            wizardStep3ToggleButton.setEnabled(true); 
            wizardStep3ToggleButton.setSelected(true); 
            errorLabel2.setVisible(false);
            setConfirmText();
            
            if(saveCredentialsCheckBox.isSelected()){
                dataHandler.getCreditCard().setCardNumber(cardNumberTextField.getText());
                dataHandler.getCreditCard().setCardType(cardTypeComboBox.getSelectedItem().toString());
                dataHandler.getCreditCard().setHoldersName(holderNameTextField.getText());
                dataHandler.getCreditCard().setVerificationCode(Integer.valueOf(securityCodeTextField.getText()));
                dataHandler.getCreditCard().setValidMonth(Integer.valueOf(validMonthComboBox.getSelectedItem().toString()));
                dataHandler.getCreditCard().setValidYear(Integer.valueOf(validYearComboBox.getSelectedItem().toString()));

            }
        }
    }//GEN-LAST:event_page2NextButtonActionPerformed

    private void page2BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2BackButtonActionPerformed
        showCard("page1");
        wizardStep1ToggleButton.setSelected(true);
    }//GEN-LAST:event_page2BackButtonActionPerformed

    private void page3BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page3BackButtonActionPerformed
        showCard("page2");
        wizardStep1ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setSelected(false);
        wizardStep3ToggleButton.setEnabled(false);
    }//GEN-LAST:event_page3BackButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        dataHandler.placeOrder(true);
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.setEnabled(false);
        wizardStep1ToggleButton.setSelected(true);
        ((IMat)this.getTopLevelAncestor()).switchCard("welcomePanel", null);
    }//GEN-LAST:event_buyButtonActionPerformed

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        totalLabel1.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
        totalLabel2.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel buttonPanel2;
    private javax.swing.JPanel buttonPanel3;
    private javax.swing.JPanel buttonPanel4;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JComboBox cardTypeComboBox;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JTextArea confirmTextArea;
    private javax.swing.JLabel deliveryDateLabel;
    private javax.swing.JTextField deliveryDateTextField;
    private javax.swing.JComboBox deliveryTimeComboBox;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorLabel1;
    private javax.swing.JLabel errorLabel2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel holderNameLabel;
    private javax.swing.JTextField holderNameTextField;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel middlePanel1;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JPanel page1FormPanel;
    private javax.swing.JButton page1NextButton;
    private javax.swing.JPanel page1Panel;
    private javax.swing.JButton page2BackButton;
    private javax.swing.JPanel page2FormsPanel;
    private javax.swing.JButton page2NextButton;
    private javax.swing.JPanel page2Panel;
    private javax.swing.JButton page3BackButton;
    private javax.swing.JPanel page3Panel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel postAddressLabel;
    private javax.swing.JTextField postAddressTextField;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JTextField postCodeTextField;
    private javax.swing.JPanel rightPanel1;
    private javax.swing.JCheckBox saveCredentialsCheckBox;
    private javax.swing.JCheckBox saveCustomerCheckBox;
    private javax.swing.JLabel securityCodeLabel;
    private javax.swing.JTextField securityCodeTextField;
    private javax.swing.JLabel totalLabel1;
    private javax.swing.JLabel totalLabel2;
    private javax.swing.JLabel validDateLabel;
    private javax.swing.JComboBox validMonthComboBox;
    private javax.swing.JComboBox validYearComboBox;
    private javax.swing.ButtonGroup wizardButtonGroup;
    private javax.swing.JToggleButton wizardStep1ToggleButton;
    private javax.swing.JToggleButton wizardStep2ToggleButton;
    private javax.swing.JToggleButton wizardStep3ToggleButton;
    // End of variables declaration//GEN-END:variables

}

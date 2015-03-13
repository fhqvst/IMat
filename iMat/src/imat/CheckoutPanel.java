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
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class CheckoutPanel extends javax.swing.JPanel implements java.beans.Customizer, ShoppingCartListener {
    
    private Object bean;
    private ProductListPanel plp1 = new ProductListPanel(true);
    private ProductListPanel plp2 = new ProductListPanel(true);
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
        jPanel1.add(plp1, 0);
        page2FormsPanel.add(plp2, 0);
        showCard("page1");
        errorLabel1.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel1.setForeground(Color.red);
        totalLabel1.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
        totalLabel2.setText("Antal varor: " + dataHandler.getShoppingCart().getItems().size() + " st   Totalkostnad: " + Math.round(dataHandler.getShoppingCart().getTotal()*100)/100 + " kr");
        
        this.plp1.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(200,200,200)));
        this.plp2.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(200,200,200)));
        
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
    
    public void customerToTextFields(){
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
        firstRow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        secondRow = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        thirdRow = new javax.swing.JPanel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        fourthRow = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        postCodeLabel = new javax.swing.JLabel();
        fifthRow = new javax.swing.JPanel();
        addressTextField = new javax.swing.JTextField();
        postCodeTextField = new javax.swing.JTextField();
        sixthRow = new javax.swing.JPanel();
        postAddressLabel = new javax.swing.JLabel();
        mobileNumberLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        postAddressTextField = new javax.swing.JTextField();
        mobileNumberTextField = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        phoneNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        errorLabel1 = new javax.swing.JLabel();
        buttonPanel2 = new javax.swing.JPanel();
        totalLabel1 = new javax.swing.JLabel();
        saveCustomerCheckBox = new javax.swing.JCheckBox();
        page1NextButton = new javax.swing.JButton();
        page2Panel = new javax.swing.JPanel();
        page2FormsPanel = new javax.swing.JPanel();
        middlePanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeComboBox = new javax.swing.JComboBox();
        validDateLabel = new javax.swing.JLabel();
        validDatePanel = new javax.swing.JPanel();
        validMonthComboBox = new javax.swing.JComboBox();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        validYearComboBox = new javax.swing.JComboBox();
        holderNameLabel = new javax.swing.JLabel();
        holderNameTextField = new javax.swing.JTextField();
        securityCodeLabel = new javax.swing.JLabel();
        securityCodeTextField = new javax.swing.JTextField();
        deliveryDateLabel = new javax.swing.JLabel();
        deliveryDateTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        deliveryTimeComboBox = new javax.swing.JComboBox();
        errorLabel2 = new javax.swing.JLabel();
        buttonPanel3 = new javax.swing.JPanel();
        page2BackButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jTextArea2 = new javax.swing.JTextArea();
        saveCredentialsCheckBox = new javax.swing.JCheckBox();
        page2NextButton = new javax.swing.JButton();
        page3Panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confirmTextArea = new javax.swing.JTextArea();
        buttonPanel4 = new javax.swing.JPanel();
        page3BackButton = new javax.swing.JButton();
        totalLabel2 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(200, 200, 200)));
        buttonPanel.setLayout(new java.awt.GridLayout(1, 3));

        wizardButtonGroup.add(wizardStep1ToggleButton);
        wizardStep1ToggleButton.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        wizardStep1ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        wizardStep1ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        wizardStep1ToggleButton.setSelected(true);
        wizardStep1ToggleButton.setText("1. PERSONUPPGIFTER");
        wizardStep1ToggleButton.setAlignmentX(0.5F);
        wizardStep1ToggleButton.setBorder(null);
        wizardStep1ToggleButton.setBorderPainted(false);
        wizardStep1ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wizardStep1ToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wizardStep1ToggleButton.setIconTextGap(0);
        wizardStep1ToggleButton.setMaximumSize(new java.awt.Dimension(170, 40));
        wizardStep1ToggleButton.setMinimumSize(new java.awt.Dimension(170, 40));
        wizardStep1ToggleButton.setPreferredSize(new java.awt.Dimension(170, 40));
        wizardStep1ToggleButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep1ToggleButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep1ToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        wizardStep1ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep1ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep1ToggleButton);

        wizardStep2ToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        wizardButtonGroup.add(wizardStep2ToggleButton);
        wizardStep2ToggleButton.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        wizardStep2ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        wizardStep2ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        wizardStep2ToggleButton.setText("2. BETALUPPGIFTER");
        wizardStep2ToggleButton.setAlignmentX(0.5F);
        wizardStep2ToggleButton.setBorder(null);
        wizardStep2ToggleButton.setBorderPainted(false);
        wizardStep2ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wizardStep2ToggleButton.setEnabled(false);
        wizardStep2ToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wizardStep2ToggleButton.setIconTextGap(0);
        wizardStep2ToggleButton.setMaximumSize(new java.awt.Dimension(170, 40));
        wizardStep2ToggleButton.setMinimumSize(new java.awt.Dimension(170, 40));
        wizardStep2ToggleButton.setPreferredSize(new java.awt.Dimension(170, 40));
        wizardStep2ToggleButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep2ToggleButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep2ToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        wizardStep2ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep2ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep2ToggleButton);

        wizardStep3ToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        wizardButtonGroup.add(wizardStep3ToggleButton);
        wizardStep3ToggleButton.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        wizardStep3ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        wizardStep3ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        wizardStep3ToggleButton.setText("3. BEKRÄFTA KÖP");
        wizardStep3ToggleButton.setAlignmentX(0.5F);
        wizardStep3ToggleButton.setBorder(null);
        wizardStep3ToggleButton.setBorderPainted(false);
        wizardStep3ToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wizardStep3ToggleButton.setEnabled(false);
        wizardStep3ToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wizardStep3ToggleButton.setIconTextGap(0);
        wizardStep3ToggleButton.setMaximumSize(new java.awt.Dimension(170, 40));
        wizardStep3ToggleButton.setMinimumSize(new java.awt.Dimension(170, 40));
        wizardStep3ToggleButton.setPreferredSize(new java.awt.Dimension(170, 40));
        wizardStep3ToggleButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep3ToggleButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        wizardStep3ToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        wizardStep3ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardStep3ToggleButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(wizardStep3ToggleButton);

        add(buttonPanel);

        cardPanel.setLayout(new java.awt.CardLayout());

        page1Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        page1Panel.setOpaque(false);
        page1Panel.setLayout(new javax.swing.BoxLayout(page1Panel, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 550));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        page1FormPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        page1FormPanel.setMaximumSize(new java.awt.Dimension(32767, 200));
        page1FormPanel.setMinimumSize(new java.awt.Dimension(394, 200));
        page1FormPanel.setOpaque(false);
        page1FormPanel.setPreferredSize(new java.awt.Dimension(260, 200));
        page1FormPanel.setLayout(new javax.swing.BoxLayout(page1FormPanel, javax.swing.BoxLayout.Y_AXIS));

        firstRow.setMaximumSize(new java.awt.Dimension(32767, 40));
        firstRow.setPreferredSize(new java.awt.Dimension(873, 40));
        firstRow.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Personuppgifter");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setMaximumSize(new java.awt.Dimension(121231, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 20));
        firstRow.add(jLabel1);

        page1FormPanel.add(firstRow);

        secondRow.setMaximumSize(new java.awt.Dimension(32767, 60));
        secondRow.setPreferredSize(new java.awt.Dimension(1333337, 30));
        secondRow.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        firstNameLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstNameLabel.setText("FÖRNAMN*");
        firstNameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        firstNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        firstNameLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        firstNameLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        firstNameLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        secondRow.add(firstNameLabel);

        lastNameLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastNameLabel.setText("EFTERNAMN");
        lastNameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lastNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lastNameLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        lastNameLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        lastNameLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        secondRow.add(lastNameLabel);

        page1FormPanel.add(secondRow);

        thirdRow.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        thirdRow.setMaximumSize(new java.awt.Dimension(32767, 60));
        thirdRow.setPreferredSize(new java.awt.Dimension(13333, 60));
        thirdRow.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        firstNameTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        thirdRow.add(firstNameTextField);

        lastNameTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        thirdRow.add(lastNameTextField);

        page1FormPanel.add(thirdRow);

        fourthRow.setMaximumSize(new java.awt.Dimension(32767, 60));
        fourthRow.setPreferredSize(new java.awt.Dimension(1333337, 30));
        fourthRow.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        addressLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addressLabel.setText("GATUADRESS*");
        addressLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addressLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        addressLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        addressLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        fourthRow.add(addressLabel);

        postCodeLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        postCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        postCodeLabel.setText("POSTKOD");
        postCodeLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        postCodeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        postCodeLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        postCodeLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        postCodeLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        fourthRow.add(postCodeLabel);

        page1FormPanel.add(fourthRow);

        fifthRow.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        fifthRow.setMaximumSize(new java.awt.Dimension(32767, 60));
        fifthRow.setPreferredSize(new java.awt.Dimension(13333, 60));
        fifthRow.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        addressTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        fifthRow.add(addressTextField);

        postCodeTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        fifthRow.add(postCodeTextField);

        page1FormPanel.add(fifthRow);

        sixthRow.setMaximumSize(new java.awt.Dimension(32767, 60));
        sixthRow.setPreferredSize(new java.awt.Dimension(1333337, 30));
        sixthRow.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        postAddressLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        postAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        postAddressLabel.setText("ORT*");
        postAddressLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        postAddressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        postAddressLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        postAddressLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        postAddressLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        sixthRow.add(postAddressLabel);

        mobileNumberLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        mobileNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mobileNumberLabel.setText("MOBILNUMMER*");
        mobileNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mobileNumberLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mobileNumberLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        mobileNumberLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        mobileNumberLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        sixthRow.add(mobileNumberLabel);

        page1FormPanel.add(sixthRow);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel8.setPreferredSize(new java.awt.Dimension(13333, 60));
        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        postAddressTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        jPanel8.add(postAddressTextField);

        mobileNumberTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        jPanel8.add(mobileNumberTextField);

        page1FormPanel.add(jPanel8);

        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(1333337, 30));
        jPanel13.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        phoneNumberLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneNumberLabel.setText("TELEFONNUMMER*");
        phoneNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        phoneNumberLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        phoneNumberLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        phoneNumberLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        phoneNumberLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        jPanel13.add(phoneNumberLabel);

        emailLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLabel.setText("E-MAIL");
        emailLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        emailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        emailLabel.setMaximumSize(new java.awt.Dimension(100, 10));
        emailLabel.setMinimumSize(new java.awt.Dimension(100, 10));
        emailLabel.setPreferredSize(new java.awt.Dimension(100, 10));
        jPanel13.add(emailLabel);

        page1FormPanel.add(jPanel13);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel10.setPreferredSize(new java.awt.Dimension(13333, 60));
        jPanel10.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        phoneNumberTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        jPanel10.add(phoneNumberTextField);

        emailTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        jPanel10.add(emailTextField);

        page1FormPanel.add(jPanel10);

        jPanel12.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        errorLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        errorLabel1.setText("Error");
        jPanel12.add(errorLabel1);

        page1FormPanel.add(jPanel12);

        jPanel1.add(page1FormPanel);

        page1Panel.add(jPanel1);

        buttonPanel2.setMaximumSize(new java.awt.Dimension(12192712, 60));
        buttonPanel2.setLayout(new javax.swing.BoxLayout(buttonPanel2, javax.swing.BoxLayout.X_AXIS));

        totalLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel1.setText("Antal varor: 99 st   Totalkostnad: 9999 kr");
        totalLabel1.setMaximumSize(new java.awt.Dimension(13337, 22));
        buttonPanel2.add(totalLabel1);

        saveCustomerCheckBox.setSelected(true);
        saveCustomerCheckBox.setText("Spara personuppgifter");
        buttonPanel2.add(saveCustomerCheckBox);

        page1NextButton.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        page1NextButton.setForeground(new java.awt.Color(255, 255, 255));
        page1NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        page1NextButton.setText("NÄSTA");
        page1NextButton.setBorderPainted(false);
        page1NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        page1NextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page1NextButton.setIconTextGap(0);
        page1NextButton.setMaximumSize(new java.awt.Dimension(120, 60));
        page1NextButton.setMinimumSize(new java.awt.Dimension(120, 60));
        page1NextButton.setPreferredSize(new java.awt.Dimension(120, 60));
        page1NextButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected-hover.png"))); // NOI18N
        page1NextButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected-hover.png"))); // NOI18N
        page1NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1NextButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(page1NextButton);

        page1Panel.add(buttonPanel2);

        cardPanel.add(page1Panel, "page1");

        page2Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        page2Panel.setAutoscrolls(true);
        page2Panel.setLayout(new javax.swing.BoxLayout(page2Panel, javax.swing.BoxLayout.Y_AXIS));

        page2FormsPanel.setLayout(new java.awt.GridLayout(1, 2));

        middlePanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        middlePanel1.setLayout(new javax.swing.BoxLayout(middlePanel1, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel2.setText("Betaluppgifter");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setMaximumSize(new java.awt.Dimension(1333337, 60));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2.setPreferredSize(new java.awt.Dimension(133337, 60));
        middlePanel1.add(jLabel2);

        cardNumberLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        cardNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardNumberLabel.setText("KORTNUMMER*");
        cardNumberLabel.setAlignmentX(0.5F);
        cardNumberLabel.setMaximumSize(new java.awt.Dimension(1333337, 20));
        cardNumberLabel.setPreferredSize(new java.awt.Dimension(13333337, 20));
        middlePanel1.add(cardNumberLabel);

        cardNumberTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        cardNumberTextField.setAutoscrolls(false);
        cardNumberTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        cardNumberTextField.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        cardNumberTextField.setMinimumSize(new java.awt.Dimension(100, 60));
        cardNumberTextField.setPreferredSize(new java.awt.Dimension(133333337, 60));
        middlePanel1.add(cardNumberTextField);

        cardTypeLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        cardTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardTypeLabel.setText("KORRTYP*");
        cardTypeLabel.setAlignmentX(0.5F);
        cardTypeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        cardTypeLabel.setMaximumSize(new java.awt.Dimension(1333337, 30));
        cardTypeLabel.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(cardTypeLabel);

        cardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa", "MasterCard", "American Express", "Visa Electron" }));
        cardTypeComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        cardTypeComboBox.setMaximumSize(new java.awt.Dimension(32767, 60));
        cardTypeComboBox.setMinimumSize(new java.awt.Dimension(100, 60));
        cardTypeComboBox.setPreferredSize(new java.awt.Dimension(1333337, 60));
        middlePanel1.add(cardTypeComboBox);

        validDateLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        validDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        validDateLabel.setText("GILTIGT T.O.M.*");
        validDateLabel.setAlignmentX(0.5F);
        validDateLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        validDateLabel.setMaximumSize(new java.awt.Dimension(1333337, 30));
        validDateLabel.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(validDateLabel);

        validDatePanel.setLayout(new javax.swing.BoxLayout(validDatePanel, javax.swing.BoxLayout.LINE_AXIS));

        validMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mån", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        validMonthComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        validMonthComboBox.setMaximumSize(new java.awt.Dimension(32767, 60));
        validMonthComboBox.setMinimumSize(new java.awt.Dimension(100, 60));
        validMonthComboBox.setPreferredSize(new java.awt.Dimension(1333337, 60));
        validDatePanel.add(validMonthComboBox);
        validDatePanel.add(filler11);

        validYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "År", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        validYearComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        validYearComboBox.setMaximumSize(new java.awt.Dimension(32767, 60));
        validYearComboBox.setMinimumSize(new java.awt.Dimension(100, 60));
        validYearComboBox.setPreferredSize(new java.awt.Dimension(1333337, 60));
        validDatePanel.add(validYearComboBox);

        middlePanel1.add(validDatePanel);

        holderNameLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        holderNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        holderNameLabel.setText("KORTINNEHAVARENS NAMN");
        holderNameLabel.setAlignmentX(0.5F);
        holderNameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        holderNameLabel.setMaximumSize(new java.awt.Dimension(1333337, 30));
        holderNameLabel.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(holderNameLabel);

        holderNameTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        holderNameTextField.setAutoscrolls(false);
        holderNameTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        holderNameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        holderNameTextField.setMinimumSize(new java.awt.Dimension(100, 60));
        holderNameTextField.setPreferredSize(new java.awt.Dimension(133333337, 60));
        middlePanel1.add(holderNameTextField);

        securityCodeLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        securityCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        securityCodeLabel.setText("CCV-KOD**");
        securityCodeLabel.setAlignmentX(0.5F);
        securityCodeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        securityCodeLabel.setMaximumSize(new java.awt.Dimension(1333337, 30));
        securityCodeLabel.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(securityCodeLabel);

        securityCodeTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        securityCodeTextField.setAutoscrolls(false);
        securityCodeTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        securityCodeTextField.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        securityCodeTextField.setMinimumSize(new java.awt.Dimension(100, 60));
        securityCodeTextField.setPreferredSize(new java.awt.Dimension(133333337, 60));
        middlePanel1.add(securityCodeTextField);

        deliveryDateLabel.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        deliveryDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deliveryDateLabel.setText("LEVERANSDATUM");
        deliveryDateLabel.setAlignmentX(0.5F);
        deliveryDateLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        deliveryDateLabel.setMaximumSize(new java.awt.Dimension(1333337, 30));
        deliveryDateLabel.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(deliveryDateLabel);

        deliveryDateTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        deliveryDateTextField.setText("13-03-2015");
        deliveryDateTextField.setAutoscrolls(false);
        deliveryDateTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        deliveryDateTextField.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        deliveryDateTextField.setMinimumSize(new java.awt.Dimension(100, 60));
        deliveryDateTextField.setPreferredSize(new java.awt.Dimension(133333337, 60));
        deliveryDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryDateTextFieldActionPerformed(evt);
            }
        });
        middlePanel1.add(deliveryDateTextField);

        jLabel22.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("LEVERANSTID");
        jLabel22.setAlignmentX(0.5F);
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        jLabel22.setMaximumSize(new java.awt.Dimension(1333337, 30));
        jLabel22.setPreferredSize(new java.awt.Dimension(13333337, 30));
        middlePanel1.add(jLabel22);

        deliveryTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hela dagen (8:00-16:00)", "Förmiddag (8:00-12:00)", "Eftermiddag (12:00-16:00)" }));
        deliveryTimeComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        deliveryTimeComboBox.setMaximumSize(new java.awt.Dimension(32767, 60));
        deliveryTimeComboBox.setMinimumSize(new java.awt.Dimension(100, 60));
        deliveryTimeComboBox.setPreferredSize(new java.awt.Dimension(1333337, 60));
        middlePanel1.add(deliveryTimeComboBox);

        errorLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabel2.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel2.setText("errorLabel");
        errorLabel2.setAlignmentX(0.5F);
        errorLabel2.setMaximumSize(new java.awt.Dimension(133337, 40));
        errorLabel2.setPreferredSize(new java.awt.Dimension(133337, 20));
        middlePanel1.add(errorLabel2);

        page2FormsPanel.add(middlePanel1);

        page2Panel.add(page2FormsPanel);

        buttonPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 0, 0));
        buttonPanel3.setMaximumSize(new java.awt.Dimension(133337, 80));
        buttonPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        buttonPanel3.setPreferredSize(new java.awt.Dimension(133337, 80));
        buttonPanel3.setLayout(new javax.swing.BoxLayout(buttonPanel3, javax.swing.BoxLayout.LINE_AXIS));

        page2BackButton.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        page2BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        page2BackButton.setText("TILLBAKA");
        page2BackButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        page2BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        page2BackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page2BackButton.setMaximumSize(new java.awt.Dimension(130, 60));
        page2BackButton.setMinimumSize(new java.awt.Dimension(130, 60));
        page2BackButton.setPreferredSize(new java.awt.Dimension(130, 60));
        page2BackButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected.png"))); // NOI18N
        page2BackButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        page2BackButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected.png"))); // NOI18N
        page2BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2BackButtonActionPerformed(evt);
            }
        });
        buttonPanel3.add(page2BackButton);
        buttonPanel3.add(filler2);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("*Måste fyllas i\n**Sparas Ej");
        jTextArea2.setMaximumSize(new java.awt.Dimension(100, 60));
        jTextArea2.setMinimumSize(new java.awt.Dimension(100, 60));
        jTextArea2.setPreferredSize(new java.awt.Dimension(100, 60));
        buttonPanel3.add(jTextArea2);

        saveCredentialsCheckBox.setText("Spara betaluppgifter");
        saveCredentialsCheckBox.setMaximumSize(new java.awt.Dimension(200, 60));
        saveCredentialsCheckBox.setMinimumSize(new java.awt.Dimension(100, 60));
        saveCredentialsCheckBox.setPreferredSize(new java.awt.Dimension(200, 60));
        buttonPanel3.add(saveCredentialsCheckBox);

        page2NextButton.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        page2NextButton.setForeground(new java.awt.Color(255, 255, 255));
        page2NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        page2NextButton.setText("NÄSTA");
        page2NextButton.setBorderPainted(false);
        page2NextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        page2NextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page2NextButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        page2NextButton.setMaximumSize(new java.awt.Dimension(120, 60));
        page2NextButton.setMinimumSize(new java.awt.Dimension(100, 60));
        page2NextButton.setPreferredSize(new java.awt.Dimension(120, 60));
        page2NextButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        page2NextButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        page2NextButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        page2NextButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        page2NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2NextButtonActionPerformed(evt);
            }
        });
        buttonPanel3.add(page2NextButton);

        page2Panel.add(buttonPanel3);

        cardPanel.add(page2Panel, "page2");

        page3Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        page3Panel.setLayout(new javax.swing.BoxLayout(page3Panel, javax.swing.BoxLayout.Y_AXIS));

        confirmTextArea.setEditable(false);
        confirmTextArea.setBackground(new java.awt.Color(240, 240, 240));
        confirmTextArea.setColumns(20);
        confirmTextArea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        confirmTextArea.setRows(5);
        confirmTextArea.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)));
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
                .addContainerGap(398, Short.MAX_VALUE))
        );

        page3Panel.add(jPanel4);

        buttonPanel4.setLayout(new javax.swing.BoxLayout(buttonPanel4, javax.swing.BoxLayout.LINE_AXIS));

        page3BackButton.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        page3BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        page3BackButton.setText("TILLBAKA");
        page3BackButton.setBorder(null);
        page3BackButton.setBorderPainted(false);
        page3BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        page3BackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        page3BackButton.setMaximumSize(new java.awt.Dimension(120, 60));
        page3BackButton.setMinimumSize(new java.awt.Dimension(120, 60));
        page3BackButton.setPreferredSize(new java.awt.Dimension(120, 60));
        page3BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page3BackButtonActionPerformed(evt);
            }
        });
        buttonPanel4.add(page3BackButton);

        totalLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel2.setText("Antal varor: 99 st   Totalkostnad: 9999 kr");
        totalLabel2.setMaximumSize(new java.awt.Dimension(133337, 22));
        totalLabel2.setMinimumSize(new java.awt.Dimension(30, 22));
        totalLabel2.setPreferredSize(new java.awt.Dimension(133337, 22));
        buttonPanel4.add(totalLabel2);

        buyButton.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green.png"))); // NOI18N
        buyButton.setText("BETALA");
        buyButton.setBorderPainted(false);
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buyButton.setMaximumSize(new java.awt.Dimension(120, 60));
        buyButton.setMinimumSize(new java.awt.Dimension(120, 60));
        buyButton.setPreferredSize(new java.awt.Dimension(120, 60));
        buyButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        buyButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        buyButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-hover.png"))); // NOI18N
        buyButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-green-selected.png"))); // NOI18N
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        buttonPanel4.add(buyButton);

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
                ReminderAndStoredInformation r = ProfilePanel.getReminderAndStoredInformation();
                r.setTextFieldsFromStoredInformation();
                r.setLabelsFromStoredInformation();
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
        ((IMat)this.getTopLevelAncestor()).switchCard("thankYouPanel", null);
    }//GEN-LAST:event_buyButtonActionPerformed

    private void deliveryDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryDateTextFieldActionPerformed

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
    private javax.swing.JPanel fifthRow;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel firstRow;
    private javax.swing.JPanel fourthRow;
    private javax.swing.JLabel holderNameLabel;
    private javax.swing.JTextField holderNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JCheckBox saveCredentialsCheckBox;
    private javax.swing.JCheckBox saveCustomerCheckBox;
    private javax.swing.JPanel secondRow;
    private javax.swing.JLabel securityCodeLabel;
    private javax.swing.JTextField securityCodeTextField;
    private javax.swing.JPanel sixthRow;
    private javax.swing.JPanel thirdRow;
    private javax.swing.JLabel totalLabel1;
    private javax.swing.JLabel totalLabel2;
    private javax.swing.JLabel validDateLabel;
    private javax.swing.JPanel validDatePanel;
    private javax.swing.JComboBox validMonthComboBox;
    private javax.swing.JComboBox validYearComboBox;
    private javax.swing.ButtonGroup wizardButtonGroup;
    private javax.swing.JToggleButton wizardStep1ToggleButton;
    private javax.swing.JToggleButton wizardStep2ToggleButton;
    private javax.swing.JToggleButton wizardStep3ToggleButton;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author kakan
 */
public class ReminderAndStoredInformation extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private Customer customer;

    /**
     * Creates new customizer ReminderAndStoredInformation
     */
    public ReminderAndStoredInformation() {
        initComponents();
        customer = IMatDataHandler.getInstance().getCustomer();
        setLabelsFromStoredInformation();
        CardLayout cards = (CardLayout) this.getLayout();
        cards.show(this, "showCard");
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    public void setLabelsFromStoredInformation() {
        userAddress.setText(customer.getAddress());
        userEmail.setText(customer.getEmail());
        userFirstName.setText(customer.getFirstName());
        userLastName.setText(customer.getLastName());
        userMobile.setText(customer.getMobilePhoneNumber());
        userPostCode.setText(customer.getPostCode());
        
    }
    
    public void setTextFieldsFromStoredInformation() {
        firstNameTextField.setText(customer.getFirstName());
        lastNameTextField.setText(customer.getLastName());
        addressTextField.setText(customer.getAddress());
        postCodeTextField.setText(customer.getPostCode());
        emailTextField.setText(customer.getEmail());
        mobileTextField.setText(customer.getMobilePhoneNumber());
    }
    
    public void storeInformaitonFromTextFields() {
        customer.setAddress(addressTextField.getText());
        customer.setEmail(emailTextField.getText());
        customer.setFirstName(firstNameTextField.getText());
        customer.setLastName(lastNameTextField.getText());
        customer.setMobilePhoneNumber(mobileTextField.getText());;
        customer.setPostCode(postCodeTextField.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        mobileTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        postCodeTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        postCodeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        contactInformationLabel = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        newReminderButton = new javax.swing.JButton();
        howComboBox = new javax.swing.JComboBox();
        frequencyComboBox = new javax.swing.JComboBox();
        howLabel = new javax.swing.JLabel();
        frequenceyLabel = new javax.swing.JLabel();
        reminderLabel = new javax.swing.JLabel();
        showPanel = new javax.swing.JPanel();
        showContactInformationLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        showFirstNameLabel = new javax.swing.JLabel();
        userFirstName = new javax.swing.JLabel();
        showLastName = new javax.swing.JLabel();
        userLastName = new javax.swing.JLabel();
        showAddressLabel = new javax.swing.JLabel();
        userAddress = new javax.swing.JLabel();
        showPostCodeLabel = new javax.swing.JLabel();
        userPostCode = new javax.swing.JLabel();
        showEmailLabel = new javax.swing.JLabel();
        userEmail = new javax.swing.JLabel();
        showMobileLabel = new javax.swing.JLabel();
        userMobile = new javax.swing.JLabel();
        reminderLabel1 = new javax.swing.JLabel();
        howLabel1 = new javax.swing.JLabel();
        frequenceyLabel1 = new javax.swing.JLabel();
        frequencyComboBox1 = new javax.swing.JComboBox();
        howComboBox1 = new javax.swing.JComboBox();
        newReminderButton1 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));

        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(200, 400));
        setLayout(new java.awt.CardLayout());

        editPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        saveButton.setText("Spara ändringar");
        saveButton.setPreferredSize(null);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        mobileTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        mobileLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobileLabel.setText("Mobil:");

        postCodeTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        postCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeTextFieldActionPerformed(evt);
            }
        });

        addressTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        firstNameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        postCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        postCodeLabel.setText("Postnummer:");

        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("E-post:");

        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLabel.setText("Adress:");

        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastNameLabel.setText("Efternamn:");

        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstNameLabel.setText("Förnamn:");

        contactInformationLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        contactInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactInformationLabel.setText("Kontaktuppgifter");

        newReminderButton.setText("Ny påminnelse");
        newReminderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReminderButtonActionPerformed(evt);
            }
        });

        howComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        frequencyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        howLabel.setText("Hur");

        frequenceyLabel.setText("Frekvens");

        reminderLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        reminderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reminderLabel.setText("Påminnelser");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newReminderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(howLabel)
                                .addComponent(howComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(frequencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(frequenceyLabel)))
                        .addComponent(reminderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(contactInformationLabel))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailLabel)
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(postCodeLabel)
                                .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mobileLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(12, 12, 12)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(lastNameTextField)
                                .addComponent(addressTextField)
                                .addComponent(postCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addComponent(contactInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCodeLabel)
                    .addComponent(postCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(reminderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howLabel)
                    .addComponent(frequenceyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newReminderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(editPanel, "editCard");

        showPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        showContactInformationLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        showContactInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showContactInformationLabel.setText("Kontaktuppgifter");

        editButton.setText("Redigera uppgifter");
        editButton.setPreferredSize(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        showFirstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showFirstNameLabel.setText("Förnamn:");
        showFirstNameLabel.setPreferredSize(null);

        userFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userFirstName.setText("[förnamn]");
        userFirstName.setPreferredSize(null);

        showLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showLastName.setText("Efternamn:");
        showLastName.setPreferredSize(null);

        userLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userLastName.setText("[efternamn]");
        userLastName.setPreferredSize(null);

        showAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showAddressLabel.setText("Adress:");
        showAddressLabel.setPreferredSize(null);

        userAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userAddress.setText("[adress]");
        userAddress.setPreferredSize(null);

        showPostCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showPostCodeLabel.setText("Postnummer:");
        showPostCodeLabel.setPreferredSize(null);

        userPostCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userPostCode.setText("[postnummer]");
        userPostCode.setPreferredSize(null);

        showEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showEmailLabel.setText("E-post:");
        showEmailLabel.setPreferredSize(null);

        userEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userEmail.setText("[e-post]");
        userEmail.setPreferredSize(null);

        showMobileLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showMobileLabel.setText("Mobil:");
        showMobileLabel.setPreferredSize(null);

        userMobile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userMobile.setText("[mobil]");
        userMobile.setPreferredSize(null);

        reminderLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        reminderLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reminderLabel1.setText("Påminnelser");

        howLabel1.setText("Hur");

        frequenceyLabel1.setText("Frekvens");

        frequencyComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        howComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        newReminderButton1.setText("Ny påminnelse");

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showPanelLayout.createSequentialGroup()
                        .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPostCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showMobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(showPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(showContactInformationLabel))
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newReminderButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showPanelLayout.createSequentialGroup()
                            .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(howLabel1)
                                .addComponent(howComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(frequencyComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(frequenceyLabel1)))
                        .addComponent(reminderLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addComponent(showContactInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showPostCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showMobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reminderLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howLabel1)
                    .addComponent(frequenceyLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(howComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequencyComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newReminderButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(showPanel, "showCard");
    }// </editor-fold>//GEN-END:initComponents

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        CardLayout cards = (CardLayout) this.getLayout();
        cards.show(this, "editCard");
        setTextFieldsFromStoredInformation();
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        storeInformaitonFromTextFields();
        setLabelsFromStoredInformation();
        
        CardLayout cards = (CardLayout) this.getLayout();
        cards.show(this, "showCard");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void postCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeTextFieldActionPerformed

    private void newReminderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReminderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newReminderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel contactInformationLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel frequenceyLabel;
    private javax.swing.JLabel frequenceyLabel1;
    private javax.swing.JComboBox frequencyComboBox;
    private javax.swing.JComboBox frequencyComboBox1;
    private javax.swing.JComboBox howComboBox;
    private javax.swing.JComboBox howComboBox1;
    private javax.swing.JLabel howLabel;
    private javax.swing.JLabel howLabel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.JButton newReminderButton;
    private javax.swing.JButton newReminderButton1;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JTextField postCodeTextField;
    private javax.swing.JLabel reminderLabel;
    private javax.swing.JLabel reminderLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel showAddressLabel;
    private javax.swing.JLabel showContactInformationLabel;
    private javax.swing.JLabel showEmailLabel;
    private javax.swing.JLabel showFirstNameLabel;
    private javax.swing.JLabel showLastName;
    private javax.swing.JLabel showMobileLabel;
    private javax.swing.JPanel showPanel;
    private javax.swing.JLabel showPostCodeLabel;
    private javax.swing.JLabel userAddress;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel userFirstName;
    private javax.swing.JLabel userLastName;
    private javax.swing.JLabel userMobile;
    private javax.swing.JLabel userPostCode;
    // End of variables declaration//GEN-END:variables
}

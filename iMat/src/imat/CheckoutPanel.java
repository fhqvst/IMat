/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class CheckoutPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private ProductListPanel plp = new ProductListPanel();
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();
    /**
     * Creates new customizer PageCard
     */
    public CheckoutPanel() {
        initComponents();
        page1Panel.add(plp, 0);
        this.cardPanel.add(page1Panel, "page1");
        showCard("page1");
    }
    
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    public void showCard(String cardName) {
        CardLayout cards = (CardLayout) cardPanel.getLayout();
        cards.show(cardPanel, cardName);
    }
    
    public ProductListPanel getProductListPanel(){
        return plp;
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
        nextButton = new javax.swing.JButton();
        listNameTextField = new javax.swing.JTextField();
        saveListCheckBox = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        wizardStep1ToggleButton.setSelected(true);
        wizardStep1ToggleButton.setText("Varukorg");
        buttonPanel.add(wizardStep1ToggleButton);

        wizardStep2ToggleButton.setText("Personuppgifter");
        wizardStep2ToggleButton.setEnabled(false);
        buttonPanel.add(wizardStep2ToggleButton);

        wizardStep3ToggleButton.setText("Bekräfta köp");
        wizardStep3ToggleButton.setEnabled(false);
        buttonPanel.add(wizardStep3ToggleButton);

        add(buttonPanel);

        cardPanel.setLayout(new java.awt.CardLayout());

        page1Panel.setLayout(new javax.swing.BoxLayout(page1Panel, javax.swing.BoxLayout.Y_AXIS));

        buttonPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        nextButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nextButton.setText("Nästa");
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
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
                .addComponent(nextButton))
        );
        buttonPanel1Layout.setVerticalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(listNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveListCheckBox)))
        );

        page1Panel.add(buttonPanel1);

        cardPanel.add(page1Panel, "card2");

        add(cardPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        //TODO
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel buttonPanel1;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JTextField listNameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel page1Panel;
    private javax.swing.JCheckBox saveListCheckBox;
    private javax.swing.JToggleButton wizardStep1ToggleButton;
    private javax.swing.JToggleButton wizardStep2ToggleButton;
    private javax.swing.JToggleButton wizardStep3ToggleButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.AbstractButton;
import javax.swing.text.StyleConstants;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class ProductListPanel extends javax.swing.JPanel implements java.beans.Customizer, ShoppingCartListener {
    
    private Object bean;
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();
    private ShoppingCart cart = dataHandler.getShoppingCart();

    /**
     * Creates new customizer PageCard
     */
    public ProductListPanel(boolean isInCheckout) {
        initComponents();
        if (isInCheckout) {
            jButton1.setVisible(false);
        }
        cart.addShoppingCartListener(this);
        updatePanel();
    }

    
    private void addProducts(ShoppingCart cart) {
        
        productsPanel.removeAll();
        
        for(int i = 0; i < cart.getItems().size(); i++){

            ListedProductPanel listedProductPanel = new ListedProductPanel(cart.getItems().get(i));
            if (i % 2 == 0) {
                listedProductPanel.setBackground(Color.LIGHT_GRAY);
                Component[] c = listedProductPanel.getComponents();
                for (int j = 0; j < c.length; j++) {
                    c[j].setBackground(Color.LIGHT_GRAY);  
                }
            }
            productsPanel.add(listedProductPanel);
            revalidate();
            repaint();
        }

    }
    
    public void updatePanel(){
        this.addProducts(cart);
        
        this.updateUI();
    }
    
    @Override
    public void shoppingCartChanged(CartEvent ce) {
        updatePanel();
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

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productsScrollPane = new javax.swing.JScrollPane();
        productsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addToCartButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(500, 0));
        setPreferredSize(new java.awt.Dimension(500, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        titlePanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(20, 0, 20, 10)));
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vara");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(null);
        titlePanel.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pris/Enhet");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(null);
        titlePanel.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Antal");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setIconTextGap(0);
        jLabel3.setMaximumSize(null);
        jLabel3.setMinimumSize(null);
        jLabel3.setPreferredSize(null);
        titlePanel.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Totalt");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(0);
        jLabel4.setMaximumSize(null);
        jLabel4.setMinimumSize(null);
        jLabel4.setPreferredSize(null);
        titlePanel.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ta bort");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(0);
        jLabel5.setMaximumSize(null);
        jLabel5.setMinimumSize(null);
        jLabel5.setPreferredSize(null);
        titlePanel.add(jLabel5);

        add(titlePanel);

        productsScrollPane.setBorder(null);
        productsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        productsScrollPane.setAutoscrolls(true);
        productsScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        productsScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));

        productsPanel.setAutoscrolls(true);
        productsPanel.setMaximumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setMinimumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setLayout(new javax.swing.BoxLayout(productsPanel, javax.swing.BoxLayout.Y_AXIS));
        productsScrollPane.setViewportView(productsPanel);

        add(productsScrollPane);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 80));

        addToCartButton.setBackground(new java.awt.Color(255, 153, 153));
        addToCartButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        addToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        addToCartButton.setText("TÖM VARUKORG");
        addToCartButton.setAlignmentX(0.5F);
        addToCartButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        addToCartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addToCartButton.setFocusPainted(false);
        addToCartButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addToCartButton.setIconTextGap(0);
        addToCartButton.setMargin(null);
        addToCartButton.setMaximumSize(new java.awt.Dimension(100, 100));
        addToCartButton.setMinimumSize(new java.awt.Dimension(100, 40));
        addToCartButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        jButton1.setText("Gå till kassa");
        jButton1.setAlignmentX(0.5F);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMargin(null);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        /*for (ShoppingItem s : dataHandler.getShoppingCart().getItems()) {
            dataHandler.getShoppingCart().removeItem(s);
        }*/
        dataHandler.getShoppingCart().clear();
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IMat i = IMat.getIMat();
        i.switchCard("checkoutPanel", evt);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JScrollPane productsScrollPane;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}

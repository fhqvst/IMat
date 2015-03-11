/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.GridLayout;
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
    public ProductListPanel() {
        initComponents();
        cart.addShoppingCartListener(this);
        updatePanel();
    }

    
    private void addProducts(ShoppingCart cart) {
        
        productsPanel.removeAll();
        
        for(ShoppingItem item : cart.getItems()){

            ListedProductPanel listedProductPanel = new ListedProductPanel(item);
            productsPanel.add(listedProductPanel);
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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(500, 0));
        setPreferredSize(new java.awt.Dimension(500, 200));

        titlePanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(20, 0, 20, 10)));
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new java.awt.GridLayout());

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

        productsScrollPane.setBorder(null);
        productsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        productsScrollPane.setAutoscrolls(true);
        productsScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        productsScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));

        productsPanel.setAlignmentX(0.5F);
        productsPanel.setAutoscrolls(true);
        productsPanel.setMaximumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setMinimumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setLayout(new javax.swing.BoxLayout(productsPanel, javax.swing.BoxLayout.Y_AXIS));
        productsScrollPane.setViewportView(productsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JScrollPane productsScrollPane;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}

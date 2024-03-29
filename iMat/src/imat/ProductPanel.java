/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author filip
 */
public class ProductPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private Product product;
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();

    /**
     * Creates new customizer ProductPanel
     */
    public ProductPanel() {
        initComponents();
    }
    
    public ProductPanel(Product product) {
        this();
        this.product = product;
        this.titleLabel.setText(product.getName());
        this.priceLabel.setText(Double.toString(product.getPrice()));
        this.imageLabel.setIcon(IMat.dataHandler.getImageIcon(product, 256, 200));
        this.unitLabel.setText(product.getUnitSuffix());
        this.amountSpinner.setValue(1);
        if(dataHandler.favorites().contains(product)){
            addToFavouritesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart.png")));
        }
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

        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        titleAndPricePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        addToFavouritesButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        amountSpinner = new javax.swing.JSpinner();
        unitLabel = new javax.swing.JLabel();
        addToCartButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(200, 300));
        setLayout(new java.awt.GridLayout(2, 0));

        imagePanel.setBackground(new java.awt.Color(255, 255, 255));
        imagePanel.setLayout(new java.awt.BorderLayout());

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imageLabel.setPreferredSize(new java.awt.Dimension(256, 0));
        imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelMouseClicked(evt);
            }
        });
        imagePanel.add(imageLabel, java.awt.BorderLayout.CENTER);

        add(imagePanel);

        descriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        descriptionPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        descriptionPanel.setLayout(new javax.swing.BoxLayout(descriptionPanel, javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setLayout(new java.awt.BorderLayout());

        titleAndPricePanel.setBackground(new java.awt.Color(255, 255, 255));
        titleAndPricePanel.setOpaque(false);
        titleAndPricePanel.setLayout(new javax.swing.BoxLayout(titleAndPricePanel, javax.swing.BoxLayout.Y_AXIS));

        titleLabel.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Titel");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        titleLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        titleAndPricePanel.add(titleLabel);

        priceLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(238, 85, 62));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Pris");
        priceLabel.setToolTipText("");
        titleAndPricePanel.add(priceLabel);

        topPanel.add(titleAndPricePanel, java.awt.BorderLayout.CENTER);

        addToFavouritesButton.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        addToFavouritesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart-open.png"))); // NOI18N
        addToFavouritesButton.setAlignmentY(0.0F);
        addToFavouritesButton.setBorder(null);
        addToFavouritesButton.setBorderPainted(false);
        addToFavouritesButton.setContentAreaFilled(false);
        addToFavouritesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToFavouritesButton.setFocusPainted(false);
        addToFavouritesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addToFavouritesButton.setIconTextGap(0);
        addToFavouritesButton.setMargin(null);
        addToFavouritesButton.setMaximumSize(new java.awt.Dimension(50, 50));
        addToFavouritesButton.setMinimumSize(new java.awt.Dimension(0, 0));
        addToFavouritesButton.setPreferredSize(new java.awt.Dimension(60, 60));
        addToFavouritesButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart.png"))); // NOI18N
        addToFavouritesButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart.png"))); // NOI18N
        addToFavouritesButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart.png"))); // NOI18N
        addToFavouritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToFavouritesButtonActionPerformed(evt);
            }
        });
        topPanel.add(addToFavouritesButton, java.awt.BorderLayout.EAST);

        descriptionPanel.add(topPanel);

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 0, 0));
        bottomPanel.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        bottomPanel.setMinimumSize(new java.awt.Dimension(0, 60));
        bottomPanel.setPreferredSize(new java.awt.Dimension(170, 60));
        bottomPanel.setLayout(new java.awt.BorderLayout());

        amountSpinner.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        amountSpinner.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        amountSpinner.setMinimumSize(new java.awt.Dimension(0, 0));
        amountSpinner.setPreferredSize(new java.awt.Dimension(100, 40));
        amountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                amountSpinnerStateChanged(evt);
            }
        });
        bottomPanel.add(amountSpinner, java.awt.BorderLayout.WEST);

        unitLabel.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        unitLabel.setText("kg");
        bottomPanel.add(unitLabel, java.awt.BorderLayout.CENTER);

        addToCartButton.setBackground(new java.awt.Color(255, 153, 153));
        addToCartButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        addToCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        addToCartButton.setText("LÄGG TILL");
        addToCartButton.setAlignmentX(0.5F);
        addToCartButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        addToCartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCartButton.setFocusPainted(false);
        addToCartButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addToCartButton.setIconTextGap(0);
        addToCartButton.setMargin(null);
        addToCartButton.setMaximumSize(new java.awt.Dimension(100, 60));
        addToCartButton.setMinimumSize(new java.awt.Dimension(0, 0));
        addToCartButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addToCartButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected.png"))); // NOI18N
        addToCartButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        addToCartButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        bottomPanel.add(addToCartButton, java.awt.BorderLayout.EAST);

        descriptionPanel.add(bottomPanel);

        add(descriptionPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void amountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_amountSpinnerStateChanged
        if((Integer)amountSpinner.getValue() < 1)
            amountSpinner.setValue(1);
        this.priceLabel.setText(Double.toString(((Integer)amountSpinner.getValue()) * this.product.getPrice()) + " kr");
    }//GEN-LAST:event_amountSpinnerStateChanged

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        boolean exists = false;
                
        for(int i = 0; i < dataHandler.getShoppingCart().getItems().size(); i++){
            ShoppingItem temp = dataHandler.getShoppingCart().getItems().get(i);
            if(temp.getProduct() == product){
                temp.setAmount(temp.getAmount() + (Integer)amountSpinner.getValue());
                dataHandler.getShoppingCart().fireShoppingCartChanged(temp, true);
                exists = true;
                break;
            }
        }
        
        if(!exists){
            dataHandler.getShoppingCart().addProduct(product, (Integer)amountSpinner.getValue());
        }
        
        //((IMat)this.getTopLevelAncestor()).getLayeredPane().moveToFront(((IMat)this.getTopLevelAncestor()).getCardPanel());
        //((IMat)this.getTopLevelAncestor()).getLayeredPane().moveToBack(((IMat)this.getTopLevelAncestor()).getCartPanel());
        
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void addToFavouritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToFavouritesButtonActionPerformed
        if(dataHandler.favorites().contains(product)){
            dataHandler.favorites().remove(product);
            addToFavouritesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart-open.png")));
        }else{
            dataHandler.addFavorite(product);
            addToFavouritesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/heart.png")));
        }
    }//GEN-LAST:event_addToFavouritesButtonActionPerformed

    private void imageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseClicked
        ((IMat)this.getTopLevelAncestor()).switchCard("detailPanel", null);
        ((IMat)this.getTopLevelAncestor()).getDetailPanel().update(product);
        
    }//GEN-LAST:event_imageLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton addToFavouritesButton;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel titleAndPricePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel unitLabel;
    // End of variables declaration//GEN-END:variables
}

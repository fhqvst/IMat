/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author henriknilson
 */
public class DetailPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    
    /**
     * Creates new customizer Detail
     */
    public DetailPanel() {
        initComponents();
        
    }
    
    public void update(Product product) {
        this.titleLabel.setText(product.getName());
        this.priceLabel.setText(Double.toString(product.getPrice()) + " " + product.getUnit());
        this.imageLabel.setIcon(IMat.dataHandler.getImageIcon(product, 300, 300));
       // this.adjustedPriceLabel.setText(Double.toString(this.product.getPrice()) + " kr");
       // this.amountSpinner.setValue(1);
       // if(dataHandler.favorites().contains(product)){
       //     addToFavouritesButton.setForeground(Color.red);
       // }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.add(imageLabel);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        titleLabel.setText("Title");
        jPanel4.add(titleLabel);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1);

        jPanel1.add(jPanel4);

        priceLabel.setText("jLabel1");
        jPanel5.add(priceLabel);

        jPanel1.add(jPanel5);

        add(jPanel1);
        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

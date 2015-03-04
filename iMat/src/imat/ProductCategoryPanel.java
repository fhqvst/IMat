/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author filip
 */
public class ProductCategoryPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private JPanel filterPanel = new JPanel();

    /**
     * Creates new customizer PageCard
     */
    public ProductCategoryPanel() {
        initComponents();
        filterPanel.setBackground(Color.white);
        this.add(filterPanel, 0);
    }
    
    public ProductCategoryPanel(ProductCategory... productCategories) {
        this();
        this.addProducts(productCategories);
    }
    
    public ProductCategoryPanel(List<Product> products) {
        this();
        filterPanel.setVisible(false);
        for(Product product : products) {
                
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);
        }
    }
    
    private void addProducts(ProductCategory[] productCategories) {
        for(ProductCategory productCategory : productCategories) {
            List<Product> products = IMat.dataHandler.getProducts(productCategory);
            for(Product product : products) {
                
                ProductPanel productPanel = new ProductPanel(product);
                productPanel.setSize(200, 100);
                productsPanel.add(productPanel);
            }
        }
    }
    
    public void applyFilters(FilterPanel filterCard) {
        
        filterPanel.removeAll();
        filterPanel.add(filterCard);
        filterPanel.revalidate();
        filterPanel.repaint();
        
        productsPanel.removeAll();
  
        for(Product product : filterCard.getSelected()) {
            
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);

        }
        this.revalidate();
        this.repaint();
    }
    
    public void displayProducts(List<Product> products) {
        productsPanel.removeAll();
        filterPanel.removeAll();
        
        for(Product product : products) {
            
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);

        }
        this.revalidate();
        this.repaint();
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

        productsScrollPane = new javax.swing.JScrollPane();
        productsPanel = new javax.swing.JPanel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        productsScrollPane.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        productsScrollPane.setBorder(null);
        productsScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        productsScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));

        productsPanel.setBackground(java.awt.SystemColor.window);
        productsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        productsPanel.setMaximumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setMinimumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setLayout(new java.awt.GridLayout(0, 3, 20, 20));
        productsScrollPane.setViewportView(productsPanel);

        add(productsScrollPane);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel productsPanel;
    private javax.swing.JScrollPane productsScrollPane;
    // End of variables declaration//GEN-END:variables
}

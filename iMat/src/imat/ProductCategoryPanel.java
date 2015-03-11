/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
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
    protected JPanel filterPanel = new JPanel();
    private GridLayout layout;

    /**
     * Creates new customizer PageCard
     */
    public ProductCategoryPanel() {
        initComponents();
        this.layout = (GridLayout)productsPanel.getLayout();
        productsScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        filterPanel.setBackground(Color.white);
        this.add(filterPanel, 0);
    }
    
    public ProductCategoryPanel(ProductCategory... productCategories) {
        this();
        this.layout = (GridLayout) productsPanel.getLayout();
        this.addProducts(productCategories);
    }
    
    public ProductCategoryPanel(List<Product> products) {
        this();
        this.layout = (GridLayout) productsPanel.getLayout();
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
        layout.setColumns(3);
  
        for(Product product : filterCard.getSelected()) {
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);

        }    
        this.revalidate();
        this.repaint();
    }
    
    //#NoFilter
    public void displayProducts(List<Product> products) {
        productsPanel.removeAll();
        filterPanel.removeAll();
        layout.setColumns(4);

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        sortingPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLinkLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceLinkLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        favouritesLinkLabel = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        productsScrollPane = new javax.swing.JScrollPane();
        productsPanel = new javax.swing.JPanel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(100, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        sortingPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(200, 200, 200)));
        sortingPanel.setLayout(new java.awt.GridLayout(1, 2));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Sortera efter:");
        leftPanel.add(jLabel1);

        nameLinkLabel.setForeground(new java.awt.Color(102, 102, 255));
        nameLinkLabel.setText("Namn");
        nameLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(nameLinkLabel);

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("|");
        leftPanel.add(jLabel3);

        priceLinkLabel.setForeground(new java.awt.Color(102, 102, 255));
        priceLinkLabel.setText("Pris");
        priceLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(priceLinkLabel);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("|");
        leftPanel.add(jLabel5);

        favouritesLinkLabel.setForeground(new java.awt.Color(102, 102, 255));
        favouritesLinkLabel.setText("Favoriter");
        favouritesLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(favouritesLinkLabel);

        sortingPanel.add(leftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Vy:");
        rightPanel.add(jLabel2);

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/gridSmall.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 4, 4));
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightPanel.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/listSmall.png"))); // NOI18N
        jToggleButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 4, 4));
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightPanel.add(jToggleButton2);

        sortingPanel.add(rightPanel);

        jPanel1.add(sortingPanel);

        productsScrollPane.setBorder(null);
        productsScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        productsScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));

        productsPanel.setBackground(java.awt.SystemColor.window);
        productsPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        productsPanel.setMaximumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setMinimumSize(new java.awt.Dimension(1084, 2147483647));
        productsPanel.setLayout(new java.awt.GridLayout(0, 4, 20, 20));
        productsScrollPane.setViewportView(productsPanel);

        jPanel1.add(productsScrollPane);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel favouritesLinkLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel nameLinkLabel;
    private javax.swing.JLabel priceLinkLabel;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JScrollPane productsScrollPane;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sortingPanel;
    // End of variables declaration//GEN-END:variables
}

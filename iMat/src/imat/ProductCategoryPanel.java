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
import javax.swing.Box;
import javax.swing.Box.Filler;
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
        layout.setColumns(4);
  
        for(Product product : filterCard.getSelected()) {
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);

        }
        
        JPanel p;
        
        if(filterCard.getSelected().size() < 9){
            for(int i = 0; i < (9-filterCard.getSelected().size()); i++){
                p = new JPanel();
                p.setBackground(Color.white);
                productsPanel.add(p);
            }
        }
        this.revalidate();
        this.repaint();
    }
    
    //#NoFilter
    public void displayProducts(List<Product> products) {
        productsPanel.removeAll();
        filterPanel.removeAll();
        layout.setColumns(5);

        for(Product product : products) {
            
            ProductPanel productPanel = new ProductPanel(product);
            productPanel.setSize(200, 100);
            productsPanel.add(productPanel);

        }
        
        JPanel p;
        
        if(products.size() < 11){
            for(int i = 0; i < (11-products.size()); i++){
                p = new JPanel();
                p.setBackground(Color.white);
                productsPanel.add(p);
            }
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

        sortingPanel.setBackground(new java.awt.Color(255, 255, 255));
        sortingPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(200, 200, 200)));
        sortingPanel.setMaximumSize(new java.awt.Dimension(32767, 40));
        sortingPanel.setMinimumSize(new java.awt.Dimension(528, 40));
        sortingPanel.setPreferredSize(new java.awt.Dimension(133337, 40));
        sortingPanel.setLayout(new java.awt.GridLayout(1, 2));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        leftPanel.setMaximumSize(new java.awt.Dimension(13337, 60));
        leftPanel.setMinimumSize(new java.awt.Dimension(0, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(13337, 60));
        leftPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("SORTERA EFTER");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(101, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(101, 20));
        leftPanel.add(jLabel1);

        nameLinkLabel.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        nameLinkLabel.setForeground(new java.awt.Color(255, 102, 102));
        nameLinkLabel.setText("Namn");
        nameLinkLabel.setAlignmentX(0.5F);
        nameLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameLinkLabel.setMinimumSize(new java.awt.Dimension(0, 20));
        nameLinkLabel.setPreferredSize(new java.awt.Dimension(33, 20));
        leftPanel.add(nameLinkLabel);

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("|");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(3, 20));
        leftPanel.add(jLabel3);

        priceLinkLabel.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        priceLinkLabel.setForeground(new java.awt.Color(200, 200, 200));
        priceLinkLabel.setText("Pris");
        priceLinkLabel.setAlignmentX(0.5F);
        priceLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        priceLinkLabel.setMinimumSize(new java.awt.Dimension(0, 20));
        priceLinkLabel.setPreferredSize(new java.awt.Dimension(21, 20));
        priceLinkLabel.setRequestFocusEnabled(false);
        leftPanel.add(priceLinkLabel);

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("|");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(3, 20));
        leftPanel.add(jLabel5);

        favouritesLinkLabel.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        favouritesLinkLabel.setForeground(new java.awt.Color(200, 200, 200));
        favouritesLinkLabel.setText("Favoriter");
        favouritesLinkLabel.setAlignmentX(0.5F);
        favouritesLinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        favouritesLinkLabel.setMinimumSize(new java.awt.Dimension(0, 20));
        favouritesLinkLabel.setPreferredSize(new java.awt.Dimension(48, 20));
        leftPanel.add(favouritesLinkLabel);

        sortingPanel.add(leftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        rightPanel.setMaximumSize(new java.awt.Dimension(13337, 60));
        rightPanel.setMinimumSize(new java.awt.Dimension(0, 60));
        rightPanel.setPreferredSize(new java.awt.Dimension(13337, 60));
        rightPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Vy:");
        jLabel2.setPreferredSize(new java.awt.Dimension(20, 20));
        rightPanel.add(jLabel2);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/gridSmall.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setAlignmentX(0.5F);
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.setIconTextGap(0);
        jToggleButton1.setMargin(null);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(20, 20));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(20, 20));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(20, 20));
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/gridSmall.png"))); // NOI18N
        jToggleButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        rightPanel.add(jToggleButton1);

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/listSmall.png"))); // NOI18N
        jToggleButton2.setAlignmentX(0.5F);
        jToggleButton2.setBorder(null);
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton2.setIconTextGap(0);
        jToggleButton2.setMargin(null);
        jToggleButton2.setMaximumSize(new java.awt.Dimension(20, 20));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(20, 20));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(20, 20));
        jToggleButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/listSmall.png"))); // NOI18N
        jToggleButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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

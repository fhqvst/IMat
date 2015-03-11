/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author kakan
 */
public class FilterPanel extends javax.swing.JPanel implements java.beans.Customizer, ChangeListener{
    
    private Object bean;
    private final String title;
    private String[] checkBoxTitles;
    private JCheckBox[] filterBoxes;
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();

    /**
     * Creates new customizer AbstractFilterCard
     */
    public FilterPanel(String title, String[] array) {
        initComponents();
        
        this.title = title;
        this.checkBoxTitles = array;
        filterBoxes = new JCheckBox[array.length];
        
        filterPanel.setLayout(new GridLayout(10,1));
        
        setFilterBoxesFromString();
        setFilterBoxesToPanel();
        setTitle();
        
        
    }
    
    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        ((IMat)this.getTopLevelAncestor()).getProductCategoryPanel().applyFilters(this);
        System.out.println("StateChanged");
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    private void setTitle() {
        titleLable.setText(title);
    }
    
    private void setFilterBoxesFromString() {
        for(int i=0; i<checkBoxTitles.length; i++ ) {
            filterBoxes[i] = new JCheckBox(checkBoxTitles[i]);
            filterBoxes[i].setSelected(true);
            filterBoxes[i].addChangeListener(this);
            filterBoxes[i].setBackground(Color.white);
        }
    }
    private void setFilterBoxesToPanel() {
        for(JCheckBox n : filterBoxes) {
            filterPanel.add(n);
        }
    }
    
    private ProductCategory stringToCategory(String s){
        switch(s) {
            case "Nötkött": case "Fläskkött": return ProductCategory.MEAT;
            case "Fisk": case "Frysta saker": case "Råvaror": return ProductCategory.FISH;
            case "Mjölk": return ProductCategory.DAIRIES;
            case "Bär": return ProductCategory.BERRY;
            case "Bröd": return ProductCategory.BREAD;
            case "Sallad": return ProductCategory.CABBAGE;
            case "Läsk": return ProductCategory.COLD_DRINKS;
            case "Citrus Frukter": return ProductCategory.CITRUS_FRUIT;
            case "Exotic Frukt": return ProductCategory.EXOTIC_FRUIT;
            case "Mjöl, Socker, Salt": return ProductCategory.FLOUR_SUGAR_SALT;
            case "Frukt": return ProductCategory.FRUIT;
            case "Örter": return ProductCategory.HERB;
            case "Kaffe, Te": return ProductCategory.HOT_DRINKS;
            case "Meloner": return ProductCategory.MELONS;
            case "Nötter": return ProductCategory.NUTS_AND_SEEDS;
            case "Pasta": return ProductCategory.PASTA;
            case "Potatis, ris": return ProductCategory.POTATO_RICE;
            case "Godis": return ProductCategory.SWEET;
            case "Bönor": return ProductCategory.POD;
            
            default: return null;
        }
    }
    
    protected List<Product> getSelected() {
        
        List<Product> productsShown = new ArrayList<Product>();
        List<ProductCategory> productCategoriesInSearch = new ArrayList<ProductCategory>();
        
        for(int i = 0; i<filterBoxes.length; i++) {
            if(filterBoxes[i].isSelected() && !productCategoriesInSearch.contains(stringToCategory(checkBoxTitles[i]))) {
                    productsShown.addAll(dataHandler.getProducts(stringToCategory(checkBoxTitles[i])));
                    productCategoriesInSearch.add(stringToCategory(checkBoxTitles[i]));
            }
        }
        
        ArrayList<Product> toBeRemoved = new ArrayList();
        for(Product p: productsShown) {
            if ((int)jSpinner1.getValue() < p.getPrice()) {
                toBeRemoved.add(p);
            }
        }
        productsShown.removeAll(toBeRemoved);
        return productsShown;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLable = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        filterPanel = new javax.swing.JPanel();
        unselectAllButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10));
        selectAllButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setAlignmentX(0.5F);
        setMaximumSize(new java.awt.Dimension(250, 32767));
        setMinimumSize(new java.awt.Dimension(250, 0));
        setPreferredSize(new java.awt.Dimension(250, 434));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        titleLable.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        titleLable.setText("Title");
        titleLable.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLable.setAlignmentX(0.5F);
        titleLable.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        titleLable.setMaximumSize(new java.awt.Dimension(1337, 40));
        titleLable.setMinimumSize(new java.awt.Dimension(1337, 40));
        titleLable.setPreferredSize(new java.awt.Dimension(1337, 40));
        titleLable.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(titleLable);

        jSpinner1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        jSpinner1.setMaximumSize(new java.awt.Dimension(32767, 60));
        jSpinner1.setPreferredSize(new java.awt.Dimension(37, 60));
        jSpinner1.setValue(150);
        add(jSpinner1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Max Kr/Kg");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(1337, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(1337, 20));
        add(jLabel1);

        filterPanel.setBackground(new java.awt.Color(255, 255, 255));
        add(filterPanel);

        unselectAllButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        unselectAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        unselectAllButton.setText("AVMARKERA ALLT");
        unselectAllButton.setAlignmentX(0.5F);
        unselectAllButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        unselectAllButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unselectAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unselectAllButton.setMargin(null);
        unselectAllButton.setMaximumSize(new java.awt.Dimension(1337, 40));
        unselectAllButton.setMinimumSize(new java.awt.Dimension(1337, 40));
        unselectAllButton.setPreferredSize(new java.awt.Dimension(1337, 40));
        unselectAllButton.setRolloverEnabled(true);
        unselectAllButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        unselectAllButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        unselectAllButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected.png"))); // NOI18N
        unselectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unselectAllButtonActionPerformed(evt);
            }
        });
        add(unselectAllButton);
        add(filler1);

        selectAllButton.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        selectAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button.png"))); // NOI18N
        selectAllButton.setText("ÅTERSTÄLL FILTRERING");
        selectAllButton.setAlignmentX(0.5F);
        selectAllButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
        selectAllButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selectAllButton.setMargin(null);
        selectAllButton.setMaximumSize(new java.awt.Dimension(1337, 40));
        selectAllButton.setMinimumSize(new java.awt.Dimension(1337, 40));
        selectAllButton.setPreferredSize(new java.awt.Dimension(1337, 40));
        selectAllButton.setRolloverEnabled(true);
        selectAllButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        selectAllButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-hover.png"))); // NOI18N
        selectAllButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/button-selected.png"))); // NOI18N
        selectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllButtonActionPerformed(evt);
            }
        });
        add(selectAllButton);
    }// </editor-fold>//GEN-END:initComponents

    private void unselectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unselectAllButtonActionPerformed
        for(int i=0; i<filterBoxes.length; i++ ) {
            filterBoxes[i].setSelected(false);
        }
    }//GEN-LAST:event_unselectAllButtonActionPerformed

    private void selectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllButtonActionPerformed
        for(int i=0; i<filterBoxes.length; i++ ) {
            filterBoxes[i].setSelected(true);
        }
    }//GEN-LAST:event_selectAllButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton selectAllButton;
    private javax.swing.JLabel titleLable;
    private javax.swing.JButton unselectAllButton;
    // End of variables declaration//GEN-END:variables
}

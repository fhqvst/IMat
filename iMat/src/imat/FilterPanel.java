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
            case "Fisk": return ProductCategory.FISH;
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
            
            default: return ProductCategory.FISH;
        }
    }
    
    protected List<Product> getSelected() {
        List<Product> productsShown = new ArrayList<Product>();
        List<ProductCategory> productCategoriesInSearch = new ArrayList<ProductCategory>();
        for(int i = 0; i<filterBoxes.length; i++) {
            if(filterBoxes[i].isSelected()); {
                if (!productCategoriesInSearch.contains(stringToCategory(checkBoxTitles[i]))) {
                    productsShown.addAll(dataHandler.getProducts(stringToCategory(checkBoxTitles[i])));
                    productCategoriesInSearch.add(stringToCategory(checkBoxTitles[i]));
                }
            }
        }
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
        selectAllButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(180, 32767));
        setMinimumSize(new java.awt.Dimension(150, 0));
        setPreferredSize(new java.awt.Dimension(180, 434));

        titleLable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLable.setText("Title");

        jLabel1.setText("Max Kr/Kg");

        filterPanel.setBackground(new java.awt.Color(255, 255, 255));

        unselectAllButton.setLabel("Avmarkera allt");
        unselectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unselectAllButtonActionPerformed(evt);
            }
        });

        selectAllButton.setText("Återställ filtrering");
        selectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(unselectAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLable)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unselectAllButton)
                .addContainerGap())
        );
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
    private javax.swing.JPanel filterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton selectAllButton;
    private javax.swing.JLabel titleLable;
    private javax.swing.JButton unselectAllButton;
    // End of variables declaration//GEN-END:variables
}

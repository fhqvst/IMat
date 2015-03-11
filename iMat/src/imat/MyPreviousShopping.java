/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author kakan
 */
public class MyPreviousShopping extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private DefaultListModel orders;
    private DefaultListModel items;
    private DefaultListModel<String> shoppingLists = new DefaultListModel();
    private DefaultListModel<Product> listContent = new DefaultListModel();
    private HashMap<String, List<Product>> listMap = new HashMap();
    private HashMap<Product, Integer> amout = new HashMap();
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();

    /**
     * Creates new customizer MyPreviousShopping
     */
    public MyPreviousShopping() {
        initComponents();
        myStoredListsLabel.setText("<html><h2>Mina inköpslistor</h2></html>");
        myLatestShoppingsLabel.setText("<html><h2>Mina senaste köp</h2></html>");
        orders = new DefaultListModel();
        items = new DefaultListModel();
        for(int i = 0; i < dataHandler.getOrders().size(); i ++){
            orders.addElement(dataHandler.getOrders().get(i).getDate());            
        }
        ordersList.setModel(orders);
        ordersList.setSelectedIndex(0);
        addDefaultShoppingList();
        for (String s : listMap.keySet()) {
            shoppingLists.addElement(s);
        }
        shoppingListName.setModel(shoppingLists);
        
        
    }

    MyPreviousShopping(int width, int height) {
        this();
        super.setSize(width, height);
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    public void addDefaultShoppingList() {
        ArrayList<Product> someProducts = new ArrayList<>();
        for (int i = 0; i < 7; i++ ) {
            someProducts.add(dataHandler.getProduct(i));
            amout.put(dataHandler.getProduct(i), (i*4)%3);
        }
        listMap.put("Veckohandling", someProducts);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myStoredListsScrollPane = new javax.swing.JScrollPane();
        myStoredListsPanel = new javax.swing.JPanel();
        myStoredListsLabel = new javax.swing.JLabel();
        myLatestShoppingsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        jScrollPane5 = new javax.swing.JScrollPane();
        shoppingListName = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        shoppingListContains = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shoppingListToCart = new javax.swing.JButton();
        shoppingListProductsToCart = new javax.swing.JButton();
        productsToCart = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBorder(null);
        setLayout(new java.awt.GridLayout(1, 0));

        myStoredListsScrollPane.setBorder(null);
        myStoredListsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        myStoredListsScrollPane.setPreferredSize(new java.awt.Dimension(300, 400));

        myStoredListsPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        myStoredListsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myStoredListsLabel.setText("Mina inköpslistor");

        myLatestShoppingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myLatestShoppingsLabel.setText("Mina senaste köp");

        ordersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ordersListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ordersList);

        jScrollPane4.setViewportView(itemsList);

        shoppingListName.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shoppingListNameValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(shoppingListName);

        jScrollPane6.setViewportView(shoppingListContains);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Namn");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Innehåll");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("När");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Handlade produkter");

        shoppingListToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        shoppingListToCart.setToolTipText("Lägg till vald listas innehåll i varukorgen");
        shoppingListToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingListToCartActionPerformed(evt);
            }
        });

        shoppingListProductsToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        shoppingListProductsToCart.setToolTipText("Lägg till valda varor i varukorgen");
        shoppingListProductsToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingListProductsToCartActionPerformed(evt);
            }
        });

        productsToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        jButton1.setToolTipText("Lägg till valt köptillfälles innehåll i varukorgen");

        jButton2.setText("[edit]");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("[edit]");

        jButton4.setText("X");

        javax.swing.GroupLayout myStoredListsPanelLayout = new javax.swing.GroupLayout(myStoredListsPanel);
        myStoredListsPanel.setLayout(myStoredListsPanelLayout);
        myStoredListsPanelLayout.setHorizontalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(myLatestShoppingsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(myStoredListsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productsToCart)
                    .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shoppingListProductsToCart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shoppingListToCart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        myStoredListsPanelLayout.setVerticalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myStoredListsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shoppingListToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shoppingListProductsToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(myLatestShoppingsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productsToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        myStoredListsScrollPane.setViewportView(myStoredListsPanel);

        add(myStoredListsScrollPane);
    }// </editor-fold>//GEN-END:initComponents

    private void ordersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ordersListValueChanged
        
        if(orders.getSize() > 0){
            List<ShoppingItem> tempItems = ((Order)dataHandler.getOrders().get(ordersList.getSelectedIndex())).getItems();
            items.removeAllElements();
            for(int i = 0; i < tempItems.size(); i ++){
                
                items.addElement(tempItems.get(i).getProduct().getName() + ": " + tempItems.get(i).getAmount() + " " + tempItems.get(i).getProduct().getUnitSuffix());
            }
            
            itemsList.setModel(items);
        }
    }//GEN-LAST:event_ordersListValueChanged

    private void shoppingListNameValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shoppingListNameValueChanged
        listContent.removeAllElements();
        for (Product p : listMap.get(shoppingLists.get(shoppingListName.getSelectedIndex()))) {
            listContent.addElement(p);
        }
        shoppingListContains.setModel(listContent);
    }//GEN-LAST:event_shoppingListNameValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void shoppingListToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingListToCartActionPerformed
        if (shoppingListName.getSelectedIndex() >= 0) {
            Dimension d = jScrollPane6.getPreferredSize();
            Dimension e = jScrollPane6.getSize();
            for (Product p : listMap.get(shoppingLists.get(shoppingListName.getSelectedIndex()))) {
                if (p != null) {
                    boolean exists = false;
                    for(int i = 0; i < dataHandler.getShoppingCart().getItems().size(); i++){
                        ShoppingItem temp = dataHandler.getShoppingCart().getItems().get(i);
                        if(temp.getProduct() == p){
                            temp.setAmount(temp.getAmount() + amout.get(p));
                            dataHandler.getShoppingCart().fireShoppingCartChanged(temp, true);
                            exists = true;
                            break;
                        }
                    }
                    if(!exists) {
                        dataHandler.getShoppingCart().addProduct(p, amout.get(p));
                    }
                }
               
            }
            jScrollPane6.setPreferredSize(d);
            jScrollPane6.setSize(e);
        }
    }//GEN-LAST:event_shoppingListToCartActionPerformed

    private void shoppingListProductsToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingListProductsToCartActionPerformed
        if (shoppingListName.getSelectedIndex() >= 0) {
            Product p = listContent.get(shoppingListContains.getSelectedIndex());
            if (p != null) {
                boolean exists = false;
                for(int i = 0; i < dataHandler.getShoppingCart().getItems().size(); i++){
                    ShoppingItem temp = dataHandler.getShoppingCart().getItems().get(i);
                    if(temp.getProduct() == p){
                        temp.setAmount(temp.getAmount() + amout.get(p));
                        dataHandler.getShoppingCart().fireShoppingCartChanged(temp, true);
                        exists = true;
                        break;
                    }
                }
                if(!exists){
                    dataHandler.getShoppingCart().addProduct(p, amout.get(p));
                }
            }
        }
    }//GEN-LAST:event_shoppingListProductsToCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler4;
    private javax.swing.JList itemsList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel myLatestShoppingsLabel;
    private javax.swing.JLabel myStoredListsLabel;
    private javax.swing.JPanel myStoredListsPanel;
    private javax.swing.JScrollPane myStoredListsScrollPane;
    private javax.swing.JList ordersList;
    private javax.swing.JButton productsToCart;
    private javax.swing.JList shoppingListContains;
    private javax.swing.JList shoppingListName;
    private javax.swing.JButton shoppingListProductsToCart;
    private javax.swing.JButton shoppingListToCart;
    // End of variables declaration//GEN-END:variables
}

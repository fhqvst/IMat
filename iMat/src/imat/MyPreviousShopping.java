/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

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
    private IMatDataHandler dataHandler = IMatDataHandler.getInstance();

    /**
     * Creates new customizer MyPreviousShopping
     */
    public MyPreviousShopping() {
        initComponents();
        orders = new DefaultListModel();
        items = new DefaultListModel();
        for(int i = 0; i < dataHandler.getOrders().size(); i ++){
            orders.addElement(dataHandler.getOrders().get(i).getDate());
            
        }
        ordersList.setModel(orders);
        ordersList.setSelectedIndex(0);
    }

    MyPreviousShopping(int width, int height) {
        this();
        super.setSize(width, height);
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

        myStoredListsScrollPane = new javax.swing.JScrollPane();
        myStoredListsPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JList();
        cartButtonList1 = new javax.swing.JButton();
        cartButtonList2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList();

        setLayout(new java.awt.GridLayout(1, 0));

        myStoredListsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        myStoredListsScrollPane.setPreferredSize(new java.awt.Dimension(0, 0));

        myStoredListsPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel55.setText("Mina inköpslistor");

        jButton21.setText("+");

        jButton25.setText("Veckohandel");

        jButton27.setText("+");

        jButton28.setText("Middagsbjudning");

        jToggleButton4.setText("auto");
        jToggleButton4.setToolTipText("Lägg till som autoköp");

        jToggleButton5.setText("auto");
        jToggleButton5.setToolTipText("Lägg till som autoköp");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel54.setText("auto");

        jLabel56.setText("autoköp");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel57.setText("Mina senaste köp");

        ordersList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ordersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ordersListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ordersList);

        cartButtonList1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        cartButtonList1.setBorderPainted(false);
        cartButtonList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cartButtonList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonList1ActionPerformed(evt);
            }
        });

        cartButtonList2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        cartButtonList2.setBorderPainted(false);
        cartButtonList2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cartButtonList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonList2ActionPerformed(evt);
            }
        });

        itemsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(itemsList);

        javax.swing.GroupLayout myStoredListsPanelLayout = new javax.swing.GroupLayout(myStoredListsPanel);
        myStoredListsPanel.setLayout(myStoredListsPanelLayout);
        myStoredListsPanelLayout.setHorizontalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addComponent(jButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28))
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addComponent(jButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25))
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartButtonList2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cartButtonList1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myStoredListsPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton4))))
                    .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 158, Short.MAX_VALUE))
        );
        myStoredListsPanelLayout.setVerticalGroup(
            myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myStoredListsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton21)
                        .addComponent(jButton25))
                    .addComponent(cartButtonList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27)
                        .addComponent(jButton28))
                    .addComponent(cartButtonList2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myStoredListsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myStoredListsScrollPane.setViewportView(myStoredListsPanel);

        add(myStoredListsScrollPane);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void cartButtonList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonList1ActionPerformed

    private void cartButtonList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonList2ActionPerformed

    }//GEN-LAST:event_cartButtonList2ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartButtonList1;
    private javax.swing.JButton cartButtonList2;
    private javax.swing.JList itemsList;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JPanel myStoredListsPanel;
    private javax.swing.JScrollPane myStoredListsScrollPane;
    private javax.swing.JList ordersList;
    // End of variables declaration//GEN-END:variables
}

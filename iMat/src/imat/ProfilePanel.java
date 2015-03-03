/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.BorderLayout;

/**
 *
 * @author kakan
 */
public class ProfilePanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer ProfilePanel
     */
    public ProfilePanel() {
        initComponents();
        this.add(new ReminderAndStoredInformation(), BorderLayout.WEST);
        this.add(new MyPreviousShopping(), BorderLayout.CENTER);
        this.add(new MyPreferenses(), BorderLayout.EAST);
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

        myPreferenses = new javax.swing.JPanel();
        myFavouritesScrollPane = new javax.swing.JScrollPane();
        myFavouritesPanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        myIgnoresScrollPane = new javax.swing.JScrollPane();
        myIgnoresPanel = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();

        setLayout(new java.awt.BorderLayout());

        myPreferenses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myPreferenses.setPreferredSize(new java.awt.Dimension(301, 505));
        myPreferenses.setLayout(new java.awt.GridLayout(2, 0));

        myFavouritesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel58.setText("Mina favoriter");

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout myFavouritesPanelLayout = new javax.swing.GroupLayout(myFavouritesPanel);
        myFavouritesPanel.setLayout(myFavouritesPanelLayout);
        myFavouritesPanelLayout.setHorizontalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addContainerGap(640, Short.MAX_VALUE))
        );
        myFavouritesPanelLayout.setVerticalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        myFavouritesScrollPane.setViewportView(myFavouritesPanel);

        myPreferenses.add(myFavouritesScrollPane);

        myIgnoresScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel59.setText("Mina borttagna varor");

        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        javax.swing.GroupLayout myIgnoresPanelLayout = new javax.swing.GroupLayout(myIgnoresPanel);
        myIgnoresPanel.setLayout(myIgnoresPanelLayout);
        myIgnoresPanelLayout.setHorizontalGroup(
            myIgnoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myIgnoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myIgnoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addContainerGap(637, Short.MAX_VALUE))
        );
        myIgnoresPanelLayout.setVerticalGroup(
            myIgnoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myIgnoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        myIgnoresScrollPane.setViewportView(myIgnoresPanel);

        myPreferenses.add(myIgnoresScrollPane);

        add(myPreferenses, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel myFavouritesPanel;
    private javax.swing.JScrollPane myFavouritesScrollPane;
    private javax.swing.JPanel myIgnoresPanel;
    private javax.swing.JScrollPane myIgnoresScrollPane;
    private javax.swing.JPanel myPreferenses;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author kakan
 */
public class MyPreferenses extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer MyPreferenses
     */
    public MyPreferenses() {
        initComponents();
    }

    MyPreferenses(int width, int height) {
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

        myPreferenses = new javax.swing.JPanel();
        myFavouritesPanel = new javax.swing.JPanel();
        myFavoritesLabel = new javax.swing.JLabel();
        myFavouritesScrollPane = new javax.swing.JScrollPane();
        myFavouritesList = new javax.swing.JList();
        myIgnoresLabel = new javax.swing.JLabel();
        myIgnoresScrollPane = new javax.swing.JScrollPane();
        myIgnoresList = new javax.swing.JList();

        setLayout(new java.awt.GridLayout(1, 0));

        myPreferenses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myPreferenses.setPreferredSize(new java.awt.Dimension(301, 505));
        myPreferenses.setLayout(new java.awt.GridLayout(1, 0));

        myFavoritesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myFavoritesLabel.setText("Mina favoriter");

        myFavouritesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        myFavouritesScrollPane.setViewportView(myFavouritesList);

        myIgnoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myIgnoresLabel.setText("Mina borttagna varor");

        myIgnoresList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        myIgnoresScrollPane.setViewportView(myIgnoresList);

        javax.swing.GroupLayout myFavouritesPanelLayout = new javax.swing.GroupLayout(myFavouritesPanel);
        myFavouritesPanel.setLayout(myFavouritesPanelLayout);
        myFavouritesPanelLayout.setHorizontalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myIgnoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(myFavouritesScrollPane)
                    .addComponent(myFavoritesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myIgnoresScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        myFavouritesPanelLayout.setVerticalGroup(
            myFavouritesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFavouritesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myFavoritesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myFavouritesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myIgnoresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myIgnoresScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myPreferenses.add(myFavouritesPanel);

        add(myPreferenses);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel myFavoritesLabel;
    private javax.swing.JList myFavouritesList;
    private javax.swing.JPanel myFavouritesPanel;
    private javax.swing.JScrollPane myFavouritesScrollPane;
    private javax.swing.JLabel myIgnoresLabel;
    private javax.swing.JList myIgnoresList;
    private javax.swing.JScrollPane myIgnoresScrollPane;
    private javax.swing.JPanel myPreferenses;
    // End of variables declaration//GEN-END:variables
}

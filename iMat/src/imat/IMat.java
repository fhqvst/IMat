package imat;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.UIManager;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class IMat extends javax.swing.JFrame implements ShoppingCartListener {
    
    public static IMatDataHandler dataHandler = IMatDataHandler.getInstance();
    
    private ProductCategoryPanel productCategoryPanel;

    /**
     * Creates new form IMat
     */
    public IMat() {
        initComponents();
        
        
        //Saves data when application is terminated
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                    dataHandler.shutDown();
            }
        }));
        
        dataHandler.getShoppingCart().addShoppingCartListener(this);
        updateCartLabels();
        homeButton.requestFocus();
      
        /*
        Map<String, ProductCategoryPanel> productCategoryPanels = new TreeMap<String, ProductCategoryPanel>();
        
        productCategoryPanels.put("meatFishPanel", new ProductCategoryPanel(ProductCategory.MEAT, ProductCategory.FISH));
        productCategoryPanels.put("freezerPanel", new ProductCategoryPanel(ProductCategory.POD));
        productCategoryPanels.put("dairyPanel", new ProductCategoryPanel(ProductCategory.DAIRIES));
        productCategoryPanels.put("fruitVegetablesPanel", new ProductCategoryPanel(ProductCategory.BERRY, ProductCategory.CABBAGE, ProductCategory.CITRUS_FRUIT));
        productCategoryPanels.put("pantryPanel", new ProductCategoryPanel(ProductCategory.PASTA, ProductCategory.FLOUR_SUGAR_SALT));
        productCategoryPanels.put("candySnacksPanel", new ProductCategoryPanel(ProductCategory.SWEET));
       
        for(Map.Entry<String, ProductCategoryPanel> entry : productCategoryPanels.entrySet()) {
            this.cardPanel.add(entry.getValue(), entry.getKey());
        }
        */
        
        this.productCategoryPanel = new ProductCategoryPanel();

        
        FilterFactory.createFilterCards();
                
        this.cardPanel.add(this.productCategoryPanel, "productCategoryPanel");
        this.cardPanel.add(new ProfilePanel(), "profilePanel");
        this.cardPanel.add(new HintsPanel(), "hintsPanel");
        this.cardPanel.add(new RecipePanel(), "recipePanel");
        this.cardPanel.add(new WelcomePanel(), "welcomePanel");
        this.cardPanel.add(new CheckoutPanel(), "checkoutPanel");
        
        showCard("welcomePanel");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        headerPanel = new javax.swing.JPanel();
        logotype = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        tipsButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        checkoutButton = new javax.swing.JButton();
        navigationPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        recipeButton = new javax.swing.JButton();
        meatFishButton = new javax.swing.JButton();
        freezerButton = new javax.swing.JButton();
        dairyButton = new javax.swing.JButton();
        fruitVegetablesButton = new javax.swing.JButton();
        pantryButton = new javax.swing.JButton();
        candySnacksButton = new javax.swing.JButton();
        favouriteButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        cartAndListsPanel = new javax.swing.JPanel();
        cartPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cartButton = new javax.swing.JButton();
        cartAmountLabel = new javax.swing.JLabel();
        cartPriceLabel = new javax.swing.JLabel();
        listsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(2147483647, 2147483647));

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMat");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1260, 800));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        headerPanel.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        headerPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        headerPanel.setPreferredSize(new java.awt.Dimension(0, 80));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.LINE_AXIS));

        logotype.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logotype.setText("iMat");
        headerPanel.add(logotype);
        headerPanel.add(filler2);

        searchTextField.setText("Sök produkt...");
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        headerPanel.add(searchTextField);

        searchButton.setText("Sök");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchButton.setMaximumSize(new java.awt.Dimension(75, 40));
        searchButton.setMinimumSize(new java.awt.Dimension(75, 40));
        searchButton.setPreferredSize(new java.awt.Dimension(75, 40));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        headerPanel.add(searchButton);
        headerPanel.add(filler3);

        tipsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/info.png"))); // NOI18N
        tipsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipsButton.setMaximumSize(new java.awt.Dimension(64, 40));
        tipsButton.setMinimumSize(new java.awt.Dimension(64, 40));
        tipsButton.setPreferredSize(new java.awt.Dimension(64, 40));
        tipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsButtonActionPerformed(evt);
            }
        });
        headerPanel.add(tipsButton);

        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/person.png"))); // NOI18N
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton.setMaximumSize(new java.awt.Dimension(64, 40));
        profileButton.setMinimumSize(new java.awt.Dimension(64, 40));
        profileButton.setPreferredSize(new java.awt.Dimension(64, 40));
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        headerPanel.add(profileButton);
        headerPanel.add(filler4);

        checkoutButton.setBackground(new java.awt.Color(204, 255, 102));
        checkoutButton.setText("Till kassan");
        checkoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkoutButton.setMaximumSize(new java.awt.Dimension(112, 40));
        checkoutButton.setMinimumSize(new java.awt.Dimension(112, 40));
        checkoutButton.setPreferredSize(new java.awt.Dimension(112, 40));
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });
        headerPanel.add(checkoutButton);

        getContentPane().add(headerPanel);

        navigationPanel.setBackground(new java.awt.Color(255, 255, 255));
        navigationPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(200, 200, 200)), javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20)));
        navigationPanel.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        navigationPanel.setLayout(new javax.swing.BoxLayout(navigationPanel, javax.swing.BoxLayout.LINE_AXIS));

        homeButton.setText("Hem");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(homeButton);

        recipeButton.setText("Recept");
        recipeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(recipeButton);

        meatFishButton.setText("Kött & Fisk");
        meatFishButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        meatFishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatFishButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(meatFishButton);

        freezerButton.setText("Frysvaror");
        freezerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        freezerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freezerButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(freezerButton);

        dairyButton.setText("Mejeri");
        dairyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dairyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(dairyButton);

        fruitVegetablesButton.setText("Frukt & Grönt");
        fruitVegetablesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fruitVegetablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitVegetablesButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(fruitVegetablesButton);

        pantryButton.setText("Skafferi");
        pantryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pantryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantryButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(pantryButton);

        candySnacksButton.setText("Godis & Snacks");
        candySnacksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        candySnacksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candySnacksButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(candySnacksButton);

        favouriteButton.setText("Favoriter");
        favouriteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        favouriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(favouriteButton);

        getContentPane().add(navigationPanel);

        contentPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        contentPanel.setPreferredSize(new java.awt.Dimension(80, 0));
        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.X_AXIS));

        cardPanel.setLayout(new java.awt.CardLayout());
        contentPanel.add(cardPanel);

        cartAndListsPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartAndListsPanel.setMaximumSize(new java.awt.Dimension(80, 2147483647));
        cartAndListsPanel.setMinimumSize(new java.awt.Dimension(70, 0));
        cartAndListsPanel.setPreferredSize(new java.awt.Dimension(80, 0));
        cartAndListsPanel.setLayout(new javax.swing.BoxLayout(cartAndListsPanel, javax.swing.BoxLayout.Y_AXIS));

        cartPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartPanel.setMaximumSize(new java.awt.Dimension(80, 2147483647));
        cartPanel.setMinimumSize(new java.awt.Dimension(0, 200));
        cartPanel.setLayout(new javax.swing.BoxLayout(cartPanel, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Varukorg");
        jLabel4.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(null);
        cartPanel.add(jLabel4);

        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/basket.png"))); // NOI18N
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cartPanel.add(cartButton);

        cartAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartAmountLabel.setText("Varor: 0");
        cartAmountLabel.setMaximumSize(new java.awt.Dimension(80, 20));
        cartAmountLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        cartPanel.add(cartAmountLabel);

        cartPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartPriceLabel.setText(" 0 kr");
        cartPriceLabel.setMaximumSize(new java.awt.Dimension(80, 20));
        cartPriceLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        cartPanel.add(cartPriceLabel);

        cartAndListsPanel.add(cartPanel);

        listsPanel.setBackground(new java.awt.Color(255, 255, 255));
        listsPanel.setMaximumSize(new java.awt.Dimension(80, 2147483647));
        listsPanel.setPreferredSize(new java.awt.Dimension(80, 389));
        listsPanel.setLayout(new javax.swing.BoxLayout(listsPanel, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/lists.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 48));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setPreferredSize(null);
        listsPanel.add(jLabel1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Listor");
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setPreferredSize(null);
        listsPanel.add(jLabel5);

        cartAndListsPanel.add(listsPanel);

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        cartAndListsPanel.add(filler1);

        contentPanel.add(cartAndListsPanel);

        getContentPane().add(contentPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ProductCategoryPanel getProductCategoryPanel(){
        return productCategoryPanel;
    }
    
    public void updateCartLabels(){
        cartAmountLabel.setText(dataHandler.getShoppingCart().getItems().size() + " varor");
        cartPriceLabel.setText(Math.round(dataHandler.getShoppingCart().getTotal()) + " kr");
    }
    
    public void showCard(String cardName) {
        CardLayout cards = (CardLayout) cardPanel.getLayout();
        cards.show(cardPanel, cardName);
    }
    
    public void changeFilter(FilterPanel filterCard) {
        this.productCategoryPanel.applyFilters(filterCard);
        showCard("productCategoryPanel");
    }
    
    private void candySnacksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candySnacksButtonActionPerformed
       changeFilter(FilterFactory.sweetsFilterCard);
    }//GEN-LAST:event_candySnacksButtonActionPerformed

    private void pantryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantryButtonActionPerformed
       changeFilter(FilterFactory.pantryFilterCard);
    }//GEN-LAST:event_pantryButtonActionPerformed

    private void fruitVegetablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitVegetablesButtonActionPerformed
        changeFilter(FilterFactory.veggieAndFruitsFilterCard);
    }//GEN-LAST:event_fruitVegetablesButtonActionPerformed

    private void dairyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairyButtonActionPerformed
        changeFilter(FilterFactory.dairyFilterCard);
    }//GEN-LAST:event_dairyButtonActionPerformed

    private void freezerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freezerButtonActionPerformed
        changeFilter(FilterFactory.freezerFilterCard);
    }//GEN-LAST:event_freezerButtonActionPerformed

    private void meatFishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatFishButtonActionPerformed
        changeFilter(FilterFactory.meatAndFishFilterCard);
    }//GEN-LAST:event_meatFishButtonActionPerformed

    private void recipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeButtonActionPerformed
        showCard("recipePanel");
    }//GEN-LAST:event_recipeButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        showCard("welcomePanel");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
       showCard("profilePanel");
    }//GEN-LAST:event_profileButtonActionPerformed

    private void tipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsButtonActionPerformed
        showCard("hintsPanel");
    }//GEN-LAST:event_tipsButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed

        showCard("checkoutPanel");
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if(searchTextField.getText().equals("Sök produkt...")){
            searchTextField.setText("");
        }else{
            searchTextField.selectAll();
        }
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if(searchTextField.getText().equals("")){
            searchTextField.setText("Sök produkt...");
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        this.productCategoryPanel.displayProducts(dataHandler.findProducts(searchTextField.getText()));
        showCard("productCategoryPanel");
    }//GEN-LAST:event_searchButtonActionPerformed

    private void favouriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteButtonActionPerformed
        this.productCategoryPanel.displayProducts(dataHandler.favorites());
        showCard("productCategoryPanel");
    }//GEN-LAST:event_favouriteButtonActionPerformed

    @Override
    public void shoppingCartChanged(CartEvent ce) {
        updateCartLabels();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Aqua".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        UIManager.getLookAndFeelDefaults()
        .put("defaultFont", new Font("Helvetica Neue", Font.PLAIN, 13));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton candySnacksButton;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel cartAmountLabel;
    private javax.swing.JPanel cartAndListsPanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel cartPriceLabel;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton dairyButton;
    private javax.swing.JButton favouriteButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton freezerButton;
    private javax.swing.JButton fruitVegetablesButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel listsPanel;
    private javax.swing.JLabel logotype;
    private javax.swing.JButton meatFishButton;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JButton pantryButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton recipeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton tipsButton;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;

/**
 *
 * @author kakan
 */
public class HintsPanel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private final int NUMBER_OF_HINTS = 37;
    private int currentHintNbr;

    /**
     * Creates new customizer HintsPanel
     */
    public HintsPanel() {
        initComponents();
        forumButton.setText("<html><font color='blue'><u>forum</u></font></html>");
        contactUsButton.setText("<html><font color='blue'><u>kontakta oss!</u></font></html>");
        changeToHint(13);
        manualTextArea.setText("Mitt första köp:\n\n" + getDummyText() + "\n\nAtt lägga till favoriter:\n\n" + getDummyText());
        currentHintScrollPane.setPreferredSize(new Dimension(800, 600));
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    private void changeToHint(int changeNumber) {
        if (1 <= changeNumber && changeNumber <= NUMBER_OF_HINTS) {
            hintsHeaderLabel.setText("<html><h2>Tips " + changeNumber + "/" + NUMBER_OF_HINTS + "</html></h2>");
            currentHintTextField.setText(String.valueOf(changeNumber));
            
            System.out.println(changeNumber);
            if (changeNumber < 6) {
                leftDotsLabel.setVisible(false);
                if (changeNumber < 5) {
                    minusTwoButton.setVisible(false);
                    if (changeNumber < 4) {
                        minusOneButton.setVisible(false);
                        if (changeNumber < 3) {
                            secondButton.setVisible(false);
                            if (changeNumber < 2) {
                                firstButton.setVisible(false);
                            } else {
                                firstButton.setVisible(true);
                            }
                        } else {
                            secondButton.setVisible(true);
                        }
                    } else {
                        minusOneButton.setVisible(true);
                    }
                } else {
                  minusTwoButton.setVisible(true);
                }
            } else {
                leftDotsLabel.setVisible(true);
            }
            
            if (changeNumber > NUMBER_OF_HINTS-5) {
                rightDotsLabel.setVisible(false);
                if (changeNumber > NUMBER_OF_HINTS-4){
                    plusTwoButton.setVisible(false);
                    if (changeNumber > NUMBER_OF_HINTS-3) {
                        plusOneButton.setVisible(false);
                        if (changeNumber > NUMBER_OF_HINTS-2) {
                            secondLastButton.setVisible(false);
                            if (changeNumber > NUMBER_OF_HINTS-1){
                                lastButton.setVisible(false);
                            } else {
                                lastButton.setVisible(true);
                            }
                        } else {
                            secondLastButton.setVisible(true);
                        }
                    } else {
                        plusOneButton.setVisible(true);
                    }
                } else {
                    plusTwoButton.setVisible(true);
                }
            } else {
                rightDotsLabel.setVisible(true);
            }
            
            
            if (2 < changeNumber) {
                minusOneButton.setText(String.valueOf(changeNumber-1));
                minusTwoButton.setText(String.valueOf(changeNumber-2));
            } else {
                 minusOneButton.setText(String.valueOf(2));
                 minusTwoButton.setText(String.valueOf(1));
            }
            
            if(changeNumber < NUMBER_OF_HINTS-1) {
                plusOneButton.setText(String.valueOf(changeNumber+1));
                plusTwoButton.setText(String.valueOf(changeNumber+2));
            } else {
                plusOneButton.setText(String.valueOf(NUMBER_OF_HINTS-1));
                plusTwoButton.setText(String.valueOf(NUMBER_OF_HINTS));
            }
            if (currentHintNbr != changeNumber) {
                currentHintNbr = changeNumber;
                currentHintTextArea.setText(getDummyText());
            }
            
        }
        
        Component[] allComponents = hintsNavigationPanel.getComponents();
        for (Component c: allComponents) {
            if (c instanceof AbstractButton) {
                AbstractButton button = (AbstractButton)c;
                button.setPreferredSize(new Dimension(60, 25));
                // button.setBorderPainted(false);
                //button.setContentAreaFilled(false);
            }
        }
        currentHintTextField.setPreferredSize(new Dimension(60, 25));
        this.revalidate();
        this.repaint();
        
    }
    
    public String getDummyText() {
        String dummyText = "";
        boolean startOfSentence = true;
        Random r = new Random();
        for (int i = 0; i < 5000; i++) {
            if (i%20 == 19 && r.nextInt(3) == 0 && !startOfSentence) {
                dummyText += ". ";
                startOfSentence = true;
            } else if (i%7 == 6 && r.nextInt(2) == 0 && !startOfSentence) {
                dummyText += " ";
            }
            else {
                if (startOfSentence) {
                    dummyText += String.valueOf((char)(r.nextInt((122 - 97) + 1) + 97)).toUpperCase();
                    startOfSentence = false;
                } else {
                    dummyText += String.valueOf((char)(r.nextInt((122 - 97) + 1) + 97)).toLowerCase();
                }
            }
        }
        return dummyText;
    }
    
    private void changeCurrentHintToButtonText(AbstractButton button) {
        changeToHint(Integer.parseInt(button.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintsButtonGroup = new javax.swing.ButtonGroup();
        currentTipsPanel = new javax.swing.JPanel();
        hintsHeaderLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        currentHintScrollPane = new javax.swing.JScrollPane();
        currentHintTextArea = new javax.swing.JTextArea();
        hintsNavigationPanel = new javax.swing.JPanel();
        previousButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        secondButton = new javax.swing.JButton();
        leftDotsLabel = new javax.swing.JLabel();
        minusTwoButton = new javax.swing.JButton();
        minusOneButton = new javax.swing.JButton();
        currentHintTextField = new javax.swing.JTextField();
        plusOneButton = new javax.swing.JButton();
        plusTwoButton = new javax.swing.JButton();
        rightDotsLabel = new javax.swing.JLabel();
        secondLastButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        needHelpLabel = new javax.swing.JLabel();
        findHelpPanel = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        forumButton = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        contactUsButton = new javax.swing.JButton();
        manualPanel = new javax.swing.JPanel();
        manualLabel = new javax.swing.JLabel();
        manualScrollPane = new javax.swing.JScrollPane();
        manualTextArea = new javax.swing.JTextArea();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        hintsHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintsHeaderLabel.setText("Tips 13/37");

        currentHintScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        currentHintTextArea.setColumns(20);
        currentHintTextArea.setLineWrap(true);
        currentHintTextArea.setRows(5);
        currentHintTextArea.setWrapStyleWord(true);
        currentHintTextArea.setAutoscrolls(false);
        currentHintTextArea.setFocusable(false);
        currentHintScrollPane.setViewportView(currentHintTextArea);

        previousButton.setText("<<");
        hintsButtonGroup.add(previousButton);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(previousButton);

        firstButton.setText("1");
        hintsButtonGroup.add(firstButton);
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(firstButton);

        secondButton.setText("2");
        hintsButtonGroup.add(secondButton);
        secondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(secondButton);

        leftDotsLabel.setText(". . .");
        hintsNavigationPanel.add(leftDotsLabel);

        minusTwoButton.setText("11");
        minusTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTwoButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(minusTwoButton);

        minusOneButton.setText("12");
        hintsButtonGroup.add(minusOneButton);
        minusOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusOneButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(minusOneButton);

        currentHintTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentHintTextField.setText("13");
        currentHintTextField.setMaximumSize(new java.awt.Dimension(28, 29));
        currentHintTextField.setMinimumSize(new java.awt.Dimension(28, 29));
        currentHintTextField.setPreferredSize(new java.awt.Dimension(28, 29));
        currentHintTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentHintTextFieldActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(currentHintTextField);

        plusOneButton.setText("14");
        hintsButtonGroup.add(plusOneButton);
        plusOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOneButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(plusOneButton);

        plusTwoButton.setText("15");
        plusTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusTwoButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(plusTwoButton);

        rightDotsLabel.setText(". . .");
        hintsNavigationPanel.add(rightDotsLabel);

        secondLastButton.setText("36");
        hintsButtonGroup.add(secondLastButton);
        secondLastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondLastButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(secondLastButton);

        lastButton.setText("37");
        hintsButtonGroup.add(lastButton);
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(lastButton);

        nextButton.setText(">>");
        hintsButtonGroup.add(nextButton);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        hintsNavigationPanel.add(nextButton);

        needHelpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        needHelpLabel.setText("Behöver du hjälp?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hintsNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addComponent(currentHintScrollPane))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(needHelpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(currentHintScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hintsNavigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(needHelpLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel65.setText("Besök vårt");
        findHelpPanel.add(jLabel65);

        forumButton.setText("forum");
        forumButton.setBorderPainted(false);
        forumButton.setContentAreaFilled(false);
        findHelpPanel.add(forumButton);

        jLabel66.setText("eller");
        findHelpPanel.add(jLabel66);

        contactUsButton.setText("kontakta oss");
        contactUsButton.setBorderPainted(false);
        contactUsButton.setContentAreaFilled(false);
        findHelpPanel.add(contactUsButton);

        manualLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manualLabel.setText("Manual");

        manualScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        manualScrollPane.setToolTipText("");

        manualTextArea.setColumns(20);
        manualTextArea.setLineWrap(true);
        manualTextArea.setRows(5);
        manualTextArea.setText("\n");
        manualTextArea.setToolTipText("");
        manualTextArea.setWrapStyleWord(true);
        manualTextArea.setFocusable(false);
        manualTextArea.setMaximumSize(new java.awt.Dimension(200, 204));
        manualTextArea.setMinimumSize(new java.awt.Dimension(200, 204));
        manualTextArea.setPreferredSize(new java.awt.Dimension(200, 204));
        manualScrollPane.setViewportView(manualTextArea);

        javax.swing.GroupLayout manualPanelLayout = new javax.swing.GroupLayout(manualPanel);
        manualPanel.setLayout(manualPanelLayout);
        manualPanelLayout.setHorizontalGroup(
            manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manualScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
            .addComponent(manualLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manualPanelLayout.setVerticalGroup(
            manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manualLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualScrollPane))
        );

        javax.swing.GroupLayout currentTipsPanelLayout = new javax.swing.GroupLayout(currentTipsPanel);
        currentTipsPanel.setLayout(currentTipsPanelLayout);
        currentTipsPanelLayout.setHorizontalGroup(
            currentTipsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentTipsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentTipsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hintsHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(findHelpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        currentTipsPanelLayout.setVerticalGroup(
            currentTipsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentTipsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hintsHeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findHelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(currentTipsPanelLayout.createSequentialGroup()
                .addComponent(manualPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(currentTipsPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void currentHintTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentHintTextFieldActionPerformed
        Pattern ALLOWED_HINT_NUMBER = Pattern.compile("^\\d{0,2}$");
        Matcher m = ALLOWED_HINT_NUMBER.matcher(currentHintTextField.getText());
        if (m.find()) {
            int showHintNbr;
            if (currentHintTextField.getText().equals("")) {
                showHintNbr = 1;
            } else {
                showHintNbr = Integer.parseInt(currentHintTextField.getText());
            }
            if (showHintNbr <= NUMBER_OF_HINTS) {
                changeToHint(showHintNbr);
            } else {
                currentHintTextField.setText(String.valueOf(currentHintNbr));
            }
        } else {
            currentHintTextField.setText(String.valueOf(currentHintNbr));
        }
    }//GEN-LAST:event_currentHintTextFieldActionPerformed
    
    private void minusOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusOneButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_minusOneButtonActionPerformed

    private void plusOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOneButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_plusOneButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_firstButtonActionPerformed

    private void secondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_secondButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_lastButtonActionPerformed

    private void secondLastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondLastButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_secondLastButtonActionPerformed

    private void minusTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTwoButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_minusTwoButtonActionPerformed

    private void plusTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTwoButtonActionPerformed
        changeCurrentHintToButtonText((AbstractButton)evt.getSource());
    }//GEN-LAST:event_plusTwoButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        changeToHint(currentHintNbr-1);
    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        changeToHint(currentHintNbr+1);
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactUsButton;
    private javax.swing.JScrollPane currentHintScrollPane;
    private javax.swing.JTextArea currentHintTextArea;
    private javax.swing.JTextField currentHintTextField;
    private javax.swing.JPanel currentTipsPanel;
    private javax.swing.JPanel findHelpPanel;
    private javax.swing.JButton firstButton;
    private javax.swing.JButton forumButton;
    private javax.swing.ButtonGroup hintsButtonGroup;
    private javax.swing.JLabel hintsHeaderLabel;
    private javax.swing.JPanel hintsNavigationPanel;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lastButton;
    private javax.swing.JLabel leftDotsLabel;
    private javax.swing.JLabel manualLabel;
    private javax.swing.JPanel manualPanel;
    private javax.swing.JScrollPane manualScrollPane;
    private javax.swing.JTextArea manualTextArea;
    private javax.swing.JButton minusOneButton;
    private javax.swing.JButton minusTwoButton;
    private javax.swing.JLabel needHelpLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton plusOneButton;
    private javax.swing.JButton plusTwoButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel rightDotsLabel;
    private javax.swing.JButton secondButton;
    private javax.swing.JButton secondLastButton;
    // End of variables declaration//GEN-END:variables


}
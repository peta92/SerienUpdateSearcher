/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updater;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Alessandro
 */
public class UpdaterGUI extends javax.swing.JFrame {

    private final InputReader reader;
    private List<Episode> episodeList;
    private List<String> alreadyDownloadedList;
    private final File serieListFile;
    private final File alreadyDownloadedFile;
    private final Controller controller;

    /**
     * Creates new form UpdaterGUI
     *
     * @throws java.io.IOException
     */
    public UpdaterGUI() throws IOException {

        reader = new InputReader();
        controller = Controller.getInstance();
        serieListFile = new File("serienFile.txt");
        alreadyDownloadedFile = new File("alreadyDownloaded.txt");
        initComponents();
        alreadyDownloadedList = controller.readAlreadyDownloadedFile(alreadyDownloadedFile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modifierFrame = new javax.swing.JFrame();
        addSerieField = new javax.swing.JTextField();
        addSerieButton = new javax.swing.JButton();
        deleteSerieButton = new javax.swing.JButton();
        saveSerieListButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        serieList = new javax.swing.JList();
        closeModifierButton = new javax.swing.JButton();
        serienUpdaterPanel = new javax.swing.JPanel();
        modifySerieButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EpisodeTable = new javax.swing.JTable();
        jLabelCount = new javax.swing.JLabel();

        modifierFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        modifierFrame.setTitle("Modify your series");
        modifierFrame.setMinimumSize(new java.awt.Dimension(260, 310));
        modifierFrame.setResizable(false);

        addSerieField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addSerieFieldKeyReleased(evt);
            }
        });

        addSerieButton.setText("Add");
        addSerieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSerieButtonActionPerformed(evt);
            }
        });

        deleteSerieButton.setText("Delete");
        deleteSerieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSerieButtonActionPerformed(evt);
            }
        });

        saveSerieListButton.setText("Save");
        saveSerieListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSerieListButtonActionPerformed(evt);
            }
        });

        serieListModel = new DefaultListModel();
        serieList.setModel(serieListModel);
        jScrollPane2.setViewportView(serieList);

        closeModifierButton.setText("Close");
        closeModifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeModifierButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifierFrameLayout = new javax.swing.GroupLayout(modifierFrame.getContentPane());
        modifierFrame.getContentPane().setLayout(modifierFrameLayout);
        modifierFrameLayout.setHorizontalGroup(
            modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifierFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSerieField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSerieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteSerieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveSerieListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeModifierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        modifierFrameLayout.setVerticalGroup(
            modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifierFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSerieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSerieButton))
                .addGap(18, 18, 18)
                .addGroup(modifierFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifierFrameLayout.createSequentialGroup()
                        .addComponent(deleteSerieButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveSerieListButton)
                        .addGap(11, 11, 11)
                        .addComponent(closeModifierButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        modifySerieButton.setText("Modify your Series");
        modifySerieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifySerieButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        model = new DefaultTableModel();
        EpisodeTable.setModel(model);
        model.addColumn("Langage");
        model.addColumn("Serie");
        model.addColumn("Episode");
        model.addColumn("Episodenname");
        EpisodeTable.setToolTipText("");
        EpisodeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        EpisodeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(EpisodeTable);
        EpisodeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout serienUpdaterPanelLayout = new javax.swing.GroupLayout(serienUpdaterPanel);
        serienUpdaterPanel.setLayout(serienUpdaterPanelLayout);
        serienUpdaterPanelLayout.setHorizontalGroup(
            serienUpdaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serienUpdaterPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(serienUpdaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(serienUpdaterPanelLayout.createSequentialGroup()
                        .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 751, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(serienUpdaterPanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(modifySerieButton)
                .addGap(73, 73, 73)
                .addComponent(startButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        serienUpdaterPanelLayout.setVerticalGroup(
            serienUpdaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serienUpdaterPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(serienUpdaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifySerieButton)
                    .addComponent(startButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serienUpdaterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serienUpdaterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {

            XMLParser.getInstance().readXML(reader.readInput(serieListFile));
            episodeList = XMLParser.getInstance().getXMLResult();
            alreadyDownloadedList = controller.readAlreadyDownloadedFile(alreadyDownloadedFile);
            clearTable();
            addToTable();

        } catch (ParserConfigurationException | IOException | SAXException ex) {
            Logger.getLogger(UpdaterGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void modifySerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifySerieButtonActionPerformed
        if (!serieListModel.isEmpty()) {
            serieListModel.clear();
        }

        modifySerieButton.setEnabled(false);
        modifierFrame.setVisible(true);
        try {
            for (String serie : reader.readInput(serieListFile)) {
                serie = controller.changeToUpperCase(serie);
                serieListModel.addElement(serie);
            }
        } catch (IOException ex) {
            Logger.getLogger(UpdaterGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_modifySerieButtonActionPerformed

    private void addSerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSerieButtonActionPerformed
        addToSerieField();
    }//GEN-LAST:event_addSerieButtonActionPerformed

    private void deleteSerieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSerieButtonActionPerformed
        if (!serieList.isSelectionEmpty()) {
            serieListModel.removeElement(serieList.getSelectedValue());
        } else {

            JOptionPane.showMessageDialog(null, "Select something!", "Nothing selected", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteSerieButtonActionPerformed

    private void saveSerieListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSerieListButtonActionPerformed
        OutputWriter writer = new OutputWriter();
        List<String> series = new ArrayList<>();
        for (int listPosition = 0; listPosition < serieListModel.size(); listPosition++) {
            series.add((String) serieListModel.elementAt(listPosition));
        }
        Collections.sort(series);
        try {
            writer.writeToFile(serieListFile, series);
        } catch (IOException ex) {
            Logger.getLogger(UpdaterGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        addSerieField.setText("");
        modifySerieButton.setEnabled(true);
        modifierFrame.setVisible(false);
    }//GEN-LAST:event_saveSerieListButtonActionPerformed

    private void addSerieFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addSerieFieldKeyReleased
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            addToSerieField();
        }
    }//GEN-LAST:event_addSerieFieldKeyReleased

    private void closeModifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeModifierButtonActionPerformed
        modifierFrame.setVisible(false);
        modifySerieButton.setEnabled(true);
    }//GEN-LAST:event_closeModifierButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EpisodeTable;
    private DefaultTableModel model;
    private javax.swing.JButton addSerieButton;
    private javax.swing.JTextField addSerieField;
    private javax.swing.JButton closeModifierButton;
    private javax.swing.JButton deleteSerieButton;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFrame modifierFrame;
    private javax.swing.JButton modifySerieButton;
    private javax.swing.JButton saveSerieListButton;
    private javax.swing.JList serieList;
    private DefaultListModel serieListModel;
    private javax.swing.JPanel serienUpdaterPanel;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    private void clearTable() {
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        setJLabelCount();
    }

    private void addToSerieField() {
        if (!addSerieField.getText().isEmpty()) {
            if (!serieListModel.contains(controller.changeToUpperCase(addSerieField.getText()))) {
                serieListModel.addElement(controller.changeToUpperCase(addSerieField.getText()));
                addSerieField.selectAll();
            } else {
                JOptionPane.showMessageDialog(null, "This serie is already in your list", "Exist already", ERROR_MESSAGE);
            }
        }
    }

    private void addToTable() {
        addRow(controller.deleteDuplicate(episodeList));
        eachSecondRowColor();
        setJLabelCount();
    }

    private void addRow(TreeMap<String, String> map) {

        for (Entry<String, String> entry : map.entrySet()) {
            String language = controller.getfromInput(entry.getKey(), "(.*?)(?=\\.)");
            String title = controller.getfromInput(entry.getKey(), "(?<=\\.).*?(?=.S[0-9]{2}E[0-9]{2})");
            String episodeNumber = controller.getfromInput(entry.getKey(), "S[0-9]{2}E[0-9]{2}");

            model.addRow(new Object[]{language, title,
                episodeNumber, entry.getValue()});
        }

    }

    private void eachSecondRowColor() {
        EpisodeTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                return this;
            }
        });
    }

    private void setJLabelCount() {
        jLabelCount.setText("Anzahl: " + EpisodeTable.getRowCount());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserController;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import model.User;

/**
 *
 * @author Y0199223
 */
public class CreateStory extends javax.swing.JPanel {
    private UserController uc = null;
    /**
     * Creates new form CreateStory1
     */
    public CreateStory() {
        initComponents();
        getChildUser();
    }
    
    // method to display list of children on story creation page
    private void getChildUser() {
      
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagePanel = new javax.swing.JPanel();
        deletePage = new javax.swing.JButton();
        newPage = new javax.swing.JButton();
        editPage = new javax.swing.JButton();
        pageListScrollPane = new javax.swing.JScrollPane();
        pageList = new javax.swing.JList();
        pagesLabel = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        assignstoryPanel = new javax.swing.JPanel();
        feedback = new javax.swing.JCheckBox();
        childBox = new javax.swing.JComboBox();
        storyAssignedTo = new javax.swing.JLabel();
        AssignStory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        childListModel = new javax.swing.JList();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        childListModel = new javax.swing.JList();
        buttonPanel = new javax.swing.JPanel();
        saveStory = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        storyNamePanel = new javax.swing.JPanel();
        storyName = new javax.swing.JTextField();
        storyTitleLabel = new javax.swing.JLabel();

        deletePage.setText("Delete Page");

        newPage.setText("New Page");
        newPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPageActionPerformed(evt);
            }
        });

        editPage.setText("Edit Page");
        editPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPageActionPerformed(evt);
            }
        });

        pageList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "page 1", "page 2", "page 3", "page 4", "page 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pageListScrollPane.setViewportView(pageList);

        pagesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pagesLabel.setText("Pages:");

        javax.swing.GroupLayout pagePanelLayout = new javax.swing.GroupLayout(pagePanel);
        pagePanel.setLayout(pagePanelLayout);
        pagePanelLayout.setHorizontalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pagesLabel)
                .addGap(43, 43, 43)
                .addComponent(pageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(newPage)
                        .addComponent(deletePage, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(editPage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deletePage, editPage, newPage});

        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePage))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Choose Font:");

        jLabel2.setText("Choose Font Size:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        feedback.setText("Ask for feedback?");

        childBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        childBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childBoxActionPerformed(evt);
            }
        });

        storyAssignedTo.setText("This story is assigned to ");

        AssignStory.setText("Assign this story to: ");

        childListModel.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(childListModel);

        deleteButton.setText("Delete");

        childListModel.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(childListModel);

        javax.swing.GroupLayout assignstoryPanelLayout = new javax.swing.GroupLayout(assignstoryPanel);
        assignstoryPanel.setLayout(assignstoryPanelLayout);
        assignstoryPanelLayout.setHorizontalGroup(
            assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignstoryPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(childBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AssignStory))
                .addGap(94, 94, 94)
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton)
                    .addComponent(jScrollPane1)
                    .addComponent(storyAssignedTo))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        assignstoryPanelLayout.setVerticalGroup(
            assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignstoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AssignStory)
                    .addComponent(storyAssignedTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assignstoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(assignstoryPanelLayout.createSequentialGroup()
                        .addComponent(childBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(feedback)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addContainerGap())
        );

        saveStory.setText("Save Story");

        cancel.setText("Cancel");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(saveStory)
                .addGap(12, 12, 12)
                .addComponent(cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, saveStory});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveStory)
                    .addComponent(cancel))
                .addContainerGap())
        );

        storyName.setText("Story Name");

        storyTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        storyTitleLabel.setText("Story Title:");

        javax.swing.GroupLayout storyNamePanelLayout = new javax.swing.GroupLayout(storyNamePanel);
        storyNamePanel.setLayout(storyNamePanelLayout);
        storyNamePanelLayout.setHorizontalGroup(
            storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storyNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storyTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storyName, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        storyNamePanelLayout.setVerticalGroup(
            storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storyNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(storyNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storyName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storyTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(storyNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(assignstoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(storyNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignstoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPageActionPerformed

    private void childBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childBoxActionPerformed

    }//GEN-LAST:event_childBoxActionPerformed

    private void editPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssignStory;
    private javax.swing.JPanel assignstoryPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox childBox;
    private javax.swing.JList childListModel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deletePage;
    private javax.swing.JButton editPage;
    private javax.swing.JCheckBox feedback;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newPage;
    private javax.swing.JList pageList;
    private javax.swing.JScrollPane pageListScrollPane;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JLabel pagesLabel;
    private javax.swing.JButton saveStory;
    private javax.swing.JLabel storyAssignedTo;
    private javax.swing.JTextField storyName;
    private javax.swing.JPanel storyNamePanel;
    private javax.swing.JLabel storyTitleLabel;
    // End of variables declaration//GEN-END:variables


}

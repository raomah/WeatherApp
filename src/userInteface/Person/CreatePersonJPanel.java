/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package userInteface.Person;
import business.MyNumericVerifier;
import business.MyStringVerifier;
import business.Person;
import business.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raomah
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatientJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public CreatePersonJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier integerVerifier = new MyNumericVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new MyStringVerifier();
        pesonNameJTextField.setInputVerifier(stringVerifier);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personAgeJTextField = new javax.swing.JTextField();
        addPersonJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 206, 255));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        addPersonJButton.setText("ADD");
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bangla MN", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD PERSON DETAILS");

        patientNameJLabel.setText("Person Name");

        AgeJLabel.setText("Age");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AgeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pesonNameJTextField)
                                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(addPersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJLabel)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeJLabel)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addPersonJButton))
                .addContainerGap(459, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonJButtonActionPerformed
    private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField pesonNameJTextField;
    // End of variables declaration//GEN-END:variables
}

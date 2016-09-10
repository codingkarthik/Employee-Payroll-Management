/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gopinath
 */
public class FrmEdit extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public FrmEdit() {
        initComponents();
        this.getContentPane().setBackground(Color.YELLOW);
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblEmpreg = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        dtDOB = new com.toedter.calendar.JDateChooser();
        lblDOB = new javax.swing.JLabel();
        lblMobno = new javax.swing.JLabel();
        txtMobno = new javax.swing.JTextField();
        cmbQual = new javax.swing.JComboBox();
        lblQual = new javax.swing.JLabel();
        lblDesig = new javax.swing.JLabel();
        cmbDesig = new javax.swing.JComboBox();
        lblDOJ = new javax.swing.JLabel();
        dtDOJ = new com.toedter.calendar.JDateChooser();
        btnSubmit = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblEmp_Id = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaAddress = new javax.swing.JTextArea();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setTitle("EMPLOYEE REGISTRATION");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblEmpreg.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmpreg.setText("Employee Update");

        lblFname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblFname.setText("First Name:");

        txtFname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFnameMouseClicked(evt);
            }
        });
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFnameKeyTyped(evt);
            }
        });

        lblLname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblLname.setText("Last Name:");

        txtLname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLnameKeyPressed(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDOB.setText("Date of birth:");

        lblMobno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblMobno.setText("Mobile Number:");

        txtMobno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobnoActionPerformed(evt);
            }
        });
        txtMobno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobnoKeyTyped(evt);
            }
        });

        cmbQual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbQual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HSC", "SSC", "DIPLOMA", "B.E/B.TECH", "M.E/M.TECH", "PhD" }));

        lblQual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblQual.setText("Qualification:");

        lblDesig.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDesig.setText("Designation:");

        cmbDesig.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbDesig.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clerk", "Peon", "Lab Assistant", "Assistant Proffesor", "Associate Proffesor", "Head Of Department" }));

        lblDOJ.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDOJ.setText("Date of joining:");

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblGender.setText("Gender:");

        buttonGroup1.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rdbFemale.setText("Female");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Employee ID:");

        lblEmp_Id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmp_Id.setText("Employee Id");
        lblEmp_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmp_IdMouseClicked(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAddress.setText("Address:");

        txtareaAddress.setColumns(20);
        txtareaAddress.setRows(5);
        jScrollPane1.setViewportView(txtareaAddress);

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmail.setText("Email ID:");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMobno)
                            .addComponent(lblFname)
                            .addComponent(lblDOB)
                            .addComponent(lblLname)
                            .addComponent(lblGender)
                            .addComponent(lblEmail)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMobno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                        .addContainerGap(417, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbMale)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbFemale))
                                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(408, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblEmp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 428, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDOJ)
                            .addComponent(lblDesig)
                            .addComponent(lblQual))
                        .addGap(90, 90, 90))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtDOJ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDesig, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbQual, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblAddress)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 317, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmpreg, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(289, 289, 289))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblEmpreg)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblEmp_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLname)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMobno)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFname)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesig)
                            .addComponent(cmbDesig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtDOJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOJ))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int i=0;
       String nu="";
  
        if(txtFname.getText().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "First name cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtLname.getText().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Last name cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtEmail.getText().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Email cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtareaAddress.getText().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Address cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtMobno.getText().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Mobile number cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
                      if(txtMobno.getText().length()!=10)
            {
            JOptionPane.showMessageDialog(null, "Enter valid mobile number", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbDesig.getSelectedItem().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Select a gender", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbQual.getSelectedItem().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Select your qualification", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(dtDOB.getDate().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Date of birth cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(dtDOJ.getDate().equals(nu))
        {
            JOptionPane.showMessageDialog(null, "Date of joining cannot remain empty", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Connect1 k=new Connect1();
            DBCollection dbc2=k.connect("Emp_Records");
            BasicDBObject bdb2=new BasicDBObject();
            bdb2.put("ID",FrmAdmin.Id);
            DBCursor cur=dbc2.find(bdb2);
            DBObject obj1=cur.next();
            
        java.util.Date d1 = dtDOB.getDate();
        java.util.Date d2 = dtDOJ.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dtDOB.getDate());
        String gender = null;
         ButtonGroup group = new ButtonGroup();
       
  
        if (rdbMale.isSelected())
        {
            gender = rdbMale.getText();
            
        }
        else
        {
            gender = rdbFemale.getText();
            
        }
        final JPanel p2=new JPanel();
        final JOptionPane jo=new JOptionPane();
        
        Connect1 j=new Connect1();
        DBCollection dbc=j.connect("Emp_Records");
        DBCursor cursor=dbc.find();
        while(cursor.hasNext()==true)
        {
            DBObject obj=cursor.next();
            i++; 
        }
            
        String ID=FrmAdmin.Id;
     
        String emailID = txtEmail.getText();
        String emailRE = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$" ;

        Boolean flag = emailID.matches(emailRE);
        BasicDBObject bdb=new BasicDBObject();
        bdb.put("ID",ID);
        
            
        bdb.put("First Name",txtFname.getText());
        bdb.put("Last Name",txtLname.getText());
        if(flag!=null)
        bdb.put("Email",txtEmail.getText());
        else
        {
            JOptionPane.showMessageDialog(p2,"Invalid Email Id","Enter a valid email address",JOptionPane.ERROR_MESSAGE); 
            return;
        }
            
        bdb.put("Address",txtareaAddress.getText());
        bdb.put("Mobile Number",txtMobno.getText());
        bdb.put("Qualification",cmbQual.getSelectedItem());
        bdb.put("Designation",cmbDesig.getSelectedItem());
        Calendar c=new GregorianCalendar();
            int year=c.get(Calendar.YEAR);
            if(year-d1.getYear()>60)
            {
                JOptionPane.showMessageDialog(p2,"Only employees between 21 to 60 years can work ","failure",JOptionPane.ERROR_MESSAGE); 
            return;
            
            }
            if(year-d1.getYear()<20)
            {
                JOptionPane.showMessageDialog(p2,"Only employees between 21 to 60 years can work ","failure",JOptionPane.ERROR_MESSAGE); 
            return;
            
            }
        bdb.put("DOB",d1);
        bdb.put("Gender",gender);
        bdb.put("DOJ",d2);
        dbc.update(obj1,bdb);
        
        
        
        JOptionPane.showMessageDialog(p2,"Successfully Updated","Success",JOptionPane.INFORMATION_MESSAGE);        
        clear();
        this.setVisible(false);
  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ONE OR MORE FIELDS ARE EMPTY","FAILURE",JOptionPane.ERROR_MESSAGE);   
        }
        
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed
    

    
    public void clear()
    {
          txtFname.setText(null);
        txtLname.setText(null);
        cmbDesig.setSelectedItem(null);
        cmbQual.setSelectedItem(null);
        txtMobno.setText(null);
        rdbMale.setSelected(false);
        rdbFemale.setSelected(false);  
        dtDOB.setDate(null);
        dtDOJ.setDate(null);
    }
    
    private void txtMobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobnoActionPerformed

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void txtFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameKeyTyped

    private void txtFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyPressed
        // TODO add your handling code here:
        final KeyEvent k=evt;


    txtFname.addKeyListener(new KeyAdapter(){
           
      public void keyTyped(KeyEvent e) {
              //  if (!Character.isDigit(e.getKeyChar()))
          final char c=k.getKeyChar();
          if(Character.isDigit(c) || (Character.isWhitespace(c)))
          {
              txtFname.setEditable(false);
          }
          else
          {
              
         
                    txtFname.setEditable(true);
            }
      }
    });
    }//GEN-LAST:event_txtFnameKeyPressed

    private void txtLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyPressed
        // TODO add your handling code here:
        final KeyEvent k=evt;


    txtLname.addKeyListener(new KeyAdapter(){
           
      public void keyTyped(KeyEvent e) {
              //  if (!Character.isDigit(e.getKeyChar()))
          final char c=k.getKeyChar();
          if(Character.isDigit(c) || (Character.isWhitespace(c)))
          {
              txtLname.setEditable(false);
          }
          else
          {
              
         
                    txtLname.setEditable(true);
            }
      }
    });
    }//GEN-LAST:event_txtLnameKeyPressed

    private void txtMobnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobnoKeyPressed
        // TODO add your handling code here:
        final KeyEvent k=evt;


    txtMobno.addKeyListener(new KeyAdapter(){
           
      public void keyTyped(KeyEvent e) {
              //  if (!Character.isDigit(e.getKeyChar()))
          final char c=k.getKeyChar();
          if(Character.isLetter(c) || (Character.isWhitespace(c))){
              txtMobno.setEditable(false);
          }
          else
          {
              
         
                    txtMobno.setEditable(true);
            }
      }
    });
    }//GEN-LAST:event_txtMobnoKeyPressed

    private void txtMobnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobnoKeyTyped
        // TODO add your handling code here:
     /*   int length=txtMobno.getText().length();
      
        if(length==9)
            lblStatus.setText("Valid");
        else {
            lblStatus.setText("Invalid");
        }*/
    }//GEN-LAST:event_txtMobnoKeyTyped

    private void lblEmp_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmp_IdMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblEmp_IdMouseClicked

    private void txtFnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFnameMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
      
           
        
            int i=0;
        String empid=FrmAdmin.Id;
        lblEmp_Id.setText(empid);
         Connect1 k=new Connect1();
        DBCollection dbc1=k.connect("Emp_Records");
        BasicDBObject bdb3=new BasicDBObject();
        bdb3.put("ID",empid);
        DBCursor cursor=dbc1.find(bdb3);
             if(cursor.hasNext()){
       DBObject obj1 = cursor.next();
       String ID=(String)obj1.get("ID");
       
       txtFname.setText((String)obj1.get("First Name"));
       txtLname.setText((String)obj1.get("Last Name"));
        dtDOB.setDate((Date)obj1.get("DOB"));
       String gender=(String)obj1.get("Gender");
               if (gender.equals("Male"))
        {
           rdbMale.setSelected(true);
            
        }
        else
        {
            rdbFemale.setSelected(true);
            
        }
       txtMobno.setText((String)obj1.get("Mobile Number"));
      dtDOJ.setDate((Date)obj1.get("DOJ"));
      String desig=(String)obj1.get("Designation");
      switch(desig)
      {
          case "Clerk":cmbDesig.setSelectedIndex(0);
                        break;
          case "Peon":cmbDesig.setSelectedIndex(1);
                        break;
          case "Lab Assistant":cmbDesig.setSelectedIndex(2);
                        break;
          case "Assistant Proffesor":cmbDesig.setSelectedIndex(3);
                        break;
          case "Associate Proffesor":cmbDesig.setSelectedIndex(4);
                        break;
          case "Head Of Department":cmbDesig.setSelectedIndex(5);
                        break;
      }
      String qual=(String)obj1.get("Qualification");
      switch(qual)
      {
          case "HSC":cmbQual.setSelectedIndex(0);
                        break;
         case "SSC":cmbQual.setSelectedIndex(1);
                        break;
          case "DIPLOMA":cmbQual.setSelectedIndex(2);
                        break;
           case "B.E/B.TECH":cmbQual.setSelectedIndex(3);
                        break;
             case "M.E/M.TECH":cmbQual.setSelectedIndex(4);
                        break;
              case "PhD":cmbQual.setSelectedIndex(5);
                        break;
              
      
      }
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  
       txtEmail.setText((String)obj1.get("Email"));
        txtareaAddress.setText((String)obj1.get("Address"));
             
             }
    
    }//GEN-LAST:event_formWindowActivated

    private void txtMobnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobnoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobnoKeyReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbDesig;
    private javax.swing.JComboBox cmbQual;
    private com.toedter.calendar.JDateChooser dtDOB;
    private com.toedter.calendar.JDateChooser dtDOJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOJ;
    private javax.swing.JLabel lblDesig;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmp_Id;
    private javax.swing.JLabel lblEmpreg;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMobno;
    private javax.swing.JLabel lblQual;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMobno;
    private javax.swing.JTextArea txtareaAddress;
    // End of variables declaration//GEN-END:variables
}
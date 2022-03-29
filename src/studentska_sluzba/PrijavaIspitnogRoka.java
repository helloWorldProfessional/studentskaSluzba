/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentska_sluzba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author sc21l
 */


public class PrijavaIspitnogRoka extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    static int brojac=0;
    String ID,ID_IRoka;
    PreparedStatement pstSelect=null;
    /**
     * Creates new form PrijavaRoka
     */
    public PrijavaIspitnogRoka() {
        this.ID = new String();
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        popuniPredmet();
        
        
    }

public int provjeriDVUIR(){
  
    if(VrijemeIR.getSelectedIndex()==0){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+2)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+3)+":00");
            
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
        return 5;
    }
    else if(VrijemeIR.getSelectedIndex()==1){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+2)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+3)+":00");
            pst.setString(7,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
        return 5;
    }
    else if(VrijemeIR.getSelectedIndex()==2){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+2)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+3)+":00");
            pst.setString(7,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            pst.setString(8,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-2)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
        return 5;
    }
    else if(VrijemeIR.getSelectedIndex()==16){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+2)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            pst.setString(7,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-2)+":00");
            pst.setString(8,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-3)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
        return 5;
    }
    else if(VrijemeIR.getSelectedIndex()==17){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-2)+":00");
            pst.setString(7,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-3)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Termin je popunjen","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
    }
    else if(VrijemeIR.getSelectedIndex()==18){
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-2)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-3)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
    }
    else{
        String sqlSelect="select* from Rokovi where Datum=? and Sala=? and (Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=? or Vrijeme=?)";
        try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            
            pst.setString(1,DatumIR.getText());
            pst.setString(2, SalaPIR.getSelectedItem().toString());
            pst.setString(3,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+3)+":00");
            pst.setString(4,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+2)+":00");
            pst.setString(5,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()+1)+":00");
            pst.setString(6,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex())+":00");
            pst.setString(7,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-1)+":00");
            pst.setString(8,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-2)+":00");
            pst.setString(9,VrijemeIR.getItemAt(VrijemeIR.getSelectedIndex()-3)+":00");
            rs=pst.executeQuery();
            
            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Uneseni termin ispitnog roka je popunjen!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            else{
                return 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
    }
    return 9;
}
public void popuniProf(){
    
    String sqlSelect="select Profesor from Predmet where Naziv=?";
    
    try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            
            pst=con.prepareStatement(sqlSelect);
            pst.setString(1,PredmetIR.getSelectedItem().toString());
            rs=pst.executeQuery();
            while(rs.next())
            {
                ProfesorPIR.addItem(rs.getString("Profesor"));
            }
            
        }catch(Exception e){
           // JOptionPane.showMessageDialog(null,e);
        }
}
public void popuniUcionicu(){
    String sqlSelect="select Sala_BR from Sala";
    
    try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            rs=pst.executeQuery();
            while(rs.next())
            {
                SalaPIR.addItem(rs.getString("Sala_BR"));
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
}
public void popuniPredmet(){
    String sqlSelect="select Naziv from Predmet";
    
    try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sqlSelect);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                PredmetIR.addItem(rs.getString("Naziv"));
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ProfesorPIR = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ucionica = new javax.swing.JLabel();
        DatumIR = new datechooser.beans.DateChooserCombo();
        SalaPIR = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        PredmetIR = new javax.swing.JComboBox<>();
        VrijemeIR = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Kapacitet = new javax.swing.JComboBox<>();
        PretragaPoKapacitetu = new javax.swing.JButton();
        SalaRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NazadIR = new javax.swing.JButton();
        DodajIR = new javax.swing.JButton();
        OdjavaIR = new javax.swing.JButton();
        UkloniIR = new javax.swing.JButton();
        OsvjeziIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPIR = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ispitni rokovi-Studentska sluzba");
        setPreferredSize(new java.awt.Dimension(1104, 569));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1124, 589));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prijava roka  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(7, 41, 78))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel5.setText("Predmet");

        ProfesorPIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfesorPIRMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ProfesorPIRMouseReleased(evt);
            }
        });

        jLabel6.setText("Datum");

        jLabel7.setText("Vrijeme");

        Ucionica.setText("Sala");

        jLabel8.setText("Profesor");

        PredmetIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PredmetIRActionPerformed(evt);
            }
        });

        VrijemeIR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", " ", " " }));

        jLabel3.setText("Kapacitet");

        Kapacitet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "50", "80", "90", "200" }));

        PretragaPoKapacitetu.setBackground(new java.awt.Color(255, 255, 255));
        PretragaPoKapacitetu.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\zoom-search-2-icon.png")); // NOI18N
        PretragaPoKapacitetu.setBorderPainted(false);
        PretragaPoKapacitetu.setContentAreaFilled(false);
        PretragaPoKapacitetu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PretragaPoKapacitetuActionPerformed(evt);
            }
        });

        SalaRefresh.setBackground(new java.awt.Color(255, 255, 255));
        SalaRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\arrow-refresh-4-icon.png")); // NOI18N
        SalaRefresh.setBorderPainted(false);
        SalaRefresh.setContentAreaFilled(false);
        SalaRefresh.setMinimumSize(new java.awt.Dimension(40, 40));
        SalaRefresh.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SalaRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SalaRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ucionica, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DatumIR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProfesorPIR, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PredmetIR, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VrijemeIR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Kapacitet, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PretragaPoKapacitetu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SalaPIR, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SalaRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PredmetIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfesorPIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatumIR, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VrijemeIR))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Kapacitet)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PretragaPoKapacitetu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ucionica, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SalaPIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalaRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));

        NazadIR.setBackground(new java.awt.Color(7, 41, 78));
        NazadIR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NazadIR.setForeground(new java.awt.Color(255, 255, 255));
        NazadIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\arrow-back-1-icon.png")); // NOI18N
        NazadIR.setText(" Nazad ");
        NazadIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(54, 89, 147), null, null));
        NazadIR.setBorderPainted(false);
        NazadIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazadIRActionPerformed(evt);
            }
        });

        DodajIR.setBackground(new java.awt.Color(7, 41, 78));
        DodajIR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DodajIR.setForeground(new java.awt.Color(255, 255, 255));
        DodajIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\add-1-icon.png")); // NOI18N
        DodajIR.setText(" Dodaj");
        DodajIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(54, 89, 147), null, null));
        DodajIR.setBorderPainted(false);
        DodajIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajIRActionPerformed(evt);
            }
        });

        OdjavaIR.setBackground(new java.awt.Color(255, 0, 0));
        OdjavaIR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OdjavaIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\User-Interface-Logout-icon.png")); // NOI18N
        OdjavaIR.setText("Odjavi se ");
        OdjavaIR.setActionCommand(" Nazad ");
        OdjavaIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(54, 89, 147), null, null));
        OdjavaIR.setBorderPainted(false);
        OdjavaIR.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        OdjavaIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdjavaIRActionPerformed(evt);
            }
        });

        UkloniIR.setBackground(new java.awt.Color(7, 41, 78));
        UkloniIR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UkloniIR.setForeground(new java.awt.Color(255, 255, 255));
        UkloniIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\user-trash-full-icon.png")); // NOI18N
        UkloniIR.setText(" Ukloni");
        UkloniIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(54, 89, 147), null, null));
        UkloniIR.setBorderPainted(false);
        UkloniIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UkloniIRActionPerformed(evt);
            }
        });

        OsvjeziIR.setBackground(new java.awt.Color(7, 41, 78));
        OsvjeziIR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OsvjeziIR.setForeground(new java.awt.Color(255, 255, 255));
        OsvjeziIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\arrow-refresh-4-icon.png")); // NOI18N
        OsvjeziIR.setText(" Osvjezi");
        OsvjeziIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(54, 89, 147), null, null));
        OsvjeziIR.setBorderPainted(false);
        OsvjeziIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsvjeziIRActionPerformed(evt);
            }
        });

        TabelaPIR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaPIR);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sc21l\\Documents\\NetBeansProjects\\Studentska_Sluzba\\LogoZaJavu\\apeironLogo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OdjavaIR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DodajIR, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UkloniIR, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(NazadIR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(OsvjeziIR, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NazadIR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OsvjeziIR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OdjavaIR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(DodajIR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(UkloniIR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OsvjeziIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsvjeziIRActionPerformed
    String sql="select Rokovi.ID_IR,Predmet.ID_P,Predmet.Naziv,Predmet.Profesor,Rokovi.Datum,Rokovi.Vrijeme,Rokovi.Sala from Rokovi right join Predmet on Rokovi.ID_P=Predmet.ID_P where Rokovi.ID_IR is not null";
    try{
        con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        TabelaPIR.setModel(DbUtils.resultSetToTableModel(rs));
        TabelaPIR.setAutoscrolls(true);                    
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        
    }//GEN-LAST:event_OsvjeziIRActionPerformed
    }
    private void UkloniIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UkloniIRActionPerformed
        
        if(TabelaPIR.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Potrebno je selektovati ispitni rok koji zelite izbrisati!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(TabelaPIR.getSelectionModel().getSelectedItemsCount()>1){
            JOptionPane.showMessageDialog(null, "Moguce je selektovati samo jedan ispitni rok za brisanje!","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(TabelaPIR.getSelectionModel().getSelectedItemsCount()==1){
            
        int odg=JOptionPane.showConfirmDialog(null, "Da li zelite izbrisati selektovani ispitni rok?","Potvrda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(odg==0){
            DefaultTableModel model=(DefaultTableModel)TabelaPIR.getModel();
            int indexR=TabelaPIR.getSelectedRow();
            int IDIR=(int)model.getValueAt(indexR, 0);
            String sql="delete from Rokovi where ID_IR='"+IDIR+"'";
            try{
            con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Izbrisali ste selektovani ispitni rok iz baze podataka","OBAVJESTENJE",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,e);
        }
            model.removeRow(indexR);
            } 
        }   
    }//GEN-LAST:event_UkloniIRActionPerformed

    private void OdjavaIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdjavaIRActionPerformed
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OdjavaIRActionPerformed

    private void DodajIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajIRActionPerformed
    
        int provjera=provjeriDVUIR();
        
        //if(provjera==2 && !PredmetIR.getSelectedItem().equals("") && !ProfesorPIR.getSelectedItem().equals("") && !DatumIR.getText().isEmpty() && !VrijemeIR.getSelectedItem().equals("") && !SalaPIR.getSelectedItem().equals("")){
        if(provjera==2){
        String s="select ID_P from Predmet where Naziv=?";
        try{
                con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
                pst=con.prepareStatement(s);
                pst.setString(1,PredmetIR.getSelectedItem().toString());
                rs=pst.executeQuery();
                if(rs.next()){
                    ID=rs.getString("ID_P");
                }
        }catch(Exception e){
                //JOptionPane.showMessageDialog(null,e);
            }
        
        String sql="select ID_IR from Rokovi where ID_P=?";
        try{
                con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
                pst=con.prepareStatement(sql);
                pst.setString(1,ID);
                rs=pst.executeQuery();
                while(rs.next()){
                    ID_IRoka=rs.getString("ID_IR");
                    brojac+=1;
                }
        }catch(Exception e){
                //JOptionPane.showMessageDialog(null,e);
            }
        
        
        if(brojac<2){
            String sqlI="insert into Rokovi (ID_P,Datum,Vrijeme,Sala) values (?,?,?,?)";
        try{
                con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
                pst=con.prepareStatement(sqlI);
                pst.setString(1,ID);System.out.println("ID="+ID);
                pst.setString(2, DatumIR.getText());
                pst.setString(3, VrijemeIR.getSelectedItem().toString());
                pst.setString(4, SalaPIR.getSelectedItem().toString());
                pst.execute();
                   JOptionPane.showMessageDialog(null,"Uspjesno ste dodali ispitni rok!","Upozorenje",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Greska prilikom unosa termina ispitnog roka!","Upozorenje",JOptionPane.INFORMATION_MESSAGE);
            }SalaPIR.setSelectedIndex(-1);
               }
        
        else{        
         JOptionPane.showMessageDialog(null,"Predmet vec ima maksimalan broj prijavljenih ispitnih rokova ili vec postoji u bazi!","UPOZORENJE",JOptionPane.WARNING_MESSAGE);
        }
    }
        else if(provjera==1){
            JOptionPane.showMessageDialog(null,"Uneseni termin ispitnog roka je popunjen!","UPOZORENJE",JOptionPane.WARNING_MESSAGE);
        }
    else{
           JOptionPane.showMessageDialog(null,"Selektujte vrijednosti navedenih polja prije dodavanja!","UPOZORENJE",JOptionPane.WARNING_MESSAGE);
       }
        
        brojac=0;
    }//GEN-LAST:event_DodajIRActionPerformed

    private void NazadIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazadIRActionPerformed
        new PocetnaSTDSL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NazadIRActionPerformed

    private void ProfesorPIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesorPIRMouseClicked
    popuniProf();
    }//GEN-LAST:event_ProfesorPIRMouseClicked

    private void ProfesorPIRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesorPIRMouseReleased
        ProfesorPIR.removeAllItems();
    }//GEN-LAST:event_ProfesorPIRMouseReleased

    private void PretragaPoKapacitetuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PretragaPoKapacitetuActionPerformed
        SalaPIR.removeAllItems();
        String sql="select Sala_BR from Sala where Kapacitet=?";
        try{
            con=con=DriverManager.getConnection("jdbc:sqlserver://your-computer-name:port-number;databaseName=studentskaSluzba","admin","admin321");
            pst=con.prepareStatement(sql);
            pst.setString(1,Kapacitet.getSelectedItem().toString());
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                SalaPIR.addItem(rs.getString("Sala_BR"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_PretragaPoKapacitetuActionPerformed

    private void SalaRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaRefreshActionPerformed
        SalaPIR.removeAllItems();
        popuniUcionicu();
    }//GEN-LAST:event_SalaRefreshActionPerformed

    private void PredmetIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PredmetIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PredmetIRActionPerformed

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
            java.util.logging.Logger.getLogger(PrijavaIspitnogRoka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrijavaIspitnogRoka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrijavaIspitnogRoka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrijavaIspitnogRoka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrijavaIspitnogRoka().setVisible(true);
                
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo DatumIR;
    private javax.swing.JButton DodajIR;
    private javax.swing.JComboBox<String> Kapacitet;
    private javax.swing.JButton NazadIR;
    private javax.swing.JButton OdjavaIR;
    private javax.swing.JButton OsvjeziIR;
    private javax.swing.JComboBox<String> PredmetIR;
    private javax.swing.JButton PretragaPoKapacitetu;
    private javax.swing.JComboBox<String> ProfesorPIR;
    private javax.swing.JComboBox<String> SalaPIR;
    private javax.swing.JButton SalaRefresh;
    private javax.swing.JTable TabelaPIR;
    private javax.swing.JLabel Ucionica;
    private javax.swing.JButton UkloniIR;
    private javax.swing.JComboBox<String> VrijemeIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

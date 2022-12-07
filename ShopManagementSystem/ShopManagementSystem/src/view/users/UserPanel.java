/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.users;

import controller.AddressController;
import controller.UserController;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Address;
import model.Province;
import model.Response;
import model.User;
import output.UserOutput;
import swing.UIController;

/**
 *
 * @author Admin
 */
public class UserPanel extends javax.swing.JPanel {

//    private boolean isSelected = false;
    private DefaultTableModel dtm;
    private UserController uc;
    private AddressController ac;
    private UserOutput output;
    private String imageName;
    private Map<Integer, User> listUser;

    private AddressDialog addressDialog;
    private UserDeletedDialog userDeletedDialog;

    /**
     * Creates new form StaffPanel
     */
    public UserPanel() {
        initComponents();
        dtm = (DefaultTableModel) jTable_User.getModel();
        uc = new UserController();
        ac = new AddressController();
        UIController.setDefaultTableHeader(jTable_User);
        loadData(1);
        loadProvince();
//        jButton_Remove.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_NumOfOrders = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jButton_Detail = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_User = new javax.swing.JTable();
        jButton_ExportExcel = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox_Address = new javax.swing.JComboBox<>();
        jButton_Deleted = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_PreviousPage = new javax.swing.JButton();
        jLabel_Page = new javax.swing.JLabel();
        jButton_NextPage = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Email");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Username.setEditable(false);
        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Name");

        jTextField_LastName.setEditable(false);
        jTextField_LastName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Address.setEditable(false);
        jTextField_Address.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Image");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Phone");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Number of orders");

        jTextField_FirstName.setEditable(false);
        jTextField_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_NumOfOrders.setEditable(false);
        jTextField_NumOfOrders.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Email.setEditable(false);
        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTextField_Phone.setEditable(false);
        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jButton_Detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail.png"))); // NOI18N
        jButton_Detail.setContentAreaFilled(false);
        jButton_Detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DetailActionPerformed(evt);
            }
        });

        jLabel_Image.setText("image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_NumOfOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextField_Phone))
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField_Address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jButton_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_NumOfOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("Search:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField_Search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField_SearchCaretUpdate(evt);
            }
        });

        jTable_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Last name", "First name", "Email", "Phone", "Province"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_User);

        jButton_ExportExcel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_ExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jButton_ExportExcel.setText("Export");
        jButton_ExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportExcelActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Filter:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setText("Address");

        jComboBox_Address.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_Address.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_AddressItemStateChanged(evt);
            }
        });

        jButton_Deleted.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Deleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_list.png"))); // NOI18N
        jButton_Deleted.setText("Deleted");
        jButton_Deleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Deleted.setFocusPainted(false);
        jButton_Deleted.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton_Deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletedActionPerformed(evt);
            }
        });

        jButton_Remove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_Remove.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton_Remove.setText("Remove");
        jButton_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove.setMaximumSize(new java.awt.Dimension(123, 35));
        jButton_Remove.setMinimumSize(new java.awt.Dimension(95, 30));
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        jButton_PreviousPage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_PreviousPage.setText("<");
        jButton_PreviousPage.setEnabled(false);
        jButton_PreviousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousPageActionPerformed(evt);
            }
        });

        jLabel_Page.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel_Page.setText("/");

        jButton_NextPage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_NextPage.setText(">");
        jButton_NextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_PreviousPage)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_NextPage)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ExportExcel)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_ExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_PreviousPage)
                        .addComponent(jButton_NextPage)
                        .addComponent(jLabel_Page))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21)
                        .addComponent(jComboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loadProvince() {
        List<Province> list = ac.getAllProvince();
        jComboBox_Address.addItem(new Province("All"));
        for (Province p : list) {
            jComboBox_Address.addItem(p);
        }
    }

    private void loadData(int page) {
        output = uc.getUserInOnePage(page);
        jLabel_Page.setText(output.getPage() + "/" + output.getTotalPage());
        uc.loadTable(output.getListResult(), dtm);
        if (output.getPage() == 1) {
            jButton_PreviousPage.setEnabled(false);
        }
        if (output.getPage() == output.getTotalPage()) {
            jButton_NextPage.setEnabled(false);
        }
        listUser = output.getListResult().stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }

    private void jTable_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UserMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable_User.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
        int id = Integer.parseInt(jTable_User.getValueAt(selectedRow, 0).toString());
        User u = listUser.get(id);

        jTextField_ID.setText(u.getId() + "");
        jTextField_Username.setText(u.getUsername());
        jTextField_LastName.setText(u.getLastName());
        jTextField_FirstName.setText(u.getFirstName());
        jTextField_Email.setText(u.getEmail());
        jTextField_Phone.setText(u.getPhone());
        jTextField_NumOfOrders.setText(u.getNumord() + "");
        Address address;
        if (u.getAddresses().isEmpty()) {
            jTextField_Address.setText("");
        } else {
            address = u.getAddresses().get(0);
            jTextField_Address.setText(address.getSpecificAddress() + ", " + address.getWard().getWardPrefix() + " " + address.getWard().getWardName() + ", " + address.getWard().getDistrict().getDistrictPrefix() + " " + address.getWard().getDistrict().getDistrictName() + ", " + address.getWard().getDistrict().getProvince().getProvinceName());
        }

        imageName = u.getImage();
        Image img = uc.getImage(imageName);
        Image newImg = img.getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImg);
        jLabel_Image.setIcon(icon);

//        isSelected = true;
        jButton_Remove.setEnabled(true);
    }//GEN-LAST:event_jTable_UserMouseClicked

    private void jTextField_SearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField_SearchCaretUpdate
        // TODO add your handling code here:
        String tuKhoa = jTextField_Search.getText().toLowerCase();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(jTable_User.getModel());
        jTable_User.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + tuKhoa));
    }//GEN-LAST:event_jTextField_SearchCaretUpdate

    private void jButton_ExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportExcelActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = fileChooser.showDialog(this, "Choose folder");
        if (x == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();
            utils.File.xuatFileExcel("UserList", (DefaultTableModel) jTable_User.getModel(), file.getAbsolutePath() + "/User");
            JOptionPane.showMessageDialog(this, "Export excel file successfully!");
        } else {
            return;
        }
    }//GEN-LAST:event_jButton_ExportExcelActionPerformed

    private void jButton_DeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletedActionPerformed
        // TODO add your handling code here:
        userDeletedDialog = new UserDeletedDialog(null, true);
        userDeletedDialog.setVisible(true);
    }//GEN-LAST:event_jButton_DeletedActionPerformed

    private void jButton_DetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DetailActionPerformed
        // TODO add your handling code here:
        if (!jTextField_ID.getText().equals("")) {
            List<Address> listAddress = new ArrayList<>();
            listAddress = listUser.get(Integer.valueOf(jTextField_ID.getText())).getAddresses();
            this.addressDialog = new AddressDialog(null, true, listAddress, this);
            this.addressDialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton_DetailActionPerformed

    private void jButton_PreviousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousPageActionPerformed
        // TODO add your handling code here:
        if (output.getPage() > 1) {
            loadData(output.getPage() - 1);
            jButton_NextPage.setEnabled(true);
        }
        if (output.getPage() == 1) {
            jButton_PreviousPage.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_PreviousPageActionPerformed

    private void jButton_NextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextPageActionPerformed
        // TODO add your handling code here:
        if (output.getPage() < output.getTotalPage()) {
            loadData(output.getPage() + 1);
            jButton_PreviousPage.setEnabled(true);
        }
        if (output.getPage() == output.getTotalPage()) {
            jButton_NextPage.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_NextPageActionPerformed

    private void jComboBox_AddressItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_AddressItemStateChanged
        // TODO add your handling code here:
        if (jComboBox_Address.getSelectedItem() == null) {
            return;
        }
        String provinceName = ((Province) jComboBox_Address.getSelectedItem()).getProvinceName();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(jTable_User.getModel());
        jTable_User.setRowSorter(trs);
        if ("All".equals(jComboBox_Address.getSelectedItem().toString())) {
            return;
        }
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + provinceName, 6));
    }//GEN-LAST:event_jComboBox_AddressItemStateChanged

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_User.getSelectedRow();
        if (selectedRow != -1) {
            int id = Integer.parseInt(jTable_User.getValueAt(selectedRow, 0).toString());
            User u = listUser.get(id);
            int luaChon = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this user?", "OK", 0);
            if (luaChon == JOptionPane.CANCEL_OPTION) {
                return;
            } else if (luaChon == JOptionPane.OK_OPTION) {
                Response response = uc.updateStatusByID(u);
                JOptionPane.showMessageDialog(this, response.getMessage());
                if (response.getResponseCode() == 200) {
                    loadData(output.getPage());
                    jButton_Remove.setEnabled(false);
                } else {
                    return;
                }
            }
        }
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Deleted;
    private javax.swing.JButton jButton_Detail;
    private javax.swing.JButton jButton_ExportExcel;
    private javax.swing.JButton jButton_NextPage;
    private javax.swing.JButton jButton_PreviousPage;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JComboBox<Province> jComboBox_Address;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Page;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_User;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_NumOfOrders;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}

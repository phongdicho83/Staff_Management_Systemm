/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package staff_management_system.UI;

import Helpers.MessageDialogHelper;
import static Helpers.MessageDialogHelper.showErrorDialog;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import staff_management_system.BUS.LuongHopDongBUS;
import staff_management_system.DTO.LuongHopDongDTO;

/**
 *
 * @author Chi Thien
 */
public final class LuongHopDongUI extends javax.swing.JFrame {
    DefaultTableModel model;
    public static ArrayList<LuongHopDongDTO> list;
    /**
     * Creates new form CongViecUI
     */
    public LuongHopDongUI() {
        initComponents();
        readData();
        loadData(list);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void readData() {
        LuongHopDongBUS bus = new LuongHopDongBUS();
        try {
            list = bus.getListHopDongs();
        } catch (Exception ex) {
            Logger.getLogger(LuongHopDongUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadData(ArrayList<LuongHopDongDTO> list) {
        Vector header = new Vector();
        header.add("Mã Nhân viên");
        header.add("Mã Hợp đồng");
        header.add("Ngày Vào Làm");
        header.add("Tiền Lương");
        model = new DefaultTableModel(header, 0);

        String[] data = new String[header.size()];

        for (int i = 0; i < list.size(); i++) {
            data[0] = list.get(i).getManV();
            data[1] = list.get(i).getMaHD();
             data[2] = list.get(i).getNgayVaoLam();
              data[3] = String.valueOf(list.get(i).getTienLuong());
            model.addRow(data);
        }

        tblCongViec.setModel(model);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaTienThuong = new javax.swing.JTextField();
        txtTenTienThuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCongViec = new javax.swing.JTable();
        btLuu = new javax.swing.JButton();
        btCapNhat = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btLamMoi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtThang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LƯƠNG HỢP ĐỒNG");

        jLabel2.setText("Mã Hợp đồng");

        jLabel3.setText("Mã Nhân viên");

        txtMaTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTienThuongActionPerformed(evt);
            }
        });

        tblCongViec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "số ngày làm", "Tăng", "Lương tăng"
            }
        ));
        tblCongViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCongViecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCongViec);

        btLuu.setText("Thêm");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btCapNhat.setText("Cập nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        btDelete.setText("Xóa");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btLamMoi.setText("Làm mới");
        btLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLamMoiActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày vào làm");

        jLabel5.setText("Lương Tăng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btLuu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCapNhat)
                                        .addGap(44, 44, 44)
                                        .addComponent(btDelete)
                                        .addGap(44, 44, 44)
                                        .addComponent(btLamMoi))
                                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(203, 203, 203)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLuu)
                    .addComponent(btCapNhat)
                    .addComponent(btDelete)
                    .addComponent(btLamMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        LuongHopDongDTO item = new LuongHopDongDTO();
        item.setManV(txtMaTienThuong.getText());
        item.setMaHD(txtTenTienThuong.getText());
        item.setNgayVaoLam(txtThang.getText());
        item.setTienLuong(Long.valueOf(txtSoTien.getText()));

        int i = MessageDialogHelper.showConFirmDialog(jLabel1, "Đồng ý cập nhật?", "Xác nhận");
        if (i == JOptionPane.NO_OPTION) {
            return;
        }

        LuongHopDongBUS bus = new LuongHopDongBUS();
        if (bus.update(item)) {
            MessageDialogHelper.showMessageDialog(jLabel1, "Cập nhật thông tin theo dõi thành công!", "Thông báo");
            readData();
            loadData(list);
            btLamMoiActionPerformed(evt);
        } else
            MessageDialogHelper.showErrorDialog(jLabel1, "Cập thông thông tin theo dõi thất bại", "Lỗi");
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        String manv = txtMaTienThuong.getText();
       
         LuongHopDongBUS bus = new LuongHopDongBUS();
         if(!bus.check(manv)){
               try {
            LuongHopDongDTO item = new LuongHopDongDTO();
        item.setManV(txtMaTienThuong.getText());
        item.setMaHD(txtTenTienThuong.getText());
        item.setNgayVaoLam(txtThang.getText());
        item.setTienLuong(Long.valueOf(txtSoTien.getText()));

           
            bus.add(item);
            readData();
            loadData(list);
            btLamMoiActionPerformed(evt);

        } catch (NumberFormatException e) {
           MessageDialogHelper.showErrorDialog(jLabel1, e.getMessage(), "Lỗi");
        }
         }else
              MessageDialogHelper.showErrorDialog(jLabel1,"Nhân viên không tồn tại", "Lỗi");
      
    }//GEN-LAST:event_btLuuActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        int i = tblCongViec.getSelectedRow();

        int opt = MessageDialogHelper.showConFirmDialog(jLabel1, "Đồng ý xóa thông tin ?", "Xác nhận");
        if (opt == JOptionPane.NO_OPTION) {
            return;
        }
        
         LuongHopDongBUS bus = new LuongHopDongBUS();
        if (bus.del(list.get(i).getManV())) {
            list.remove(i);
            MessageDialogHelper.showMessageDialog(jLabel1, "Xóa thông tin  thành công!", "Thông báo");
            readData();
            loadData(list);
            btLamMoiActionPerformed(evt);
        } else {
            MessageDialogHelper.showErrorDialog(jLabel1, "Xóa thông tin  không thành công", "Lỗi");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLamMoiActionPerformed
        // TODO add your handling code here:
        txtMaTienThuong.setText("");
        txtTenTienThuong.setText("");
        txtSoTien.setText("");
        txtThang.setText("");
    }//GEN-LAST:event_btLamMoiActionPerformed

    private void tblCongViecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCongViecMouseClicked
        // TODO add your handling code here:
        int i = tblCongViec.getSelectedRow();
        txtMaTienThuong.setText(list.get(i).getManV());
        txtTenTienThuong.setText(list.get(i).getMaHD());
          txtThang.setText(list.get(i).getNgayVaoLam());
            txtSoTien.setText(String.valueOf(list.get(i).getTienLuong()));
    }//GEN-LAST:event_tblCongViecMouseClicked

    private void txtMaTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTienThuongActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTienThuongActionPerformed

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
            java.util.logging.Logger.getLogger(LuongHopDongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuongHopDongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuongHopDongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuongHopDongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LuongHopDongUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btLamMoi;
    private javax.swing.JButton btLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCongViec;
    private javax.swing.JTextField txtMaTienThuong;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTenTienThuong;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}

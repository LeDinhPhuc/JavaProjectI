/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoesmanagementcompany;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Pham Ngoc Minh
 */
public class Supplier extends javax.swing.JPanel {

    public boolean[] inserted = new boolean[100000];

    /**
     * Creates new form supplier
     */
    public Supplier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        jToolBar4 = new javax.swing.JToolBar();
        importFile = new javax.swing.JButton();
        exportFile = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        viewData = new javax.swing.JButton();
        clearData = new javax.swing.JButton();
        insertData = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        properties = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        tableSupplier.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ"
            }
        ));
        tableSupplier.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableSupplier.setRowHeight(25);
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSupplierMouseReleased(evt);
            }
        });
        tableSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSupplierKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableSupplier);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setRollover(true);

        importFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Microsoft_Excel_37px.png"))); // NOI18N
        importFile.setToolTipText("Nhập file");
        importFile.setOpaque(false);
        importFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFileActionPerformed(evt);
            }
        });
        jToolBar4.add(importFile);

        exportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Microsoft_Word_37px.png"))); // NOI18N
        exportFile.setToolTipText("Xuất file");
        exportFile.setOpaque(false);
        exportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportFileActionPerformed(evt);
            }
        });
        jToolBar4.add(exportFile);

        jToolBar5.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar5.setRollover(true);

        viewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Database_View_37px.png"))); // NOI18N
        viewData.setToolTipText("Hiển thị ");
        viewData.setOpaque(false);
        viewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataActionPerformed(evt);
            }
        });
        jToolBar5.add(viewData);

        clearData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Delete_Database_37px.png"))); // NOI18N
        clearData.setToolTipText("Xoá bảng");
        clearData.setOpaque(false);
        clearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDataActionPerformed(evt);
            }
        });
        jToolBar5.add(clearData);

        insertData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Add_Database_37px.png"))); // NOI18N
        insertData.setToolTipText("Thêm");
        insertData.setOpaque(false);
        insertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDataActionPerformed(evt);
            }
        });
        jToolBar5.add(insertData);

        jToolBar6.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar6.setRollover(true);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Combo_Chart_37px.png"))); // NOI18N
        jButton7.setToolTipText("Thống kê");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar6.add(jButton7);

        searchBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        properties.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ" }));
        properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void importFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFileActionPerformed
        // TODO add your handling code here:
        String path = null;
        JFileChooser fileChooser = new JFileChooser();
        // show ra một bảng chọn file
        int rVal = fileChooser.showOpenDialog(null);
        // nếu nhấn nút ok (tuỳ chọn APPROVE_OPTION)
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getName();
            String dir = fileChooser.getCurrentDirectory().toString();
            path = dir + "\\" + fileName;
        } // nếu nhấn nút cancel trong bảng
        else if (rVal == JFileChooser.CANCEL_OPTION) {
            return;
        }
        // chỗ này sẽ delete hết các dòng trước khi nhập dữ liệu từ file

        // vector lưu tên cột
        Vector columns = new Vector();
        try {
            FileInputStream file = new FileInputStream(new File(path));
            // tạo một file excel
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            // tạo một sheet trong excel có số thứ tự là 0
            XSSFSheet sheet = workbook.getSheetAt(0);
            // con trỏ duyệt hàng trong excel
            Iterator<Row> rowIt = sheet.iterator();
            // nếu vẫn còn dòng trong file
            while (rowIt.hasNext()) {
                // tạo một dòng mới
                Row row = rowIt.next();
                // con trỏ trỏ vào các ô trong một dòng
                Iterator<Cell> cellIt = row.cellIterator();
                // nếu là hàng 0
                if (row.getRowNum() == 0) {
                    // add tên các cột vào trong bảng jtable
                    while (cellIt.hasNext()) {
                        Cell cell = cellIt.next();
                        columns.add(cell.getStringCellValue());
                        ((DefaultTableModel) tableSupplier.getModel()).setColumnIdentifiers(columns);
                    }
                } else {
                    //vector chứa dữ liệu trong 1 dòng để add vào bảng jtabel
                    Vector<String> rowData = new Vector<String>();
                    // nếu vẫn còn ô tiếp theo
                    while (cellIt.hasNext()) {
                        // lấy cell trong bảng excel
                        Cell cell = cellIt.next();
                        // nếu cell có kiểu dữ liệu là string
                        if (cell.getCellType() == CellType.STRING) {
                            rowData.add(cell.getStringCellValue());
                        } // nếu cell có kiểu dữ liệu là số
                        else if (cell.getCellType() == CellType.NUMERIC) {
                            rowData.add(Double.toString(cell.getNumericCellValue()));
                        }
                    }
                    // add dữ liệu vào trong bảng jtable
                    ((DefaultTableModel) tableSupplier.getModel()).addRow(rowData);
                }
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importFileActionPerformed

    private void exportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportFileActionPerformed
        // TODO add your handling code here:
        try {
            // mở file word, trong đó file word trích đường dẫn như ví dụ bên dưới
            FileInputStream fis = new FileInputStream(System.getProperty("user.home") + "\\Desktop\\TestWord.docx");
            XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
            // con trỏ duyệt phần thân của file word
            Iterator bodyElementIterator = xdoc.getBodyElementsIterator();
            // duyệt phần body
            while (bodyElementIterator.hasNext()) {
                IBodyElement element = (IBodyElement) bodyElementIterator.next();
                // lấy tất cả các bảng trong phần body
                if ("TABLE".equalsIgnoreCase(element.getElementType().name())) {
                    java.util.List<XWPFTable> tableList = element.getBody().getTables();
                    // giờ xử lý với từng bảng, vì trong biểu mẫu chỉ có một bảng nên nó sẽ chỉ xử lý 1 lần
                    for (XWPFTable table : tableList) {
                        setDefaultTable(table);
                        for (int i = 1; i < table.getRows().size(); i++) {
                            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                                removeParagraphs(table.getRow(i).getCell(j));
                                XWPFParagraph paragraph = table.getRow(i).getCell(j).addParagraph();
                                paragraph.createRun().setText(tableSupplier.getValueAt(i - 1, j).toString());
                            }

                        }
                        addRowData(table, table.getRows().size());
                    }
                }
            }
            OutputStream out = new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\TestWord.docx");
            xdoc.write(out);
            out.close();

        } catch (IOException | InvalidFormatException ex) {
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "File đã tạo thành công!\nBạn có muốn mở file?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(System.getProperty("user.home") + "\\Desktop\\TestWord.docx");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        } else {
        }

    }//GEN-LAST:event_exportFileActionPerformed

    private void viewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataActionPerformed
        // TODO add your handling code here:

        ConnectionDB connectDB = new ConnectionDB();
        Connection connection = connectDB.getConnect();
        DefaultTableModel tableModel = (DefaultTableModel) tableSupplier.getModel();
        tableModel.setNumRows(0);
        String sql = "SELECT * FROM quanlybangiay.nhacungcap";
        PreparedStatement pst;
        int row = 0;
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3)
                });
                inserted[row] = true;
                row++;
            }
            tableSupplier.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_viewDataActionPerformed

    private void clearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDataActionPerformed
        // TODO add your handling code here:
        int dialog = JOptionPane.showConfirmDialog(null, "Hành động này sẽ xoá toàn bộ dữ liệu \nBạn có muốn tiếp tục không?\nTip: Nếu bạn không chắc chắn, hãy kiểm tra lại hoặc xoá lần lượt từng hàng một!", "Cảnh báo", JOptionPane.INFORMATION_MESSAGE);

        if (dialog == JOptionPane.YES_OPTION) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection con = connectionDB.getConnect();

            String sql = "deletle from quanlybangiay.nhavien";
            try {
                con.setAutoCommit(false);
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                con.commit();
                JOptionPane.showMessageDialog(null, "Thành công!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Không thể xoá dữ liệu\n" + "Lỗi: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_clearDataActionPerformed

    private void insertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDataActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectDB = new ConnectionDB();
        Connection connection = connectDB.getConnect();

        //        DefaultTableModel tableModel = (DefaultTableModel) supplierTable.getModel();
        int rows = tableSupplier.getRowCount();
        for (int row = 0; row < rows; row++) {
            if (!inserted[row] && !isEmptyRow(row)) {
                String sql = "INSERT INTO quanlybangiay.nhacungcap VALUES (?,?,?)";
                try {
                    connection.setAutoCommit(false);
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setString(1, tableSupplier.getValueAt(row, 0).toString());
                    pst.setString(2, tableSupplier.getValueAt(row, 1).toString());
                    pst.setString(3, tableSupplier.getValueAt(row, 2).toString());

                    pst.addBatch();
                    pst.executeUpdate();
                    connection.commit();

                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                inserted[row] = true;
            }
        }
        JOptionPane.showMessageDialog(null, "Successfully");
    }//GEN-LAST:event_insertDataActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new ChartFrame().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tableSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseReleased
        // TODO add your handling code here:
        tableSupplier.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = tableSupplier.rowAtPoint(e.getPoint());
                if (r >= 0 && r < tableSupplier.getRowCount()) {
                    tableSupplier.setRowSelectionAllowed(true);
                } else {
                    tableSupplier.clearSelection();
                }

                int[] rowindex = tableSupplier.getSelectedRows();
                for (int i = 0; i < rowindex.length; i++) {
                    int j = rowindex[i];
                    if (j < 0) {
                        return;
                    }
                }
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                    JPopupMenu popup = popUp();
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_tableSupplierMouseReleased

    private void tableSupplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSupplierKeyPressed
         // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER && tableSupplier.getSelectedRow() == tableSupplier.getRowCount() - 1) {

            ((DefaultTableModel) tableSupplier.getModel()).addRow(new Object[]{null});
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            tableSupplier.requestFocus();
            tableSupplier.changeSelection(tableSupplier.getSelectedRow(), 0, false, false);
        }
    }//GEN-LAST:event_tableSupplierKeyPressed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void propertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesActionPerformed
        // TODO add your handling code here:
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        ConnectionDB connectionDB = new ConnectionDB();
        Connection con = connectionDB.getConnect();
        if (selected != null) {
            switch (selected) {
                case "Mã nhà cung cấp":
                try {
                    ((DefaultTableModel) tableSupplier.getModel()).setNumRows(0);
                    String sql = "SELECT * FROM quanlybangiay.nhacungcap WHERE maNCC like '%" + searchBox.getText() + "%'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Vector<String> vector = new Vector<>();
                        for (int i = 0; i < 3; i++) {
                            vector.add(rs.getString(i + 1));
                        }
                        ((DefaultTableModel) tableSupplier.getModel()).addRow(vector);
                    }
                    System.out.println("done");
                } catch (SQLException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                case "Tên nhà cung cấp":
                try {
                    ((DefaultTableModel) tableSupplier.getModel()).setNumRows(0);
                    String sql = "select * from quanlybangiay.nhacungcap where tenNCC like '%" + searchBox.getText() + "%'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        Vector<String> vector = new Vector<>();
                        for (int i = 0; i < 3; i++) {
                            vector.add(rs.getString(i + 1));
                        }
                        ((DefaultTableModel) tableSupplier.getModel()).addRow(vector);
                    }
                } catch (Exception e) {
                }
                break;
                case "Địa chỉ":
                try {
                    ((DefaultTableModel) tableSupplier.getModel()).setNumRows(0);
                    String sql = "select * from quanlybangiay.nhacungcap where diaChi like '%" + searchBox.getText() + "%'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        Vector<String> vector = new Vector<>();
                        for (int i = 0; i < 3; i++) {
                            vector.add(rs.getString(i + 1));
                        }
                        ((DefaultTableModel) tableSupplier.getModel()).addRow(vector);
                    }
                } catch (Exception e) {
                }
                break;
                

            }
        }
    }//GEN-LAST:event_propertiesActionPerformed
    private JPopupMenu popUp() {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenu deleteMenu = new JMenu("Delete");
        JPopupMenu subPopupMenu = new JPopupMenu();
        JMenuItem deleteFromTb = new JMenuItem("From table");
        JMenuItem deleteFromDb = new JMenuItem("From database");
        JMenu insertMenu = new JMenu("Insert");
        JMenuItem insertAbove = new JMenuItem("Insert Above");
        JMenuItem insertBelow = new JMenuItem("Insert Below");
        JMenuItem update = new JMenuItem("Update");
        Icon icon = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-cancel-16.png");
        Icon deleteDb = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-delete-database-20.png");
        Icon deleteTb = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-delete-table-25.png");
        Icon updateIcon = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-downloading-updates-20.png");
        Icon insertIcon = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-add-row-25.png");
        Icon insertBelowIcon = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-down-arrow-25.png");
        Icon insertAboveIcon = new ImageIcon("C:\\Users\\Pham Ngoc Minh\\Downloads\\Icon\\icons8-long-arrow-up-25.png");
        insertMenu.setIcon(insertIcon);
        insertAbove.setIcon(insertAboveIcon);
        insertBelow.setIcon(insertBelowIcon);
        deleteMenu.setIcon(icon);
        deleteFromDb.setIcon(deleteDb);
        deleteFromTb.setIcon(deleteTb);
        update.setIcon(updateIcon);
        deleteFromDb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int[] rows = tableSupplier.getSelectedRows();
                Arrays.sort(rows);
                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];
                    ConnectionDB connectDB = new ConnectionDB();
                    Connection connection = connectDB.getConnect();

                    DefaultTableModel tableModel = (DefaultTableModel) tableSupplier.getModel();
                    String sql = "DELETE FROM `quanlybangiay`.`nhacungcap` WHERE (`maNCC` = ?);";
                    try {
                        connection.setAutoCommit(false);
                        PreparedStatement pst = connection.prepareStatement(sql);
                        String idBook = (String) tableModel.getValueAt(row, 0);
                        pst.setString(1, idBook);
                        pst.executeUpdate();
                        connection.commit();
                        ((DefaultTableModel) tableSupplier.getModel()).removeRow(row);
                        for (int j = i + 1; j < rows.length; j++) {
                            rows[j] = rows[j] - 1;
                        }
                        JOptionPane.showMessageDialog(null, "Successfully delete");
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Can not delele!\n" + ex.getMessage());
                    }

                }

            }
        });
        deleteFromTb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                int[] rows = tableSupplier.getSelectedRows();
                Arrays.sort(rows);

                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];
                    ((DefaultTableModel) tableSupplier.getModel()).removeRow(row);
                    for (int j = i + 1; j < rows.length; j++) {
                        rows[j] = rows[j] - 1;
                    }
                }
            }
        });
        update.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                ConnectionDB connectDB = new ConnectionDB();
                Connection connection = connectDB.getConnect();

                DefaultTableModel tableModel = (DefaultTableModel) tableSupplier.getModel();
                int[] rows = tableSupplier.getSelectedRows();
                Arrays.sort(rows);
                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];

                    String temp = (String) tableModel.getValueAt(row, 0);
                    String sql = "UPDATE `quanlybangiay`.`nhacungcap` "
                            + "SET `maNCC` = ?, `tenNCC` = ?, "
                            + "`diaChi` = ? WHERE (`maNCC` = ?);";
                    try {
                        connection.setAutoCommit(false);
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(4, temp);
                        pst.setString(1, tableModel.getValueAt(row, 0).toString());
                        pst.setString(2, tableModel.getValueAt(row, 1).toString());
                        pst.setString(3, tableModel.getValueAt(row, 2).toString());

                        pst.addBatch();
                        pst.executeUpdate();
                        connection.commit();
                        JOptionPane.showMessageDialog(null, "Successfully update");
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Can not update!\n" + ex.getMessage());
                    }
                }

            }
        });
        insertAbove.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((DefaultTableModel) tableSupplier.getModel()).insertRow(tableSupplier.getSelectedRow(), new Object[]{null});
                tableSupplier.removeRowSelectionInterval(tableSupplier.getSelectedRow(), tableSupplier.getSelectedRow());
            }
        });
        insertBelow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((DefaultTableModel) tableSupplier.getModel()).insertRow(tableSupplier.getSelectedRow() + 1, new Object[]{null});
                tableSupplier.removeRowSelectionInterval(tableSupplier.getSelectedRow() + 1, tableSupplier.getSelectedRow() + 1);
            }
        });
        subPopupMenu.add(deleteFromTb);
        subPopupMenu.add(deleteFromDb);
        insertMenu.add(insertBelow);
        insertMenu.add(insertAbove);
        deleteMenu.add(deleteFromTb);
        deleteMenu.add(deleteFromDb);
        popupMenu.add(insertMenu);
        popupMenu.add(deleteMenu);
        popupMenu.add(update);
        return popupMenu;

    }

    private boolean isEmptyRow(int row) {
        DefaultTableModel tableModel = (DefaultTableModel) tableSupplier.getModel();
        for (int i = 0; i < tableSupplier.getColumnCount(); i++) {
            String data = (String) tableSupplier.getValueAt(row, i);
            if (data == null) {
                return true;
            }
        }
        return false;
    }

    private void addRowData(XWPFTable table, int lastRowPosition) {
        for (int i = lastRowPosition - 1; i < tableSupplier.getRowCount(); i++) {
            XWPFTableRow newRow = table.createRow();
            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                newRow.getCell(j).setText(tableSupplier.getValueAt(i, j).toString());
            }

        }
    }

    private static void removeParagraphs(XWPFTableCell tableCell) {
        int count = tableCell.getParagraphs().size();
        for (int i = 0; i < count; i++) {
            tableCell.removeParagraph(i);
        }
    }

    private void setDefaultTable(XWPFTable table) {
        for (int i = 1; i < table.getRows().size(); i++) {
            table.removeRow(1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearData;
    private javax.swing.JButton exportFile;
    private javax.swing.JButton importFile;
    private javax.swing.JButton insertData;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JComboBox<String> properties;
    private javax.swing.JTextField searchBox;
    public javax.swing.JTable tableSupplier;
    private javax.swing.JButton viewData;
    // End of variables declaration//GEN-END:variables
}

package dictionaryjava;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DictionaryApplication extends javax.swing.JFrame {

    DefaultListModel<String> model = new DefaultListModel<>();
    ArrayList<Word> y = new ArrayList<>();
    DictionaryManagement x = new DictionaryManagement();
    int phan_biet = 0;
    String Qw;
    Word temporary = new Word();
    int SoTuRuturn = y.size();
    Map<String, String> map = new TreeMap<String, String>();

    public DictionaryApplication() throws IOException {
        map = x.map;
        initComponents();
        this.setSize(975, 705);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        jRadioButton1_E_V.setSelected(true);

    }

    public void ShowAll() {
        model.clear();
        for (Entry<String, String> a : map.entrySet()) {
            //System.out.println(a.getKey() + "\t" + a.getValue());
            model.addElement(a.getKey());
        }
        Jlist_hint.setModel(model);
        /*model.clear();
        for (int i = 0; i < x.soluongtu; i++) {
            model.addElement(x.a.arrayWord[i].word_taget);
        }
        Jlist_hint.setModel(model);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        textArea1 = new java.awt.TextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        label1 = new java.awt.Label();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Jlist_hint = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LabelEdit = new javax.swing.JLabel();
        LabelPlus = new javax.swing.JLabel();
        LabelDelete = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LabelSpeak = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        jRadioButton1_E_V = new javax.swing.JRadioButton();
        jRadioButton2_V_E = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jReturn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        label1.setText("label1");

        jScrollPane1.setViewportView(jTextPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary on Java");
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchFieldFocusLost(evt);
            }
        });
        SearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchFieldMouseClicked(evt);
            }
        });
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\logo1.png")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(jEditorPane1);

        Jlist_hint.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Jlist_hint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlist_hintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jlist_hintMouseEntered(evt);
            }
        });
        Jlist_hint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Jlist_hintKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(Jlist_hint);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\Google_Translate_Icon1.png")); // NOI18N
        jButton5.setText("Google Translate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        LabelEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icons8_Edit_52px_2 (1).png")); // NOI18N
        LabelEdit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LabelEditMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LabelEditMouseMoved(evt);
            }
        });
        LabelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelEditMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LabelEditMouseReleased(evt);
            }
        });

        LabelPlus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\plus-icon-black-2.png")); // NOI18N
        LabelPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelPlusMouseClicked(evt);
            }
        });

        LabelDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icons8_Trash_52px.png")); // NOI18N
        LabelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDeleteMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icons8_Star_Filled_52px.png")); // NOI18N

        LabelSpeak.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icons8_Speaker_48px.png")); // NOI18N
        LabelSpeak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelSpeakMouseClicked(evt);
            }
        });

        jScrollPane5.setViewportView(jTree1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icon-dicitionary.png")); // NOI18N
        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1_E_V);
        jRadioButton1_E_V.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1_E_V.setText("English -> Vietnamese");
        jRadioButton1_E_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_E_VActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2_V_E);
        jRadioButton2_V_E.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2_V_E.setText("Vietnamese -> English");
        jRadioButton2_V_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_V_EActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Designed by ......");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\icon-E_V.png")); // NOI18N

        jReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\143423-200.png")); // NOI18N
        jReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReturnMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\humansearch2.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 255));
        jLabel13.setText("About");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Le Hung\\Documents\\NetBeansProjects\\DictionaryJAVA\\icon_dicitonary\\novel.png")); // NOI18N

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1_E_V)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2_V_E)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelEdit)
                                                .addGap(26, 26, 26)
                                                .addComponent(LabelPlus)
                                                .addGap(18, 18, 18)
                                                .addComponent(LabelDelete)
                                                .addGap(33, 33, 33)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(LabelSpeak)
                                .addGap(191, 191, 191))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1102, 1102, 1102)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton2_V_E)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jReturn)
                            .addComponent(jRadioButton1_E_V)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10)
                                        .addComponent(LabelSpeak)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8)))
                                    .addGap(6, 6, 6)))
                            .addComponent(LabelEdit)
                            .addComponent(LabelPlus)
                            .addComponent(LabelDelete))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFieldMouseClicked
        // TODO add your handling code here:
        SearchField.setText("");
        ShowAll();
        SoTuRuturn = y.size();
    }//GEN-LAST:event_SearchFieldMouseClicked

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
//ARRAY 
        
        /*int k = 0;
        for (int i = 0; i < x.soluongtu; i++) {
//                if (x.a.arrayWord[i].word_taget.length()>=SearchField.getText().length()&&SearchField.getText().length()>=1){
//                    if (x.a.arrayWord[i].word_taget.substring(0, SearchField.getText().length()).equals(SearchField.getText().toLowerCase()))
//                    SuggestionWord.append(x.a.arrayWord[i].word_taget+"\n");
//                }
            if (SearchField.getText().toLowerCase().equals(x.a.arrayWord[i].word_taget)) {
                SearchField.setText(x.a.arrayWord[i].word_taget);
                jEditorPane1.setContentType("text/html"); // content type, định dạng hiện thị văn bản là dạng text/html
                jEditorPane1.setText(x.a.arrayWord[i].word_explain);
                y.add(x.a.arrayWord[i]);
                k = 1;;
                break;
            }
        }
        if (k == 0) {
            if (!SearchField.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thầy từ này trong từ điển ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập từ vào ");
            }
        }*/
// TREE MAP        
        if (map.containsKey(SearchField.getText().toLowerCase())) {
            SearchField.setText(SearchField.getText().toLowerCase());
            jEditorPane1.setContentType("text/html"); // content type, định dạng hiện thị văn bản là dạng text/html
            jEditorPane1.setText(map.get(SearchField.getText().toLowerCase()));
            Word NEW =new Word(SearchField.getText().toLowerCase(),map.get(SearchField.getText().toLowerCase()));
            y.add(NEW);
  
        } else if (!SearchField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thầy từ này trong từ điển ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập từ vào ");
        }
        phan_biet = 0;
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// ARRAY
        /*int k = 0;
        for (int i = 0; i < x.soluongtu; i++) {
//                if (x.a.arrayWord[i].word_taget.length()>=SearchField.getText().length()&&SearchField.getText().length()>=1){
//                    if (x.a.arrayWord[i].word_taget.substring(0, SearchField.getText().length()).equals(SearchField.getText().toLowerCase()))
//                    SuggestionWord.append(x.a.arrayWord[i].word_taget+"\n");
//                    
//                }
            if (SearchField.getText().toLowerCase().equals(x.a.arrayWord[i].word_taget)) {
                k = 1;
                jEditorPane1.setContentType("text/html"); // content type, định dạng hiện thị văn bản là dạng text/html
                jEditorPane1.setText(x.a.arrayWord[i].word_explain);
                y.add(x.a.arrayWord[i]);
                break;
            }
        }
        if (k == 0) {
            if (!SearchField.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thầy từ này trong từ điển ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập từ vào ");
            }
        }*/
        
// TREE MAP 
        if (map.containsKey(SearchField.getText().toLowerCase())) {
            SearchField.setText(SearchField.getText().toLowerCase());
            jEditorPane1.setContentType("text/html"); // content type, định dạng hiện thị văn bản là dạng text/html
            jEditorPane1.setText(map.get(SearchField.getText().toLowerCase()));
            Word NEW =new Word(SearchField.getText().toLowerCase(),map.get(SearchField.getText().toLowerCase()));
            y.add(NEW);
  
        } else if (!SearchField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thầy từ này trong từ điển ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải nhập từ vào ");
        }
        phan_biet = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void SearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyPressed
        // TODO add your handling code here:
//        String S=SearchField.getText();
//        SuggestionWord.setText("");
//        for (int i=0;i<x.soluongtu;i++){
//            if (x.a.arrayWord[i].word_taget.length()>=S.length()){
//            if (x.a.arrayWord[i].word_taget.startsWith(S)){
//                SuggestionWord.append(x.a.arrayWord[i].word_taget+"\n");
//            }
//        }
//        }
    }//GEN-LAST:event_SearchFieldKeyPressed

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
        // TODO add your handling code here:
        /*String S = SearchField.getText();
        model.clear();
        for (int i = 0; i < x.soluongtu; i++) {
            if (x.a.arrayWord[i].word_taget.length() >= S.length()) {
                if (x.a.arrayWord[i].word_taget.startsWith(S.toLowerCase())) {
                    model.addElement(x.a.arrayWord[i].word_taget);
                }
            }
        }
        Jlist_hint.setModel(model);*/
        String S = SearchField.getText();
        model.clear();
        for (Entry<String, String> a : map.entrySet()) {
            //System.out.println(a.getKey() + "\t" + a.getValue());
            if(a.getKey().startsWith(S))
            model.addElement(a.getKey());
            
        }
        Jlist_hint.setModel(model);


    }//GEN-LAST:event_SearchFieldKeyReleased

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        if (evt.getKeyCode() == evt.VK_DOWN) {

        }
    }//GEN-LAST:event_SearchFieldKeyTyped

    private void Jlist_hintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlist_hintMouseClicked
        // TODO add your handling code here:
        /*String qww = Jlist_hint.getSelectedValue();
        for (int i = 0; i < x.soluongtu; i++) {
            if (x.a.arrayWord[i].word_taget.equals(qww)) {
                y.add(x.a.arrayWord[i]);
                phan_biet = 1;
                Qw = Jlist_hint.getSelectedValue();
                model.clear();
                model.addElement(qww);
                Jlist_hint.setModel(model);
                SearchField.setText(qww);
                jEditorPane1.setContentType("text/html");
                jEditorPane1.setText(x.a.arrayWord[i].word_explain);
                break;
            }
        }*/
        String qww = Jlist_hint.getSelectedValue();
        if(map.containsKey(qww)){
                y.add(new Word(qww,map.get(qww)));
                phan_biet = 1;
                Qw = Jlist_hint.getSelectedValue();
                model.clear();
                model.addElement(qww);
                Jlist_hint.setModel(model);
                SearchField.setText(qww);
                jEditorPane1.setContentType("text/html");
                jEditorPane1.setText(map.get(qww));
        }
    }//GEN-LAST:event_Jlist_hintMouseClicked

    private void Jlist_hintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlist_hintMouseEntered
        // sự kiện khi nhấn enter
//        String qww = Jlist_hint.getSelectedValue();
//        for (int i = 0; i < x.soluongtu; i++) {
//            if (x.a.arrayWord[i].word_taget.equals(qww)) {
//                model.clear();
//                model.addElement(qww);
//                Jlist_hint.setModel(model);
//                jEditorPane1.setContentType("text/html");
//                jEditorPane1.setText(x.a.arrayWord[i].word_explain);
//                break;
//            }
//        }
//        phan_biet = 1;
//        Qw = Jlist_hint.getSelectedValue();
    }//GEN-LAST:event_Jlist_hintMouseEntered

    private void Jlist_hintKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jlist_hintKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String qww = Jlist_hint.getSelectedValue();
            for (int i = 0; i < x.soluongtu; i++) {
                if (x.a.arrayWord[i].word_taget.equals(qww)) {
                    jEditorPane1.setContentType("text/html");
                    jEditorPane1.setText(x.a.arrayWord[i].word_explain);
                    break;
                }
            }
        }
    }//GEN-LAST:event_Jlist_hintKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        API api = new API();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "HAHAHA");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        AddWord addWord = new AddWord(x);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new ChangeWord(x);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        DeleteWord deleteWord = new DeleteWord(x);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void LabelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEditMouseClicked
        // TODO add your handling code here:
        new ChangeWord(x);
    }//GEN-LAST:event_LabelEditMouseClicked

    private void LabelPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelPlusMouseClicked
        // TODO add your handling code here:
        new AddWord(x);
    }//GEN-LAST:event_LabelPlusMouseClicked

    private void LabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDeleteMouseClicked
        // TODO add your handling code here:
        new DeleteWord(x);
    }//GEN-LAST:event_LabelDeleteMouseClicked

    private void LabelSpeakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelSpeakMouseClicked
        // TODO add your handling code here:
        if (phan_biet == 1) {
            Freetts freetts = new Freetts(Qw);

        } else {
            Freetts freetts = new Freetts(SearchField.getText());
        }

    }//GEN-LAST:event_LabelSpeakMouseClicked

    private void SearchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFieldFocusLost

    }//GEN-LAST:event_SearchFieldFocusLost

    private void jRadioButton1_E_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_E_VActionPerformed
        // TODO add your handling code here:
        model.clear();
        try {
            //x.insertFromFile(x.fileE_V);
            
            // TREE MAP
            x.useTreeMapinsertFromFile(x.fileE_V);
            map=x.map;
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.ShowAll();
    }//GEN-LAST:event_jRadioButton1_E_VActionPerformed

    private void jRadioButton2_V_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_V_EActionPerformed
        // TODO add your handling code here:
        model.clear();
        try {
            //x.insertFromFile(x.fileV_E);
            
            //TREE MAP
            
            x.useTreeMapinsertFromFile(x.fileV_E);
            map=x.map;
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.ShowAll();
    }//GEN-LAST:event_jRadioButton2_V_EActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new History(y).Show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LabelEditMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEditMouseDragged

    }//GEN-LAST:event_LabelEditMouseDragged

    private void LabelEditMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEditMouseMoved

    }//GEN-LAST:event_LabelEditMouseMoved

    private void LabelEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEditMouseReleased

    }//GEN-LAST:event_LabelEditMouseReleased

    private void jReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReturnMouseClicked
        if (SoTuRuturn > 0) {
            SearchField.setText(y.get(--SoTuRuturn).word_taget);
            jEditorPane1.setText(y.get(--SoTuRuturn).word_explain);
            model.clear();
            model.addElement(y.get(--SoTuRuturn).word_taget);
            Jlist_hint.setModel(model);
        }
    }//GEN-LAST:event_jReturnMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DictionaryApplication().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Jlist_hint;
    private javax.swing.JLabel LabelDelete;
    private javax.swing.JLabel LabelEdit;
    private javax.swing.JLabel LabelPlus;
    private javax.swing.JLabel LabelSpeak;
    private javax.swing.JTextField SearchField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1_E_V;
    private javax.swing.JRadioButton jRadioButton2_V_E;
    private javax.swing.JLabel jReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTree jTree1;
    private java.awt.Label label1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}

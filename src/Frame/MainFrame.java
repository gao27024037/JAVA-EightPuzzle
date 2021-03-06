/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import algorithm.EightPuzzle;
import algorithm.Execute;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author SAKURA
 */

public class MainFrame extends JFrame {

    /**
     * Creates new form NewUI2
     */
    public MainFrame() {
        setTitle("八数码问题演示");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * 由NetBeans完成
     */
    private void initComponents() {

        jPanelInitial = new JPanel();
        jTextFieldInitial1 = new JTextField();
        jTextFieldInitial2 = new JTextField();
        jTextFieldInitial3 = new JTextField();
        jTextFieldInitial4 = new JTextField();
        jTextFieldInitial5 = new JTextField();
        jTextFieldInitial6 = new JTextField();
        jTextFieldInitial7 = new JTextField();
        jTextFieldInitial8 = new JTextField();
        jTextFieldInitial9 = new JTextField();
        jPanelTarget = new JPanel();
        jTextFieldTarget1 = new JTextField();
        jTextFieldTarget2 = new JTextField();
        jTextFieldTarget3 = new JTextField();
        jTextFieldTarget4 = new JTextField();
        jTextFieldTarget5 = new JTextField();
        jTextFieldTarget6 = new JTextField();
        jTextFieldTarget7 = new JTextField();
        jTextFieldTarget8 = new JTextField();
        jTextFieldTarget9 = new JTextField();
        jPanelDemonstrate = new JPanel();
        jLabelDemonstrate1 = new JLabel();
        jLabelDemonstrate2 = new JLabel();
        jLabelDemonstrate3 = new JLabel();
        jLabelDemonstrate4 = new JLabel();
        jLabelDemonstrate5 = new JLabel();
        jLabelDemonstrate6 = new JLabel();
        jLabelDemonstrate7 = new JLabel();
        jLabelDemonstrate8 = new JLabel();
        jLabelDemonstrate9 = new JLabel();
        jButtonRandomGenerate = new JButton();
        jButtonAbilityOfSolution = new JButton();
        jButtonBreadthFirst = new JButton();
        jButtonDepthFirst = new JButton();
        jButtonAStar = new JButton();
        jButtonReset = new JButton();
        jPanelStep = new JPanel();
        scrollPaneStep = new java.awt.ScrollPane();
        jScrollPaneStep = new JScrollPane();
        jTextAreaStep = new JTextArea();
        jPanelExtendedNodes = new JPanel();
        jTextFieldExtendedNodes = new JTextField();
        jPanelTimeConsuming = new JPanel();
        jTextFieldTimeConsuming = new JTextField();

        addList();//将1-9相同元素放入ArrayList（JLable,JTextField）

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelInitial.setBorder(BorderFactory.createTitledBorder("初始状态"));
        jPanelInitial.setToolTipText("");
        jPanelInitial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelInitial.setPreferredSize(new java.awt.Dimension(100, 150));
        jPanelDemonstrate.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (runFlag) {
                    demonstrate();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //合并大量重复代码 用ForEach代替
        for (JTextField jTextField: listInit) {
            jTextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
            jTextField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {}

                @Override
                public void focusLost(FocusEvent e) {
                    super.focusLost(e);
                    alert(jTextField);
                }
            });
        }

        GroupLayout jPanelInitialLayout = new GroupLayout(jPanelInitial);
        jPanelInitial.setLayout(jPanelInitialLayout);
        jPanelInitialLayout.setHorizontalGroup(
            jPanelInitialLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInitialLayout.createSequentialGroup()
                .addComponent(jTextFieldInitial1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelInitialLayout.createSequentialGroup()
                .addComponent(jTextFieldInitial4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelInitialLayout.createSequentialGroup()
                .addComponent(jTextFieldInitial7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInitial9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        jPanelInitialLayout.setVerticalGroup(
            jPanelInitialLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInitialLayout.createSequentialGroup()
                .addGroup(jPanelInitialLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInitial1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInitialLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInitial4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInitialLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInitial7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInitial9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
        );

        jPanelTarget.setBorder(BorderFactory.createTitledBorder("目标状态"));
        jPanelTarget.setPreferredSize(new java.awt.Dimension(100, 150));

        //合并大量重复代码 用ForEach代替
        for (JTextField jTextField: listTarget) {
            jTextField.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
            jTextField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {}

                @Override
                public void focusLost(FocusEvent e) {
                    super.focusLost(e);
                    alert(jTextField);
                }
            });
        }

        GroupLayout jPanelTargetLayout = new GroupLayout(jPanelTarget);
        jPanelTarget.setLayout(jPanelTargetLayout);
        jPanelTargetLayout.setHorizontalGroup(
            jPanelTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTargetLayout.createSequentialGroup()
                .addComponent(jTextFieldTarget1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTargetLayout.createSequentialGroup()
                .addComponent(jTextFieldTarget4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTargetLayout.createSequentialGroup()
                .addComponent(jTextFieldTarget7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTarget9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        jPanelTargetLayout.setVerticalGroup(
            jPanelTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTargetLayout.createSequentialGroup()
                .addGroup(jPanelTargetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTarget1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTargetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTarget4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTargetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTarget7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTarget9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
        );

        jPanelDemonstrate.setBorder(BorderFactory.createTitledBorder("图示"));

        jLabelDemonstrate1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate1.setIcon(new ImageIcon(getClass().getResource("/Pic/1.jpg"))); // NOI18N

        jLabelDemonstrate2.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate2.setIcon(new ImageIcon(getClass().getResource("/Pic/2.jpg"))); // NOI18N

        jLabelDemonstrate3.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate3.setIcon(new ImageIcon(getClass().getResource("/Pic/3.jpg"))); // NOI18N

        jLabelDemonstrate4.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate4.setIcon(new ImageIcon(getClass().getResource("/Pic/8.jpg"))); // NOI18N

        jLabelDemonstrate5.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate5.setIcon(new ImageIcon(getClass().getResource("/Pic/0.jpg"))); // NOI18N

        jLabelDemonstrate6.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate6.setIcon(new ImageIcon(getClass().getResource("/Pic/4.jpg"))); // NOI18N

        jLabelDemonstrate7.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate7.setIcon(new ImageIcon(getClass().getResource("/Pic/7.jpg"))); // NOI18N

        jLabelDemonstrate8.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate8.setIcon(new ImageIcon(getClass().getResource("/Pic/6.jpg"))); // NOI18N

        jLabelDemonstrate9.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabelDemonstrate9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelDemonstrate9.setIcon(new ImageIcon(getClass().getResource("/Pic/5.jpg"))); // NOI18N

        GroupLayout jPanelDemonstrateLayout = new GroupLayout(jPanelDemonstrate);
        jPanelDemonstrate.setLayout(jPanelDemonstrateLayout);
        jPanelDemonstrateLayout.setHorizontalGroup(
            jPanelDemonstrateLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDemonstrateLayout.createSequentialGroup()
                .addComponent(jLabelDemonstrate1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelDemonstrateLayout.createSequentialGroup()
                .addComponent(jLabelDemonstrate4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelDemonstrateLayout.createSequentialGroup()
                .addComponent(jLabelDemonstrate7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDemonstrate9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );
        jPanelDemonstrateLayout.setVerticalGroup(
            jPanelDemonstrateLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelDemonstrateLayout.createSequentialGroup()
                .addGroup(jPanelDemonstrateLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDemonstrate2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDemonstrateLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDemonstrate4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDemonstrateLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDemonstrate7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDemonstrate9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        );

        jButtonRandomGenerate.setText("随机生成");
        jButtonRandomGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent rg) {
                jButtonRandomGenerateActionPerformed(rg);
            }
        });

        jButtonAbilityOfSolution.setText("是否有解");
        jButtonAbilityOfSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent iss) {
                jAbilityOfSolutionActionPerformed(iss);
            }
        });

        jButtonBreadthFirst.setText("宽度优先算法");
        jButtonBreadthFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent bf) {
                jButtonBreadthFirstActionPerformed(bf);
            }
        });

        jButtonDepthFirst.setText("深度优先算法");
        jButtonDepthFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent df) {
                jButtonDepthFirstActionPerformed(df);
            }
        });

        jButtonAStar.setText("A*算法");
        jButtonAStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent as) {
                jButtonAStarActionPerformed(as);
            }
        });

        jButtonReset.setText("重置");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent rs) {
                jButtonResetActionPerformed(rs);
            }
        });
        jPanelStep.setBorder(BorderFactory.createTitledBorder("移动步骤"));

        jTextAreaStep.setColumns(20);
        jTextAreaStep.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaStep.setRows(5);
        jScrollPaneStep.setViewportView(jTextAreaStep);

        scrollPaneStep.add(jScrollPaneStep);

        GroupLayout jPanelStepLayout = new GroupLayout(jPanelStep);
        jPanelStep.setLayout(jPanelStepLayout);
        jPanelStepLayout.setHorizontalGroup(
            jPanelStepLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneStep, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jPanelStepLayout.setVerticalGroup(
            jPanelStepLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneStep, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanelExtendedNodes.setBorder(BorderFactory.createTitledBorder("已搜索节点数"));

        GroupLayout jPanelExtendedNodesLayout = new GroupLayout(jPanelExtendedNodes);
        jPanelExtendedNodes.setLayout(jPanelExtendedNodesLayout);
        jPanelExtendedNodesLayout.setHorizontalGroup(
            jPanelExtendedNodesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldExtendedNodes, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanelExtendedNodesLayout.setVerticalGroup(
            jPanelExtendedNodesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldExtendedNodes)
        );

        jPanelTimeConsuming.setBorder(BorderFactory.createTitledBorder("耗时"));

        GroupLayout jPanelTimeConsumingLayout = new GroupLayout(jPanelTimeConsuming);
        jPanelTimeConsuming.setLayout(jPanelTimeConsumingLayout);
        jPanelTimeConsumingLayout.setHorizontalGroup(
            jPanelTimeConsumingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTimeConsuming, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanelTimeConsumingLayout.setVerticalGroup(
            jPanelTimeConsumingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTimeConsuming)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTarget, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelInitial, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRandomGenerate, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDemonstrate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelStep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAbilityOfSolution, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBreadthFirst, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDepthFirst, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAStar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelExtendedNodes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTimeConsuming, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAbilityOfSolution)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBreadthFirst)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDepthFirst)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAStar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonReset))
                            .addComponent(jPanelDemonstrate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanelExtendedNodes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelTimeConsuming, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelStep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelInitial, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRandomGenerate)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelTarget, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        //将窗体设置在屏幕中间
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //得到屏幕的尺寸
        setLocation(((screenSize.width-getWidth())/2), ((screenSize.height-getHeight())/2));
    }// </editor-fold>//GEN-END:initComponents


    //A*算法按钮响应
    private void jButtonAStarActionPerformed(ActionEvent as) {//GEN-FIRST:event_jButtonAStarActionPerformed
        caculate(Algorithm.AStar);
    }//GEN-LAST:event_jButtonAStarActionPerformed

    //深度优先搜索响应
    private void jButtonDepthFirstActionPerformed(ActionEvent df) {//GEN-FIRST:event_jButtonDepthFirstActionPerformed
        caculate(Algorithm.DepthFirst);
    }//GEN-LAST:event_jButtonDepthFirstActionPerformed

    //随机生成响应
    private void jButtonRandomGenerateActionPerformed(ActionEvent rg) {//GEN-FIRST:event_jButtonRandomGenerateActionPerformed
        int[] random = getRandom();
        int i = 0;
        System.out.println(i);
        for (JTextField init: listInit) {
            init.setText(String.valueOf(random[i++]));
        }
        random = getRandom();
        i = 0;
        for (JTextField target: listTarget) {
            target.setText(String.valueOf(random[i++]));
        }
        jTextAreaStep.setText("");

    }//GEN-LAST:event_jButtonRandomGenerateActionPerformed

    //宽度优先响应
    private void jButtonBreadthFirstActionPerformed(ActionEvent bf) {
        caculate(Algorithm.BreadFirst);
    }

    //可解按钮响应 是否可解 可执行
    private void jAbilityOfSolutionActionPerformed(ActionEvent iss) {
        isSolvable();
    }

    //重置按钮响应
    private void jButtonResetActionPerformed(ActionEvent rs) {
        jTextAreaStep.setText("");
        jTextFieldTimeConsuming.setText("");
        jTextFieldExtendedNodes.setText("");
        addNumberToField();
        runFlag = true;
        route.clear();
    }

    //显示提示框
    private void alert(JTextField jTextField) {
        if (!jTextField.getText().matches("[0-8]")) {
            JOptionPane.showMessageDialog(null, "请输入0-8的数字", "警告", JOptionPane.ERROR_MESSAGE);
            jTextField.requestFocusInWindow();//输入不通过时焦点落回错误文本框
        }
    }

    //计算
    private void caculate(Algorithm algorithm) {
        if(isSolvable()) {
            if (!isTarget()) {
                ex = new Execute();
                Long timeStart = 0L;
                Long timeEnd = 0L;
                switch (algorithm) {
                    case AStar:
                        timeStart = System.currentTimeMillis();
                        route = ex.AStar(start, target);
                        timeEnd = System.currentTimeMillis();break;
                    case BreadFirst:
                        timeStart = System.currentTimeMillis();
                        route = ex.BreadthFirst(start, target);
                        timeEnd = System.currentTimeMillis();break;
                    case DepthFirst:
                        timeStart = System.currentTimeMillis();
                        route = ex.DepthFirst(start, target);
                        timeEnd = System.currentTimeMillis();break;
                }
                printResult(timeEnd - timeStart);
            }
        } else {
            jTextAreaStep.setText("当前状态不可解！");
        }
    }

    //演示移动 动画
    private void demonstrate() {
        runFlag = false;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int[] num: route) {
                    for (int i = 0; i< 9; i++) {
                        listDemonstrate.get(i).setIcon(new ImageIcon(getClass().getResource("/Pic/" + num[i] + ".jpg"))); // NOI18N
                    }
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                runFlag = true;
            }
        }).start();
    }

    //输出打印结果
    private void printResult(long time){
        jTextFieldExtendedNodes.setText(String.valueOf(ex.getNodeNumber()));
        jTextFieldTimeConsuming.setText(time + "ms");
        jTextAreaStep.setText("");
        int step = 0;
        for(int[] num : route) {
            String s = "";
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0) {
                    s +=("\n" + num[i]);
                } else {
                    s +=num[i];
                }
            }
            jTextAreaStep.append(s);
            jTextAreaStep.append("\n" + "---第 "+(step++)+" 步---" + "");
        }
        //改变图案为初始状态
        for (int i = 0; i< 9; i++) {
            listDemonstrate.get(i).setIcon(new ImageIcon(getClass().getResource("/Pic/" + route.get(0)[i] + ".jpg"))); // NOI18N
        }
    }

    //从九宫格获取数值 判断是否可解
    private boolean isSolvable() {
        getNumByField();
        if(start.isSolvable(target)) {
            jTextAreaStep.setText("可解");
            isTarget();
            return true;
        } else  {
            jTextAreaStep.setText("不可解");
            return false;
        }
    }

    //判断是否是自身
    private boolean isTarget() {
        if(start.isTarget(target)) {
            jTextAreaStep.setText("初始状态就是目标状态");
            return true;
        } else  {
            return false;
        }
    }

    //获取随机值
    private int[] getRandom() {
        int[] random = new int[9];
        ArrayList<Integer> allNum =new ArrayList<Integer>();
        for(int i = 0; i < 9; i++) {
            allNum.add(i);
        }
        for(int i = 0, r; i < 9 || allNum.size() > 0; i++) {
            r =(int)(Math.round(Math.random()*(allNum.size() - 1)));
            random[i] = allNum.get(r);
            allNum.remove(r);
        }
        return random;
    }

    //把九宫格元素加入LIST
    private void addList() {
        listInit.add(jTextFieldInitial1);
        listInit.add(jTextFieldInitial2);
        listInit.add(jTextFieldInitial3);
        listInit.add(jTextFieldInitial4);
        listInit.add(jTextFieldInitial5);
        listInit.add(jTextFieldInitial6);
        listInit.add(jTextFieldInitial7);
        listInit.add(jTextFieldInitial8);
        listInit.add(jTextFieldInitial9);

        listTarget.add(jTextFieldTarget1);
        listTarget.add(jTextFieldTarget2);
        listTarget.add(jTextFieldTarget3);
        listTarget.add(jTextFieldTarget4);
        listTarget.add(jTextFieldTarget5);
        listTarget.add(jTextFieldTarget6);
        listTarget.add(jTextFieldTarget7);
        listTarget.add(jTextFieldTarget8);
        listTarget.add(jTextFieldTarget9);

        listDemonstrate.add(jLabelDemonstrate1);
        listDemonstrate.add(jLabelDemonstrate2);
        listDemonstrate.add(jLabelDemonstrate3);
        listDemonstrate.add(jLabelDemonstrate4);
        listDemonstrate.add(jLabelDemonstrate5);
        listDemonstrate.add(jLabelDemonstrate6);
        listDemonstrate.add(jLabelDemonstrate7);
        listDemonstrate.add(jLabelDemonstrate8);
        listDemonstrate.add(jLabelDemonstrate9);

        addNumberToField();
    }

    //将数组数字加入Field
    private void addNumberToField() {
        int i = 0;
        for (JTextField init: listInit) {
            init.setText(String.valueOf(startnum[i++]));
        }
        i = 0;
        for (JTextField target: listTarget) {
            target.setText(String.valueOf(targetnum[i++]));
        }
    }

    //从Field里获取每个格子的值
    private void getNumByField() {
        int i = 0;
        for (JTextField init : listInit
                ) {
            startnum[i++] = Integer.parseInt(init.getText());
        }
        i = 0;
        for (JTextField target : listTarget
                ) {
            targetnum[i++] = Integer.parseInt(target.getText());
        }
        start.setNum(startnum);
        target.setNum(targetnum);
    }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    //可执行标签
    private boolean runFlag = true;
    //Execute对象
    private Execute ex = new Execute();
    //存路线
    private ArrayList<int[]> route = new ArrayList<int[]>();
    private int[] startnum = {0,8,7,6,5,4,3,2,1};
    private int[] targetnum = {1,2,3,4,5,6,7,8,0};
    private EightPuzzle start = new EightPuzzle();
    private EightPuzzle target = new EightPuzzle();
    private ArrayList<JLabel> listDemonstrate= new ArrayList<JLabel>();
    private ArrayList<JTextField> listInit = new ArrayList<JTextField>();
    private ArrayList<JTextField> listTarget = new ArrayList<JTextField>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonAStar;
    private JButton jButtonAbilityOfSolution;
    private JButton jButtonBreadthFirst;
    private JButton jButtonDepthFirst;
    private JButton jButtonRandomGenerate;
    private JButton jButtonReset;
    private JLabel jLabelDemonstrate1;
    private JLabel jLabelDemonstrate2;
    private JLabel jLabelDemonstrate3;
    private JLabel jLabelDemonstrate4;
    private JLabel jLabelDemonstrate5;
    private JLabel jLabelDemonstrate6;
    private JLabel jLabelDemonstrate7;
    private JLabel jLabelDemonstrate8;
    private JLabel jLabelDemonstrate9;
    private JPanel jPanelDemonstrate;
    private JPanel jPanelExtendedNodes;
    private JPanel jPanelInitial;
    private JPanel jPanelStep;
    private JPanel jPanelTarget;
    private JPanel jPanelTimeConsuming;
    private JScrollPane jScrollPaneStep;
    private JTextArea jTextAreaStep;
    private JTextField jTextFieldExtendedNodes;
    private JTextField jTextFieldInitial1;
    private JTextField jTextFieldInitial2;
    private JTextField jTextFieldInitial3;
    private JTextField jTextFieldInitial4;
    private JTextField jTextFieldInitial5;
    private JTextField jTextFieldInitial6;
    private JTextField jTextFieldInitial7;
    private JTextField jTextFieldInitial8;
    private JTextField jTextFieldInitial9;
    private JTextField jTextFieldTarget1;
    private JTextField jTextFieldTarget2;
    private JTextField jTextFieldTarget3;
    private JTextField jTextFieldTarget4;
    private JTextField jTextFieldTarget5;
    private JTextField jTextFieldTarget6;
    private JTextField jTextFieldTarget7;
    private JTextField jTextFieldTarget8;
    private JTextField jTextFieldTarget9;
    private JTextField jTextFieldTimeConsuming;
    private java.awt.ScrollPane scrollPaneStep;
    // End of variables declaration//GEN-END:variables
}

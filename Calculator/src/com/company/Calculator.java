package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementam interfata ActionListener
public class Calculator implements ActionListener {
    //Creem variabilele necessare pentru calculator
    double numar, rezultat;
    int calcul;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonUnu = new JButton("1");
    JButton buttonDoi = new JButton("2");
    JButton buttonTrei = new JButton("3");
    JButton buttonPatru = new JButton("4");
    JButton buttonCinci = new JButton("5");
    JButton buttonSase = new JButton("6");
    JButton buttonSapte = new JButton("7");
    JButton buttonOpt = new JButton("8");
    JButton buttonNoua = new JButton("9");
    JButton buttonPunct = new JButton(".");
    JButton buttonCuratare = new JButton("C");
    JButton buttonStergere = new JButton("DEL");
    JButton buttonEgal = new JButton("=");
    JButton buttonInm = new JButton("x");
    JButton buttonImp = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonRidPat = new JButton("x\u00B2");
    JButton buttonReciproc = new JButton("1/x");
    JButton buttonRadical = new JButton("\u221A");


    public Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.gray);
        frame.add(label);


        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.red);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.red);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSapte.setBounds(10, 230, 60, 40);
        buttonSapte.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSapte);

        buttonOpt.setBounds(80, 230, 60, 40);
        buttonOpt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOpt);

        buttonNoua.setBounds(150, 230, 60, 40);
        buttonNoua.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNoua);

        buttonPatru.setBounds(10, 290, 60, 40);
        buttonPatru.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonPatru);

        buttonCinci.setBounds(80, 290, 60, 40);
        buttonCinci.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonCinci);

        buttonSase.setBounds(150, 290, 60, 40);
        buttonSase.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSase);

        buttonUnu.setBounds(10, 350, 60, 40);
        buttonUnu.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonUnu);

        buttonDoi.setBounds(80, 350, 60, 40);
        buttonDoi.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDoi);

        buttonTrei.setBounds(150, 350, 60, 40);
        buttonTrei.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTrei);

        buttonPunct.setBounds(150, 410, 60, 40);
        buttonPunct.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonPunct);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEgal.setBounds(220, 350, 60, 100);
        buttonEgal.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEgal.setBackground(Color.green);
        frame.add(buttonEgal);

        buttonImp.setBounds(220, 110, 60, 40);
        buttonImp.setFont(new Font("Arial", Font.BOLD, 20));
        buttonImp.setBackground(new Color(239, 188, 2));
        frame.add(buttonImp);

        buttonRadical.setBounds(10, 170, 60, 40);
        buttonRadical.setFont(new Font("Arial", Font.BOLD, 18));
        buttonRadical.setBackground(new Color(239, 188, 2));
        frame.add(buttonRadical);

        buttonInm.setBounds(220, 230, 60, 40);
        buttonInm.setFont(new Font("Arial", Font.BOLD, 20));
        buttonInm.setBackground(new Color(239, 188, 2));
        frame.add(buttonInm);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonRidPat.setBounds(80, 170, 60, 40);
        buttonRidPat.setFont(new Font("Arial", Font.BOLD, 20));
        buttonRidPat.setBackground(new Color(239, 188, 2));
        frame.add(buttonRidPat);

        buttonReciproc.setBounds(150, 170, 60, 40);
        buttonReciproc.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciproc.setBackground(new Color(239, 188, 2));
        frame.add(buttonReciproc);

        buttonStergere.setBounds(150, 110, 60, 40);
        buttonStergere.setFont(new Font("Arial", Font.BOLD, 12));
        buttonStergere.setBackground(Color.red);
        buttonStergere.setForeground(Color.white);
        frame.add(buttonStergere);

        buttonCuratare.setBounds(80, 110, 60, 40);
        buttonCuratare.setFont(new Font("Arial", Font.BOLD, 12));
        buttonCuratare.setBackground(Color.red);
        buttonCuratare.setForeground(Color.white);
        frame.add(buttonCuratare);

    }

    public void addActionEvent() {
        //Inregistram ActionListener butoanelor
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonCuratare.addActionListener(this);
        buttonStergere.addActionListener(this);
        buttonImp.addActionListener(this);
        buttonRadical.addActionListener(this);
        buttonRidPat.addActionListener(this);
        buttonReciproc.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSapte.addActionListener(this);
        buttonOpt.addActionListener(this);
        buttonNoua.addActionListener(this);
        buttonInm.addActionListener(this);
        buttonPatru.addActionListener(this);
        buttonCinci.addActionListener(this);
        buttonSase.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonUnu.addActionListener(this);
        buttonDoi.addActionListener(this);
        buttonTrei.addActionListener(this);
        buttonEgal.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonPunct.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            activare();//Apelam functia activare
        } else if (source == offRadioButton) {
            dezactivare();//Apelam functia dezactivare
        } else if (source == buttonCuratare) {
            //Stergerea textelor de eticheta si camp de text
            label.setText("");
            textField.setText("");
        } else if (source == buttonStergere) {
            //Setam functionalitatea pentru butonul de stergere(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonUnu) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonDoi) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonTrei) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonPatru) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonCinci) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSase) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSapte) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonOpt) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNoua) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonPunct) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {
            String str = textField.getText();
            numar = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calcul = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            numar = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calcul = 2;
        } else if (source == buttonInm) {
            String str = textField.getText();
            numar = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calcul = 3;
        } else if (source == buttonImp) {
            String str = textField.getText();
            numar = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calcul = 4;
        } else if (source == buttonRadical) {
            numar = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(numar);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonRidPat) {
            String str = textField.getText();
            numar = Double.parseDouble(textField.getText());
            double square = Math.pow(numar, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciproc) {
            numar = Double.parseDouble(textField.getText());
            double reciprocal = 1 / numar;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEgal) {
            //Setam functionalitatea pentru butonul egal(=)
            switch (calcul) {
                case 1:
                    rezultat = numar + Double.parseDouble(textField.getText());
                    if (Double.toString(rezultat).endsWith(".0")) {
                        textField.setText(Double.toString(rezultat).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(rezultat));
                    }
                    label.setText("");
                    break;
                case 2:
                    rezultat = numar - Double.parseDouble(textField.getText());
                    if (Double.toString(rezultat).endsWith(".0")) {
                        textField.setText(Double.toString(rezultat).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(rezultat));
                    }
                    label.setText("");
                    break;
                case 3:
                    rezultat = numar * Double.parseDouble(textField.getText());
                    if (Double.toString(rezultat).endsWith(".0")) {
                        textField.setText(Double.toString(rezultat).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(rezultat));
                    }
                    label.setText("");
                    break;
                case 4:
                    rezultat = numar / Double.parseDouble(textField.getText());
                    if (Double.toString(rezultat).endsWith(".0")) {
                        textField.setText(Double.toString(rezultat).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(rezultat));
                    }
                    label.setText("");
                    break;

            }
        }


    }

    public void activare() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonCuratare.setEnabled(true);
        buttonStergere.setEnabled(true);
        buttonImp.setEnabled(true);
        buttonRadical.setEnabled(true);
        buttonRidPat.setEnabled(true);
        buttonReciproc.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSapte.setEnabled(true);
        buttonOpt.setEnabled(true);
        buttonNoua.setEnabled(true);
        buttonInm.setEnabled(true);
        buttonPatru.setEnabled(true);
        buttonCinci.setEnabled(true);
        buttonSase.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonUnu.setEnabled(true);
        buttonDoi.setEnabled(true);
        buttonTrei.setEnabled(true);
        buttonEgal.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonPunct.setEnabled(true);

    }

    public void dezactivare() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        buttonCuratare.setEnabled(false);
        buttonStergere.setEnabled(false);
        buttonImp.setEnabled(false);
        buttonRadical.setEnabled(false);
        buttonRidPat.setEnabled(false);
        buttonReciproc.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSapte.setEnabled(false);
        buttonOpt.setEnabled(false);
        buttonNoua.setEnabled(false);
        buttonInm.setEnabled(false);
        buttonPatru.setEnabled(false);
        buttonCinci.setEnabled(false);
        buttonSase.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonUnu.setEnabled(false);
        buttonDoi.setEnabled(false);
        buttonTrei.setEnabled(false);
        buttonEgal.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonPunct.setEnabled(false);
    }
}



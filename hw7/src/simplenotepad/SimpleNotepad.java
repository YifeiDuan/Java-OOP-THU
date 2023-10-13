package simplenotepad;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextArea;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class SimpleNotepad extends JFrame implements ActionListener{
    JMenuBar jmb = new JMenuBar();
    JMenu jm = new JMenu("File");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JTextArea txt = new JTextArea();
    JScrollPane jsp;

    SimpleNotepad(){
        this.openItem.addActionListener(this);
        this.saveItem.addActionListener(this);
        this.jm.add(this.openItem);
        this.jm.add(this.saveItem);
        this.jmb.add(this.jm);
        this.setJMenuBar(this.jmb);
        this.jsp = new JScrollPane(this.txt);
        this.txt.setBounds(5, 5, 790, 490);
        this.txt.setEditable(true);
        this.txt.setWrapStyleWord(true);
        this.txt.setLineWrap(true);
        this.add(this.jsp);
        this.setSize(800,500);
        this.setTitle("Notepad");
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JFileChooser jfc;
        File selected;

        if(e.getSource() == this.openItem){
            jfc = new JFileChooser();
            if(jfc.showOpenDialog(this) == 0){
                selected = jfc.getSelectedFile();

                try{
                    Scanner s = new Scanner(new FileInputStream(selected));
                    String content = "";
                    while(s.hasNext())
                        content = content + s.nextLine()+"\n";
                    this.txt.setText(content);
                    this.txt.setVisible(true);
                    this.setContentPane(this.getContentPane());
                }catch(FileNotFoundException g){
                    System.out.println("NotFound");
                }
            }
        }

        if(e.getSource() == this.saveItem){
            jfc = new JFileChooser();
            if(jfc.showSaveDialog(this) == 0){
                selected = jfc.getSelectedFile();

                try{
                    PrintStream ps = new PrintStream(new FileOutputStream(selected));
                    ps.println(txt.getText());
                } catch (FileNotFoundException g){}
              }
            }
        }


    public static void main(String[] var0) {
        SimpleNotepad e = new SimpleNotepad();
        e.setDefaultCloseOperation(3);
    }
}

package colorword;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorWord extends JFrame implements ItemListener {
    Color c;
    JRadioButton btn1;
    JRadioButton btn2;
    JRadioButton btn3;

    public ColorWord() {
        this.setVisible(true);
        this.setSize(500, 500);

        this.btn1 = new JRadioButton("red");
        this.btn2 = new JRadioButton("blue");
        this.btn3 = new JRadioButton("black");

        ButtonGroup bg = new ButtonGroup();
        bg.add(this.btn1);
        bg.add(this.btn2);
        bg.add(this.btn3);

        JPanel pan = new JPanel();
        pan.add(this.btn1);
        pan.add(this.btn2);
        pan.add(this.btn3);
        this.add(pan);

        this.btn1.addItemListener(this);
        this.btn2.addItemListener(this);
        this.btn3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getItemSelectable() == this.btn1) {
            this.c = Color.RED;
        } else if (e.getItemSelectable() == this.btn2) {
            this.c = Color.BLUE;
        } else {
            this.c = Color.BLACK;
        }

        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(this.c);
        g.setFont(new Font("Serif", 1, 20));
        g.drawString("Hello World", 20, 100);
    }

    public static void main(String[] args) {
        ColorWord app = new ColorWord();
        app.setDefaultCloseOperation(3);
    }
}


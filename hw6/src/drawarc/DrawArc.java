package drawarc;

import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;

public class DrawArc extends JFrame{
    public DrawArc() {
        this.setVisible(true);
        this.setSize(600, 600);
    }

    public void paint(Graphics g0) {
        super.paint(g0);
        Graphics2D g = (Graphics2D)g0;
        g.setColor(Color.GREEN);
        g.fillRect(295, 200, 10, 350);

        AffineTransform trans = new AffineTransform(); //准备旋转变换
        int angle = 30; //旋转角度
        trans.rotate(angle*Math.PI/180.0,100,100); //旋转变换设置
        g.setTransform(trans); //画笔设为旋转模式
        g.fillRect(50,50,100,100);
        trans.rotate(-angle*Math.PI/180.0,100,100); //旋转变换设置
        g.setTransform(trans); //画笔恢复一般模式

        g.setColor(Color.BLUE);
        g.fillArc(150, 50, 300, 300, 30, 30);
        g.fillArc(150, 50, 300, 300, 120, 30);
        g.fillArc(150, 50, 300, 300, 210, 30);
        g.fillArc(150, 50, 300, 300, 300, 30);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", 1, 18));
        g.drawString("Welcome to Java world", 50, 500);
    }

    public static void main(String[] args) {
        DrawArc app = new DrawArc();
        app.setDefaultCloseOperation(3);
    }
}

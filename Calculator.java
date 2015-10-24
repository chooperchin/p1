
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Calculator extends JFrame{
	
	JButton bttn1,bttn2,bttn3,bttn4,bttn5,bttn6,bttn7,bttn8,bttn9,bttn0,
			bttnC,bttnDot,bttnP,bttnM,bttnT,bttnD,bttnE;
	
	JTextField tf1;
	JPanel p1,p2,p3;
	
    public Calculator() {
    	
    	bttn1 = new JButton("1");
    	bttn2 = new JButton("2");
    	bttn3 = new JButton("3");
    	bttn4 = new JButton("4");
    	bttn5 = new JButton("5");
    	bttn6 = new JButton("6");
    	bttn7 = new JButton("7");
    	bttn8 = new JButton("8");
    	bttn9 = new JButton("9");
    	bttn0 = new JButton("0");
    	bttnC = new JButton("C");
    	bttnDot = new JButton(".");
    	bttnP = new JButton("+");
    	bttnM = new JButton("-");
    	bttnT = new JButton("x");
    	bttnD = new JButton("/");
    	bttnE = new JButton("=");
    	
    	tf1 = new JTextField();
    	tf1.setPreferredSize( new Dimension( 250, 24 ) );
    	
    	p1 = new JPanel();
    	p2 = new JPanel();
    	p3 = new JPanel();
    	
    	BorderLayout layout1 = new BorderLayout();
    	GridLayout layout2 = new GridLayout(4,4,4,4);
    	FlowLayout layout3 = new FlowLayout();
    	
    	setLayout(layout1);
    	
    	p1.setLayout(layout3);
    	p1.add(tf1);
    	add(p1,BorderLayout.NORTH);
    	
    	p2.setLayout(layout2);
    	p2.add(bttnP);
    	p2.add(bttn9);
    	p2.add(bttn8);
    	p2.add(bttn7);
    	p2.add(bttnM);
    	p2.add(bttn6);
    	p2.add(bttn5);
    	p2.add(bttn4);
    	p2.add(bttnT);
    	p2.add(bttn3);
    	p2.add(bttn2);
    	p2.add(bttn1);
    	p2.add(bttnD);
    	p2.add(bttnC);
    	p2.add(bttnDot);
    	p2.add(bttn0);
    	add(p2,BorderLayout.CENTER);
    	
    	p3.setLayout(layout3);
    	p3.add(bttnE);
    	add(p3,BorderLayout.SOUTH);
    	
    	
    	
    }
    
    public static void main(String[] args) {
       
       Calculator frame = new Calculator();
       
       frame.setTitle("Calculator");
       frame.setSize(300,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //another is hide on close
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       
    }
    
}
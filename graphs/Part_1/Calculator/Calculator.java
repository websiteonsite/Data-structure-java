package graphs.Part_1.Calculator;

import java.awt.*;

public class Calculator extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JPanel[] row = new JPanel[5];
    JButton[] button = new JButton[19];
    String[] buttonString = { "7", "8", "9", "+", "4", "5", "6", "- ", "1", "2", "3", "*", ".", "/", "C", "?", "+/-",
            "=", "0" };

    int[] dimW = { 430, 70, 150, 140 };
    int[] dimH = { 50, 60 };
    Dimension displayDimension = new Dimension(dimW[0], dimH[0]);
    Dimension regularDimension = new Dimension(dimW[1], dimH[1]);
    Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);
    Dimension zeroButDimension = new Dimension(dimW[3], dimH[1]);
    boolean[] function = new boolean[4];
    double[] temporary = { 0, 0 };
    JTextArea display = new JTextArea(2, 25);
    Font font = new Font("Times new Roman", Font.BOLD, 20);

Calculator() {
super("Calculator"); 
setDesign(); 
setSize(500, 350); 
setResizable(false); 
setDefaultCloseOperation (EXIT_ON_CLOSE) ; 
GridLayout grid = new GridLayout(5,5); 
setLayout(grid);

for (int i = 0; i < 4; i++)
{function[i] = false;}
FlowLayout f1 = new FlowLayout(FlowLayout.CENTER); 
FlowLayout f2 = new FlowLayout(FlowLayout.CENTER, 1, 1); 
for (int i = 0; i < 5; i++)
{row[i] = new JPanel();} 
row [0].setLayout(f1); 
for(int i = 1; i < 5; i++)
row[i].setLayout(f2);

for(int i = 0; i < 19; i++) {
button[i] = new JButton(); 
button[i].setText (buttonString[i]); 
button[i].setBackground (Color: white); 
button[i].setFont (font); 
button[i].addActionListener(this);
}
}

package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiFrame extends JFrame 
{
    JPanel pnlName,pnlSurname,pnlMain,pnlTitle,pnlOutput,pnlButtons,pnlNameAndSurname;
    JButton btnClear, btnExit,btnEnter;
    JLabel lblTitle,lblName,lblSurname;
    JTextField txtName ,txtSurname;
    JTextArea txtArea;
    public GuiFrame()
     {
         setSize(500,500);  
         setTitle("Practice Frame 1");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(new BorderLayout());
         
         //panels
         pnlTitle = new JPanel(new FlowLayout());
         pnlMain = new JPanel (new BorderLayout());
         pnlName = new JPanel(new GridLayout(1,2));
         pnlSurname= new JPanel(new GridLayout(1,2));
         pnlNameAndSurname = new JPanel(new GridLayout(2,1));
         pnlButtons = new JPanel(new GridLayout(1,3));
         pnlOutput = new JPanel(new FlowLayout());
         
         //labels
         lblTitle = new JLabel("WELCOME APP");
         lblName = new JLabel("NAME:");
         lblSurname = new JLabel("SURNAME:");
         
         //buttons
         btnClear = new JButton("CLEAR");
         btnEnter = new JButton("ENTER");
         btnExit = new JButton("EXIT");
         
         //textfields
         txtName = new JTextField(20);
         txtSurname = new JTextField(20);
         
         //textAres
         txtArea = new JTextArea(20,40);
         txtArea.setEditable(false);
         
         //add to panelas
         pnlTitle.add(lblTitle);
         pnlName.add(lblName);
         pnlName.add(txtName);
         pnlSurname.add(lblSurname);
         pnlSurname.add(txtSurname);
         pnlNameAndSurname.add(pnlName);
         pnlNameAndSurname.add(pnlSurname);
         pnlOutput.add(txtArea);
         pnlButtons.add(btnClear);
         pnlButtons.add(btnEnter);
         pnlButtons.add(btnExit);
         
         //add poanels to main panel
         pnlMain.add(pnlNameAndSurname , BorderLayout.NORTH);
         pnlMain.add(pnlOutput, BorderLayout.CENTER);
         pnlMain.add(pnlButtons , BorderLayout.SOUTH);
         
         //add the main panel and the title panel on the frame
         add(pnlTitle , BorderLayout.NORTH);
         add(pnlMain , BorderLayout.SOUTH);
         
         //set the frame to be visisble
         setVisible(true);
     }
}

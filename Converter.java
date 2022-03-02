import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener {
		JLabel label = new JLabel("Distance : ");
		JTextField input = new JTextField(10);
		JButton button = new JButton("Convert");
		JTextArea output = new JTextArea(10,15);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Convert MILES to KM", cbg, true);
		Checkbox cb2 = new Checkbox("Convert KM to MILES", cbg, false);

	Converter(){
		cb1.setBounds(90,10,200,20); //x,y,w,h
		cb2.setBounds(90,50,200,20);
		label.setBounds(75,100,100,30);
		input.setBounds(150,100,100,30);
		button.setBounds(120,150,100,30);
		output.setBounds(30,200,300,200);

		add(label);
		add(input);
		add(button);
		add(output);		
		add(cb1);
		add(cb2);
		
		button.addActionListener(this);
		  
		setLayout(null);
		setSize(380,500); //(width,height)
		setVisible(true); //making frame visible
	}
		
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			
			if (cb1.getState()== true){
				String userInput = input.getText();
				double miles = Double.parseDouble(userInput);
				double km = miles/0.62;
				String converted = String.valueOf(km);
				output.setText(userInput + " miles equals to " + converted + " kilometres");
			}else if (cb2.getState()== true){
				String userInput = input.getText();
				double miles = Double.parseDouble(userInput);
				double km = miles * 0.62;
				String converted = String.valueOf(km);
				output.setText(userInput + " km equals to " + converted + " miles");
			}
		}
	}
	
	public static void main(String[] args) {  
		new Converter();  
	}
	
}
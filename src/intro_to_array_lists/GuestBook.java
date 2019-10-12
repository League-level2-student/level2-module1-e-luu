package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton button = new JButton();
	ArrayList<String> name = new ArrayList<String>();
	void makeUI() {
		f.setVisible(true);
		f.setPreferredSize(new Dimension(200,100));
		p.add(b);
		p.add(button);
		f.add(p);
		b.setVisible(true);
		button.setVisible(true);
		b.setText("Add name");
		button.setText("View names");
		b.addActionListener(this);
		button.addActionListener(this);
		name.add("Bob Banders");
		name.add("Sandy Summers");
		name.add("Greg Ganders");
		name.add("Donny Doners");
		f.pack();
	}
	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.makeUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b) {
			String nam = JOptionPane.showInputDialog("Add any name");
			name.add(nam);
		}
		if (e.getSource()==button) {
			JOptionPane.showMessageDialog(null, name);
		}
	}
}

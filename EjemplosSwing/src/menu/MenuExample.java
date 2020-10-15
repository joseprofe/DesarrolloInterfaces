package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class MenuExample {
	JMenu menu, submenu, help;
	JMenuItem i1, i2, i3, i4, i5, i6;

	MenuExample() {
		JFrame f = new JFrame("Menu and MenuItem Example");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("Item 1");
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		i4 = new JMenuItem("Item 4");
		i5 = new JMenuItem("Item 5");
		help = new JMenu("Help");
		i6 = new JMenuItem("About");
		i6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ereh un crack");
			}
		});
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		help.add(i6);
		mb.add(menu);
		mb.add(help);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new MenuExample();
	}
}
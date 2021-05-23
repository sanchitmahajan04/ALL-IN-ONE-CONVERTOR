import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frame2w {

	public JFrame frame;
	private JTextField gf;
	private JTextField kgf;
	private JTextField lbf;
	private JTextField caf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2w window = new frame2w();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame2w() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sylfaen", Font.BOLD, 16));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 672, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		gf = new JTextField();
		gf.setBounds(118, 88, 116, 32);
		frame.getContentPane().add(gf);
		gf.setColumns(10);

		kgf = new JTextField();
		kgf.setBounds(118, 166, 116, 32);
		frame.getContentPane().add(kgf);
		kgf.setColumns(10);

		lbf = new JTextField();
		lbf.setBounds(118, 236, 116, 32);
		frame.getContentPane().add(lbf);
		lbf.setColumns(10);

		caf = new JTextField();
		caf.setBounds(118, 306, 116, 32);
		frame.getContentPane().add(caf);
		caf.setColumns(10);

		JLabel lblNewLabel = new JLabel("grams");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(272, 97, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("kilograms");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(272, 170, 99, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("pounds");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(272, 245, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("carats");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(272, 315, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);

		Button button = new Button("convert");
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (gf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double g = Double.parseDouble(gf.getText());
						double kg = g / 1000;
						double lb = g / 453.592;
						double ca = g / 0.2;
						kgf.setText("" + kg);
						lbf.setText("" + lb);
						caf.setText("" + ca);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button.setBounds(417, 86, 79, 24);
		frame.getContentPane().add(button);

		Button button_1 = new Button("convert");
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kgf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double kg = Double.parseDouble(kgf.getText());
						double g = kg * 1000;
						double lb = g / 453.592;
						double ca = g / 0.2;
						gf.setText("" + g);
						lbf.setText("" + lb);
						caf.setText("" + ca);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button_1.setBounds(417, 166, 79, 24);
		frame.getContentPane().add(button_1);

		Button button_2 = new Button("convert");
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double lb = Double.parseDouble(lbf.getText());
						double g = lb * 453.592;
						double kg = g / 1000;
						double ca = g / 0.2;
						kgf.setText("" + kg);
						gf.setText("" + g);
						caf.setText("" + ca);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button_2.setBounds(417, 236, 79, 24);
		frame.getContentPane().add(button_2);

		Button button_3 = new Button("convert");
		button_3.setForeground(Color.BLACK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (caf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double ca = Double.parseDouble(caf.getText());
						double g = ca * 0.2;
						double kg = g / 1000;
						double lb = g / 453.592;
						kgf.setText("" + kg);
						gf.setText("" + g);
						lbf.setText("" + lb);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}

		});
		button_3.setBounds(417, 316, 79, 24);
		frame.getContentPane().add(button_3);

		JLabel lblNewLabel_4 = new JLabel("WEIGHT CONVERTOR");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setBounds(188, 24, 445, 43);
		frame.getContentPane().add(lblNewLabel_4);

		JButton button_4 = new JButton("Back");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame1 window = new frame1();
				window.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Sitka Text", Font.BOLD, 23));
		button_4.setBounds(288, 410, 97, 25);
		frame.getContentPane().add(button_4);
	}

}

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

public class frame2v {

	public JFrame frame;
	private JTextField cmf;
	private JTextField mf;
	private JTextField lf;
	private JTextField gf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2v window = new frame2v();
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
	public frame2v() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Small", Font.BOLD, 16));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 637, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		cmf = new JTextField();
		cmf.setBounds(111, 85, 116, 32);
		frame.getContentPane().add(cmf);
		cmf.setColumns(10);

		mf = new JTextField();
		mf.setBounds(111, 153, 116, 27);
		frame.getContentPane().add(mf);
		mf.setColumns(10);

		lf = new JTextField();
		lf.setBounds(111, 221, 116, 27);
		frame.getContentPane().add(lf);
		lf.setColumns(10);

		gf = new JTextField();
		gf.setBounds(111, 304, 116, 25);
		frame.getContentPane().add(gf);
		gf.setColumns(10);

		JLabel lblNewLabel = new JLabel("cm^3/ml");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(263, 88, 116, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("m^3");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(263, 156, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("litres");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(263, 224, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("gallons");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(263, 308, 105, 19);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("convert");
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double cm3 = Double.parseDouble(cmf.getText());
						double m3 = cm3 / 1000000;
						double l = m3 * 1000;
						double g = m3 * 264.172;
						mf.setText("" + m3);
						lf.setText("" + l);
						gf.setText("" + g);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		btnNewButton.setBounds(416, 84, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("convert");
		btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (mf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double m3 = Double.parseDouble(mf.getText());
						double cm3 = m3 * 1000000;
						double l = m3 * 1000;
						double g = m3 * 264.172;
						cmf.setText("" + cm3);
						lf.setText("" + l);
						gf.setText("" + g);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		btnNewButton_1.setBounds(416, 152, 97, 25);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("convert");
		btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (lf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double l = Double.parseDouble(lf.getText());
						double m3 = l / 1000;
						double cm3 = m3 * 1000000;
						double g = m3 * 264.172;
						mf.setText("" + m3);
						cmf.setText("" + cm3);
						gf.setText("" + g);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		btnNewButton_2.setBounds(416, 223, 97, 25);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("convert");
		btnNewButton_3.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (gf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double g = Double.parseDouble(gf.getText());
						double m3 = g / 264.172;
						double l = m3 * 1000;
						double cm3 = m3 * 1000000;
						mf.setText("" + m3);
						lf.setText("" + l);
						cmf.setText("" + cm3);
					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		btnNewButton_3.setBounds(416, 304, 97, 25);
		frame.getContentPane().add(btnNewButton_3);

		JLabel lblNewLabel_4 = new JLabel("VOLUME CONVERTOR");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setBounds(161, 13, 476, 46);
		frame.getContentPane().add(lblNewLabel_4);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame1 window = new frame1();
				window.frame.setVisible(true);
			}
		});
		button.setFont(new Font("Sitka Text", Font.BOLD, 23));
		button.setBounds(271, 382, 97, 25);
		frame.getContentPane().add(button);
	}

}

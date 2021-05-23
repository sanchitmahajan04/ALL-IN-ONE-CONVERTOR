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

public class frame2l {

	public JFrame frame;
	private JTextField mmf;
	private JTextField cmf;
	private JTextField mf;
	private JTextField kmf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2l window = new frame2l();
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
	public frame2l() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 672, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		mmf = new JTextField();
		mmf.setBounds(121, 105, 116, 32);
		frame.getContentPane().add(mmf);
		mmf.setColumns(10);

		cmf = new JTextField();
		cmf.setBounds(121, 180, 116, 32);
		frame.getContentPane().add(cmf);
		cmf.setColumns(10);

		mf = new JTextField();
		mf.setBounds(121, 265, 116, 32);
		frame.getContentPane().add(mf);
		mf.setColumns(10);

		kmf = new JTextField();
		kmf.setBounds(121, 365, 116, 32);
		frame.getContentPane().add(kmf);
		kmf.setColumns(10);

		JLabel lblNewLabel = new JLabel("millimetres");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(261, 108, 139, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("centimetres");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 183, 97, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("metres");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(261, 268, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("kilometres");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(261, 368, 116, 16);
		frame.getContentPane().add(lblNewLabel_3);

		Button button = new Button("convert");
		button.setFont(new Font("Sitka Text", Font.BOLD, 16));
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (mmf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double mm = Double.parseDouble(mmf.getText());
						double cm = mm / 10;
						double m = cm / 100;
						double km = m / 1000;
						cmf.setText("" + cm);
						mf.setText("" + m);
						kmf.setText("" + km);
					} catch (Exception e) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button.setBounds(413, 105, 79, 24);
		frame.getContentPane().add(button);

		Button button_1 = new Button("convert");
		button_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double cm = Double.parseDouble(cmf.getText());
						double mm = cm * 10;
						double m = cm / 100;
						double km = m / 1000;
						mmf.setText("" + mm);
						mf.setText("" + m);
						kmf.setText("" + km);
					} catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button_1.setBounds(413, 180, 79, 24);
		frame.getContentPane().add(button_1);

		Button button_2 = new Button("convert");
		button_2.setFont(new Font("Sitka Text", Font.BOLD, 16));
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (mf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double m = Double.parseDouble(mf.getText());
						double cm = m * 100;
						double mm = cm * 10;
						double km = m / 1000;
						mmf.setText("" + mm);
						cmf.setText("" + cm);
						kmf.setText("" + km);
					} catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button_2.setBounds(413, 265, 79, 24);
		frame.getContentPane().add(button_2);

		Button button_3 = new Button("convert");
		button_3.setFont(new Font("Sitka Text", Font.BOLD, 16));
		button_3.setForeground(Color.BLACK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kmf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double km = Double.parseDouble(kmf.getText());
						double m = km * 1000;
						double cm = m * 100;
						double mm = cm * 10;
						mmf.setText("" + mm);
						cmf.setText("" + cm);
						mf.setText("" + m);
					} catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}
			}
		});
		button_3.setBounds(413, 365, 79, 24);
		frame.getContentPane().add(button_3);

		JLabel lblNewLabel_5 = new JLabel("LENGTH CONVERTOR");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_5.setForeground(Color.GRAY);
		lblNewLabel_5.setBounds(185, 13, 295, 60);
		frame.getContentPane().add(lblNewLabel_5);

		JButton button_4 = new JButton("Back");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame1 window = new frame1();
				window.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Sitka Text", Font.BOLD, 23));
		button_4.setBounds(280, 426, 97, 25);
		frame.getContentPane().add(button_4);

	}
}

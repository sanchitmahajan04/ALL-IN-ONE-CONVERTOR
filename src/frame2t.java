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

public class frame2t {

	public JFrame frame;
	private JTextField cf;
	private JTextField ff;
	private JTextField kf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2t window = new frame2t();
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
	public frame2t() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Text", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 688, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		cf = new JTextField();
		cf.setBounds(116, 114, 116, 31);
		frame.getContentPane().add(cf);
		cf.setColumns(10);

		ff = new JTextField();
		ff.setBounds(116, 202, 116, 31);
		frame.getContentPane().add(ff);
		ff.setColumns(10);

		kf = new JTextField();
		kf.setBounds(116, 301, 116, 31);
		frame.getContentPane().add(kf);
		kf.setColumns(10);

		JLabel lblNewLabel = new JLabel("\u00B0C");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(263, 117, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u00B0F");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(263, 205, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("K");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(263, 304, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);

		Button button = new Button("convert");
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double c = Double.parseDouble(cf.getText());
						double f = c * 1.8 + 32;
						double k = c + 273.15;
						ff.setText("" + f);
						kf.setText("" + k);

					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}

				}

			}
		});
		button.setBounds(406, 112, 79, 24);
		frame.getContentPane().add(button);

		Button button_1 = new Button("convert");
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ff.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double f = Double.parseDouble(ff.getText());
						double k = (f - 32) * 5 / 9 + 273.15;
						double c = k - 273.15;
						cf.setText("" + c);
						kf.setText("" + k);

					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}
				}
			}
		});
		button_1.setBounds(406, 197, 79, 24);
		frame.getContentPane().add(button_1);

		Button button_2 = new Button("convert");
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kf.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is empty!");
				} else {
					try {
						double k = Double.parseDouble(kf.getText());
						double f = (k - 273.15) * 1.8 + 32;
						double c = k - 273.15;
						cf.setText("" + c);
						ff.setText("" + f);

					} catch (Exception e3) {

						JOptionPane.showMessageDialog(null, "Please enter a numeric value");
					}
				}
			}
		});
		button_2.setBounds(406, 301, 79, 24);
		frame.getContentPane().add(button_2);

		JLabel lblNewLabel_3 = new JLabel("TEMPERATURE CONVERTOR");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(127, 29, 464, 48);
		frame.getContentPane().add(lblNewLabel_3);

		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame1 window = new frame1();
				window.frame.setVisible(true);
			}
		});
		button_3.setFont(new Font("Sitka Text", Font.BOLD, 23));
		button_3.setBounds(275, 375, 97, 25);
		frame.getContentPane().add(button_3);
	}

}

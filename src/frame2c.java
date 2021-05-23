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

public class frame2c {

	public JFrame frame;
	private JTextField bdt;
	private JTextField qtr;
	private JTextField inr;
	private JTextField pkr;
	private JTextField usd;
	private JTextField hkd;
	private JTextField aud;
	private JTextField gbp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2c window = new frame2c();
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
	public frame2c() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 843, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		bdt = new JTextField();
		bdt.setBounds(291, 37, 116, 22);
		frame.getContentPane().add(bdt);
		bdt.setColumns(10);

		qtr = new JTextField();
		qtr.setBounds(291, 87, 116, 22);
		frame.getContentPane().add(qtr);
		qtr.setColumns(10);

		inr = new JTextField();
		inr.setBounds(291, 134, 116, 22);
		frame.getContentPane().add(inr);
		inr.setColumns(10);

		pkr = new JTextField();
		pkr.setBounds(291, 184, 116, 22);
		frame.getContentPane().add(pkr);
		pkr.setColumns(10);

		usd = new JTextField();
		usd.setBounds(291, 238, 116, 22);
		frame.getContentPane().add(usd);
		usd.setColumns(10);

		hkd = new JTextField();
		hkd.setBounds(291, 298, 116, 22);
		frame.getContentPane().add(hkd);
		hkd.setColumns(10);

		aud = new JTextField();
		aud.setBounds(291, 355, 116, 22);
		frame.getContentPane().add(aud);
		aud.setColumns(10);

		gbp = new JTextField();
		gbp.setBounds(291, 405, 116, 22);
		frame.getContentPane().add(gbp);
		gbp.setColumns(10);

		JButton btnNewButton = new JButton("convert");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (bdt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Bdt = Double.parseDouble(bdt.getText());
						double Usd = Bdt * 0.012;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 2.13;
						double Aud = Hkd * 0.17;
						double Gbp = Aud * 0.57;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						pkr.setText(PKR);
						inr.setText(INR);
						qtr.setText(QTR);
						hkd.setText(HKD);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}

				}
			}
		});
		btnNewButton.setBounds(526, 36, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("convert");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (qtr.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Qtr = Double.parseDouble(qtr.getText());
						double Usd = Qtr * 0.27;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Bdt = Usd * 84.47;
						double Hkd = Qtr * 2.13;
						double Aud = Hkd * 0.17;
						double Gbp = Aud * 0.57;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String BDT = String.format("%.3f", Bdt);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						pkr.setText(PKR);
						inr.setText(INR);
						bdt.setText(BDT);
						hkd.setText(HKD);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_1.setBounds(526, 86, 97, 25);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("convert");
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (inr.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Inr = Double.parseDouble(inr.getText());
						double Usd = Inr * 0.014;
						double Pkr = Usd * 160.16;
						double Bdt = Usd * 84.47;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 0.46;
						double Aud = Hkd * 5.36;
						double Gbp = Aud * 1.889;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String BDT = String.format("%.3f", Bdt);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						pkr.setText(PKR);
						bdt.setText(BDT);
						qtr.setText(QTR);
						hkd.setText(HKD);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_2.setBounds(526, 133, 97, 25);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("convert");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (pkr.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Pkr = Double.parseDouble(pkr.getText());
						double Usd = Pkr / 156.05;
						double Bdt = Usd * 84.47;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 0.46;
						double Aud = Hkd * 5.36;
						double Gbp = Aud * 1.889;

						String USD = String.format("%.3f", Usd);
						String BDT = String.format("%.3f", Bdt);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						bdt.setText(BDT);
						inr.setText(INR);
						qtr.setText(QTR);
						hkd.setText(HKD);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_3.setBounds(526, 183, 97, 25);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("convert");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (usd.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Usd = Double.parseDouble(usd.getText());
						double Bdt = Usd * 84.47;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 0.46;
						double Aud = Hkd * 5.36;
						double Gbp = Aud * 1.889;

						String BDT = String.format("%.3f", Bdt);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						bdt.setText(BDT);
						pkr.setText(PKR);
						inr.setText(INR);
						qtr.setText(QTR);
						hkd.setText(HKD);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_4.setBounds(526, 237, 97, 25);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("convert");
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (hkd.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Hkd = Double.parseDouble(hkd.getText());
						double Usd = Hkd * 0.13;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Bdt = Usd * 84.47;
						double Aud = Hkd * 5.36;
						double Gbp = Aud * 1.889;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String BDT = String.format("%.3f", Bdt);
						String AUD = String.format("%.3f", Aud);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						pkr.setText(PKR);
						inr.setText(INR);
						qtr.setText(QTR);
						bdt.setText(BDT);
						aud.setText(AUD);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_5.setBounds(526, 297, 97, 25);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("convert");
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (aud.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Aud = Double.parseDouble(aud.getText());
						double Usd = Aud * 0.75;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 0.46;
						double Bdt = Usd * 84.47;
						double Gbp = Aud * 1.889;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String BDT = String.format("%.3f", Bdt);
						String GBP = String.format("%.3f", Gbp);

						usd.setText(USD);
						pkr.setText(PKR);
						inr.setText(INR);
						qtr.setText(QTR);
						hkd.setText(HKD);
						bdt.setText(BDT);
						gbp.setText(GBP);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_6.setBounds(526, 354, 97, 25);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("convert");
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (gbp.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Your input is Empty !");
				} else {

					try {
						double Gbp = Double.parseDouble(gbp.getText());
						double Usd = Gbp * 1.75;
						double Pkr = Usd * 160.16;
						double Inr = Pkr * 0.45;
						double Qtr = Inr * 0.051;
						double Hkd = Qtr * 0.46;
						double Aud = Hkd * 5.36;
						double Bdt = Usd * 84.47;

						String USD = String.format("%.3f", Usd);
						String PKR = String.format("%.3f", Pkr);
						String INR = String.format("%.3f", Inr);
						String QTR = String.format("%.3f", Qtr);
						String HKD = String.format("%.3f", Hkd);
						String AUD = String.format("%.3f", Aud);
						String BDT = String.format("%.3f", Bdt);

						usd.setText(USD);
						pkr.setText(PKR);
						inr.setText(INR);
						qtr.setText(QTR);
						hkd.setText(HKD);
						aud.setText(AUD);
						bdt.setText(BDT);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter a numeric value!");
					}
				}
			}
		});
		btnNewButton_7.setBounds(526, 404, 97, 25);
		frame.getContentPane().add(btnNewButton_7);

		JLabel lblNewLabel = new JLabel("BDT");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(429, 40, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("QAR");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(429, 93, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("INR");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(429, 140, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("PKR");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(429, 190, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("USD");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(429, 241, 56, 16);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("HKD");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(429, 304, 56, 16);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("AUD");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(429, 363, 56, 16);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("GBP");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(429, 411, 56, 16);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Bangladesh");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(148, 40, 97, 19);
		frame.getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Qatar");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(148, 90, 56, 16);
		frame.getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("India");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(148, 137, 56, 16);
		frame.getContentPane().add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Pakistan");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(148, 187, 74, 16);
		frame.getContentPane().add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("United States");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(148, 241, 116, 16);
		frame.getContentPane().add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("HongKong");
		lblNewLabel_13.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(148, 304, 116, 16);
		frame.getContentPane().add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Australia");
		lblNewLabel_14.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(148, 358, 97, 16);
		frame.getContentPane().add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("British");
		lblNewLabel_15.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setBounds(148, 408, 56, 16);
		frame.getContentPane().add(lblNewLabel_15);

		JButton btnNewButton_8 = new JButton("Back");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame1 window = new frame1();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_8.setFont(new Font("Sitka Text", Font.BOLD, 23));
		btnNewButton_8.setBounds(343, 476, 97, 25);
		frame.getContentPane().add(btnNewButton_8);
	}
}

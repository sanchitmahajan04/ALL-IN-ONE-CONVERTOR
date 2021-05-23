import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame1 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 723, 463);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ALL IN ONE CONVERTOR");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(163, 13, 375, 50);
		frame.getContentPane().add(lblNewLabel);

		Button button = new Button("Length");
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);

				frame2l windo = new frame2l();

				windo.frame.setVisible(true);

			}
		});
		button.setBounds(182, 88, 307, 33);
		frame.getContentPane().add(button);

		Button button_1 = new Button("Weight");
		button_1.setFont(new Font("Dialog", Font.BOLD, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame2w window = new frame2w();
				window.frame.setVisible(true);
			}
		});
		button_1.setBounds(182, 152, 307, 33);
		frame.getContentPane().add(button_1);

		Button button_2 = new Button("Temperature");
		button_2.setFont(new Font("Dialog", Font.BOLD, 16));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame2t window = new frame2t();
				window.frame.setVisible(true);
			}
		});
		button_2.setBounds(182, 217, 307, 33);
		frame.getContentPane().add(button_2);

		Button button_3 = new Button("Currency");
		button_3.setFont(new Font("Dialog", Font.BOLD, 16));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame2c window = new frame2c();
				window.frame.setVisible(true);
			}
		});
		button_3.setBounds(182, 275, 307, 33);
		frame.getContentPane().add(button_3);

		Button button_4 = new Button("Volume");
		button_4.setFont(new Font("Dialog", Font.BOLD, 16));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				frame2v window = new frame2v();
				window.frame.setVisible(true);
			}
		});
		button_4.setBounds(182, 334, 307, 33);
		frame.getContentPane().add(button_4);
	}
}

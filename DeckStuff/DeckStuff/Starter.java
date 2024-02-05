package deckStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class Starter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JLabel Credit;
	private JTextField credit;
	private JTextField bet;
	private JLabel Bet;
	private JLabel StartC;
	private JTextField startC;
	private JLabel StartN;
	private JTextField startN;
	private JLabel Error;
	private JButton Play;
	private JLabel StartB;
	private JTextField startB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Starter frame = new Starter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Starter() {
		setFont(new Font("Script MT Bold", Font.BOLD, 16));
		setTitle("Video Poker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Title
		JLabel lblNewLabel = new JLabel("Welcome to video poker");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 755, 78);
		contentPane.add(lblNewLabel);
		
		//name inputs and label
		name = new JTextField();
		name.setEditable(false);
		name.setFont(new Font("Stencil", Font.PLAIN, 20));
		name.setBounds(74, 75, 136, 29);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel Name = new JLabel("Name:");
		Name.setBackground(new Color(255, 255, 255));
		Name.setForeground(new Color(255, 255, 255));
		Name.setFont(new Font("Stencil", Font.PLAIN, 18));
		Name.setBounds(10, 75, 54, 29);
		contentPane.add(Name);
		
		//start button
		JButton Shuffling = new JButton("Start");
		Shuffling.setForeground(new Color(255, 255, 255));
		Shuffling.setBackground(new Color(0, 128, 0));
		Shuffling.setFont(new Font("Stencil", Font.PLAIN, 20));
		Shuffling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				//If anyone can figure out how to get it to check for int input
				//check if name is empty
				if (!startN.getText().isEmpty()) {
					//check if credits is empty
					if (!startC.getText().isEmpty()) {
						//dont even ask, just leave it
						String p = startC.getText();
						int r = p.length();
						int oh = 0;
						for (int i = 0; i < r; i++) {
							if (Character.isDigit(p.charAt(i))) {
								oh++;
							}
							else {
								Error.show();
							}
						}
						if (oh == r) {
							int s = Integer.parseInt(startC.getText());
							if (s > 999 || s < 1) {
								Error.show();
							}
							else {
								name.setText(startN.getText());
								credit.setText(startC.getText());
								StartC.hide();
								startC.hide();
								StartN.hide();
								startN.hide();
								Error.hide();
								Shuffling.hide();
								StartB.show();
								startB.show();
							} }
						else {
							Error.show();
						}
					}
					else {
						Error.show();
					}
				}
				else {
					Error.show();
				}
				
				//CreateDeck mainDeck = new CreateDeck();
				//Shuffle Shuffler = new Shuffle(mainDeck);
				//Shuffler.TestShuffle();
				//Hold.setText(credit.getText());	
				//credit.setText("");
				//int money = Integer.parseInt(Hold.getText());
				
				
			}
		});
		Shuffling.setBounds(329, 452, 116, 41);
		contentPane.add(Shuffling);
		
		Credit = new JLabel("Credits:");
		Credit.setForeground(new Color(255, 255, 255));
		Credit.setFont(new Font("Stencil", Font.PLAIN, 18));
		Credit.setBounds(220, 75, 81, 29);
		contentPane.add(Credit);
		
		credit = new JTextField();
		credit.setFont(new Font("Stencil", Font.PLAIN, 20));
		credit.setBounds(311, 75, 50, 29);
		contentPane.add(credit);
		credit.setColumns(10);
		
		
		bet = new JTextField();
		bet.setFont(new Font("Stencil", Font.PLAIN, 20));
		bet.setBounds(421, 75, 50, 29);
		contentPane.add(bet);
		bet.setColumns(10);
		
		Bet = new JLabel("Bet:");
		Bet.setFont(new Font("Stencil", Font.PLAIN, 18));
		Bet.setForeground(new Color(255, 255, 255));
		Bet.setBounds(371, 75, 40, 29);
		contentPane.add(Bet);
		
		StartC = new JLabel("Please Enter Starting Credits:");
		StartC.setFont(new Font("Stencil", Font.PLAIN, 20));
		StartC.setForeground(new Color(255, 255, 255));
		StartC.setBounds(73, 209, 338, 29);
		contentPane.add(StartC);
		
		startC = new JTextField();
		startC.setFont(new Font("Stencil", Font.PLAIN, 20));
		startC.setBounds(421, 209, 96, 29);
		contentPane.add(startC);
		startC.setColumns(10);
		
		StartN = new JLabel("Please Enter Your Name:");
		StartN.setForeground(new Color(255, 255, 255));
		StartN.setFont(new Font("Stencil", Font.PLAIN, 20));
		StartN.setBounds(73, 248, 266, 29);
		contentPane.add(StartN);
		
		startN = new JTextField();
		startN.setFont(new Font("Stencil", Font.PLAIN, 20));
		startN.setBounds(349, 248, 96, 29);
		contentPane.add(startN);
		startN.setColumns(10);
		
		Error = new JLabel("Error, invalid input");
		Error.setForeground(new Color(255, 0, 0));
		Error.setFont(new Font("Stencil", Font.PLAIN, 24));
		Error.setBounds(252, 310, 270, 55);
		contentPane.add(Error);
		Error.hide();
		
		Play = new JButton("Play");
		Play.setForeground(new Color(255, 255, 255));
		Play.setBackground(new Color(0, 128, 0));
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bet.setText(startB.getText());
				StartB.hide();
				startB.hide();
			}
		});
		Play.setFont(new Font("Stencil", Font.PLAIN, 20));
		Play.setBounds(329, 452, 116, 41);
		contentPane.add(Play);
		
		StartB = new JLabel("Please Enter Your Bet:");
		StartB.setForeground(new Color(255, 255, 255));
		StartB.setFont(new Font("Stencil", Font.PLAIN, 20));
		StartB.setBounds(74, 287, 253, 29);
		contentPane.add(StartB);
		StartB.hide();
		
		startB = new JTextField();
		startB.setFont(new Font("Stencil", Font.PLAIN, 20));
		startB.setBounds(329, 288, 96, 29);
		contentPane.add(startB);
		startB.setColumns(10);
		startB.hide();
		
	}
}

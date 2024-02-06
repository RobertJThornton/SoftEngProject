package DeckStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.PlayerHand;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
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
	private JLabel BetLabel;
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
	
	
	static CreateDeck mainDeck = new CreateDeck();
	static Shuffle Shuffler = new Shuffle(mainDeck);
	static PlayerHand Hand = new PlayerHand(Shuffler);
	static int credits = 15;
	static int betAmount=0;
	private JTextField Card1;
	private JTextField Card2;
	private JTextField Card3;
	private JTextField Card4;
	private JTextField Card5;
	private JLabel StartR;
	private JTextField CardNum;
	private JButton ReplaceCard;
	private JButton Exit;
	private JButton Confirm;
	private JButton Restart;
	
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
		setTitle("Team Obsidian Video Poker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Title
		JLabel GameName = new JLabel("Team Obsidian Video Poker");
		GameName.setForeground(new Color(255, 255, 255));
		GameName.setFont(new Font("Stencil", Font.PLAIN, 24));
		GameName.setHorizontalAlignment(SwingConstants.CENTER);
		GameName.setBounds(10, 10, 755, 78);
		contentPane.add(GameName);
		
		
		//name inputs and label
		name = new JTextField();
		name.setEditable(false);
		name.setFont(new Font("Stencil", Font.PLAIN, 20));
		name.setBounds(74, 75, 136, 29);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setBackground(new Color(255, 255, 255));
		NameLabel.setForeground(new Color(255, 255, 255));
		NameLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		NameLabel.setBounds(10, 75, 54, 29);
		contentPane.add(NameLabel);
		
		//ReplaceCard Button
		ReplaceCard = new JButton("ReplaceCard");
		ReplaceCard.setForeground(Color.WHITE);
		ReplaceCard.setFont(new Font("Stencil", Font.PLAIN, 20));
		ReplaceCard.setBackground(new Color(0, 128, 0));
		ReplaceCard.setBounds(550, 405, 116, 41);
		contentPane.add(ReplaceCard);
		ReplaceCard.hide();
		
		//Exit Button
		Exit = new JButton("Exit");
		Exit.setForeground(Color.WHITE);
		Exit.setFont(new Font("Stencil", Font.PLAIN, 20));
		Exit.setBackground(new Color(0, 128, 0));
		Exit.setBounds(200, 452, 116, 41);
		contentPane.add(Exit);
		Exit.hide();
		
		//start button
		JButton Start = new JButton("Start");
		Start.setForeground(new Color(255, 255, 255));
		Start.setBackground(new Color(0, 128, 0));
		Start.setFont(new Font("Stencil", Font.PLAIN, 20));
		
		// confromation for replacing cards
		Confirm = new JButton("Confirm");
		Confirm.setForeground(Color.WHITE);
		Confirm.setFont(new Font("Stencil", Font.PLAIN, 20));
		Confirm.setBackground(new Color(0, 128, 0));
		Confirm.setBounds(330, 452, 116, 41);
		contentPane.add(Confirm);
		Confirm.hide();
		
		//play button
		Play = new JButton("Play");
		Play.setForeground(new Color(255, 255, 255));
		Play.setBackground(new Color(0, 128, 0));
		
		//replay button
		Restart = new JButton("Replay");
		Restart.setForeground(Color.WHITE);
		Restart.setFont(new Font("Stencil", Font.PLAIN, 20));
		Restart.setBackground(new Color(0, 128, 0));
		Restart.setBounds(330, 450, 116, 41);
		Restart.hide();
		contentPane.add(Restart);
		
		//make a getter for this!!!!!!
		List<Integer> ToReplace = new ArrayList<Integer>();
		
		//Confirm button actions
		Confirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Hand.DealHand();
				
				Card1.setText(Hand.getFullName(Hand.getHand()[0].GetSuit(), Hand.getHand()[0].GetNumber()));
				Card2.setText(Hand.getFullName(Hand.getHand()[1].GetSuit(), Hand.getHand()[1].GetNumber()));
				Card3.setText(Hand.getFullName(Hand.getHand()[2].GetSuit(), Hand.getHand()[2].GetNumber()));
				Card4.setText(Hand.getFullName(Hand.getHand()[3].GetSuit(), Hand.getHand()[3].GetNumber()));
				Card5.setText(Hand.getFullName(Hand.getHand()[4].GetSuit(), Hand.getHand()[4].GetNumber()));
				Restart.show();
				Confirm.hide();
				ReplaceCard.hide();
				CardNum.hide();
				Exit.show();
				ToReplace.clear();
				//give results
				//give credits
			}
			
			
			
		});
		
		//restart Button actions
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play.show();
				Card1.hide();
				Card2.hide();
				Card3.hide();
				Card4.hide();
				Card5.hide();
				Restart.hide();
				Exit.hide();
				ReplaceCard.hide();
				Shuffler.ShuffleDeck(mainDeck.getDeck());
				for(int i =0; i< 5;i++) {
					Hand.ReplaceCards(i);
				}
				
			}
			
		});
		
		//ReplaceCard Button actions
		ReplaceCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.valueOf(CardNum.getText());
				if(num > 0 && num < 6)
						if(!ToReplace.contains(num)) {
						ToReplace.add(num);
						}
			}
		});
		
		//Exit Button Actions
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		//Start Button actions
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean startMode = true;
				//while(startMode) 
				{
				//check if name is empty
				if (startN.getText().isEmpty()) {
					Error.show();
					return;
				}
				
				else {
					name.setText(startN.getText());
					Start.hide();
					StartN.hide();
					startN.hide();
					Error.hide();
					Start.hide();
					StartB.show();
					startB.show();
					Play.show();
					startMode = false;
					}
				}
				
				boolean gameRunning = true;
				
				while(gameRunning){
					boolean replacing = true;
					while(replacing) {

							//get Result
							//change credits
							replacing = false;	
					}
					
					gameRunning = false;
				}	
			}
		});

		//Play Button actions
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean settingBet = true;
				betAmount = Integer.valueOf(startB.getText());
				while(settingBet) {
					if(betAmount < 1 || betAmount > 5) {
						return;
					}
					else
						settingBet=false;
				}
				bet.setText(String.valueOf(betAmount));
				
				credits -= betAmount;
				credit.setText(String.valueOf(credits));
				StartR.show();
				CardNum.show();
				startB.hide();
				StartB.hide();
				
				Card1.setText(Hand.getFullName(Hand.getHand()[0].GetSuit(), Hand.getHand()[0].GetNumber()));
				Card2.setText(Hand.getFullName(Hand.getHand()[1].GetSuit(), Hand.getHand()[1].GetNumber()));
				Card3.setText(Hand.getFullName(Hand.getHand()[2].GetSuit(), Hand.getHand()[2].GetNumber()));
				Card4.setText(Hand.getFullName(Hand.getHand()[3].GetSuit(), Hand.getHand()[3].GetNumber()));
				Card5.setText(Hand.getFullName(Hand.getHand()[4].GetSuit(), Hand.getHand()[4].GetNumber()));
				Card1.show();
				Card2.show();
				Card3.show();
				Card4.show();
				Card5.show();
				ReplaceCard.show();
				Confirm.show();
				Play.hide();
			}
		});
		
		Shuffler.ShuffleDeck(mainDeck.getDeck());
		Hand.DealHand();
		
		Start.setBounds(329, 452, 116, 41);
		contentPane.add(Start);
		
		Credit = new JLabel("Credits:");
		Credit.setForeground(new Color(255, 255, 255));
		Credit.setFont(new Font("Stencil", Font.PLAIN, 18));
		Credit.setBounds(220, 75, 81, 29);
		contentPane.add(Credit);
		
		credit = new JTextField(String.valueOf(credits));
		credit.setEditable(false);
		credit.setFont(new Font("Stencil", Font.PLAIN, 20));
		credit.setBounds(311, 75, 50, 29);
		contentPane.add(credit);
		credit.setColumns(10);
		
		
		bet = new JTextField(String.valueOf(betAmount));
		bet.setEditable(false);
		bet.setFont(new Font("Stencil", Font.PLAIN, 20));
		bet.setBounds(421, 75, 50, 29);
		contentPane.add(bet);
		bet.setColumns(10);
		
		BetLabel = new JLabel("Bet:");
		BetLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		BetLabel.setForeground(new Color(255, 255, 255));
		BetLabel.setBounds(371, 75, 40, 29);
		contentPane.add(BetLabel);
		
		/*
		StartC = new JLabel("Please Enter Starting Credits:");
		StartC.setEnabled(false);
		StartC.setFont(new Font("Stencil", Font.PLAIN, 20));
		StartC.setForeground(new Color(255, 255, 255));
		StartC.setBounds(73, 209, 338, 29);
		contentPane.add(StartC);
		
		startC = new JTextField();
		startC.setEditable(false);
		startC.setEnabled(false);
		startC.setFont(new Font("Stencil", Font.PLAIN, 20));
		startC.setBounds(421, 209, 96, 29);
		contentPane.add(startC);
		startC.setColumns(10);
		*/
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
		
		
		Play.setFont(new Font("Stencil", Font.PLAIN, 20));
		Play.setBounds(329, 452, 116, 41);
		contentPane.add(Play);
		
		//Betting
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
		
		//Cards
		
		Card1 = new JTextField(Hand.getFullName(Hand.getHand()[0].GetSuit(), Hand.getHand()[0].GetNumber()));
		Card1.setSelectedTextColor(Color.BLACK);
		Card1.setEditable(false);
		Card1.setBounds(40, 250, 100, 150);
		contentPane.add(Card1);
		Card1.setColumns(10);
		Card1.hide();
		
		Card2 = new JTextField(Hand.getFullName(Hand.getHand()[1].GetSuit(), Hand.getHand()[1].GetNumber()));
		Card2.setSelectedTextColor(Color.BLACK);
		Card2.setEnabled(false);
		Card2.setEditable(false);
		Card2.setColumns(10);
		Card2.setBounds(180, 250, 100, 150);
		contentPane.add(Card2);
		Card2.hide();
		
		Card3 = new JTextField(Hand.getFullName(Hand.getHand()[2].GetSuit(), Hand.getHand()[2].GetNumber()));
		Card3.setSelectedTextColor(Color.BLACK);
		Card3.setEnabled(false);
		Card3.setEditable(false);
		Card3.setColumns(10);
		Card3.setBounds(320, 250, 100, 150);
		contentPane.add(Card3);
		Card3.hide();
		
		Card4 = new JTextField(Hand.getFullName(Hand.getHand()[3].GetSuit(), Hand.getHand()[3].GetNumber()));
		Card4.setSelectedTextColor(Color.BLACK);
		Card4.setEnabled(false);
		Card4.setEditable(false);
		Card4.setColumns(10);
		Card4.setBounds(460, 250, 100, 150);
		contentPane.add(Card4);
		Card4.hide();
		
		Card5 = new JTextField(Hand.getFullName(Hand.getHand()[4].GetSuit(), Hand.getHand()[4].GetNumber()));
		Card5.setSelectedTextColor(Color.BLACK);
		Card5.setEnabled(false);
		Card5.setEditable(false);
		Card5.setColumns(10);
		Card5.setBounds(600, 250, 100, 150);
		contentPane.add(Card5);
		Card5.hide();
		
		StartR = new JLabel("Enter a Card Number to Replace:");
		StartR.setForeground(new Color(255, 255, 255));
		StartR.setFont(new Font("Stencil", Font.PLAIN, 20));
		StartR.setBounds(74, 400, 400, 50);
		contentPane.add(StartR);
		StartR.hide();
		
		
		
		CardNum = new JTextField();
		StartR.setLabelFor(CardNum);
		CardNum.setBounds(450, 400, 100, 50);
		contentPane.add(CardNum);
		CardNum.setColumns(10);
		CardNum.hide();
		
		
		
		
	}
}

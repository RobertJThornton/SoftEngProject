package DeckStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
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

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

import java.awt.Component;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Starter extends JFrame {
	/*NAMING RULES FOR GUI
	 * JLabels start with capital letters
	 * JTextFields start with lowercase
	 * If the name is 2 words, second word is always capitalized
	 * JButtons and JToggleButton start with capital letters
	 * Any actions a button performs must stay between its creation and when:
	 * 	-the line of f_contentPane.add, or the setcolumns line
	 * JLabel text cannot be changed
	 * JTextField can be changed by player
	 */

	private JPanel contentPane;
	private JLabel Name;
	private JTextField name;
	private JLabel Credit;
	private JTextField credit;
	private JLabel Bet;
	private JTextField bet;
	private JLabel StartN;
	private JTextField startN;
	private JLabel StartC;
	private JTextField startC;
	private JLabel CreditRule;
	private JButton Start;
	private JLabel StartB;
	private JTextField startB;
	private JLabel BetRule;
	private JButton Play;
	private JTextField card1;
	private JTextField card2;
	private JTextField card3;
	private JTextField card4;
	private JTextField card5;
	private JToggleButton Card1;
	private JToggleButton Card2;
	private JToggleButton Card3;
	private JToggleButton Card4;
	private JToggleButton Card5;
	private JLabel StartR;
	private JButton Confirm;
	private JButton Restart;
	private JLabel Error;
	private JLabel Invalid;
	private JButton Exit;
	private JTextField ResultNum;
	private JTextField ResultName;
	
	static CreateDeck mainDeck = new CreateDeck();
	static Shuffle Shuffler = new Shuffle(mainDeck);
	static PlayerHand Hand = new PlayerHand(Shuffler);
	static Result Results = new Result();
	
	static int credits = 0;
	static int betAmount = 0;
	
	static boolean c1 = false;
	static boolean c2 = false;
	static boolean c3 = false;
	static boolean c4 = false;
	static boolean c5 = false;
	static boolean start = true;
	
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

	//create the frame
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
		GameName.setBounds(10, 10, 755, 78);
		GameName.setForeground(new Color(255, 255, 255));
		GameName.setFont(new Font("Stencil", Font.PLAIN, 24));
		GameName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(GameName);
		
		//name inputs and label====================================================================== Name
		Name = new JLabel("Name:");
		Name.setBounds(10, 75, 54, 29);
		Name.setBackground(new Color(255, 255, 255));
		Name.setForeground(new Color(255, 255, 255));
		Name.setFont(new Font("Stencil", Font.PLAIN, 18));
		contentPane.add(Name);
		
		name = new JTextField();
		name.setBounds(74, 75, 136, 29);
		name.setEditable(false);
		name.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(name);
		name.setColumns(10);
		//========================================================================================== Name end
		
		//Credit==================================================================================== Credit
		Credit = new JLabel("Credits:");
		Credit.setBounds(220, 75, 81, 29);
		Credit.setForeground(new Color(255, 255, 255));
		Credit.setFont(new Font("Stencil", Font.PLAIN, 18));
		contentPane.add(Credit);
		
		credit = new JTextField();
		credit.setBounds(311, 75, 50, 29);
		credit.setEditable(false);
		credit.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(credit);
		credit.setColumns(10);
		//============================================================================================= Credit end
		
		//Bet========================================================================================== Bet
		Bet = new JLabel("Bet:");
		Bet.setBounds(371, 75, 40, 29);
		Bet.setFont(new Font("Stencil", Font.PLAIN, 18));
		Bet.setForeground(new Color(255, 255, 255));
		contentPane.add(Bet);
		
		
		bet = new JTextField();
		bet.setBounds(421, 75, 50, 29);
		bet.setEditable(false);
		bet.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(bet);
		bet.setColumns(10);
		//============================================================================================= Bet end
		
		//Enter Name=================================================================================== Enter Name
		StartN = new JLabel("Please Enter Your Name:");
		StartN.setBounds(73, 248, 266, 29);
		StartN.setForeground(new Color(255, 255, 255));
		StartN.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(StartN);
		
		startN = new JTextField();
		startN.setBounds(349, 248, 96, 29);
		startN.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(startN);
		startN.setColumns(10);
		//============================================================================================ Enter Name end
		
		//Start Credits============================================================================== Start Credits
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

		CreditRule = new JLabel("Startng credits must be between 1 and 999");
		CreditRule.setForeground(new Color(255, 255, 255));
		CreditRule.setFont(new Font("Stencil", Font.PLAIN, 15));
		CreditRule.setBounds(150, 179, 400, 29);
		contentPane.add(CreditRule);
		//=========================================================================================== Start Credits end
		
		//Start Button================================================================================== Start Button
		Start = new JButton("Start");
		Start.setBounds(329, 452, 116, 41);
		Start.setForeground(new Color(255, 255, 255));
		Start.setBackground(new Color(0, 128, 0));
		Start.setFont(new Font("Stencil", Font.PLAIN, 20));
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//check if name is empty
				if (!startN.getText().isEmpty()) {
					//check if credits is empty
					if (!startC.getText().isEmpty()) {
						//check to make sure you can only enter numbers into startC
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
								//sets the text box at top to match the player input
								name.setText(startN.getText());
								credit.setText(startC.getText());
								//hide no longer needed text and show next game phase
								StartC.hide();
								startC.hide();
								CreditRule.hide();
								StartN.hide();
								startN.hide();
								Error.hide();
								Start.hide();
								StartB.show();
								startB.show();
								BetRule.show();
							} }
						//error labels
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
			}
		});
		contentPane.add(Start);
		//=========================================================================================== Start Button end
		
		//Betting==================================================================================== Betting
		StartB = new JLabel("Please Enter Your Bet:");
		StartB.setBounds(74, 287, 253, 29);
		StartB.setForeground(new Color(255, 255, 255));
		StartB.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(StartB);
		StartB.hide();

		//player can enter starting bet
		startB = new JTextField();
		startB.setBounds(329, 288, 96, 29);
		startB.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(startB);
		startB.setColumns(10);
		startB.hide();

		//informs player of how much they can bet
		BetRule = new JLabel("must be or be between 1 and 5");
		BetRule.setForeground(new Color(255, 255, 255));
		BetRule.setFont(new Font("Stencil", Font.PLAIN, 15));
		BetRule.setBounds(74, 257, 400, 29);
		contentPane.add(BetRule);
		BetRule.hide();
		//============================================================================================ Betting end
		
		//play button ================================================================================== Play Button
		Play = new JButton("Play");
		Play.setBounds(329, 452, 116, 41);
		Play.setForeground(new Color(255, 255, 255));
		Play.setBackground(new Color(0, 128, 0));
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				betAmount = Integer.valueOf(startB.getText());
				if (start == true) {
					credits = Integer.valueOf(startC.getText());
				}
					//can only bet between 1 and 5 credits
					if(betAmount < 1 || betAmount > 5) {
						Error.show();
					}
					else {
						//can't bet more than player has
						if ((credits - betAmount) < 0) {
							Error.hide();
							Invalid.show();
						}
						else {
							//set text in bet
							bet.setText(startB.getText());
							betAmount = Integer.valueOf(startB.getText());
							//determine amount of credits and set text in credit
							credits = credits - betAmount;
							credit.setText(String.valueOf(credits));
							//makes deck
							Shuffler.ShuffleDeck(mainDeck.getDeck());
							//makes player hand
							Hand.DealHand();
							//hide unneccesary text and shows cards
							startB.hide();
							StartB.hide();
							BetRule.hide();
							card1.show();
							card2.show();
							card3.show();
							card4.show();
							card5.show();
							//reset card selected status for new games
							Card1.setSelected(false);
							Card2.setSelected(false);
							Card3.setSelected(false);
							Card4.setSelected(false);
							Card5.setSelected(false);
							//show card buttons
							Card1.show();
							Card2.show();
							Card3.show();
							Card4.show();
							Card5.show();
							//set text of text box under cards
							card1.setText(Hand.getFullName(Hand.getHand()[0].GetNumber(), Hand.getHand()[0].GetSuit()));
							card2.setText(Hand.getFullName(Hand.getHand()[1].GetNumber(), Hand.getHand()[1].GetSuit()));
							card3.setText(Hand.getFullName(Hand.getHand()[2].GetNumber(), Hand.getHand()[2].GetSuit()));
							card4.setText(Hand.getFullName(Hand.getHand()[3].GetNumber(), Hand.getHand()[3].GetSuit()));
							card5.setText(Hand.getFullName(Hand.getHand()[4].GetNumber(), Hand.getHand()[4].GetSuit()));
							//sets the cards images
							Image img1 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[0].GetNumber(), Hand.getHand()[0].GetSuit(), 0))).getImage();
							Card1.setIcon(new ImageIcon(img1));
							
							Image img2 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[1].GetNumber(), Hand.getHand()[1].GetSuit(), 0))).getImage();
							Card2.setIcon(new ImageIcon(img2));
							
							Image img3 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[2].GetNumber(), Hand.getHand()[2].GetSuit(), 0))).getImage();
							Card3.setIcon(new ImageIcon(img3));
							
							Image img4 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[3].GetNumber(), Hand.getHand()[3].GetSuit(), 0))).getImage();
							Card4.setIcon(new ImageIcon(img4));
							
							Image img5 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[4].GetNumber(), Hand.getHand()[4].GetSuit(), 0))).getImage();
							Card5.setIcon(new ImageIcon(img5));
							//more text box hiding and showing
							Confirm.show();
							Play.hide();
							Error.hide();
							Invalid.hide();
						}
					}
				}
			});
		Play.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(Play);
		//===================================================================================== Play Button end
		
		//Card Label================================================================================ Card Label
		//text box under cards, every one in this section is the same format
		card1 = new JTextField("");
		card1.setHorizontalAlignment(SwingConstants.CENTER);
		card1.setBorder(null);
		card1.setFont(new Font("Stencil", Font.PLAIN, 14));
		card1.setBackground(new Color(0, 128, 0));
		card1.setForeground(new Color(255, 255, 255));
		card1.setBounds(10, 349, 135, 29);
		card1.setSelectedTextColor(Color.BLACK);
		card1.setEditable(false);
		contentPane.add(card1);
		card1.setColumns(10);
		card1.hide();

		card2 = new JTextField("");
		card2.setHorizontalAlignment(SwingConstants.CENTER);
		card2.setFont(new Font("Stencil", Font.PLAIN, 14));
		card2.setForeground(new Color(255, 255, 255));
		card2.setBorder(null);
		card2.setBackground(new Color(0, 128, 0));
		card2.setBounds(165, 349, 135, 29);
		card2.setSelectedTextColor(Color.BLACK);
		card2.setEditable(false);
		card2.setColumns(10);
		contentPane.add(card2);
		card2.hide();
		
		card3 = new JTextField("");
		card3.setHorizontalAlignment(SwingConstants.CENTER);
		card3.setFont(new Font("Stencil", Font.PLAIN, 14));
		card3.setForeground(new Color(255, 255, 255));
		card3.setBorder(null);
		card3.setBackground(new Color(0, 128, 0));
		card3.setBounds(320, 349, 135, 29);
		card3.setSelectedTextColor(Color.BLACK);
		card3.setEditable(false);
		card3.setColumns(10);
		contentPane.add(card3);
		card3.hide();
		
		card4 = new JTextField("");
		card4.setHorizontalAlignment(SwingConstants.CENTER);
		card4.setFont(new Font("Stencil", Font.PLAIN, 14));
		card4.setForeground(new Color(255, 255, 255));
		card4.setBorder(null);
		card4.setBackground(new Color(0, 128, 0));
		card4.setBounds(475, 349, 135, 29);
		card4.setSelectedTextColor(Color.BLACK);
		card4.setEditable(false);
		card4.setColumns(10);
		contentPane.add(card4);
		card4.hide();
		
		card5 = new JTextField("");
		card5.setEditable(false);
		card5.setHorizontalAlignment(SwingConstants.CENTER);
		card5.setFont(new Font("Stencil", Font.PLAIN, 14));
		card5.setForeground(new Color(255, 255, 255));
		card5.setBorder(null);
		card5.setBackground(new Color(0, 128, 0));
		card5.setBounds(630, 349, 135, 29);
		card5.setSelectedTextColor(Color.BLACK);
		card5.setColumns(10);
		contentPane.add(card5);
		card5.hide();
		//=============================================================================== Card Label end
		
		//Card Button==================================================================== Card Button
		//the buttons so the player can select which cards to replace
		Card1 = new JToggleButton();
		Card1.setBackground(new Color(0, 64, 0));
		Border emptyBorder1 = BorderFactory.createEmptyBorder();
		Card1.setBorder(emptyBorder1);
		Card1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent a) {
				int state = a.getStateChange();
				if (state == a.SELECTED) { 
					c1 = true;
				}
				else {
					c1 = false;
				}	
			}
		});
		Card1.setFont(new Font("Stencil", Font.PLAIN, 20));
		Card1.setBounds(10, 150, 135, 189);
		contentPane.add(Card1);
		Card1.hide();
		
		Card2 = new JToggleButton();
		Card2.setBackground(new Color(0, 64, 0));
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		Card2.setBorder(emptyBorder2);
		Card2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent b) {
				int state = b.getStateChange();
				if (state == b.SELECTED) { 
					c2 = true;
				}
				else {
					c2 = false;
				}
			}
		});
		Card2.setFont(new Font("Stencil", Font.PLAIN, 20));
		Card2.setBounds(165, 150, 135, 189);
		contentPane.add(Card2);
		Card2.hide();
		
		Card3 = new JToggleButton();
		Card3.setBackground(new Color(0, 64, 0));
		Border emptyBorder3 = BorderFactory.createEmptyBorder();
		Card3.setBorder(emptyBorder3);
		Card3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent c) {
				int state = c.getStateChange();
				if (state == c.SELECTED) { 
					c3 = true;
				}
				else {
					c3 = false;
				}
			}
		});
		Card3.setBounds(320, 150, 135, 189);
		contentPane.add(Card3);
		Card3.hide();
		
		Card4 = new JToggleButton();
		Card4.setBackground(new Color(0, 64, 0));
		Border emptyBorder4 = BorderFactory.createEmptyBorder();
		Card4.setBorder(emptyBorder4);
		Card4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent d) {
				int state = d.getStateChange();
				if (state == d.SELECTED) { 
					c4 = true;
				}
				else {
					c4 = false;
				}
			}
		});
		Card4.setBounds(475, 150, 135, 189);
		contentPane.add(Card4);
		Card4.hide();
		
		Card5 = new JToggleButton();
		Card5.setBackground(new Color(0, 64, 0));
		Border emptyBorder5 = BorderFactory.createEmptyBorder();
		Card5.setBorder(emptyBorder5);
		Card5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == e.SELECTED) { 
					c5 = true;
				}
				else {
					c5 = false;
				}
			}
		});
		Card5.setBounds(630, 150, 135, 189);
		contentPane.add(Card5);
		Card5.hide();
		//============================================================================ Card Button end
		
		//Replace Label======================================================================== Replace Label
		StartR = new JLabel("Select which cards to replace:");
		StartR.setBounds(74, 400, 400, 50);
		StartR.setForeground(new Color(255, 255, 255));
		StartR.setFont(new Font("Stencil", Font.PLAIN, 20));
		contentPane.add(StartR);
		StartR.hide();
		//=================================================================================== Replace Label end
		
		//Confirm Replace==================================================================== Confirm Replace
		Confirm = new JButton("Confirm");
		Confirm.setBounds(330, 452, 116, 41);
		Confirm.setForeground(Color.WHITE);
		Confirm.setFont(new Font("Stencil", Font.PLAIN, 20));
		Confirm.setBackground(new Color(0, 128, 0));
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//replace cards
				if (c1 == true) {
					Card1.setSelected(false);
					Hand.ReplaceCards(0);
					card1.setText(Hand.getFullName(Hand.getHand()[0].GetNumber(), Hand.getHand()[0].GetSuit()));
					Image imgR1 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[0].GetNumber(), Hand.getHand()[0].GetSuit(), 1))).getImage();
					Card1.setIcon(new ImageIcon(imgR1));
				}
				if (c2 == true) {
					Card2.setSelected(false);
					Hand.ReplaceCards(1);
					card2.setText(Hand.getFullName(Hand.getHand()[1].GetNumber(), Hand.getHand()[1].GetSuit()));
					Image imgR2 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[1].GetNumber(), Hand.getHand()[1].GetSuit(), 1))).getImage();
					Card2.setIcon(new ImageIcon(imgR2));
				}
				if (c3 == true) {
					Card3.setSelected(false);
					Hand.ReplaceCards(2);
					card3.setText(Hand.getFullName(Hand.getHand()[2].GetNumber(), Hand.getHand()[2].GetSuit()));
					Image imgR3 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[2].GetNumber(), Hand.getHand()[2].GetSuit(), 1))).getImage();
					Card3.setIcon(new ImageIcon(imgR3));
				}
				if (c4 == true) {
					Card4.setSelected(false);
					Hand.ReplaceCards(3);
					card4.setText(Hand.getFullName(Hand.getHand()[3].GetNumber(), Hand.getHand()[3].GetSuit()));
					Image imgR4 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[3].GetNumber(), Hand.getHand()[3].GetSuit(), 1))).getImage();
					Card4.setIcon(new ImageIcon(imgR4));
				}
				if (c5 == true) {
					Card5.setSelected(false);
					Hand.ReplaceCards(4);
					card5.setText(Hand.getFullName(Hand.getHand()[4].GetNumber(), Hand.getHand()[4].GetSuit()));
					Image imgR5 = new ImageIcon(this.getClass().getResource(Images.cardIm(Hand.getHand()[4].GetNumber(), Hand.getHand()[4].GetSuit(), 1))).getImage();
					Card5.setIcon(new ImageIcon(imgR5));
				}
				Confirm.hide();
				Restart.show();
				//tell player results and return the correct amount of credits
				Results.SetResultCards(Hand.getHand(), betAmount);
				int result = Results.GetResult();
				credits += result;
				if(result != 0) {
				resultNum.setText("+" + result);
				resultNum.show();
				}
				resultName.setText(Results.GetResultName());
				resultName.show();
				credit.setText(String.valueOf(credits));
			}
		});
		contentPane.add(Confirm);
		Confirm.hide();
		//==================================================================================== Confirm Replace end

		//Replay Button====================================================================== Replay Button
		Restart = new JButton("Replay");
		Restart.setBounds(330, 450, 116, 41);
		Restart.setForeground(Color.WHITE);
		Restart.setFont(new Font("Stencil", Font.PLAIN, 20));
		Restart.setBackground(new Color(0, 128, 0));
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start = false;
				Play.show();
				card1.hide();
				card2.hide();
				card3.hide();
				card4.hide();
				card5.hide();
				Card1.hide();
				Card2.hide();
				Card3.hide();
				Card4.hide();
				Card5.hide();
				StartB.show();
				startB.show();
				Restart.hide();
				resultNum.hide();
				resultName.hide();
				Shuffler.ShuffleDeck(mainDeck.getDeck());
			}
		});
		contentPane.add(Restart);
		Restart.hide();

		//Error ============================================================= Error
		Error = new JLabel("Error, invalid input");
		Error.setBounds(252, 310, 270, 55);
		Error.setForeground(new Color(255, 0, 0));
		Error.setFont(new Font("Stencil", Font.PLAIN, 24));
		contentPane.add(Error);
		Error.hide();

		Invalid = new JLabel("Cannot exceed current credits");
		Invalid.setForeground(new Color(255, 0, 0));
		Invalid.setFont(new Font("Stencil", Font.PLAIN, 24));
		Invalid.setBounds(150, 310, 450, 55);
		f_contentPane.add(Invalid);
		Invalid.hide();
		
		//Exit =============================================================== Exit
		Exit = new JButton("Exit");
		Exit.setBounds(200, 452, 116, 41);
		Exit.setForeground(Color.WHITE);
		Exit.setFont(new Font("Stencil", Font.PLAIN, 20));
		Exit.setBackground(new Color(0, 128, 0));
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			
			}
		});
		contentPane.add(Exit);

		//Result ========================================================== Result
		resultNum = new JTextField("");
		resultNum.setSelectedTextColor(Color.BLACK);
		resultNum.setHorizontalAlignment(SwingConstants.CENTER);
		resultNum.setForeground(Color.WHITE);
		resultNum.setFont(new Font("Stencil", Font.PLAIN, 14));
		resultNum.setEditable(false);
		resultNum.setColumns(10);
		resultNum.setBorder(null);
		resultNum.setBackground(new Color(0, 128, 0));
		resultNum.setBounds(10, 115, 135, 29);
		resultNum.hide();
		contentPane.add(resultNum);
		
		resultName = new JTextField("");
		resultName.setSelectedTextColor(Color.BLACK);
		resultName.setHorizontalAlignment(SwingConstants.CENTER);
		resultName.setForeground(Color.WHITE);
		resultName.setFont(new Font("Stencil", Font.PLAIN, 14));
		resultName.setEditable(false);
		resultName.setColumns(10);
		resultName.setBorder(null);
		resultName.setBackground(new Color(0, 128, 0));
		resultName.setBounds(180, 115, 260, 29);
		resultName.hide();
		contentPane.add(resultName);
	}
}

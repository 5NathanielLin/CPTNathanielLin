import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;
import java.util.Random;

public class CPTNathaniel{
	public static void main(String[]args){
		Console con = new Console(1200,1500);
		
		
		char chrMainMenu;
			BufferedImage imgMathLogo = con.loadImage("MathPi.png");
			//Font MathFont = con.loadFont("MathFont.ttf",30);
			//con.setDrawFont(MathFont);
		
		boolean running = true;
		
		while(running){
			// Changed Background to white 
			con.setDrawColor(Color.WHITE);
			con.fillRect(0,0,1200,1500);
		
			//Logo
			con.drawImage(imgMathLogo,250,75);

		
		
			// Buttons 
			con.setDrawColor(new Color(0,0,0));
			con.drawString("Play [P]", 700,300);
			con.setDrawColor(new Color(0,0,0));
			con.drawString("View Leaderboard [V]",700,325);
			con.setDrawColor(new Color(0,0,0));
			con.drawString("Add Quiz [A]",700,350);
			con.setDrawColor(new Color(0,0,0));
			con.drawString("Quit [Q]",700,375);

			//Repainting to ensure above images are loadin	
			con.repaint();
			
			//variables
			String strUsername;
			String strCurrentQuiz;
			
			chrMainMenu = con.getChar();
			System.out.println("letter: "+chrMainMenu);
		
		
		// Quiz portion
		if(chrMainMenu == 'p'||chrMainMenu == 'P'){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0,0,1200,1500);
			con.repaint();
			con.println("What is your name?: ");
			strUsername = con.readLine();
			con.println("Which quiz do you want to do?: Linear, Quadratics, Geometry");
			strCurrentQuiz = con.readLine();
			con.clear();
			
			TextInputFile CurrentQuiz = new TextInputFile("linear.txt");
			
			if(strCurrentQuiz.equalsIgnoreCase("Linear")){
				CurrentQuiz = new TextInputFile("linear.txt");
				con.setDrawColor(Color.WHITE);
				con.fillRect(0,0,1200,1500);
				con.setDrawColor(Color.BLACK);
				con.drawString(strUsername,200,20);
				con.setDrawColor(Color.BLACK);
				con.drawString(strCurrentQuiz,470,20);
				
			}else if(strCurrentQuiz.equalsIgnoreCase("Quadratics")){
				CurrentQuiz = new TextInputFile("quadratics.txt");
				con.setDrawColor(Color.WHITE);
				con.fillRect(0,0,1200,1500);
				con.setDrawColor(Color.BLACK);
				con.drawString(strUsername,200,20);
				con.setDrawColor(Color.BLACK);
				con.drawString(strCurrentQuiz,470,20);
				
			}else if(strCurrentQuiz.equalsIgnoreCase("Geometry")){
				CurrentQuiz = new TextInputFile("geometry.txt");
				con.setDrawColor(Color.WHITE);
				con.fillRect(0,0,1200,1500);
				con.setDrawColor(Color.BLACK);
				con.drawString(strUsername,200,20);
				con.setDrawColor(Color.BLACK);
				con.drawString(strCurrentQuiz,470,20);
			}else{
				con.println("Quiz is unavaiable");
			}
			
			// Setup 2d Array
			String[][] strMathQuiz = new String[10][5];
			int intRow;
			intRow = 0;
			String strQuestionLine;
			String strAnswer;
			int intCounter;
			intCounter = 0;
			double dblCorrectPercentage;
			dblCorrectPercentage = 0;
					
			while(CurrentQuiz.eof() == false && intRow <10){
				strMathQuiz[intRow][0] = CurrentQuiz.readLine();
				strMathQuiz[intRow][1] = CurrentQuiz.readLine();
				strMathQuiz[intRow][2] = CurrentQuiz.readLine();
				strMathQuiz[intRow][3] = CurrentQuiz.readLine();
				intRow++;
			}
			
			strMathQuiz = nathanieltools.ShuffleQuestions(strMathQuiz, 10);
			
			intRow = 0;
			
			while(intRow< 10){
				 
				 
			if (intRow == 0) {
				dblCorrectPercentage = 0.0;
			}else{
				dblCorrectPercentage = ((double) intCounter / intRow) * 100;
			}
				
				con.clear();
				con.setDrawColor(Color.WHITE);
				con.fillRect(0,0,1200,1500);
				con.setDrawColor(Color.BLACK);
				con.drawString(strUsername,200,20);
				con.setDrawColor(Color.BLACK);
				con.drawString(strCurrentQuiz,370,20);
				con.setDrawColor(Color.BLACK);
				con.drawString("Correct Answers: "+intCounter,500,20);
				con.setDrawColor(Color.BLACK);
				con.drawString("Score Percentage: "+dblCorrectPercentage,750,20);
				
				 
				con.setTextColor(Color.BLACK);
				con.println("\n\n\nQuestion: " +strMathQuiz[intRow][0]);
				strAnswer = con.readLine();
				if(strAnswer.equals(strMathQuiz[intRow][1])||strAnswer.equals(strMathQuiz[intRow][2])||strAnswer.equalsIgnoreCase(strMathQuiz[intRow][3])){	
					intCounter = intCounter + 1;
					con.drawString("Correct!", 100, 160);
				}else{
					con.drawString("Wrong Answer", 70, 160);
					con.drawString("A: " + strMathQuiz[intRow][1], 70, 100);
					con.drawString("B: " + strMathQuiz[intRow][2], 70, 120);
					con.drawString("C: " + strMathQuiz[intRow][3], 70, 140);
				}
				con.setDrawColor(Color.BLACK);
				con.drawString("Press Enter to continue",70,250);
				con.readLine();
				intRow++;
			}
			TextOutputFile LeaderboardInputing = new TextOutputFile("leaderboard.txt",true);
			LeaderboardInputing.println(strUsername);
			LeaderboardInputing.println(strCurrentQuiz);
			LeaderboardInputing.println(dblCorrectPercentage);
			LeaderboardInputing.close();
			
			con.clear();
			con.setDrawColor(Color.WHITE);
			con.fillRect(0, 0, 1200, 1500);
			con.setDrawColor(Color.BLACK);
			con.drawString("Quiz completed!, press [R] to return to the main menu.", 100, 100);
			
			
			char chrReturnMainMenu;
			chrReturnMainMenu = con.getChar();
			System.out.println("letter: "+chrReturnMainMenu);
			if(chrReturnMainMenu == 'r'||chrReturnMainMenu == 'R'){
				con.setDrawColor(Color.WHITE);
				con.fillRect(0,0,1200,1500);
		
			//Logo
				con.drawImage(imgMathLogo,250,75);

		
		
			// Buttons 
				con.setDrawColor(new Color(0,0,0));
				con.drawString("Play [P]", 700,300);
				con.setDrawColor(new Color(0,0,0));
				con.drawString("View Leaderboard [V]",700,325);
				con.setDrawColor(new Color(0,0,0));
				con.drawString("Add Quiz [A]",700,350);
				con.setDrawColor(new Color(0,0,0));
				con.drawString("Quit [Q]",700,375);

			//Repainting to ensure above images are loadin	
				con.repaint();
		}
		//View leaderboard portion	
		if(chrMainMenu == 'v'||chrMainMenu == 'V'){
			con.setDrawColor(Color.WHITE);
			con.fillRect(0,0,1200,1500);
			con.repaint();
			
			//variables
			String StrLeaderboardLine;
			String StrUsernameLeaderboard;
			String StrQuizNameLeaderboard;
			String StrPercentageScoreLeaderboard;
			String[][] leaderboard = new String[100][3];
			int leaderboardRow = 0;
			
			TextInputFile LeaderboardExtracting = new TextInputFile("leaderboard.txt");
			
			for(int i = 0; i < 100; i++){
				StrUsernameLeaderboard = LeaderboardExtracting.readLine();
				StrQuizNameLeaderboard = LeaderboardExtracting.readLine();
				StrPercentageScoreLeaderboard = LeaderboardExtracting.readLine();
				if(StrUsernameLeaderboard.equals("") || StrQuizNameLeaderboard.equals("") || StrPercentageScoreLeaderboard.equals("")){
					i = 100;
				}else{
					leaderboard[leaderboardRow][0] = StrUsernameLeaderboard;
					leaderboard[leaderboardRow][1] = StrQuizNameLeaderboard;
					leaderboard[leaderboardRow][2] = StrPercentageScoreLeaderboard;	
					leaderboardRow++;
			}		
		}
		LeaderboardExtracting.close();
		
		for(int i = 0; i < leaderboardRow; i++) {
			con.drawString((i+1) + ". " + leaderboard[i][0] + " - " + leaderboard[i][1] + " - " + leaderboard[i][2], 50, 50 + i*30);
		}

		if(chrMainMenu == 'a'||chrMainMenu == 'A'){
			con.setDrawColor(Color.WHITE);
			con.fillRect(0,0,1200,1500);
			con.repaint();
		}
		if(chrMainMenu == 'q'||chrMainMenu == 'Q'){
			con.closeConsole();
		}
	}
}
}
}
}


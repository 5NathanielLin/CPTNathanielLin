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
		
			
			while(CurrentQuiz.eof() == false && intRow <10){
				strMathQuiz[intRow][0] = CurrentQuiz.readLine();
				strMathQuiz[intRow][1] = CurrentQuiz.readLine();
				strMathQuiz[intRow][2] = CurrentQuiz.readLine();
				strMathQuiz[intRow][3] = CurrentQuiz.readLine();
				Random random = new Random();
				int randoNumber = random.nextInt(100) + 1;
				con.println(randoNumbter);
				//strMathQuiz[intRow][4] = randoNumber;
				con.setTextColor(Color.BLACK);
				con.println("\n\nQuestion: " +strMathQuiz[0][0]);
				strAnswer = con.readLine();
				if(strAnswer.equals(strMathQuiz[intRow][1])||strAnswer.equals(strMathQuiz[intRow][2])||strAnswer.equalsIgnoreCase(strMathQuiz[intRow][3])){	
					intCounter = intCounter + 1;
					con.println("Correct!");
					con.println("A:"+strMathQuiz[intRow][1]);
					con.println("B:"+strMathQuiz[intRow][2]);
					con.println("C:"+strMathQuiz[intRow][3]);
					con.println(strMathQuiz[intRow][4]);
				}else{
					con.println("Wrong Answer");
				}
			
			}
			
		if(chrMainMenu == 'v'||chrMainMenu == 'V'){
			con.setDrawColor(Color.WHITE);
			con.fillRect(0,0,1200,1500);
			con.repaint();
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


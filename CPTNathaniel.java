import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

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
				if(strCurrentQuiz == "Linear"||strCurrentQuiz == "linear"){
					TextInputFile LinearQuiz = new TextInputFile("linear.txt");
				}else if(strCurrentQuiz == "Quadratics"||strCurrentQuiz == "quadratics"){
					TextInputFile QuadraticsQuiz = new TextInputFile("quadratics.txt");
				}else if(strCurrentQuiz == "Geometry"||strCurrentQuiz == "geometry"){
					TextInputFile GeomtryQuiz = new TextInputFile("geometry.txt");
				}else{
					con.println("Quiz is unavaiable");
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

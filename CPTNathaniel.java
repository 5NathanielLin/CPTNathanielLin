import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class CPTNathaniel{
	public static void main(String[]args){
		Console con = new Console(1200,1500);
		BufferedImage imgMathLogo = con.loadImage("MathLogo.png");
		//Font title = con.loadFont("", 40);
		
		// Changed Background to white 
		con.setDrawColor(Color.WHITE);
		con.fillRect(0,0,1200,1500);
		
		//Logo
		con.drawImage(imgMathLogo,300,75);

		
		
		// Buttons 
		con.setDrawColor(new Color(0,0,0));
		con.drawString("Play [P]", 700,300);
		con.setDrawColor(new Color(0,0,0));
		con.drawString("View Leaderboard [V]",700,325);
		con.setDrawColor(new Color(0,0,0));
		con.drawString("Add Quiz [A]",700,350);
		con.setDrawColor(new Color(0,0,0));
		con.drawString("Quit [Q]",700,375);
		
		//Repainting to ensure above images are loading
		con.repaint();
		
	}
}

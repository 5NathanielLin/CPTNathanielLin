import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class CPTNathaniel{
	public static void main(String[]args){
		Console con = new Console();
		//Font title = con.loadFont("", 40);
		
		// Changed Background to white 
		con.setDrawColor(Color.WHITE);
		con.fillRect(0,0,1000,1000);
		
		// Load title 
		/*con.setDrawFont(title);
		con.setDrawColor(new Color(0,0,0));
		con.drawString("Math Training Game",0,0 );*/
		
		// Buttons 
		con.setDrawColor(new Color(0,0,0));
		con.drawString("Play [P]", 425,300);
		con.setDrawColor(new Color(0,0,0));
		con.drawString("View Leaderboard [V]",425,325);
		
	}
}

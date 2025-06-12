import arc.*;

public class nathanieltools{
	public static void helloprint(Console con){
		con.println("Hello");
		con.println("Bonjour");
		con.println("Hola");
		con.println("Good Morning");
	}
	
	public static double circlearea(double  dblRadius){
		double dblArea;
		dblArea = Math.PI*Math.pow(dblRadius, 2);
		dblArea = Math.round(dblArea *100.0)/100.0;
		return dblArea;
		
		
	}
	
	public static String studentrank(int intStudyHours, int intPayAttention, double dblAverage){
		String strTier;
		strTier = "F Tier";
		if(intStudyHours >= 2 && intPayAttention == 1 && dblAverage > 95){
			strTier = "S Tier";
		}else if (intStudyHours >= 2 && intPayAttention == 1 && dblAverage > 80){
			strTier = "A Tier";
		}else if (intStudyHours >= 2 || intPayAttention == 1 || dblAverage > 80){
			strTier = "B Tier";
		}
		return strTier;
	}
	
	public static double usheighttocm(int intFeet, int intInches){
		double dblCM = 0;
		double dblFeetCM;
		double dblInchCM;
		dblFeetCM = intFeet * 30.48;
		dblInchCM = intInches * 2.54;
		dblCM = dblFeetCM + dblInchCM;
		return dblCM;
	}
	
	public static String makeitbackwards(String strWord){
		String strBack = "";
		String strLetter;
		int intLength;
		intLength = strWord.length();
		int intCount;
		for(intCount = intLength; intCount > 0; intCount--){
			strLetter = strWord.substring(intCount-1, intCount);
			strBack = strBack + strLetter; 
			//System.out.println prints to the terminal window
			//Use this command to print debugging tests
			//System.out.println("Test: "+strBack);
			
		}
		return strBack;
		
	}
	
	public static boolean ischill(String strWord){
		boolean blnChill;
		blnChill = false;
		if(strWord.equalsIgnoreCase("nocap") || strWord.equalsIgnoreCase("labron") || strWord.equalsIgnoreCase("mid")){
		blnChill = true;
		}
		
		return blnChill;
	}
	
	public static String seeMovie(char chrTier, String strName){
		String strResult;
		char chrFirstLetter;
		strResult = "Do not see movie";
		chrFirstLetter = strName.charAt(0);
		if(chrTier == 'a' || chrTier == 's' || chrFirstLetter == 'x'){
			strResult = "Have to see this movie";
			
		}
		return strResult;
	}
	
	public static double AverageDoubles(double dblA, double dblB){
		double dblAverage;
		dblAverage = (dblA + dblB)/2;
		return dblAverage;

	}
	
	public static double sphereVolume(double dblr){
		double dblV;
		dblV = (4.0/3.0)*Math.PI*Math.pow(dblr, 3);
		return dblV;
	}

	
	public static boolean isEven(int intN){
		boolean blnEven;
		blnEven = true;
		if(intN % 2 !=0){
			blnEven = false;
		}
	
		return blnEven;
		
	} 
	
	public static int dayYear(int intDay, int intMonth){
		
		int intYear;
		
		intYear = intDay + ((intMonth-1)*30);
		return intYear;
	}

	
	public static boolean isLeapYear(int intYear){
		boolean blnLeapYear;
		blnLeapYear = false;
		if(intYear % 4 == 0  && (intYear % 100 !=0 || intYear % 400 == 0)){
			blnLeapYear = true;
		}else{
			blnLeapYear = false;
		}                    
	return blnLeapYear;
	}

	public static int LongFactorial(int intN){
		int intFactorial;
		intFactorial = 1;
		int intCount;
		
		for(intCount = 1; intCount <= intN; intCount++){
			intFactorial = intFactorial * intCount;
		}
	return intFactorial;
	} 
	
	public static boolean isPrime(int intN){
		boolean blnPrime;
		blnPrime = true;
		if(intN <= 1)
			blnPrime = false;
		for(int i = 2; i < intN; i++){
			if(intN % i == 0){
				blnPrime = false;
			}
		}
		return blnPrime;
	}
	
	public static double distance(double dblX1, double dblX2, double dblY1, double dblY2){
		double dblDistance;
		double dblXDifference;
		double dblYDifference;
		
		dblXDifference = dblX2 - dblX1;
		dblYDifference = dblY2 - dblY1;
		
		dblDistance = Math.sqrt((Math.pow(dblXDifference, 2)) + (Math.pow(dblYDifference, 2)));
		return dblDistance;
	}
	
	public static double RectangleArea(double dblLength, double dblWidth){
		double dblArea;
		dblArea = dblLength*dblWidth;
		return dblArea;
	}
	
	
	static String[][] ShuffleQuestions(String[][] strArray, int length) {
        for (int i = 0; i < length; i++) {
            int j = (int) (Math.random() * length);
            String[] temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
        }
        return strArray;
    }
}



	

	

/**
* OOPSBannerApp UC1-OOPS Banner Display Application 

* @author Developer
@version 3J.0
*/

class UC4{
	public static void main (String[] args){
		String lines[]=new String[6];
		lines[0]=String.join(" ","   ***  "," " ,"   **  ","  ", "****   " ,"  ","  ****  ");
		lines[1]=String.join(" "," **   **"," " ," **  **","  ", "**  ** " ,"  "," **     ");
		lines[2]=String.join(" "," **   **"," " ," **  **","  ", "**  ** " ,"  ","  ****  ");
		lines[3]=String.join(" "," **   **"," " ," **  **","  ", "** *   " ,"  ","     ** ");
		lines[4]=String.join(" "," **   **"," " ," **  **","  ", "**     " ,"  "," **   **"); 
		lines[5]=String.join(" ","   ***  "," " ,"   **  ","  ", "**     " ,"  ","  ****  ");
		for (String line:lines){
			System.out.println(line);
		}
		
	}
	
}
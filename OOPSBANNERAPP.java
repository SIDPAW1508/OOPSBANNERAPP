/**
* OOPSBannerApp UC1-OOPS Banner Display Application 
* Demonstrates OOP without getter/setter - using public fields
* @author Developer
* @version 7.0
*/

import java.util.HashMap;

public class OOPSBannerApp {

	public static HashMap<Character, String[]> createHashMap() {
		HashMap<Character, String[]> map = new HashMap<>();
		map.put('O', new String[] {
				"    ***    ",
				" **     ** ",
				"**       **",
				"**       **",
				"**       **",
				"**       **",
				"**       **",
				" **     ** ",
				"    ***    "
		});
		map.put('S', new String[] {
				"   *****  ",
				"  **      ",
				" **       ",
				"  **      ",
				"   ***    ",
				"      ** ",
				"       **",
				"      ** ",
				"  ******  "
		});
		map.put('P', new String[] {
				" *******  ",
				" **    ** ",
				" **     **",
				" **    ** ",
				" ****     ",
				" **       ",
				" **       ",
				" **       ",
				" **       "
		});
		return map;
	}

	public static void DisplayBannner(String Message, HashMap<Character, String[]> map) {
		int patternHeight = map.get('O').length;
		for (int i = 0; i < patternHeight; i++) {
			for (char c : Message.toCharArray()) {
				System.out.print(map.get(c)[i] + " ");
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
        HashMap<Character, String[]> map = createHashMap();
        String message = "OOPS";
        DisplayBannner(message, map);
    }
}
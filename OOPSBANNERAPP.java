/**
@author developer
@version 7
*/
class OOPSBannerInnerClass{
	static class CharacterPattern{
		static String[] oPattern = {
			"    ***    ",
			" **     ** ",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			"**       **",
			" **     ** ",
			"    ***    "
		};
		static String[] pPattern = {
			" *******  ",
			" **    ** ",
			" **     **",
			" **    ** ",
			" ****     ",
			" **       ",
			" **       ",
			" **       ",
			" **       "
		};
		static String[] sPattern = {
			"   *****  ",
			"  **      ",
			" **       ",
			"  **      ",
			"   ***    ",
			"      ** ",
			"       **",
			"      ** ",
			"  ******  "
		};
		static String[] getPattern(char ch){
			switch(Character.toUpperCase(ch)){
				case 'O' : return oPattern;
				case 'P' : return pPattern;
				case 'S' : return sPattern;
				default : return  new String[] {
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" ",
					" "
				};
			}
		}
	}
	public static void main(String[] args) {
		String name = "OOPS";
		for(int i=0; i<9; i++){
			for(char ch : name.toCharArray()){
				String[] pattern = CharacterPattern.getPattern(ch);
				System.out.print(pattern[i] + "  ");
			}
			System.out.println();
		}
	}
}
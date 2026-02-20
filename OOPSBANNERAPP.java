/*
@author developer
@version 6
*/
class OOPSBannerFunction{
	public static String[] getOPattern(){
		return new String[] {
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
	}
	public static String[] getPPattern(){
		return new String[] {
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
	}
	public static String[] getSPattern(){
		return new String[] {
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
	}
	public static void main(String[] args){
		// continuous memory to store elements
		String oPattern[] = getOPattern();
		String pPattern[] = getPPattern();
		String sPattern[] = getSPattern();
		for(int i = 0; i < oPattern.length;i++){
			System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
		}
	}
}
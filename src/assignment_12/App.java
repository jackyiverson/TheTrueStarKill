package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	public static String starKill(String str) {
		int start = str.indexOf('*');
		int Dstart=str.indexOf("**");
		if(str.length()==0 || start==-1) return str;
		else if(start==0 && str.length()==1) return "";
		else if (start == 0) {
			str="a"+str;
			return starKill(str);
		}else if((str.lastIndexOf('*')==str.length()-1)){
			str=str+"a";
			return starKill(str);
		}	else if(Dstart !=-1) {
			str=str.substring(0,Dstart)+"*"+str.substring(Dstart+2);
			return starKill(str);
		} 
		str=str.substring(0,start-1)+str.substring(start+2);
		if(str.indexOf('*')!=-1) return starKill(str);
		return str;
	}
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

package SalaryChecker.Class;

public class Utils {

	public static String ANSI_GREEN="\033[92m";
	public static String ANSI_RED="\033[31m";
	public static String ANSI_YELLOW="\033[33m";
	public static String ANSI_WHITE="\033[37m";
	public static String ANSI_MGNT="\033[36m";
	/*public static String ANSI_BG_GREEN="\033[42m";
	public static String ANSI_BG_RED="\033[41m";
	public static String RESET="\033[0m";*/
	
	
	public static void intro() {
		System.out.println(Utils.ANSI_GREEN);
		System.out.println("	 #  #     #     #####    #####  ##### ");
		System.out.println("	 # #     # #    #        #      #   # ");
		System.out.println("	 ##     #####   ##### -- #####  #     ");
		System.out.println("	 # #   #     #  #            #  #   # ");
		System.out.println("	 #  # #       # #####    #####  ##### ");
		System.out.println(Utils.ANSI_YELLOW+" 	KEEP AN EYE ON IT: SALARY CHECKER"+Utils.ANSI_WHITE+" 	v 1.1");
	}

	public static void menu() {
		System.out.println("\n"+Utils.ANSI_YELLOW+"  1]"+Utils.ANSI_WHITE+"  Add Salary");
		System.out.println(Utils.ANSI_YELLOW+"  2]"+Utils.ANSI_WHITE+"  Add expense");
		System.out.println(Utils.ANSI_YELLOW+"  3]"+Utils.ANSI_WHITE+"  Print");
		System.out.println(Utils.ANSI_YELLOW+"  4]"+Utils.ANSI_WHITE+"  Menu");
		System.out.println(Utils.ANSI_YELLOW+"  5]"+Utils.ANSI_WHITE+"  Load from txt file (overwrites actual data)");
		System.out.println(Utils.ANSI_YELLOW+"  6]"+Utils.ANSI_WHITE+"  Save data into txt\n");
	}
	
	
	/*
	 * Given a String month, it returns an integer that indicates which month it is
	 * Thus helping to access the arraylist (0 is January, 1 February , ...)
	 * 	So i need to do Integer_returned - 1 to access the correct position in the ArrayList.
	 * 
	 * It returns -1 in case an error occured, so in the main i can reask the month until this function returns a value greater than 1.
	 * 
	 */
	public static Integer MonthToInt(String month) {
		switch(month) {
			case "JANUARY":
				return 1;
			case "FEBRUARY":
					return 2;
			case "MARCH":
					return 3;
			case "APRIL":
					return 4;
			case "MAY":
					return 5;
			case "JUNE":
					return 6;
			case "JULY":
					return 7;
			case "AUGUST":
					return 8;
			case "SEPTEMBER":
					return 9;
			case "OCTOBER":
					return 10;
			case "NOVEMBER":
					return 11;
			case "DECEMBER":
					return 12;
			default:
					System.out.println("	This month is not an option.\n");
					return -1;
		}
	}

	
	
	
}
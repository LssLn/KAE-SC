package SalaryChecker.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import SalaryChecker.Class.FileHandler;
import SalaryChecker.Class.Salary;
import SalaryChecker.Class.Utils;
import SalaryChecker.Class.Year;
import SalaryChecker.Class.SwitchManagerUtils;

public class SalaryCheck_main {

	public static void main(String[] args) {
		
		Utils.intro();
		ArrayList<Year> yearsList = new ArrayList<>();		
		Utils.menu();
		
		int scelta=0;
		do {
			System.out.print(Utils.ANSI_YELLOW+"\n -> "+Utils.ANSI_WHITE);
			Scanner scannerSwitch = new Scanner(System.in);
			scelta=scannerSwitch.nextInt();
			switch(scelta) {
				case 1:
					SwitchManagerUtils.addSalary(yearsList);
					break;
				case 2:
					boolean expenseAddedSuccessfully = SwitchManagerUtils.addExpense(yearsList);
					if(expenseAddedSuccessfully) {
						System.out.println();
						SwitchManagerUtils.saveData(yearsList);
						yearsList=SwitchManagerUtils.loadData(yearsList);
					}
					break;
				case 3:
					SwitchManagerUtils.removeExpense(yearsList);
					System.out.println();
					SwitchManagerUtils.saveData(yearsList);
					yearsList=SwitchManagerUtils.loadData(yearsList);
					break;
				case 4:
					SwitchManagerUtils.printAll(yearsList);
					break;
				case 5:
					SwitchManagerUtils.printYear(yearsList);
					break;
				case 6:
					yearsList = SwitchManagerUtils.loadData(yearsList);
					break;
				case 7:
					SwitchManagerUtils.saveData(yearsList);
					break;
				case 8:
					SwitchManagerUtils.showStats(yearsList);
					break;
				case 9:
					SwitchManagerUtils.printMonthByCategories(yearsList);
					break;
				case 10:
					SwitchManagerUtils.printYearsByCategories(yearsList);
					break;
				case 100: 
					Utils.menu();
					break;
			}
		}while(scelta!=0);
	}
}

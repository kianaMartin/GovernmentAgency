package package1;
import java.util.*;

public class DeathOfCertificate {
	static deathCertificate dc = new deathCertificate();
	 	static Map ques = new HashMap();
	    static String[] Nume;
	    static Queue <String> NumE = new LinkedList();
	    static Queue <String> NumEE = new LinkedList();
	    static Queue <String> NumEEE = new LinkedList();
	    static String[][] T1 = new String[2][100];
	    static int ContinueOrEdit;
	   
	public static void main(String[]args) {
		 ques();
		Scanner scn = new Scanner (System.in);
		printcopy();
    	//Continue Or Edit
    		dc.question();
    		dc.display();
    		
    		 do{
                 
                 System.out.println("----------------------------------------------------------");
                 System.out.print("Check your answers(if theres any mistake press 2 to edit)"
                          + "\n[1] Continue"
                          + "\n[2] Edit: ");
                 
                  ContinueOrEdit = scn.nextInt();
                 
                 
                 if(ContinueOrEdit == 2){
              
               System.out.print("Enter the Code Value of that question example(1a)"
                              + "\nif more than 1 each number and value should be seprate by space: ");
                      scn.nextLine();
                      String edit = scn.nextLine().toLowerCase();
                      
                      Nume = edit.split(" ");
                      
                      for(String a: Nume){
                          NumE.add(a);
                          NumEE.add(a);
                          NumEEE.add(a);
                
                      }
                      for(int i = 0; i < NumE.size(); i++){
                          
                      
                      System.out.print(NumEEE.poll()+ " " +ques.get(NumE.poll()));
                      String change = scn.nextLine();
                      switch(NumEE.poll()) {
                      case "1A":
                    	  dc.setfirstName(change);
                    	  break;
                      case"1b":
                    	  dc.setmiddleName(change);
                    	  break;
                      case"1c":
                    	  dc.setlastName(change);
                    	  break;
                      case"2":
                    	  dc.setsex(change);
                    	  break;
                      case"3":
                    	  dc.setdateOfDeath(change);
                    	  break;
                      case"4":
                    	  dc.setdateOfBirth(change);
                    	  break;
                      case"5":
                    	  dc.setageAtDeath(Integer.parseInt(change));
                    	  break;
                      case"6":
                    	  dc.setplaceOfDeath(change);
                    	  break;
                      case"7":
                    	  dc.setcivilStatus(change);
                    	  break;
                      case"8":
                    	  dc.setreligion(change);
                    	  break;
                      case"9": 
                    	  dc.setcitizenship(change);
                    	  break;
                      case"10":
                    	  dc.setoccupation(change);
                    	  break;
                      case"11":
                    	  dc.setresidence(change);
                    	  break;
                      case"12":
                    	  dc.setfatherName(change);
                    	  break;
                      case"13":
                    	  dc.setmotherName(change);
                    	  break;
                      case "14":
                    	  dc.setageOfMother(Integer.parseInt(change));
                    	  break;
                      case"15":
                    	  dc.setmdelivery(change);
                    	  break;
                      case"16":
                    	  dc.setlengthOfpreg(change);
                    	  break;
                      case"17":
                    	  dc.settypeOfbirth(change);
                    	  break;
                      case"18":
                    	  dc.setmultiBirth(change);
                    	  break;
                      case"19a":
                    	  dc.setcauseOfdeath(change);
                    	  break;
                      case"19b":
                    	  dc.setcauseD(change);
                    	  break;
                      case"19c":
                    	  dc.setmaternalCondition(change);
                    	  break;
                      case"19d":
                    	  dc.setDExternal(change);
                    	  break;
                      case"19e":
                    	  dc.setcause(change);
                      case"19f":
                    	  dc.setdeathExternal(change);
                    	  break;
                      case"20":
                    	  dc.setautopsy(change);
                    	  break;
                      case"21":
                    	  dc.setattendant(change);
                    	  break;
                    	  }
                      }     
                      dc.display();
                          }         
                 
                  }while(ContinueOrEdit == 2);
               //printcopy();
	}
	//printcopy
	public static void printcopy() {
		System.out.println("====================================================================================================");
		System.out.println("\t\t\t\t\tRepublic of the Philippines\n\t\t\t\tOFFICE OF THE CIVIL REGISTRAR GENERAL\n\t\t\t\t\tCERTIFICATE OF DEATH");
	    System.out.println("====================================================================================================");
	    System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("1. Name\t\t  (First)\t    (Middle)\t    (last)\t    |2. SEX (Male/Female)");
	
		System.out.printf("\t\t   %-18s%-16s%-15s|   %-16s", dc.getfirstName(),dc.getmiddleName(), dc.getlastName(), dc.getsex());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("3. DATE OF DEATH\t\t    |4. DATE OF BIRTH\t\t    |5. AGE AT THE TIME OF DEATH");
	    System.out.printf("   %-33s|   %-28s|   %-26s", dc.getdateOfDeath(), dc.getdateOfBirth(), dc.getageAtDeath());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("6. PLACE OF DEATH\t\t\t\t\t\t    |7. CIVIL STATUS" );
        System.out.printf("\t\t\t%-44s|   %-20s",dc.getplaceOfDeath(),dc.getcivilStatus());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("8. RELIGION/RELIGIOUS SECT\t    |9.CITIZENSHIP\t\t    |10. RESIDENCE");
	    System.out.printf("   %-33s|  %-29s|    %-19s",dc.getreligion(), dc.getcitizenship(),dc.getresidence());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("11. OCCUPATION\t\t\t    |12. NAME OF FATHER\t\t    |13. MAIDEN NAME OF MOTHER");
	    System.out.printf("    %-32s|%-31s|%-28s",dc.getoccupation(),dc.getfatherName(), dc.getmotherName());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t     MEDICAL CERTIFICATE");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("FOR CHILDREN AGE 0 TO 7 DAYS");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("14. AGE OF MOTHER: ");
	    System.out.println(dc.getageOfmother());
	    System.out.print("15. METHOD OF DELIVERY: ");
	    System.out.println(dc.getmdelivery());
	    System.out.print("16. LENGTH OF PREGNANCY WEEKS: ");
	    System.out.println(dc.getlengthOfPreg());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("17. TYPE OF BIRTH: ");
	    System.out.println(dc.gettypeOfbirth());
	    System.out.print("18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.println(dc.getmultiBirth());
	    System.out.print("19a. CAUSE OF DEATH: ");
	    System.out.println(dc.getcauseOfDeath());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS FEMALE AGED 15-49 YEARS OLD ");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("19b. CAUSE OF DEATH: ");
	    System.out.println(dc.getcauseD());
	    System.out.print("19c. MATERNAL CONDITION: ");
	    System.out.println(dc.getmaternalCondition());
	    System.out.println("a. MANNER OF DEATH: ");
		System.out.println("b. PLACE OF OCCURANCE:");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS AGED  8 DAYS AND OVER ");
        System.out.println("----------------------------------------------------------------------------------------------------\n");
	    System.out.print("19e. CAUSE OF DEATH: " );
	    System.out.println(dc.getcause()+"\t\t\t\t");
	    System.out.println("19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t|20. AUTOPSY");
	    System.out.println("a. MANNER OF DEATH: \t\t\t\t\t|    "+ dc.getautopsy());
	    System.out.println("b. PLACE OF OCCURANCE: \t\t\t\t\t|");
	    System.out.println(dc.getdeathExternal());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("21a. ATTENDANT \t\t\t\t\t\t|21b. IF ATTENDANT, STATE DURATION(MM/DD/YYYY)");
	    System.out.printf("     %-51s|     %-30s ", dc.getattendant(),dc.getduration());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("22. CERTIFICATION OF DEATH\n[] I hereby certify that the foregoing particulars are correct as near as same can be"
	    					+ "\nassertained ascertained and i futher certify that I [] have not attended the deceased"
	    					+ "\nand that death to occured at __________am/pm on the date of death specified above. ");
	    System.out.println("Signature _______________\t\t|REVIEWED BY ");
	    System.out.println("Name in Print _______________\t\t|	__________________________________");
	    System.out.println("Title or Position ________________\t|  Signature Over Printed Name of Health Officer");
	    System.out.println("Adresses ________________\t\t	   ________________________");
	    System.out.println("_________________Date__________\t\t|		     Date");
        System.out.println("----------------------------------------------------------------------------------------------------\n");
	    System.out.println("23. CORPSE DISPOSAL\t\t\t|24a. BURIAL/CREMATION PERMIT\t|24b. TRANSFER PERMIT");
	    System.out.println("\t\t\t\t\t|Number ___________\t\t|Number __________");
	    System.out.println("\t\t\t\t\t|Date Issued __________\t\t|Date Issued ___________");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("25. NAME AND ADRESS OF CEMETERY OR CREMATORY");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("26. CERTIFICATION OF INFORMANT\t\t\t|"
	    					+ "\nI hereby certify that all information\t\t|"
	    					+ "\nsupplied are true and correct to my\t\t|27. PREPARED BY"
	    					+ "\nown knowledge\t\t\t\t\t|Signature ____________");
	    System.out.println("Signature __________\t\t\t\t|Name in Print __________");
	    System.out.println("Name in Print __________\t\t\t|Address ___________");
	    System.out.println("Address __________\t\t\t\t|Date __________");
	    System.out.println("Date __________");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("28. RECEIVED BY\t\t\t\t\t|29. REGISTERED AT THE OFFICE OF THE CIVIL REGISTRAR");
	    System.out.println("Signature __________\t\t\t\t|Signature __________");
	    System.out.println("Name in Print __________\t\t\t|Name in Print __________");
	    System.out.println("Address __________\t\t\t\t|Address ___________");
	    System.out.println("Date __________\t\t\t\t\t|Date __________");
	
	}
	
	public static void ques() {
		ques.put("1a", "First Name: ");
		ques.put("1b", "Middle Name: ");
		ques.put("1c", "Last Name: ");
		ques.put("2", "Sex (M/F): ");
		ques.put("3", " Date of Death (DD/MM/YYYY): ");
		ques.put("4", " Date of Birth (DD/MM/YYYY): ");
		ques.put("5", " Age at the time of death: ");
		ques.put("6", " Place of Death: ");
		ques.put("7", " Civil Status: ");
		ques.put("8", " Religion: ");
		ques.put("9"," Citizenship: ");
		ques.put("10", " Occupation: ");
		ques.put("11", " Residence: ");
		ques.put("12", " Name of Father (First, Middle, Last): ");
		ques.put("13", " Name of Mother (First, Middle, Last): ");
		ques.put("14", " Age of Mother: ");
		ques.put("15", " Method of delivery(Normal spontaneus vertex, if others, specify): ");
		ques.put("16", " Length of pregnancy(In completed weeks):");
		ques.put("17", " Type of birth (Single, Twin, Triplet, etc.): ");
		ques.put("18", " If multiple birth child was(first, Second, Third, Others):");
		ques.put("19a", " Cause of Death: ");
		ques.put("19b", " Cause of Death: ");
		ques.put("19c", " Maternal Condition:");
		ques.put("19e", " Cause of Death: ");
		ques.put("21a", " Attendant: ");
		ques.put("21b", " If attendant press [Y] the state duration(MM/DD/YY), else [N] ");
		
	}
   
}



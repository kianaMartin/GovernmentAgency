package Marriage;
import java.util.*;
public class MarriageCertificateProgram {
	   void process(){
		  
	        Scanner scanner = new Scanner(System.in);
	        MarriageCertificate certificate = new MarriageCertificate();
	        
	        certificate.inputMarriageCertificate();
	        certificate.displayCertificateInformation();
  
	        //condition to edit
	    
	        System.out.print("\tDo you want to edit? [Y] Yes or [N] No: ");
	        String user_input = scanner.nextLine();
	        
	        if(user_input.equals("Y")|| user_input.equals("y")){
	            certificate.editCertificateInformation();
	            certificate.displayCertificateInformation();
	        }
	    

	         //System Repeats
	        boolean System_repeater = true;
	        while(System_repeater){
	           
	           System.out.println("\tDo you want to Continue to Edit?");
	           System.out.print("\t[Y] Yes or [N] No: ");
	           String decision = scanner.nextLine();
	           if (decision.equals("Y")|| decision.equals("y")){
	               System_repeater = true;
	               certificate.editCertificateInformation();
	           }
	           else if(decision.equals("N") || decision.equals("n")){
	                   System_repeater = false;
	           }
	           else{
	            System_repeater = true;
	           }
	        } 
	           certificate.displayCertificateInformation();
	           System.out.println("=======================================================================================================================");
		        System.out.println("\t\t\t\t\tRepublic of the Philippines\n\t\t\t\tOFFICE OF THE CIVIL REGISTRAR GENERAL\n\t\t\t\t\tCERTIFICATE OF MARRIAGE");
		        System.out.println("=======================================================================================================================");	 
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.println("\t\t\t\t\t|WIFE\t\t\t\t\t|HUSBAND");
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Name of Contracting Parties\t\t|(1a) %-14s|(1b) %-14s|(14a) %-14s|(14b) %-14s\n\t\t\t\t\t|(1c) %-34s|(14c) %-14s\n", 
		        					certificate.getWifeFirst(), certificate.getHusbandFirst(),certificate.getWifeMiddle(), certificate.getHusbandMiddle(),certificate.getWifeLast(),certificate.getHusbandLast());
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Date of Birth/Age\t\t\t|(2) %-15s|(3) %-15s|(15) %-15s|(16) %-15s\n", certificate.getHusbandDateOfBirth(),certificate.getWifeDateOfBirth(),certificate.getWifeAge(), certificate.getHusbandAge());
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Place of Birth\t\t\t\t|(4) %-35s|(17) %-15s\n", certificate.getHusbandPlaceOfBirth(),certificate.getWifePlaceOfBirth());
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Sex (Male/Female)\t\t\t|(5) %-30s\t|(18) %-10s\n", certificate.getHusbandSex(), certificate.getWifeSex());
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Citizenship\t\t\t\t|(6) %-30s\t|(19) %-20s\n", certificate.getHusbandCitizen(), certificate.getWifeCitzen());
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Residence\t\t\t\t|(7a) %-14s|(7a) %-14s|(20a) %-14s|(20b) %-14s\n\t\t\t\t\t|(7c) %-14s|(7d) %-14s|(20c) %-14s|(20d) %-14s",
		        		certificate.getWifeProvince(), certificate.getHusbandProvince(),certificate.getWifeCity(),
		        		certificate.getHusbandCity(),certificate.getWifeBarangay(),certificate.getHusbandBarangay(),certificate.getWifeStreet(),certificate.getHusbandStreet());	   
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Religion\t\t\t\t|(8) %-35s|(21) %-20s", certificate.getWifeReligion(), certificate.getHusbandReligion());
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Civil Status\t\t\t\t|(9) %-35s|(22) %-15s", certificate.getWifeStatus(), certificate.getHusbandStatus());
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Name of Father\t\t\t\t|(10) %-34s|(23) %-15s", certificate.getWifeFather(), certificate.getHusbandFather());
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("Citizenship\t\t\t\t|(11) %-34s|(24) %-15s", certificate.getWifeFatherCitizen(),certificate.getHusbandFatherCitizen());
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
		        System.out.println("Place of Marriage: "+ certificate.getPlaceMarriage());
		        System.out.print("Date Of Marriage: "+ certificate.getDateMarriage());
		        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
	        
	   } 

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        MarriageCertificateProgram marriageprint = new MarriageCertificateProgram();
	       marriageprint.process();  
	        
	}
}
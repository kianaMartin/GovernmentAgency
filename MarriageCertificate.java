package Marriage;
import java.util.*;
public class MarriageCertificate {
	
	//Wife Documents Info
		String Wife_First;
		String Wife_Middle;
		String Wife_Last;
		String Wife_Date_Of_Birth;
		String Wife_Age;
		String Wife_Place_Of_Birth;
	    String Wife_Sex;
		String Wife_Citizenship;
		String Wife_Provice;
		String Wife_City;
		String Wife_Barangay;
		String Wife_Street;
		String Wife_Religion;
		String Wife_Status;
		String Wife_Father;
		String Wife_Father_Citizenship;
		String Wife_Mother;
		String Wife_Mother_Citizenship;
		
		//Husband Documents Info
		String Husband_First;
		String Husband_Middle;
		String Husband_Last;
		String Husband_Date_Of_Birth;
		String Husband_Age;
		String Husband_Place_Of_Birth;
		String Husband_Sex;
		String Husband_Citizenship;
		String Husband_Provice;
		String Husband_City;
		String Husband_Barangay;
		String Husband_Street;
		String Husband_Religion;
		String Husband_Status;
		String Husband_Father;
		String Husband_Father_Citizenship;
		String Husband_Mother;
		String Husband_Mother_Citizenship;
		String place_Marriage;
		String date_Marriage;
		//Wife Document Setter

		public void setWifeName(String Wife_First){
			this.Wife_First = Wife_First;
		}
		public void setWifeMiddle(String Wife_Middle){
			this.Wife_Middle = Wife_Middle;
		}
		public void setWifeLast(String Wife_Last){
			this.Wife_Last = Wife_Last;
		}
		public void setWifeDateOfBirth(String dateofbirth){
			Wife_Date_Of_Birth = dateofbirth;
		}
		public void setWifeAge(String wifeage){
			Wife_Age = wifeage;
		}
		public void setWifePlaceOfBirth(String wifeplaceofbirth){
			Wife_Place_Of_Birth = wifeplaceofbirth;
		}
		public void setWifeSex(String wifesex){
			Wife_Sex = wifesex;
		}
		public void setWifeCitezenship(String wifecitizenship){
			Wife_Citizenship = wifecitizenship;
		}
		public void setWifeProvince(String wifeProvince){
			Wife_Provice = wifeProvince;
		}
		public void setWifeCity(String wifecity){
			Wife_City = wifecity;
		}
		public void setWifeBarangay(String wifebarangay){
		  Wife_Barangay = wifebarangay;
		}
		public void setWifeStreet(String wifestreet){
			Wife_Street = wifestreet;
		}
		public void setWifeReligion(String wifeReligion){
	       Wife_Religion = wifeReligion;
		}
		public void setWifeStatus(String wifeStatus){
		 Wife_Status = wifeStatus;
		}
		public void setWifeFather(String wifeFather){
			Wife_Father = wifeFather;
		}
		public void setWifeFatherCitizen(String wifeFatherCitizen)
		{
			Wife_Father_Citizenship = wifeFatherCitizen;
		}
		public void setWifeMother(String wifeMother){
			Wife_Mother = wifeMother;
		}
		public void setWifeMotherCitizen(String wifeMotherCitizen)
		{
			Wife_Mother_Citizenship = wifeMotherCitizen;
		}
		

		//Wife Information Getter Section
		public String getWifeFirst(){
			return Wife_First;
		}
		public String getWifeMiddle(){
			return Wife_Middle;
		}
		public String getWifeLast(){
			return Wife_Last;
		}
		public String getWifeDateOfBirth(){
			return Wife_Date_Of_Birth;
		}
		public String getWifeAge(){
			return Wife_Age;
		}
		public String getWifePlaceOfBirth(){
			return Wife_Place_Of_Birth;
		}
		public String getWifeSex(){
			return Wife_Sex;
		}
		public String getWifeCitzen(){
			return Wife_Citizenship;
		}
		public String getWifeProvince(){
			return Wife_Provice;
		}
		public String getWifeCity(){
			return Wife_City;
		}
		public String getWifeBarangay(){
			return Wife_Barangay;
		}
		public String getWifeStreet(){
			return Wife_Street;
		}
		public String getWifeReligion(){
			return Wife_Religion;
		}
		public String getWifeStatus(){
			return Wife_Status;
		}
		public String getWifeFather(){
			return Wife_Father;
		}
		public String getWifeFatherCitizen(){
			return Wife_Father_Citizenship;
		}
		public String getWifeMother(){
			return Wife_Mother;
		}
		public String getWifeMotherCitizen(){
			return Wife_Mother_Citizenship;
		}
		

		//Husband Document Setter

		public void setHusbandName(String husbandFirst){
			Husband_First = husbandFirst;
		}
		public void setHusbandMiddle(String husbandMiddle){
			Husband_Middle = husbandMiddle;
		}
		public void setHusbandLast(String husbandLast){
			Husband_Last = husbandLast;
		}
		public void setHusbandDateOfBirth(String husbandDateOfBirth){
			Husband_Date_Of_Birth = husbandDateOfBirth;
		}
		public void setHusbandAge(String husbandAge){
			Husband_Age = husbandAge;
		}
		public void setHusbandPlaceOfBirth(String husbandPlaceOfBirth){
			Husband_Place_Of_Birth = husbandPlaceOfBirth;
		}
		public void setHusbandSex(String husbandSex){
			Husband_Sex = husbandSex;
		}
		public void setHusbandCitizen(String husbadCitizen){
			Husband_Citizenship = husbadCitizen;
		}
		public void setHusbandCity(String husbandCity){
			Husband_City = husbandCity;
		}
		public void setHusbandProvince(String husbandProvince){
			Husband_Provice = husbandProvince;
		}
		public void setHusbandBarangay(String husbandBarangay){
			Husband_Barangay = husbandBarangay;
		}
		public void setHusbandStreet(String husbandStreet){
			Husband_Street = husbandStreet;
		}
		public void setHusbandReligion(String husbandReligion){
			Husband_Religion = husbandReligion;
		}
		public void setHusbandStatus(String husbandStatus){
			Husband_Status = husbandStatus;
		}
		public void setHusbandFather(String husbandFather){
			Husband_Father = husbandFather;
		}
		public void setHusbandFatherCitizen(String husbandFatherCitizen){
			Husband_Father_Citizenship = husbandFatherCitizen;
		}
		public void setHusbandMother(String husbandMother){
	         Husband_Mother = husbandMother;
		}
		public void setHusbandMotherCitizen(String husbandMotherCitizen){
			Husband_Mother_Citizenship = husbandMotherCitizen;
		}
		public void setPlaceMarriage(String placeMarriage) {
			place_Marriage = placeMarriage;
		}
		public void setDateMarriage(String dateMarriage) {
			date_Marriage = dateMarriage;
		}
		//Husband information Getter
		public String getHusbandFirst(){
			return Husband_First;
		}
		public String getHusbandMiddle(){
			return Husband_Middle;
		}
		public String getHusbandLast(){
			return Husband_Last;
		}
		public String getHusbandDateOfBirth(){
			return Husband_Date_Of_Birth;
		}
		public String getHusbandAge(){
			return Husband_Age;
		}
		public String getHusbandPlaceOfBirth(){
			return Husband_Place_Of_Birth;
		}
		public String getHusbandSex(){
			return Husband_Sex;
		}
		public String getHusbandCitizen(){
			return Husband_Citizenship;
		}
		public String getHusbandProvince(){
			return Husband_Provice;
		}
		public String getHusbandCity(){
			return Husband_City;
		}
		public String getHusbandBarangay(){
			return Husband_Barangay;
		}
		public String getHusbandStreet(){
			return Husband_Street;
		}
		public String getHusbandReligion(){
			return Husband_Religion;
		}
		public String getHusbandStatus(){
			return Husband_Status;
		}
		public String getHusbandFather(){
			return Husband_Father;
		}
		public String getHusbandFatherCitizen(){
			return Husband_Father_Citizenship;
		}
		public String getHusbandMother(){
			return Husband_Mother;
		}
		public String getHusbandMotherCitizen(){
			return Husband_Mother_Citizenship;
		}
		public String getPlaceMarriage() {
			return place_Marriage;
		}
		public String getDateMarriage() {
			return date_Marriage;
		}
		


	    // Input Marriage Area
	    void inputMarriageCertificate() {

	        Scanner scanner = new Scanner(System.in);
	        // Wife information input
	        System.out.println("\n\tWife Information");
	        System.out.println();

	        System.out.print("\tFirst Name: ");
	        String firstname = scanner.nextLine();
	        setWifeName(firstname);

	        System.out.print("\tMiddle Name: ");
	        String middlename = scanner.nextLine();
	        setWifeMiddle(middlename);

	        System.out.print("\tLast Name: ");
	        String lastname = scanner.nextLine();
	        setWifeLast(lastname);

	        System.out.print("\tDate of Birth (MM/DD/YYYY): ");
	        String dateofbirth = scanner.nextLine();
	        setWifeDateOfBirth(dateofbirth);

	        System.out.print("\tAge: ");
	        String age = scanner.nextLine();
	        setWifeAge(age);

	        System.out.print("\tPlace of Birth (City, Province): ");
	        String province = scanner.nextLine();
	        setWifePlaceOfBirth(province);

	        System.out.print("\tSex(f/m): ");
	        String sex = scanner.nextLine();
	        setWifeSex(sex);

	        System.out.print("\tCitizenship: ");
	        String citizen = scanner.nextLine();
	        setWifeCitezenship(citizen);

	        System.out.print("\tResidence (Province): ");
	        String provincename = scanner.nextLine();
	       setWifeProvince(provincename);

	        System.out.print("\tResidence (City/Municipality): ");
	        String city = scanner.nextLine();
	        setWifeCity(city);

	        System.out.print("\tResidence (Barangay): ");
	        String barangay = scanner.nextLine();
	        setWifeBarangay(barangay);

	        System.out.print("\tResidence (House Number/Street): ");
	        String residence = scanner.nextLine();
	        setWifeStreet(residence);

	        System.out.print(" \tReligion: ");
	        String religion = scanner.nextLine();
	       setWifeReligion(religion);

	        System.out.print("\tCivil status: ");
	        String status = scanner.nextLine();
	        setWifeStatus(status);

	        System.out.print("\tFull name of Father: ");
	        String father = scanner.nextLine();
	        setWifeFather(father);

	        System.out.print( "\tCitizenship of Father: ");
	        String fatherCitizen = scanner.nextLine();
	        setWifeFatherCitizen(fatherCitizen);

	        System.out.print("\tFull name of Mother: ");
	        String motherName = scanner.nextLine();
	        setWifeMother(motherName);

	        System.out.print("\tCitizenship of Mother: ");
	        String motheCitizen = scanner.nextLine();
	        setWifeMotherCitizen(motheCitizen);

	        // Husband Part
	        System.out.println("\n\tHusband Information");
	        System.out.println();
	        System.out.print("\tFirst Name: ");
	        String hfirstname = scanner.nextLine();
	        setHusbandName(hfirstname);

	        System.out.print("\tMiddle Name: ");
	        String hmiddlename = scanner.nextLine();
	        setHusbandMiddle(hmiddlename);

	        System.out.print("\tLast Name: ");
	        String hlastname = scanner.nextLine();
	        setHusbandLast(hlastname);

	        System.out.print("\tDate of Birth (MM/DD/YYYY): ");
	        String hdateofbirth = scanner.nextLine();
	        setHusbandDateOfBirth(hdateofbirth);

	        System.out.print("\tAge: ");
	        String hage = scanner.nextLine();
	        setHusbandAge(hage);

	        System.out.print("\tPlace of Birth (City, Province): ");
	        String hprovince = scanner.nextLine();
	        setHusbandPlaceOfBirth(hprovince);

	        System.out.print("\tSex(f/m): ");
	        String hsex = scanner.nextLine();
	        setHusbandSex(hsex);

	        System.out.print("\tCitizenship: ");
	        String hcitizen = scanner.nextLine();
	       setHusbandCitizen(hcitizen);

	        System.out.print("\tResidence (Province): ");
	        String hprovincename = scanner.nextLine();
	        setHusbandProvince(hprovincename);

	        System.out.print("\tResidence (City/Municipality): ");
	        String hcity = scanner.nextLine();
	       setHusbandCity(hcity);

	        System.out.print("\tResidence (Barangay): ");
	        String hbarangay = scanner.nextLine();
	        setHusbandBarangay(hbarangay);

	        System.out.print("\tResidence (House Number/Street): ");
	        String hresidence = scanner.nextLine();
	       setHusbandStreet(hresidence);

	        System.out.print("\tReligion: ");
	        String hreligion = scanner.nextLine();
	        setHusbandReligion(hreligion);

	        System.out.print("\tCivil status: ");
	        String hstatus = scanner.nextLine();
	        setHusbandStatus(hstatus);

	        System.out.print("\tFull name of Father: ");
	        String hfather = scanner.nextLine();
	        setHusbandFather(hfather);

	        System.out.print( "\tCitizenship of Father: ");
	        String hfatherCitizen = scanner.nextLine();
	        setHusbandFatherCitizen(hfatherCitizen);

	        System.out.print("\tFull name of Mother: ");
	        String hmotherName = scanner.nextLine();
	       setHusbandMother(hmotherName);

	        System.out.print("\tCitizenship of Mother: ");
	        String hmotheCitizen = scanner.nextLine();
	        setHusbandMotherCitizen(hmotheCitizen);
	        
	        System.out.print("Place of Marriage: ");
	        String placeMarraige = scanner.nextLine();
	        setPlaceMarriage(placeMarraige);
	        
	        System.out.print("Date of Marriage: ");
	        String dateMarriage = scanner.nextLine();
	        setDateMarriage(dateMarriage);

	    }


	    // Display Area
	    void displayCertificateInformation(){
	        System.out.println("\t_______________________________________________________________________________________________________");
	        System.out.println("\n\tWIFE'S INFORMATION");
	        System.out.println("\t1a. First Name: " + getWifeFirst());
	        System.out.println("\t1b. Middle Name: " + getWifeMiddle());
	        System.out.println("\t1c. Last Name: " +  getWifeLast());
	        System.out.println("\t2. Date of Birth (MM/DD/YYYY): " + getWifeDateOfBirth());
	        System.out.println("\t3. Age: " + getWifeAge());
	        System.out.println("\t4. Place of Birth (City, Province): " + getWifePlaceOfBirth());
	        System.out.println("\t5. Sex(f/m): " + getWifeSex());
	        System.out.println("\t6. Citizenship: " + getWifeCitzen());
	        System.out.println("\t7a. Residence (Province): " + getWifeProvince());
	        System.out.println("\t7b. Residence (City/Municipality): " + getWifeCity());
	        System.out.println("\t7c. Residence (Barangay): " + getWifeBarangay());
	        System.out.println("\t7d. Residence (House Number/Street): " + getWifeStreet());
	        System.out.println("\t8. Religion: " + getWifeReligion());
	        System.out.println("\t9. Civil status: " + getWifeStatus());
	        System.out.println("\t10. Full name of Father: " + getWifeFather());
	        System.out.println("\t11. Citizenship of Father: " + getWifeFatherCitizen());
	        System.out.println("\t12. Full name of Mother: " + getWifeMother());
	        System.out.println("\t13. Citizenship of Mother: " + getWifeMotherCitizen());
	        System.out.println("\t_______________________________________________________________________________________________________");
	        System.out.println("\n\tHUSBAND'S INFORMATION");
	        System.out.println("\t14a. First Name: " + getHusbandFirst());
	        System.out.println("\t14b. Middle Name: " + getHusbandMiddle());
	        System.out.println("\t15. Last Name: " + getHusbandLast());
	        System.out.println("\t16. Date of Birth (MM/DD/YYYY): " + getHusbandDateOfBirth());
	        System.out.println("\t17. Age: " + getHusbandAge());
	        System.out.println("\t18. Place of Birth (City, Province): " + getHusbandPlaceOfBirth());
	        System.out.println("\t19. Sex(f/m): " + getHusbandSex());
	        System.out.println("\t20. Citizenship: " + getHusbandCitizen());
	        System.out.println("\t21d. Residence (Province): " + getHusbandProvince());
	        System.out.println("\t21c. Residence (City/Municipality): " + getHusbandCity());
	        System.out.println("\t21b. Residence (Barangay): " + getHusbandBarangay());
	        System.out.println("\t21a. Residence (House Number/Street): " + getHusbandStreet());
	        System.out.println("\t22. Religion: " + getHusbandReligion());
	        System.out.println("\t23. Civil status: " + getHusbandStatus());
	        System.out.println("\t24. Full name of Father: " + getHusbandFather());
	        System.out.println("\t25. Citizenship of Father: " + getHusbandFatherCitizen());
	        System.out.println("\t26. Full name of Mother: " + getHusbandMother());
	        System.out.println("\t27. Citizenship of Mother: " + getHusbandMotherCitizen());
	        System.out.println("\t_______________________________________________________________________________________________________");
	        System.out.println("Place of Marriage" + getPlaceMarriage());
	        System.out.println("Date of Marriage" + getDateMarriage());
	        System.out.println("This is to certify that I" + getWifeFirst()+ getWifeMiddle()+getWifeLast() + getHusbandFirst()+getHusbandMiddle()+getHusbandLast()
	        					+",\nboth of legal age, of our own free will and accord,"
	        					+ "\nthe presence of the person solemmizing this marriage and of the witness named below,"
	        					+ "\ntake each other as husband and wife.");
	    }
	     
	    //Editing Area
	    void editCertificateInformation() {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("\tEnter the line number you want to edit: ");
	        String lineNumber = scanner.nextLine();
	        //scanner.nextLine(); // Consume the newline character

	        System.out.print("\tEnter the new value: ");
	        String newValue = scanner.nextLine();

	        switch (lineNumber) {
	            case "1a":
	                setWifeName(newValue);
	                break;
	            case "1b":
	               setWifeMiddle(newValue);
	                break;
	            case "1c":
	                setWifeLast(newValue);
	                break;
	            case "2":
	                setWifeDateOfBirth(newValue);
	                break;
	            case "3":
	                setWifeAge(newValue);
	                break;
	            case "4":
	                setWifePlaceOfBirth(newValue);
	                break;
	            case "5":
	                setWifeSex(newValue);
	                break;
	            case "6":
	                setWifeCitezenship(newValue);
	                break;
	            case "7d":
	                setWifeProvince(newValue);
	                break;
	            case "7c":
	                setWifeCity(newValue);
	                break;
	            case "7b":
	                setWifeBarangay(newValue);
	                break;
	            case "7a":
	                setWifeStreet(newValue);
	                break;
	            case "8":
	                setWifeReligion(newValue);
	                break;
	            case "9":
	                setWifeStatus(newValue);
	                break;
	            case "10":
	                setWifeFather(newValue);
	                break;
	            case "11":
	                setWifeFatherCitizen(newValue);
	                break;
	            case "12":
	                setWifeMother(newValue);
	                break;
	            case "13":
	                setWifeMotherCitizen(newValue);
	                break;

	            // Husband's information
	            case "14a":
	                setHusbandName(newValue);
	                break;
	            case "14b":
	               setHusbandMiddle(newValue);
	                break;
	            case "15":
	                setHusbandLast(newValue);
	                break;
	            case "16":
	                setHusbandDateOfBirth(newValue);
	                break;
	            case "17":
	                setHusbandAge(newValue);
	                break;
	            case "18":
	                setHusbandPlaceOfBirth(newValue);
	                break;
	            case "19":
	                setHusbandSex(newValue);
	                break;
	            case "20":
	                setHusbandCitizen(newValue);
	                break;
	            case "21d":
	                setHusbandProvince(newValue);
	                break;
	            case "21c":
	                setHusbandCity(newValue);
	                break;
	            case "21b":
	                setHusbandBarangay(newValue);
	                break;
	            case "21a":
	                setHusbandStreet(newValue);
	                break;
	            case "22":
	                setHusbandReligion(newValue);
	                break;
	            case "23":
	                setHusbandStatus(newValue);
	                break;
	            case "24":
	                setHusbandFather(newValue);
	                break;
	            case "25":
	                setHusbandFatherCitizen(newValue);
	                break;
	            case "26":
	                setHusbandMother(newValue);
	                break;
	            case "27":
	                setHusbandMotherCitizen(newValue);
	                break;

	            default:
	                System.out.println("\tInvalid line number.");
	                break;
	    }
	}
	// Ending of line of code
	}
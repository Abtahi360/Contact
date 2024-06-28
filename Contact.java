public class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	public Contact(){
	}
	public Contact(String personName,String personId,int age,String mobileNumber,char gender){
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	public void setpersonName(String personName){
		this.personName=personName;
	}
	public void setpersonId(String personId){
		this.personId=personId;
	}
	public void setage(int age){
		this.age=age;
	}
	public void setmobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public void setgender(char gender){
		this.gender=gender;
	}
	
	public String getpersonName(){
		return personName;
	}
	public String getpersonId(){
		return personId;
	}
	public int age(){
		return age;
	}
	public String mobileNumber(){
		return mobileNumber;
	}
	public char gender(){
		return gender;
	}
	public void showPersonInfo(){
		System.out.println("Person Name\t:"+personName);
		System.out.println("Person Id\t:"+personId);
		System.out.println("Person Age\t:"+age);
		System.out.println("Mobile Number\t:"+mobileNumber);
		System.out.println("Gender(M or F)\t:"+gender);
	}
	public void DetectMobileOperator(){
		if(mobileNumber.contains("017")==true||mobileNumber.contains("013")==true){
			System.out.println("Mobile Operator :GrameenPhone");
		}
		else if(mobileNumber.contains("018")==true){
			System.out.println("Mobile Operator :Robi");
		}
		else if(mobileNumber.contains("019")==true){
			System.out.println("Mobile Operator :Banglalink");
		}
		else if(mobileNumber.contains("016")==true){
			System.out.println("Mobile Operator :Airtel");
		}
		else if(mobileNumber.contains("015")==true){
			System.out.println("Mobile Operator :Tele Talk");
		}
		System.out.println();

	}
}
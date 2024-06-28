public class Start{
	public static void main(String[]args){
		Contact person1= new Contact("Abtahi Islam","23-50434-1",22,"01315477832",'M');
		Contact person2= new Contact("Sharmila","23-50534-1",21,"01323565742",'F');
		Contact person3= new Contact("Asadul Islam","23-52434-1",35,"01824865742",'M');
		Contact person4= new Contact("Abtahi Islam","23-50434-1",28,"0194865742",'F');
		person1.showPersonInfo();
				person1.DetectMobileOperator();

		person2.showPersonInfo();
				person2.DetectMobileOperator();

		person3.showPersonInfo();
				person3.DetectMobileOperator();

		person4.showPersonInfo();
				person4.DetectMobileOperator();

	}
}
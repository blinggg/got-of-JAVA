package inheritancePrint;

public class InheritancePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritancePoly poly=new InheritancePoly();
		poly.callPrintNames();
	}
	
	public void callPrintNames() {
		Parent parent1= new Parent();
		Parent parent2= new Child();
		Parent parent3= new ChildOther();
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
	}

}

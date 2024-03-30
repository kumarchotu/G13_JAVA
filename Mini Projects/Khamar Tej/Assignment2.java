package Suretrust;

interface itservice{
	public void getItserviceDetails();
	}
interface hardwareservice{
	public void getHardwareDetails();
}
class Basecompany implements itservice, hardwareservice{
	
       void getBasecompanyDetails() {
		System.out.println("base company details printed");
	}
	public void getItserviceDetails() {
		System.out.println("get It service details");
	}
	public void getHardwareDetails() {
		System.out.println("get hardware details");
	}
}

class childcompany extends Basecompany{
	 
}
class Localcompany extends childcompany{

}
class Sharecompany extends Basecompany{
	
}


public class Hybridinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Localcompany lc=new Localcompany();
        Sharecompany sc=new Sharecompany();
      
        lc.getBasecompanyDetails();
        sc.getBasecompanyDetails();
        sc.getItserviceDetails();
        sc.getHardwareDetails();
	}

}
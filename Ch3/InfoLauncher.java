
public class InfoLauncher {

	public static void main(String[] args) {
		Info info = new Info("Greg Marshall","186 Front St", 20, "314-755-3425");
		Info info2 = new Info("David Beckham", "345 Green St", 45, "314-657-2312");
		Info info3 = new Info("John Stones", "4566 Alpine Rd", 50, "314-897-7990");
		System.out.print("Data: "+ info.getName() + "\t" + "\t" +info.getAddress() + "\t" + "\t" + info.getAge()+ "\t" + info.getPhoneNumber());
		System.out.print("\nData: "+ info2.getName()  + "\t\t" + info2.getAddress() + "\t" + "\t"+ info2.getAge() + "\t" + info2.getPhoneNumber());
		System.out.print("\nData: "+ info3.getName() + "\t\t" + info3.getAddress() + "\t\t" + info3.getAge() + "\t" + info3.getPhoneNumber());
	}

}

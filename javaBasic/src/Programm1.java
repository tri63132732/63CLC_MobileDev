public class Programm1 {
   public static void main(String args[]) {
		Console c = new Console();
		c.print("Hello,  type in a number:");
		int yournumber = c.readInt();
		int mynumber = yournumber+1;
		c.println(" My number is " + mynumber);
		c.println("I win this time");
   }
}

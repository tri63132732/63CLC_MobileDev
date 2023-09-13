public class Programm2 {
   public static void main(String args[]) {
		Console c = new Console();
		c.print("Hello, what is your name ?");
		String name = c.readLine();
		c.print("Which year were you born ? ");
		int born = c.readInt();
		int age = 2023-born;
		c.println(name +", you are at least "+
			age+" years old ");

   }
}

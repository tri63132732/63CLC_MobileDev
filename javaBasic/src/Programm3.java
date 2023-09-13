public class Programm3 {
   public static void main(String args[]) {
	   Console c = new Console();
	   c.print("Enter the value to pay:");
	   int pay = c.readInt();
	   c.print("Enter the value given by the customer :");
	   int given = c.readInt();
	   int change=given-pay;
	   if(change/5000>0)
		   c.println("Give "+(change/5000)+" of 5000");
	   change = change%5000;
	   if(change/1000>0)
		   c.println("Give "+(change/1000)+" of 1000");
	   change = change%1000;
	   if(change/500>0)
		   c.println("Give "+(change/500)+" of 500");
	   change = change%500;
	   if(change/100>0)
		   c.println("Give "+(change/100)+" of 100");
	   change = change%100;
	   if(change/50>0)
		   c.println("Give "+(change/50)+" of 50");
	   change = change%50;
	   if(change/10>0)
		   c.println("Give "+(change/10)+" of 10");
	   change = change%10;
	   if(change/5>0)
		   c.println("Give "+(change/5)+" of 5");
	   change = change%5;
	   if(change>0)
		   c.println("Give "+(change)+" of 1");
   }
}

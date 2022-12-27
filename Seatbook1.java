class Seatbook11
  {
 static int T_seat=40;
 static synchronized void seat(int x)
{
	if(T_seat>=x)
	{
		System.out.println(x+" Seatbooked successfully");
		T_seat=T_seat-x;
		System.out.println(T_seat+" Seat left");
		System.out.println("_____________________________________________________________________________________________________________");
	}
	else
	{
		System.out.println("Seat cannot Booked");
		System.out.println("only " + T_seat + " seat are available");
	
		System.out.println("_____________________________________________________________________________________________________________");
	}
}
}

class sujit12 extends Thread
{
	Seatbook11 s; int x;
	sujit12(Seatbook11 s,int x)
	{
		this.s=s;
		this.x=x;
	}
	public void run()
	{
		s.seat(x);
	}
}

public class Seatbook1 {
	public static void main(String[] args) {
		Seatbook11 s=new Seatbook11();
		sujit12  s11 = new sujit12(s, 25);
		sujit12  s111 = new sujit12(s, 25);

		s11.start();
		s111.start();
		
		Seatbook11 s2=new Seatbook11();
		sujit12  s1111 = new sujit12(s2, 15);
		sujit12  s1112 = new sujit12(s2, 45);

		s1111.start();
		s1112.start();
		
	
	}

}

package bus;

import java.util.Scanner;

import controller.Join;
import model.Function;

public abstract class BusSituation {
	String id = null;
	String pw = null;
		
	Function fc = new Function();
	Scanner sc = new Scanner(System.in);
	Join  mc = new Join();
	String uName = mc.login(id, pw);
	String Nickname = uName;
			
	public abstract void situation();
}

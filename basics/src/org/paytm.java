package org;

public class paytm {
void login(String email,String pw)
{
	System.out.println("login is performed");
}
void login(long l,String password)	{
	System.out.println("login is performed");
}
public static void main(String[] args) {
	paytm p=new paytm();
	p.login("swetha","swetha");
	p.login(9491493165l, "swetha");
}
}

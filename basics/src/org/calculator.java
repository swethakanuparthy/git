package org;

public class calculator {
int add(int a,int b){
	return a+b;
}
int add(int d,int c,int e){
	return c+d+e;
}
float add(float a,float b){
	return a+b;
}
public static void main(String[] args) {
	calculator c=new calculator();
	int r= c.add(4,5);
	System.out.println(r);
	c.add(2.2f, 2.5f);
	c.add(2, 3, 5);
}
}

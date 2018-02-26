package javatutorial

class C{
	int v = 10;

	void m(){
		ont v = 20;
		System.out.println(v);
		System.out.println(this.v);		//지역변수와 전역변수가 이름이 같을떄 전역변수를 사용하기위해this를 이용
	}

}

public class ScopeDemo {

	public static void main(String[] args){
		C c1 = new C();
		c1.m();
	}
	
}

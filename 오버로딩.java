package javatutorial

class Calculator{
	int left,right;
	int third = 0;		//sum,avg 함수를 사용할때를 생각해서 0으로 초기화 시켜놓는다

	public void setOperands(int left, int right){
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOperands(int left, int right, int third){		//이름이 같아도 매개변수 형식이나 매개변수 개수가 다르면 오버로딩 가능
		System.out,println("setOperands(int left, int right, int third)");
		this.setOperands(left,right);		//this.left 와 this.right 를 중복해서 쓰지않기위해 사용
		this.third = third;
	}

	public void sum(){
		System.out.println(this.left + this.right + this.third);
	}

	public void avg(){
		System.out.println((this.left + this.right + this.third)/3);
	}
}

public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		c1.setOperands(10,20,30);
		c1.sum();
		c1.avg();
	}
}

package javatutorial

class Calculator{
	int left, right;

	public Calculator(int left, int right){		//클래스와 같은 이름의 메소드는 초기화 작업에 사용
		this.left = left;
		this.right = right;
	}

	public void sum(){
		System.out.println(this.left + this.right);
	}

	public void avg(){
		System.out.println((this.left + this.right)/2);
	}

}

public class CalculatorDemo{

	public static void main(String[] args){
		Calculator c1 = new Calculator(10,20);
		c1.sum();
		c1.avg();


		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
	}

}

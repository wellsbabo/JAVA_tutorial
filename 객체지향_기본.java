package javatutorial

class Calculator{     //객체생성. class키워드는 객체의 설계도를 알려주겠다는 뜻
  int left, right;
  
  public void setOperands(int left, int right){
    this.left = right;
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
    Calculator c1 = new Calculator();     // 메소드 앞에는 new가 붙지않음. 객체만 new가 붙음
    c1.setOperands(10 , 20);
    c1.sum();
    c1.avg();
  }
}

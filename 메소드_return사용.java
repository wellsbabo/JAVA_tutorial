package javatutorials

public class MethodDemo_2{

  public static String numbering(int init, int limit){      //반환값 String
    int i = init;
    String output ="";      //만들어지는 숫자를 ouput이라는 변수에 담기위해 변수에 빈값을 주었다
    while(i < limit){
      output += i;
      i++;
    }
    return output;      //String값을 반환함. ouput은 String값
  }
  
public static void main(String[] args){
  String result = numbering(1,5);
  System.out.println(result);
  }
 
}

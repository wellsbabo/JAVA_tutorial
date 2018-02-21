package javatutorials

import java.util.Scanner;     //라이브러리를 가져옴. java.util안에있는 Scanner라는 객체를가져옴

public class ScannerDemo{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()){
      System.out.println(sc.nextInt()*1000);
    }
    sc.close();
  }
}

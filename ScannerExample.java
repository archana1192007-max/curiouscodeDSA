Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y
ans:
import Java.util Scanner;
class Main{
  public static void main(String[]args){
    System.out.println("Enter Input");
    Scanner scan=new Scanner(System.in)
      int num=scan.nextln();
    string name=scan.nextln();
    char ch=scan.nextln().charAt(0);
    System.out.println(num); 
     System.out.println(name); 
     System.out.println(ch); 
  } 
}

import java.util.Scanner;
public  class TestApp
{
public static void main(String[] args)
{
int menu;
Scanner io = new Scanner(System.in);
Student so = new Student();
System.out.println("----MENU-----");
System.out.println("1.student score:");
System.out.println("2.check attendence status \n3.end day \n4.exit");
menu = io.nextInt();
switch(menu)
{
    case 1:
    System.out.println(" enter the score:");
    so.score=io.nextInt();
}
   break;
   {
    case 2:
so.checkPunishment();
   }
    
    
    so.attendanceStatus();
    so.endDay();
    so.attendanceStatus();

}
}
<<<<<<< HEAD
import java.util.Scanner;
public  class TestApp
{
  public static void main(String[] args)
  {
    int i,id,menu=0;
    Scanner io = new Scanner(System.in);
    Student so[] = new Student[10];
    for(i=0;i<10;i++)
    {
      so[i] = new Student();
    }

  while(menu!=4)
  {
    System.out.println("----MENU-----");
    System.out.println("1.teacher: Enter score:");
    System.out.println("2.Student: check attendence status \n3.end day \n4.exit[for exit enter '4']");
    menu = io.nextInt();
   switch(menu)
  {
    case 1:
      System.out.println("enter student ID:(1-10)");
      id= io.nextInt();
    System.out.println(" enter the score:");
    so[id-1].score=io.nextInt();
    so[id-1].checkPunishment();
    
    
    break;
   
    case 2:
      for(i=0;i<10;i++)
    {
   so[i].attendanceStatus();
    }
    break;

    case 3:
      for(i=0;i<10;i++)
    {
     so[i].endDay();
    }
    break;

    case 4:
        break;
   
   default:
        System.out.print("pls enter the vaild menu number.");
              break;
              }
}
}

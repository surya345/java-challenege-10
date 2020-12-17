import java.util.Scanner;
public class Task10
{
		static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
          static int totalDays = 0;
          public static void main(String[] args){
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
           int month = scan.nextInt();
           totalDays = days[month];
           System.out.println("Enter Year:");
           int year = scan.nextInt();
           System.out.println("Enter Day of week(Press 1 for Mon,2 for Tue,7 for Sun and so on)");
           int dayOfWeek = scan.nextInt();
           totalDays = days[month];

        printCalendar(dayOfWeek, month, year, totalDays);

        }
           public static void printCalendar(int dayOfWeek, int month, int year, int totalDays){
            System.out.println("        Calendar     ");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            
            if(dayOfWeek != 7){   
                for(int i = 1; i <= dayOfWeek; i += 1){
                    System.out.print(" ");
                }
            }
           for(int i = 1; i <= totalDays; i += 1){
                System.out.printf("%3d",i);
    
                if( ((i + dayOfWeek) % 7 == 0 ) || (i == totalDays)){
                    System.out.println();
    
    }
           }
        }
    }
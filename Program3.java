//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program1
{
    public static void main(String[] args){
        int l;
        int w;
        int A = 0;
        int P = 0;

        Scanner value = new Scanner(System.in);
        System.out.println(" Enter the Width :" );
        w = value.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.println(" Enter the lenght :");
        l = value2.nextInt();

        A = l*w;
        System.out.println("If the lenght is "+ l +" and the width is "+ w +" the area is " + A);
        P = 2*l +2*w;
        System.out.println("If the lenght is "+ l +" and the width is "+ w +" the perimeter is " + P);
    }
}


//Paste console output below:
/*
Enter the Width :
34
 Enter the lenght :
67
If the lenght is 67 and the width is 34 the area is 2278
If the lenght is 67 and the width is 34 the perimeter is 202

 */

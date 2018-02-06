/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        float x1,y1,x2,y2,t,q;
        int n,i,j;
        x1=s.nextFloat();;y1=s.nextFloat();;x2=s.nextFloat();y2=s.nextFloat();
        n=s.nextInt();
        float x[]=new float[n];
         float y[]=new float[n];
         for(i=0;i<n;i++)
          x[i]=s.nextFloat();
           for(i=0;i<n;i++)
          y[i]=s.nextFloat();
          q=s.nextFloat();
          for(i=0;i<q;i++)
          {
              t=s.nextFloat();
              int cou=0;
             double t1,t2,tres;
               for(j=0;j<n;j++)
               {
                  t1=Math.sqrt((x1-x[j])*(x1-x[j])+(y1-y[j])*(y1-y[j]));
                   t2=Math.sqrt((x2-x[j])*(x2-x[j])+(y2-y[j])*(y2-y[j]));
                    if(t1>=t2)
                     tres=t1;
                     else
                     tres=t2;
                     if(tres<=t)
                     cou++;
               }
             System.out.print(cou+" ");
              
          }
        

    }
}

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
        try{
         Scanner s = new Scanner(System.in);
         int t,i,j,m;
         int pa,pr,nee,neu,k,n;
         long q;
         t=s.nextInt();
         for(i=0;i<t;i++)
         {
             n=s.nextInt();
             k=s.nextInt();
             q=s.nextLong();
             long max;
             long a[]=new long[n];
             for(j=0;j<n;j++)
             a[j]=s.nextLong();
             
             pa=n/k;
            nee=pa;
             pr=n%k;
             neu=0;
             if(pr>0)
             {pa=pa+1;
			 nee=pa;
             neu=n-nee*k+nee; 
             }
             //System.out.println("element is"+neu);
			  
             long p[]=new long[k];
            // z=0;
             for(j=0;j<k;j++)
             {
                 int st,en;
                 if(j!=k-1 || pr==0)
                 {
                     max=0;
                      st=j*nee;en=st+nee;
                 for(m=st;m<en;m++)
                { if(max<=a[m])
                 {max=a[m];
                 p[j]=max;
                 }
                 
                   
                }
                 }
                 
else if(j==k-1 && pr!=0)  
                 {
                      max=0;
                       st=j*nee;
                       en=j*nee+neu;
                       // System.out.println(st);
                        //System.out.println(en);
                      for(m=st;m<en;m++)
                {
                   // System.out.println("hi there");
                    if(max<=a[m])
                 {max=a[m];
                 p[j]=max;
                 }
                 // System.out.println("hi there");  
                }}
   
             }
             long min=p[0];
             for(m=0;m<k;m++)
             if(min>=p[m])
             min=p[m];
             
            
             if(min<q)
             System.out.println(min);
             else
             System.out.println("NO");
               //for(m=0;m<k;m++)
                 //System.out.print(p[m]);
         }
        
}
catch(Exception e){}
    }
}

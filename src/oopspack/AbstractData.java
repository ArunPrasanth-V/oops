package oopspack;
import java.io.*;
public class AbstractData
{
    public static void main(String args[])throws IOException
    {
    	int choose;
    	int i;
    	int r;
        DataInputStream sc=new DataInputStream(System.in);
        AbstractCls a=new AbstractCls();
        do
    	{
    		try
    		{
    	      System.out.println("******STACK*******\n");
    	      System.out.println("Enter Your Choice \n 1.push \n 2.pop \n 3.display \n 4.exit");
              choose=Integer.parseInt(sc.readLine());
              switch(choose)
              {
              case 1:
            	      System.out.println("Enter The Value You want To Push : ");
            	      i=Integer.parseInt(sc.readLine());
            	      a.push(i);
            	      break;
              case 2: 
              	      a.pop();
              	      break;
              case 3:
            	      System.out.println("The Element Are");
            	      a.display();
            	      break;
              case 4:
            	     break;
            	  
              }
    		}
    		
              catch(IOException e)
              {
            	  System.out.println("io excetion");
              }
              System.out.println("Do You want to continue press 1 else press 0");
    		  r=Integer.parseInt(sc.readLine());
    	}while(r==1);    		
       }
 }

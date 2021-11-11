package oopspack;

import java.io.DataInputStream;
import java.io.IOException;

 interface Adt
{
 public void push(int i);
 public void pop();
 
}

class stractCs implements Adt
{
int stack[]=new int[6];
int top=-1;
int i;
public void push(int item)
{
	if(top>=4)
	{
	System.out.println("OverFlow");
	}
	else
	{
		top=top+1;
		stack[top]=item;
		System.out.println("Total Element in the stack");
		//System.out.println("The pushed items are"+item);
	}
}
public void pop()
{
	if(top<0)
	System.out.println("The UnderFlow..");
	else
    System.out.println("item poped"+stack[top]);
	top=top-1;
	
}
public void display()
{
	if(top<0)
		System.out.println("No Element in the Stack");
	else
	{
		for(i=0;i<=top;i++)
			System.out.println(stack[i]);
		   
	
	
	}

}
}
public class  AdtType
{
    public static void main(String args[])throws IOException
    {
    	int choose;
    	int i;
    	int r;
        DataInputStream sc=new DataInputStream(System.in);
        stractCs a=new stractCs();
        do
    	{
    		try
    		{
    	      System.out.println("******STACK*******\n");
    	      System.out.println("Enter Your Choice \n 1.push \n 2.pop  \n 3.exit");
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
            //  case 3:
            	        //System.out.println("The Element Are");
                        //a.display();
           	     
              case 3:
            	     break;
            	  
              }
             // System.out.println("The Stack Element Are");
              a.display();
    		}
    		
              catch(IOException e)
              {
            	  System.out.println("io excetion");
              }
              System.out.println("\n   Press 1 for Continue else Press 0");
    		  r=Integer.parseInt(sc.readLine());
    	}while(r==1);    		
       }
 }
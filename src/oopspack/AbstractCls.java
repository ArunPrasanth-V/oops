package oopspack;

public class AbstractCls implements ADTstack
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
		System.out.println("item push"+stack[top]);
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


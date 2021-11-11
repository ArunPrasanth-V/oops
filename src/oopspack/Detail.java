package oopspack;
import java.util.*;
class Employee 
{
	long mobile;
	String name,add,mail,id;
	 Scanner sc=new Scanner(System.in);
  void getdata()
  {
	 
	  System.out.println("Enter the Employee Name:");
	  name=sc.nextLine();
	  System.out.println("Enter the Employee I'D:");
	  id=sc.next();
	  System.out.println("Enter the Employee Address:");
	  add=sc.next();
	  System.out.println("Enter the Employee Mail I'D:");
      mail=sc.next();
      System.out.println("Enter the Employee Mobile No.:");
      mobile=sc.nextLong();
  }  
  void display()
  {
	  System.out.println("***************************************");
	  System.out.println("Employee Name:"+name);
	  System.out.println("Employee I'D:"+id);
	  System.out.println("Address:"+add);
	  System.out.println("Mail I'D:"+mail);
	  System.out.println("Mobile NO.:"+mobile);
  }
}

class Programmer extends Employee
{
	 double da,bp,hra=0.0,pf=0.0,club=0.0,net=0.0,gross=0.0;
  void getprogrammer()
  {
	 
	  System.out.println("Enter the basic pay");
	  bp=sc.nextDouble();
  }
  void calcprogrammer() 
  {
	
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+hra+da);
	net=(gross-pf-club);
	 System.out.println("*********PAY SLIP FOR PRAOGRAMMER*********");
	 System.out.println("BASIC PAY :RS:"+bp);
	 System.out.println("DA :RS:"+da);
	 System.out.println("HRA :RS:"+hra);
	 System.out.println("PF :RS"+pf);
	 System.out.println("CLUB :RS:"+club);
	 System.out.println("GROSS PAY :RS:"+gross);
	 System.out.println("NET PAY :RS:"+net);
  }
}

class AssistantProfesser extends Employee
{
	 double da,bp,hra,pf,club,net,gross;
	  void getcalcassist()
	  {
	
		  System.out.println("Enter the basic pay");
		  bp=sc.nextDouble();
	  }
	  void calcassist() 
	  {
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+hra+da);
		net=(gross-pf-club);
		 System.out.println("********PAY SLIP FOR ASSIST PROFESSOR*********");
		 System.out.println("BASIC PAY :RS:"+bp);
		 System.out.println("DA :RS:"+da);
		 System.out.println("HRA :RS:"+hra);
		 System.out.println("PF :RS"+pf);
		 System.out.println("CLUB :RS:"+club);
		 System.out.println("GROSS PAY :RS:"+gross);
		 System.out.println("NET PAY :RS:"+net);
	  }
}



class Associateaprofessor extends Employee
{
	 double salary=0.0,da,bp,hra,pf,club,net,gross;
	  void getcalcassociate()
	  {
		  
		  System.out.println("Enter the basic pay");
		  bp=sc.nextDouble();
	  }
	  void calcassociate() 
	  {
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+hra+da);
		net=(gross-pf-club);
		 System.out.println("********PAY SLIP FOR ASSOCIATE PROFESSOR*********");
		 System.out.println("BASIC PAY :RS:"+bp);
		 System.out.println("DA :RS:"+da);
		 System.out.println("HRA :RS:"+hra);
		 System.out.println("PF :RS"+pf);
		 System.out.println("CLUB :RS:"+club);
		 System.out.println("GROSS PAY :RS:"+gross);
		 System.out.println("NET PAY :RS:"+net);
	  }
}


class Professor extends Employee
{
	 double salary=0.0,da,bp,hra,pf,club,net,gross;
	  void getcalcprofessor()
	  {
		 
		  System.out.println("Enter the basic pay");
		  bp=sc.nextDouble();
	  }
	  void calcprofessor() 
	  {
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+hra+da);
		net=(gross-pf-club);
		 System.out.println("********PAY SLIP FOR PROFESSOR*********");
		 System.out.println("BASIC PAY :RS:"+bp);
		 System.out.println("DA :RS:"+da);
		 System.out.println("HRA :RS:"+hra);
		 System.out.println("PF :RS"+bp);
		 System.out.println("CLUB :RS:"+club);
		 System.out.println("GROSS PAY :RS:"+gross);
		 System.out.println("NET PAY :RS:"+net);
	  }
}



public class Detail
{
    public static void main(String args[])
    {
    	         int choose;
    		     Scanner c=new Scanner(System.in);
    			 System.out.println("*******ENTER YOUR CHOICE******** \n 1)PROGRAMMER \n 2)ASSISTANT PROFESSER \n 3)ASSOCIATE PROFESSER \n 4)PROFESSER");
    	         choose =c.nextInt();
    	    
    	         switch(choose)
    	         
    	         {
    	         case 1 :
    	        	     
    	        	     Programmer p=new Programmer();
    	        	     p.getdata();
    	        	     p.getprogrammer();
    	        	     p.display();
    	        	     p.calcprogrammer();
    	        	     break ;
    	         case 2 :
    	        	 AssistantProfesser a=new AssistantProfesser();
    	        	     a.getdata();
    	        	     a.getcalcassist();
    	        	     a.display();
    	        	     a.calcassist();
    	        	     break ;
    	         case 3 :
    	        	     Associateaprofessor as=new Associateaprofessor();
    	        	     as.getdata();
    	        	     as.getcalcassociate();
    	        	     as.display();
    	        	     as.calcassociate();
    	        	     break ;
    	         case 4 :
    	        	    Professor pc=new Professor();
    	        	    pc.getdata();
    	        	    pc.getcalcprofessor();
    	        	    pc.display();
    	        	    pc.calcprofessor();
    	        	    break;
    	        default :
    	        	   System.out.println("YOU ARE CHOOSING THE WRONG DITINATION.....PLZZ..TRY AGIN....");
    	       
    	}
    	         System.out.println("***************************************");
}
}


/*
// Airport ATC System with Medium level Considerations.
*/

import java.util.Scanner;
class Demo {
int a[]=new int[5];
Flight flight[]=new Flight[5];
void assign()
{
int i;
   flight[0]=new Flight("Bombay","Hyd","12345",0,700,0);
   flight[1]=new Flight("Hyd","Bombay","23456",0,1200,0);
   flight[2]=new Flight("Vij","Delhi","34567",0,900,0);
   flight[3]=new Flight("Madras","Thirupathi","45678",0,680,0);
   flight[4]=new Flight("Goa","Delhi","56789",0,592,0);
for(i=0;i<5;i++)
   a[i]=0;
}

 // This Function deals with Arrivals
 
void arrival()
{
String x;
int i,t,y=0,temp=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the flight no");
x=in.nextLine();
for(i=0;i<5;i++)
{
if((flight[i].no).equals(x))
{
temp=1;
y=i;
break;
}
}
if(temp==1)
 t=check(x,y);
else System.out.println("this flight is not permitted to land here!!!!!!!!");
}
 
 // Checks wether the runway is free at that instance of time or not 
 
int  check(String x,int y)
{
int i;
for(i=0;i<5;i++)
if(a[i]==0)
{
flight[y].runway=i;
a[i]=1;
flight[y].temp1=1;
System.out.println("land in runway number "+(i+1));
return 0;
}
System.out.println("run way is not free !!!..please wait for some time");
return 0;
}

 // This Function deals with Departures
 
void departure()
{
 String x;
 int y=0,i;
 Scanner in=new Scanner(System.in);
 System.out.println("enter the flight no");
 x=in.nextLine();
 for(i=0;i<5;i++)
 {
   if((flight[i].no).equals(x))
   {
   y=i;
   break;
  }
  }
a[flight[y].runway]=0;
flight[y].temp1=0;
System.out.println("have a nice journey!!!!");
}
 
 // This function check wether collisioin occurs or not
 
int collision()
{
int i;
String x;
int y=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the flight no");
x=in.nextLine();
for(i=0;i<5;i++)
{
 if((flight[i].no).equals(x))
 {
  y=i;
  break;
 }
}
for(i=0;i<5;i++)
{
 if(y!=i&& flight[y].temp1==1 && (flight[y].altitude-flight[i].altitude==-3 ||  flight[y].altitude-flight[i].altitude==3))
 {
    System.out.println ("chance for a collision with "+flight[i].no);
    return 0;
 }
}
System.out.println("No chances for a collision ..have a nice Journey!!!!!!!!!");
return 0;
}

public static void main(String[] args)
{
  int n,k,j;
  Scanner in=new Scanner(System.in);
  Demo d=new Demo();
  d.assign();
  while (true)
  {
     System.out.println("1:arrival\n2:departure\n3:collision checking\nenter your option");
     n=in.nextInt();
     if(n==1)
       d.arrival();
     else if(n==2)
       d.departure();
     else if(n==3)
       k=d.collision();
     System.out.println("enter 1 to continue.......enter 0 to exit");
     j=in.nextInt();
     if(j==0)
     break;

  }
  }
}

// Flight Class

public class Flight{
 String from,to,no;
 int runway,altitude;
 int temp1=0;
 // Constructor for Flight class
 Flight(String a1,String b1,String c1,int d1,int e1,int f1)
 {
   from=a1;
   to=b1;
   no=c1;
   runway=d1;
   altitude=e1;
   temp1=f1;
 }

}

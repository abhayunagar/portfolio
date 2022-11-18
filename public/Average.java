import java.util.*; class Average
{
public static void main(String arg[])
{
String data = "";
System.out.println("Enter name or enrollment no: "); Scanner sc=new Scanner(System.in);
data = sc.next();
int n=5,avg=0,avg1=0; int a[]=new int[n]; a[0]=10;
a[1]=20;

a[2]=30;

a[3]=40;

a[4]=50;

int b[]=new int[n]; b[0]=70;
b[1]=20;

b[2]=60;

b[3]=20;

b[4]=30;

for(int i=0;i<n;i++){ avg=avg+a[i];
}
for(int i=0;i<n;i++){ avg1 = avg1+b[i]; }
 

if(data.equals("Aaa") || data.equals("190470107001")){ System.out.println(data + " average marks:" + avg);
}
if(data.equals("Bbb") || data.equals("190470107002")){ System.out.println(data + " average marks:" + avg1);
}


}
}

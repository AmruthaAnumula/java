import java.util.*;
import java.io.*;

class Day
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
for(int i=1;i<=x;i++)
{
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
for(int j=1;j<=n;j++)
{
a+=Math.pow(2,j-1)*b;
System.out.println(a);
}
}
}
}

OUTPUT-
2
0 2 10
2
6
14
30
62
126
254
510
1022
2046
5 3 5
8
14
26
50
98
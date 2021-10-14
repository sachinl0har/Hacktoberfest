#include<iostream>
#include <graphics.h>
#include<stdlib.h>
#include<math.h>
using namespace std;
int pi[10];
double b[3][3]={1,0,0,
0,1,0,
0,0,1,
};
int c[1][1];
float a[1][1];void matmul(float[]);
int main()
{
int op,i,x,y,tx,ty,sx,sy,angle=10,xmax,ymax,xmid,ymid;
int gd,gm=VGAMAX;
gd=DETECT;
float p1[10]={50,50,
100,50,
100,100,
50,100,
50,50,
};
cout<<"\n select transformation:=";
cout<<"\n 1.translation:=";
cout<<"\n 2.rotation:=";
cout<<"\n 3.scaling:=";
cout<<"\n 4.rotation about arbitrary point:=";
cout<<"\n 5.enter the option:=";
cin>>op;
switch(op)
{
case 1:
cout<<"\n enter the x translation:=";
cin>>tx;
cout<<"\n enter the y translation:=";
cin>>ty;b[0][0]=1;
b[0][1]=0;
b[0][2]=0;
b[1][0]=0;
b[1][1]=1;
b[1][2]=0;
b[2][0]=tx;
b[2][1]=ty;
b[2][2]=1;
break;
case 2:
cout<<”\n enter the rotation angle :”;
cin>>angle;
b[0][0]=cos(angle*3.142/180);
b[0][1]=sin(angle*3.142/180);
b[0][2]=0;
b[1][0]=-sin(angle*3.142/180);
b[1][1]=cos(angle*3.142/180);
b[1][2]=0;
b[2][0]=0;
b[2][1]=0;
b[2][2]=1;
break;
case 3:
cout<<”\n enter the x scaling:”;
cin>>sx;cout<<”\n enter y scaling:”;
cin>>sy;
b[0][0]=sx;
b[0][1]=0;
b[0][2]=0;
b[1][0]=0;
b[1][1]=sy;
b[1][2]=0;
b[2][0]=0;
b[2][1]=0;
b[2][2]=1;
break;
case 4:
cout<<”\n enter x coordinate of arbitatary point :”;
cin>>x;
cout<<”\n enter x coordinate of arbitatary point:”;
cin>>y;
cout<<”\n enter the rotation angle:=”;
cin>>angle;
tx=x;
ty=y;
b[0][0]=cos(angle*3.142/180);
b[0][1]=sin(angle*3.142/180);
b[0][2]=0;
b[1][0]=-sin(angle*3.142/180);
b[1][1]=cos(angle*3.142/180);b[1][2]=0;
b[2][0]=-tx*cos(angle*3.142/180)+ty*sin(angle*3.142/180)+tx;
b[2][1]=-tx*sin(angle*3.142/180)-ty*cos(angle*3.142/180)+ty;
b[2][2]=1;
}
Initgraph(&gd,&gm,NULL); //initialize graphics
Xmax=getmaxx(); //get the maximum y coordinate
Ymax=getmaxy(); //get the maximum x co-ordinate
Xmid=xmax/2; //get the center x coordinate
Ymid=ymax/2; //get the center y coordinate
Setcolor(1);
Line(xmid,0,xmid,ymax); //draw y coordinate
Line(0,ymid,xmax,ymid); //draw x coordinate
Setcolor(4);
For(i=0;i<8;i=i+2)
{
Line(p1[i]+xmid,ymid-p1[i+1],xmid+p1[i+2],ymid-p1[i+3]);
}
Matmul(p1);
Setcolor(15);
For(i=0;i<8;i=i+2)
{
Line(xmid+pi[i],ymid-pi[i+1],xmid+pi[i+2],ymid-pi[i+3]);
}
Getch();
Closegraph();Return 0;
}
Void matmul(float p[10])
{
Int I;
For(i=0;i<9;i=i+2)
{
A[0][0]=p[i];
A[0][1]=p[i+1];
C[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]+b[2][0];
C[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1]+b[2][1];
Pi[i]=c[0][0];
Pi[i+1]=c[0][1];
}
}
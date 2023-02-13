public class Usermaincode
{
public string moveRobot(int input1,int input2,string input3,string input4)
{
String pos[]=input3.split("-");
   String mov[]=input4.split(" ");
   int i,flag=0;
   String str="";
   for(i=0;i<mov.length;i++)
   {
    if(mov[i].equals("R"))
    {
    if(pos[2].equals("N"))
     pos[2]="E";
    else if(pos[2].equals("E"))
     pos[2]="S";
    else if(pos[2].equals("S"))
     pos[2]="W";
    else if(pos[2].equals("W"))
     pos[2]="N";
    }
    else if(mov[i].equals("L"))
    {
     if(pos[2].equals("N"))
     pos[2]="W";
    else if(pos[2].equals("E"))
     pos[2]="N";
    else if(pos[2].equals("S"))
     pos[2]="E";
    else if(pos[2].equals("W"))
     pos[2]="S";
    }
    else if(mov[i].equals("M"))
    {
     if(pos[2].equals("N"))
     {
      int k=Integer.parseInt(pos[1]);
      if(k<input2)
      {
       k++;
       pos[1]=Integer.toString(k);
      }
      else
      {
       flag=1;
       break;
      }
     }
     else if(pos[2].equals("E"))
     {
      int k=Integer.parseInt(pos[0]);
      if(k<input1)
      {
       k++;
       pos[0]=Integer.toString(k);
      }
      else
      {
       flag=1;
       break;
      }
     }
     else if(pos[2].equals("S"))
     {
      int k=Integer.parseInt(pos[1]);
      if(k>0)
      {
       k--;
       pos[1]=Integer.toString(k);
      }
      else
      {
       flag=1;
       break;
      }
     }
     else if(pos[2].equals("W"))
     {
      int k=Integer.parseInt(pos[0]);
      if(k>0)
      {
       k--;
       pos[0]=Integer.toString(k);
      }
      else
      {
       flag=1;
       break;
      }
     }
    }
   }
   str=str+pos[0];
   for(i=1;i<3;i++)
   {
    str=str+"-"+pos[i];
   }
   if(flag==1)
   {
    str=str+"-ER";
   }
   return str;
}
}

import java.util.*;
import java.text.*;


public class Datedemo5
{
public static void main(String args[])
{
Date dNow=new Date();

SimpleDateFormat ft= new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
System.out.println("Current date:"+ ft.format(dNow));
}
}
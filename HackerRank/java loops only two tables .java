import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;
 
public class MultiplicationTable 
{

    public static void main(String[] args) 
    {

        int num = 2;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d x %d = %d \n", num, i, num * i);
        }
    }
}

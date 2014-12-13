import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;


public class dm {
	
	public static void main(String args[])
	{
		// CONSTRUCT THE 2D ARRAY 
		float data[][] = new float[2000][27000];
		// READ ENTERIES AND POPULATE IT 
		
	
		// WRITE IT TO A FILE IN CSV FORMAT
		try
		{
			FileInputStream fis = new FileInputStream("label1.txt");
		    FileOutputStream fop= new FileOutputStream("opt1.txt");
			DataOutputStream dop=new DataOutputStream(fop);
			BufferedWriter bop=new BufferedWriter(new OutputStreamWriter(dop));
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			PrintStream ps = new PrintStream(fop);
			String str="";
			//String strarr[]=new String[500];
			String strarr2[]=new String[2];
			String str3 = "       ";
			int row = 0;
			int row1 = 1;
			int column = 0;
			float value = 0.0f;
			while((str=br.readLine())!=null)
			{	
				
				String[] strarr = str.split("\\s+");
			
				//System.out.println(strarr[3]);
				strarr2=strarr[3].split(":");
				
				//System.out.println(strarr2[1]);
			
			     //bop.write(strarr2[1]);
			
				ps.println(strarr2[1]);
			//row= Integer.parseInt(strarr[0]);
		/*	if(row==row1){
			System.out.println();	
			System.out.print(row);
			row1++;
			}*/
		//	column= Integer.parseInt(strarr[1]);
			//value = Float.parseFloat(strarr[2]);
			//System.out.println(" ");
		//	System.out.print(value + " ");
			//data[row][column] = value;
			//System.out.print(data + " ");
			
			
			/*for(column=1; column<26366; column++)
			{
				System.out.print(data[row][column] + "|");
			}*/
			//System.out.println();
			//System.out.print(row);
			//System.out.print(" ");
			//System.out.print(value);
			}
			dis.close();
		}
		catch(java.lang.Exception e)
		{
			e.printStackTrace();
		}
		
		/*for(int i=1;i<1843;i++)
		{
		
			for(int j=1;j<26366;j++)
			{
				System.out.print(data[i][j]+"|");
			}
			System.out.println();
		}*/
		}
	}
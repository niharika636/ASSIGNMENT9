import java.io.*;
import java.util.InputMismatchException;
class CreateFile {

	public static void main(String[] args) throws IOException {
		
   File file=new File("F:\\Niharika\\files\\Acadview\\abc.txt");
   FileReader in = null;
   FileWriter f1=new FileWriter("F:\\Niharika\\files\\Acadview\\xyz.txt");
   System.out.print("CONTENTS OF FILE:");
   try {
	   in=new FileReader(file);
	   int ch;
	   String a="";
	   while((ch=in.read())!=-1) {
		   System.out.print((char)ch);
	   a=a+(char)ch;
	   }
	   char b[]=a.toCharArray();
	   for(int i=0;i<b.length;i++){
		   f1.write(b[i]);
	   }
	   f1.close();}
   catch(InputMismatchException e) {
	   System.out.println("TRY ");
   }
finally{
	   if(in!=null)
	   in.close();
   }
	}

}
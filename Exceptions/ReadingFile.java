import java.io.*;

class ReadingFile
{
    public static void main(String args[]) throws FileNotFoundException,IOException
    {
        FileReader fr=new FileReader("ethan.txt");
        fr.read();
    }
}

/*

ReadingFile.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader fr=new FileReader("ethan.txt");
                      ^
ReadingFile.java:8: error: unreported exception IOException; must be caught or declared to be thrown
        fr.read();
               ^
2 errors

try
catch
finally
throw
throws
*/
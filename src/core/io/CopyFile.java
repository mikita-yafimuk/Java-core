package core.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public class CopyFile
{
	public static void main(String[] args) throws IOException
	{
		InputStream inFile = new FileInputStream("f:/got.mkv");
		InputStream in = new BufferedInputStream(inFile);
		OutputStream outFile = new FileOutputStream("f:/got2.mkv");
		OutputStream out = new BufferedOutputStream(outFile);
		int data;

		long startTime0 = System.nanoTime();

		while ((data = in.read()) != -1)
		{
			out.write(data);
		}

		long endTime0 = System.nanoTime() - startTime0;
		System.out.println("Stream:  " + endTime0);

		in.close();
		out.close();

		FileInputStream fis = new FileInputStream("f:/got.mkv");
		FileOutputStream fos = new FileOutputStream("f:/got3.mkv");
		FileChannel fcin = fis.getChannel();
		FileChannel fcout = fos.getChannel();

		long startTime = System.nanoTime();

		fcin.transferTo(0, fcin.size(), fcout);

		long endTime = System.nanoTime() - startTime;
		System.out.println("Channel: " + endTime);

		fcin.close();
		fcout.close();

	}
}

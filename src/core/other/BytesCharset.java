package core.other;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class BytesCharset
{
	public static void main(String[] args)
	{
		ByteBuffer bytesUTF8;
		ByteBuffer bytesCP1251;
		ByteBuffer bytesCP866;

		int total = 0;
		boolean firstConditional;
		boolean secondConditional;

		if (args.length == 1)
		{

			char[] charArgs = args[0].toCharArray();

			/*
			 * It should be optimized in next iteration
			 */
			for (int i = 0; i < charArgs.length; i++)
			{

				bytesUTF8 = Charset.forName("UTF-8").encode(String.valueOf(charArgs[i]));
				bytesCP1251 = Charset.forName("CP1251").encode(String.valueOf(charArgs[i]));
				bytesCP866 = Charset.forName("CP866").encode(String.valueOf(charArgs[i]));

				byte[] UTF8 = bytesUTF8.array();
				byte[] CP1251 = bytesCP1251.array();
				byte[] CP866 = bytesCP866.array();

				firstConditional = (UTF8[0] & 0xFF) == (CP1251[0] & 0xFF);
				secondConditional = (CP1251[0] & 0xFF) == (CP866[0] & 0xFF);

				if (firstConditional & secondConditional)
				{
					System.out.println("Symbol: " + charArgs[i] + " UTF-8: " + (UTF8[0] & 0xFF) + " CP866: "
							+ (CP866[0] & 0xFF) + " CP1251: " + (CP1251[0] & 0xFF));
					total++;
				}

			}

			System.out.println("Total count of characters with same byte codes: " + total);

		}
		else if (args.length > 1)
		{
			System.out.println("Too many params");
			showHelp();
		}

		else
		{
			showHelp();
		}
	}

	private static void showHelp()
	{
		System.out.println("Use next command: \n" +
				"java BytesCharset <any string without space> \n" +
				"If your string has spaces you should use quotes");
	}
}


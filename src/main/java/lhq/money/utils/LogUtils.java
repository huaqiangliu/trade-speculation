package lhq.money.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtils {

	private static int LOG_LEVEL = 0; // 0:debug, 1:info, 2:error
	private static BufferedWriter writer;
	
	static {
		File file = new File("d:/libra_test.txt");
		if (file.exists()) {
			try {
				writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public static void debug(String msg) {
		if (LOG_LEVEL < 1) {
			String output = now() + "DEBUG-----------------------------------------------------------------------| " + msg;
			System.out.println(output);
			if(writer != null) {
				try {
					writer.write(output);
					writer.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void info(String msg) {
		if (LOG_LEVEL < 2) {
			String output = now() + "INFO| " + msg;
			System.out.println(output);
			if(writer != null) {
				try {
					writer.write(output);
					writer.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void error(String msg) {
		if (LOG_LEVEL < 3) {
			String output = now() + "ERRO------| " + msg;
			System.out.println(output);
			if(writer != null) {
				try {
					writer.write(output);
					writer.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void error(Exception ex) {
		System.out.print(now() + "ERRO------| ");
		ex.printStackTrace();
	}

	private static String now() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "|";
	}

}

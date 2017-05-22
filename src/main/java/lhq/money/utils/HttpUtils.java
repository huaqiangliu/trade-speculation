package lhq.money.utils;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUtils {

	public static HttpResponse get(String urlStr) {
		HttpURLConnection httpConn = null;
		try {
			URL url = new URL(urlStr);
			httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setReadTimeout(10000);
			httpConn.setUseCaches(false);
			httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

			int resCode = httpConn.getResponseCode();
			InputStream is = resCode >= 400 ? httpConn.getErrorStream() : httpConn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF8"));
			StringBuilder sb = new StringBuilder();
			String curLine;
			while ((curLine = reader.readLine()) != null) {
				sb.append(curLine);
			}
			return new HttpResponse(resCode, sb.toString());
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(httpConn != null) {
				httpConn.disconnect();
			}
		}
		return new HttpResponse(-1, null);
	}

	public static HttpResponse post(String urlStr, Map<String, String> headers, String formStr) {
		return post(urlStr, headers, formStr, 10000);
	}

	public static HttpResponse post(String urlStr, Map<String, String> headers, String formStr, int timeout) {
		HttpURLConnection httpConn = null;
		try {
			URL url = new URL(urlStr);
			httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setReadTimeout(timeout);
			httpConn.setDoInput(true);// 允许输入
			httpConn.setDoOutput(true);// 允许输出
			httpConn.setUseCaches(false);
			httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
			httpConn.setRequestMethod("POST");
			httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpConn.setRequestProperty("Connection", "Keep-Alive");
			httpConn.setRequestProperty("Charset", "UTF-8");
			if(headers != null) {
				for (Map.Entry<String, String> entry : headers.entrySet()) {
					httpConn.setRequestProperty(entry.getKey(), entry.getValue());
				}
			}

			DataOutputStream dos=new DataOutputStream(httpConn.getOutputStream());
			dos.writeBytes(formStr);
			dos.flush();
			dos.close();

			int resCode = httpConn.getResponseCode();
			InputStream is = resCode >= 400 ? httpConn.getErrorStream() : httpConn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF8"));
			StringBuilder sb = new StringBuilder();
			String curLine;
			while ((curLine = reader.readLine()) != null) {
				sb.append(curLine);
			}
			return new HttpResponse(resCode, sb.toString());
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(httpConn != null) {
				httpConn.disconnect();
			}
		}
		return new HttpResponse(-1, null);
	}
	
}

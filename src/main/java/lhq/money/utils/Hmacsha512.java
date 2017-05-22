package lhq.money.utils;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * HMACSHA1哈希签名
 */
public class Hmacsha512 {

	private static final String MAC_NAME = "HmacSHA512";
	private static final String ENCODING = "UTF-8";

	/**
	 * 使用 HMAC-SHA1 签名方法对对encryptText进行签名
	 * 
	 * @param encryptText
	 *            被签名的字符串
	 * @param encryptKey
	 *            密钥
	 * @return
	 * @throws Exception
	 */
	public static String hmacSHA1Encrypt(String encryptText, String encryptKey) {
		try {
			byte[] data = encryptKey.getBytes(ENCODING);
			SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);
			Mac mac = Mac.getInstance(MAC_NAME);
			mac.init(secretKey);
			byte[] macData = mac.doFinal(encryptText.getBytes(ENCODING));
			byte[] hex = new Hex().encode(macData);
			return new String(hex, ENCODING);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static final void main(String[] args) throws Exception {
		String sign = Hmacsha512.hmacSHA1Encrypt("a=b",
				"a4cfb3f1609f56054b05b98b8686a78a12e45d92962f627aba0a97f92e53098e");
		System.out.println(sign);
	}
}
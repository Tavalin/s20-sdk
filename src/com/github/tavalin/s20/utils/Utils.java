package com.github.tavalin.s20.utils;

import javax.xml.bind.DatatypeConverter;

public class Utils {

	/**
	 * Converts a hex string to a byte array. Found at
	 * http://stackoverflow.com/questions/140131/convert-a-string-representation
	 * -of-a-hex-dump-to-a-byte-array-using-java
	 * 
	 * @param s
	 *            hex string to convert
	 * @return byte array of converted string
	 */
	public static byte[] hexStringToByteArray(String s) {
		s = s.toUpperCase();
		return DatatypeConverter.parseHexBinary(s);
	}
	
	/*
	public static byte[] calculateMessageLenth(String magickey, String lengthPadding, String cmd) {
		byte[] b = hexStringToByteArray(magickey + lengthPadding + cmd);
		int len = b.length;
		return hexStringToByteArray(String.format("%04X", len));
	}
	*/
	
	public static String toHexString(byte[] array) {
		return DatatypeConverter.printHexBinary(array).toUpperCase();
	}
	
}

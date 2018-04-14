package com.javisdce.thejavisdcecc.to_dec_algorythm;

public class HexToDec {
	
	private static int dec;
	
	private static int[] pot = {1, 16, 256, 4096, 65536, 1048576, 16777216, 268435456};
	private static char[] args = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

	public static String convert(String _hex) {
		dec = 0;
		
		char[] hexArr = _hex.toCharArray();
		
		for(int i = 0; i < hexArr.length; i++) {
			for(int i2 = 0; i2 < args.length; i2++) {
				if (hexArr[i] == args[i2]) {
					dec = dec + pot[hexArr.length-i-1]*i2;
					break;
				}
			}
		}
		String _dec = "" + dec;
		return  _dec;
		
	}
}

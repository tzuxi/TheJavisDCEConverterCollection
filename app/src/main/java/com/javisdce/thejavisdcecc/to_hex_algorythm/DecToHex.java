package com.javisdce.thejavisdcecc.to_hex_algorythm;

public class DecToHex {
	
	private static String hex;
	
	private static int[] pot = {1, 16, 256, 4096, 65536, 1048576, 16777216, 268435456};
	private static char[] args = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	public static String convert(int _dec) {
		hex = "";
		
		for (int i = 7; i>=0; i--) {
			
			if(_dec/pot[i] >= 1) {
				
				int tmp = _dec/pot[i];
				_dec = _dec - pot[i]*tmp;
				hex = hex + args[tmp];
				
			}else if(hex.equals("")) {
				
			}else {
				hex = hex + 0;
			}
		}
		return hex;
	}
}
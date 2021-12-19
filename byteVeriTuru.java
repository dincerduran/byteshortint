package veriturleri;

/*1 byte 8bit içerir.
 */
public class byteVeriTuru {

	public static void main(String[] args) {
	
			byte byteSayi = 3;
			
			byte maximumByteDegeri = Byte.MAX_VALUE;
			byte minimumByteDegeri = Byte.MIN_VALUE;
			
			System.out.println("maximum byte degeri: " + maximumByteDegeri);
	        System.out.println("minimum byte degeri: " + minimumByteDegeri);
	        
	        //wrapper class kullaným
	        //byte maximumByteDegeri = Byte.MAX_VALUE;
	        //byte minimumByteDegeri = Byte.MÝN_VALUE;
	        
	        byte maximumByteDegeri = 127;
	        byte minimumByteDegeri = -128;
	         
	}
}

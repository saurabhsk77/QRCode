package com.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {
	public static void main(String[] args) throws Exception {
		
		String s="saurabh";
		
		ByteArrayOutputStream out=QRCode.from(s).to(ImageType.PNG).stream();
		
		File f=new File("C:\\Users\\Saurabh\\Desktop\\java\\QRCodeGenerator\\MyImage.jpg");
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();
	}
}

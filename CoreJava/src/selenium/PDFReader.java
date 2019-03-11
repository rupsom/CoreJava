package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDFReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		PDDocument pd;
		
		pd = PDDocument.load(new File("C:\\Users\\rrouth\\Desktop\\"
				+ "Kolkata Traffic Police __ Payment through ICICI Bank Payment Gateway.pdf"));
		System.out.println("Total Pages : " + pd.getNumberOfPages());
		
		PDFTextStripper pdf = new PDFTextStripper();
		System.out.println(pdf.getText(pd));
	}

}

package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class HelloWorldPdf {
	public static void main(String[] args) {
		try {
			// Crear un nuevo documento PDF
			PdfWriter writer = new PdfWriter("HelloWorld.pdf");
			PdfDocument pdf = new PdfDocument(writer);
			Document document = new Document(pdf);

			// Agregar un párrafo al documento
			document.add(new Paragraph("¡Hola Mundo en PDF con iText!"));

			// Cerrar el documento
			document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package PDFuploader;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class pdfupTest {
	private pdfup pdfupdlod;
	@BeforeEach
	void setUp() throws Exception {
		this.pdfupdlod = new pdfup();
	}

	@Test
	void test1() {
		assertEquals("The file does not exist.", this.pdfupdlod.pdfUploader("C:\\Users\\Abdullah Salama\\eclipse-workspace\\PDF Uploader - 120201841\\src\\PDFuploader\\test0.pdf"));
	}
	
	@Test
	void test2() {
		assertEquals("success", this.pdfupdlod.pdfUploader("C:\\Users\\Abdullah Salama\\eclipse-workspace\\PDF Uploader - 120201841\\src\\PDFuploader\\test.pdf"));
	}
	
	@Test
	void test3() {
		assertEquals("Failed, the file must be of type pdf", this.pdfupdlod.pdfUploader("C:\\Users\\Abdullah Salama\\eclipse-workspace\\PDF Uploader - 120201841\\src\\PDFuploader\\test.docx"));
	}
	
	@Test
	void test4() {
		assertEquals("Failed, the file must be less than or equal to 5 MB", this.pdfupdlod.pdfUploader("C:\\Users\\Abdullah Salama\\eclipse-workspace\\PDF Uploader - 120201841\\src\\PDFuploader\\large-pdf.pdf"));
	}
	

}

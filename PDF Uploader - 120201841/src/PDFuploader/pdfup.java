package PDFuploader;

import java.io.File;

public class pdfup {
	public static void main(String[] args) {
	    File uploadedFile = new File("C:\\Users\\Abdullah Salama\\eclipse-workspace\\PDF Uploader - 120201841\\src\\PDFuploader\\test.docx");
	}

	
	public String pdfUploader(String filePath){
	    File uploadedFile = new File(filePath);
	    String fileName = uploadedFile.getName();
	    String extension = "";
	    int i = fileName.lastIndexOf('.');
	    if (i > 0) {
	        extension = fileName.substring(i+1);
	    }
        long bytes = uploadedFile.length();
        long kilobytes = (bytes / 1024);
        long megabytes = (kilobytes / 1024);

	    if (uploadedFile.exists()) {
	    	if(extension.equals("pdf")){
	    		if(megabytes <= 5) {
	    			return "success";
	    		}else {
	    			return "Failed, the file must be less than or equal to 5 MB";
	    			
	    		}
	    	}else {
	    		return "Failed, the file must be of type pdf";
	    		
	    	}
	    } else {
	    	return "The file does not exist.";
	    }

	}

}

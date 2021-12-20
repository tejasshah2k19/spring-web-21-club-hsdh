package com.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

	
	public void uploadFile(String masterPath,MultipartFile file) {
		try {
			
			File masterFile = new File(masterPath);
			masterFile.mkdirs();//d://abc//tejas@gmail.com
			
			File myFile = new File(masterPath, file.getOriginalFilename());
			myFile.createNewFile();
			byte b[] = file.getBytes();
			FileUtils.writeByteArrayToFile(myFile, b);
			System.out.println("file uploading.....done....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

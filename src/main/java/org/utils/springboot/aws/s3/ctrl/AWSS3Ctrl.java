package org.utils.springboot.aws.s3.ctrl;

import org.utils.springboot.aws.s3.serv.AWSS3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/s3")
public class AWSS3Ctrl {

	@Autowired
	private AWSS3Service service;

	@PostMapping(value = "/upload")
	public ResponseEntity<String> uploadFile(@RequestPart(value = "file") final MultipartFile multipartFile) {
		String serviceresponse = service.uploadFile(multipartFile);
		final String response = "[" + multipartFile.getOriginalFilename() + "] " + serviceresponse;
		if (response.contains("] File upload is failed")) {
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
}
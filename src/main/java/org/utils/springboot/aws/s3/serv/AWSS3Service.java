package org.utils.springboot.aws.s3.serv;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

	String uploadFile(MultipartFile multipartFile);
}

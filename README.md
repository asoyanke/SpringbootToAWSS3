# SpringbootToAWSS3
Spring Boot - Upload file to AWS S3

## Operations
    ``
* Call this endpoint to upload a file

    ``
    curl -X "POST" -F 'file=@/home/test/hello.txt' http://localhost:9098/s3/upload

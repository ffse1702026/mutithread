package com.example.demo.main;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.iotsitewise.*;
public class Test {
	AWSIoTSiteWiseAsync a;

	@Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;

	@Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;

	@Value("${cloud.aws.region}")
    private String region;

    @Bean
    public BasicAWSCredentials basicAWSCredentials() {
        return new BasicAWSCredentials(accessKey, secretKey);
    }

	AWSIoTSiteWise tes (AWSCredentials awsCredentials) {
		
		AWSIoTSiteWise t = AWSIoTSiteWiseClientBuilder.standard()
				.withRegion(region).withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
		return null;
	}
}

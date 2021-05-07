package com.example.demo.main;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.iotsitewise.*;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyAggregatesRequest;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyValueRequest;

import java.lang.reflect.Method;

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
	
	GetAssetPropertyValueRequest request = null; 
	
	String trs() {
		AWSIoTSiteWise sitewisel = tes(basicAWSCredentials());
		sitewisel.getAssetPropertyValue(request);
		
		
		sitewisel.getAssetPropertyAggregates(getAssetPropertyAggregatesRequest);
		sitewisel.disassociateAssets(disassociateAssetsRequest);
		
		return null;
		
	}
	
	
	
	private GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest() {
		GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest = new GetAssetPropertyAggregatesRequest();
		
		getAssetPropertyAggregatesRequest.setAggregateTypes(aggregateTypes);
		getAssetPropertyAggregatesRequest.setAssetId(assetId);
		getAssetPropertyAggregatesRequest.setEndDate(endDate);
		getAssetPropertyAggregatesRequest.setMaxResults(maxResults);
		getAssetPropertyAggregatesRequest.setNextToken(nextToken);
		getAssetPropertyAggregatesRequest.set
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		getAssetPropertyAggregatesRequest
		
	
		return getAssetPropertyAggregatesRequest;
	}
	
	public void test(Method me) {
		me;
	}
}

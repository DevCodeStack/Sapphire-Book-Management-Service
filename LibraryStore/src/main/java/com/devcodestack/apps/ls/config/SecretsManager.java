package com.devcodestack.apps.ls.config;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
//import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
//import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

//@Service
/*
 * Another way to load secrets
 * User can call this service to load secrets whenever it is required
 * 
 */
//public class SecretsManager {
//
//    private final SecretsManagerClient secretsManagerClient;
//    
//    @Value("${aws.secretsmanager.secret-name}")
//    private String secretName;
//
//    public SecretsManager(@Value("${aws.region}") String region) {
//        this.secretsManagerClient = SecretsManagerClient.builder()
//                .region(Region.of(region))
//                .credentialsProvider(DefaultCredentialsProvider.create())
//                .build();
//    }
//
//    public String getSecret() {
//        GetSecretValueRequest request = GetSecretValueRequest.builder()
//                .secretId(secretName)
//                .build();
//        GetSecretValueResponse response = secretsManagerClient.getSecretValue(request);
//        return response.secretString();
//    }
//}


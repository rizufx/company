package com.qinsol.insbot.nbapp.scheduledTask;

import com.amazonaws.auth.*;
import com.amazonaws.services.dynamodbv2.xspec.S;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fahmida on 4/12/2018.
 */
@Service
public class S3QueueReaderImpl implements  FileQueueReader{

    @Value("${insbot.s3.queueUrl}")
    private String queueUrl;
    @Value("${insbot.s3.region}")
    private String region;

    @Scheduled(cron = "${insbot.s3.cornSchedule}")
    public void readMessageFromQueue(){


        AWSCredentials credentials = new BasicAWSCredentials("AKIAJVBPOSNWY36JO3BQ", "XiPgeFYkg7eQaDDhzqQ7OIhIMt8OOKSBKzLviBle");
        AWSCredentialsProvider credProvider = new AWSStaticCredentialsProvider(credentials);

        final AmazonSQS sqs = AmazonSQSClient.builder().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(credProvider.getCredentials()))
                .build();

        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

        messages.stream().forEach(message -> {

            System.out.println(message.getBody().toString());
        });

    }
}

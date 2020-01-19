package com.wjt.polly.core;

import com.wjt.polly.entity.Submission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionEventPublisher
 * @description: 事件发布器
 * @date: 2020/1/19 11:02
 */
@Component
@Slf4j
public class SubmissionEventPublisher implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public <T>T createSubmissionEvent(Class<T> clazz, Submission submission){

        try {

            Class clz=Class.forName(clazz.getName()).asSubclass(Class.forName("com.wjt.polly.event.SubmissionEvent"));
            //构造
            Constructor ct=clz.getDeclaredConstructor(new Class[]{Submission.class});
            //ct.setAccessible(true);私有化情况下
            T obj = (T) ct.newInstance(submission);
            publisher.publishEvent(obj);
            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

package com.wjt.polly.controller;

import com.wjt.polly.core.SubmissionEventPublisher;
import com.wjt.polly.entity.Submission;
import com.wjt.polly.event.SubmissionEstablishmentEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionController
 * @description: 通用任务接口
 * @date: 2019/12/31 11:13
 */
@RestController
@Slf4j
public class SubmissionController {

    @Autowired
    private SubmissionEventPublisher submissionEventPublisher;

    @RequestMapping(value = "/submissions", method = RequestMethod.POST)
    public Submission establish(@Valid @RequestBody Submission submission){


        //产生创建事件
        submission.setState(1);
        submissionEventPublisher.createSubmissionEvent(SubmissionEstablishmentEvent.class,submission);

        log.info(""+submission);

        return submission;
    }


}

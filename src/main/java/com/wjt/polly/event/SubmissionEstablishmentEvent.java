package com.wjt.polly.event;


import com.wjt.polly.entity.Submission;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionEstablishmentEvent
 * @description: 任务创建事件
 * @date: 2020/1/10 11:43
 */

public class SubmissionEstablishmentEvent extends SubmissionEvent {

    private static final long serialVersionUID = -1L;

    public SubmissionEstablishmentEvent(Submission source) {
        super(source);
    }
}

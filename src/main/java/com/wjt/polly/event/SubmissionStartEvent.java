package com.wjt.polly.event;

import com.wjt.polly.entity.Submission;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionStartEvent
 * @description: 任务启动事件
 * @date: 2020/1/19 11:35
 */

public class SubmissionStartEvent extends SubmissionEvent {

    private static final long serialVersionUID = -1L;

    public SubmissionStartEvent(Submission source) {
        super(source);
    }
}

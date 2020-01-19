package com.wjt.polly.event;

import com.wjt.polly.entity.Submission;
import org.springframework.context.ApplicationEvent;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionEvent
 * @description: 任务事件基类
 * @date: 2020/1/19 11:37
 */

public class SubmissionEvent extends ApplicationEvent {

    private static final long serialVersionUID = -1L;

    private Submission submission;

    public SubmissionEvent(Submission source) {
        super(source);
        this.submission = source;
    }

    @Override
    public String toString() {
        return "[SubmissionEvent]:"+submission;
    }
}

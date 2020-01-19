package com.wjt.polly.event;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionState
 * @description: 任务状态
 * @date: 2020/1/10 11:28
 */

public enum SubmissionState {


    SUBMISSION_STATE_NEW(0),
    SUBMISSION_STATE_RUNNING(1),
    SUBMISSION_STATE_DEAD(9)
    ;


    private int code;
    SubmissionState(int code){
        this.code = code;
    }

}

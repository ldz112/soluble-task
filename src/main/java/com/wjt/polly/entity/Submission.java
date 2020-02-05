package com.wjt.polly.entity;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: Submission
 * @description: 任务对象
 * @date: 2019/12/31 11:19
 */
@Data
public class Submission {

    private int submissionId;
    private String submissionName;
    private Date startTime;
    private Date endTime;
    private String realmId;//操作对象，uuid
    @NotNull
    @Max(10)
    @Min(1)
    private int state;//任务状态

}

package com.wjt.polly.core;

import com.wjt.polly.event.SubmissionEstablishmentEvent;
import com.wjt.polly.event.SubmissionStartEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author liqin@nd.com.cn
 * @version V1.0
 * @title: SubmissionEventNotifier
 * @description: 事件处理器
 * @date: 2020/1/19 11:07
 */

@Component
@Slf4j
@EnableAsync
public class SubmissionEventNotifier {

    @Async
    //@EventListener(condition = "#event.userId == '101'")
    @EventListener
    public void onEstablishmentEvent(SubmissionEstablishmentEvent event) throws InterruptedException {
        Thread.sleep(5000L);
        log.info("收到Establishment消息:"+event);
    }

    @Async
    @EventListener
    public void onStartEvent(SubmissionStartEvent event) {
        log.info("收到start消息:"+event);
    }

}

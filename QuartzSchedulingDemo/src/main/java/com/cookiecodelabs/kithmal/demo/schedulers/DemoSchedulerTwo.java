package com.cookiecodelabs.kithmal.demo.schedulers;

import com.cookiecodelabs.kithmal.demo.helper.SchedulerHelper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Second Scheduler
 * Created by User on 5/6/2016.
 */
public class DemoSchedulerTwo extends QuartzJobBean {

    private SchedulerHelper helper;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        helper.displayMessageTwo();
    }

    public void setHelper(SchedulerHelper helper) {
        this.helper = helper;
    }
}

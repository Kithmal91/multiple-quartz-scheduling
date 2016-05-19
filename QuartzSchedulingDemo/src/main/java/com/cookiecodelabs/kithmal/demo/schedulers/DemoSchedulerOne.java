package com.cookiecodelabs.kithmal.demo.schedulers;

import com.cookiecodelabs.kithmal.demo.helper.SchedulerHelper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * First Scheduler
 * Created by Kithmal on 5/6/2016.
 */
public class DemoSchedulerOne extends QuartzJobBean {

    private SchedulerHelper helper;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        helper.displayMessageOne();
    }

    public void setHelper(SchedulerHelper helper) {
        this.helper = helper;
    }
}

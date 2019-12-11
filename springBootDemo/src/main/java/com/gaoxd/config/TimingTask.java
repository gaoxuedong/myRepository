package com.gaoxd.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
public class TimingTask implements SchedulingConfigurer {
	private static Logger log = LoggerFactory.getLogger(TimingTask.class);

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(setExecutor());
		taskRegistrar.addCronTask(new Runnable() {

			@Override
			public void run() {
				log.info("任务1执行了");

			}
		}, "30 * * * * ?");
		taskRegistrar.addCronTask(new Runnable() {

			@Override
			public void run() {
				log.info("任务2执行了");

			}
		}, "10 * * * * ?");

	}

	@Bean(destroyMethod = "shutdown")
	public Executor setExecutor() {
		return Executors.newScheduledThreadPool(5); // 5 个线程来处理。
	}

}

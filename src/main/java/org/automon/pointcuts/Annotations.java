package org.automon.pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Pointcuts for monitoring defined in various other monitoring libraries.
 */
@Aspect
public abstract class Annotations {

    @Pointcut("within(@org.automon.annotations.Monitor *) || @annotation(org.automon.annotations.Monitor)")
    public void automon() {
    }

    @Pointcut("within(@com.jamonapi.aop.spring.MonitorAnnotation *) || @annotation(com.jamonapi.aop.spring.MonitorAnnotation)")
    public void jamon() {
    }

    @Pointcut("within(@org.javasimon.aop.Monitored *) || @annotation(org.javasimon.aop.Monitored)")
    public void javasimon() {
    }

    @Pointcut("within(@com.codahale.metrics.annotation.Timed *) || @annotation(com.codahale.metrics.annotation.Timed)")
    public void metrics() {
    }


    @Pointcut("within(@org.perf4j.aop.Profiled *) || @annotation(org.perf4j.aop.Profiled)")
    public void perf4j() {
    }

    // com.newrelic.api.agent.Trace

}
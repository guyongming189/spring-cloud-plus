package org.gourd.hu.log.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.gourd.hu.log.entity.SysOperateLog;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author gourd
 * @date 2018-11-24
 */
public interface OperateLogService extends IService<SysOperateLog> {
    /**
     * 物理删除日志
     * @param ids
     */
    void deleteLogs(List<Long> ids);

    /**
     * 异步插入日志
     * @param joinPoint
     * @param startTime
     * @param sysOperateLog
     */
    void asyncSaveLog(HttpServletRequest request,ProceedingJoinPoint joinPoint, Long startTime, SysOperateLog sysOperateLog);
}

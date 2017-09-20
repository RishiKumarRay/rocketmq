/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.remoting.api.interceptor;

import org.apache.rocketmq.remoting.api.RemotingEndPoint;
import org.apache.rocketmq.remoting.api.command.RemotingCommand;

public class ExceptionContext extends RequestContext {
    private Throwable exception;
    private String remark;

    public ExceptionContext(RemotingEndPoint remotingEndPoint, String remoteAddr, RemotingCommand request,
        Throwable exception, String remark) {
        super(remotingEndPoint, remoteAddr, request);
        this.remotingEndPoint = remotingEndPoint;
        this.remoteAddr = remoteAddr;
        this.request = request;
        this.exception = exception;
        this.remark = remark;
    }

    public RemotingEndPoint getRemotingEndPoint() {
        return remotingEndPoint;
    }

    public void setRemotingEndPoint(RemotingEndPoint remotingEndPoint) {
        this.remotingEndPoint = remotingEndPoint;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public RemotingCommand getRequest() {
        return request;
    }

    public void setRequest(RemotingCommand request) {
        this.request = request;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
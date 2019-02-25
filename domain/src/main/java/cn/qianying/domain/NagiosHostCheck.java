package cn.qianying.domain;

import java.util.Date;

/**
 * nagios主机检查历史表实体类
 * @Author Nacht
 * Created on 29/11/2018
 */
public class NagiosHostCheck {
    private int hostCheckId;
    private int instanceId;
    private int hostObjectId;
    private int checkType;
    private int isRawCheck;
    private int currentCheckAttempt;
    private int maxCheckAttempts;
    private int state;
    private int stateType;
    private Date startTime;
    private int startTimeUsec;
    private Date endTime;
    private int endTimeUsec;
    private int commandObjectId;
    private String commandArgs;
    private String commandLine;
    private int timeout;
    private int earlyTimeout;
    private double executionTime;
    private double latency;
    private int returnCode;
    private String output;
    private String longOutput;
    private String perfdata;

    public int getHostCheckId() {
        return hostCheckId;
    }

    public void setHostCheckId(int hostCheckId) {
        this.hostCheckId = hostCheckId;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public int getHostObjectId() {
        return hostObjectId;
    }

    public void setHostObjectId(int hostObjectId) {
        this.hostObjectId = hostObjectId;
    }

    public int getCheckType() {
        return checkType;
    }

    public void setCheckType(int checkType) {
        this.checkType = checkType;
    }

    public int getIsRawCheck() {
        return isRawCheck;
    }

    public void setIsRawCheck(int isRawCheck) {
        this.isRawCheck = isRawCheck;
    }

    public int getCurrentCheckAttempt() {
        return currentCheckAttempt;
    }

    public void setCurrentCheckAttempt(int currentCheckAttempt) {
        this.currentCheckAttempt = currentCheckAttempt;
    }

    public int getMaxCheckAttempts() {
        return maxCheckAttempts;
    }

    public void setMaxCheckAttempts(int maxCheckAttempts) {
        this.maxCheckAttempts = maxCheckAttempts;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStateType() {
        return stateType;
    }

    public void setStateType(int stateType) {
        this.stateType = stateType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getStartTimeUsec() {
        return startTimeUsec;
    }

    public void setStartTimeUsec(int startTimeUsec) {
        this.startTimeUsec = startTimeUsec;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getEndTimeUsec() {
        return endTimeUsec;
    }

    public void setEndTimeUsec(int endTimeUsec) {
        this.endTimeUsec = endTimeUsec;
    }

    public int getCommandObjectId() {
        return commandObjectId;
    }

    public void setCommandObjectId(int commandObjectId) {
        this.commandObjectId = commandObjectId;
    }

    public String getCommandArgs() {
        return commandArgs;
    }

    public void setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getEarlyTimeout() {
        return earlyTimeout;
    }

    public void setEarlyTimeout(int earlyTimeout) {
        this.earlyTimeout = earlyTimeout;
    }

    public double getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(double executionTime) {
        this.executionTime = executionTime;
    }

    public double getLatency() {
        return latency;
    }

    public void setLatency(double latency) {
        this.latency = latency;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getLongOutput() {
        return longOutput;
    }

    public void setLongOutput(String longOutput) {
        this.longOutput = longOutput;
    }

    public String getPerfdata() {
        return perfdata;
    }

    public void setPerfdata(String perfdata) {
        this.perfdata = perfdata;
    }

    @Override
    public String toString() {
        return "NagiosHostCheck{" +
                "hostCheckId=" + hostCheckId +
                ", instanceId=" + instanceId +
                ", hostObjectId=" + hostObjectId +
                ", checkType=" + checkType +
                ", isRawCheck=" + isRawCheck +
                ", currentCheckAttempt=" + currentCheckAttempt +
                ", maxCheckAttempts=" + maxCheckAttempts +
                ", state=" + state +
                ", stateType=" + stateType +
                ", startTime=" + startTime +
                ", startTimeUsec=" + startTimeUsec +
                ", endTime=" + endTime +
                ", endTimeUsec=" + endTimeUsec +
                ", commandObjectId=" + commandObjectId +
                ", commandArgs='" + commandArgs + '\'' +
                ", commandLine='" + commandLine + '\'' +
                ", timeout=" + timeout +
                ", earlyTimeout=" + earlyTimeout +
                ", executionTime=" + executionTime +
                ", latency=" + latency +
                ", returnCode=" + returnCode +
                ", output='" + output + '\'' +
                ", longOutput='" + longOutput + '\'' +
                ", perfdata='" + perfdata + '\'' +
                '}';
    }
}

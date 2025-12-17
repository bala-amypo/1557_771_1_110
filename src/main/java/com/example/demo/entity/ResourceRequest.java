package com.example.demo.model;

import java.time.LocalDate;

public class AllocationRequest {
    private long id;
    private String resourceType;
    private User requestedBy;
    private LocalDate startTime;
    private LocalDate endTime;
    private String purpose;
    private String status;
    public AllocationRequest(){

    }
    public AllocationRequest(String resourceType, User requestedBy, LocalDate startTime, LocalDate endTime,
            String purpose, String status) {
        this.resourceType = resourceType;
        this.requestedBy = requestedBy;
        this.startTime = startTime;
        this.endTime = endTime;
        this.purpose = purpose;
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    public User getRequestedBy() {
        return requestedBy;
    }
    public void setRequestedBy(User requestedBy) {
        this.requestedBy = requestedBy;
    }
    public LocalDate getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    public LocalDate getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}

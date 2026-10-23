
package com.buildwise.buildwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DailySiteReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reportDate;
    private int workers;
    private String workCompleted;
    private String materialsReceived;
    private String siteIssues;

    public DailySiteReport() {
    }

    public Long getId() {
        return id;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(String workCompleted) {
        this.workCompleted = workCompleted;
    }

    public String getMaterialsReceived() {
        return materialsReceived;
    }

    public void setMaterialsReceived(String materialsReceived) {
        this.materialsReceived = materialsReceived;
    }

    public String getSiteIssues() {
        return siteIssues;
    }

    public void setSiteIssues(String siteIssues) {
        this.siteIssues = siteIssues;
    }
}

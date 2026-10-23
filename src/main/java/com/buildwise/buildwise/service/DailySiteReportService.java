
package com.buildwise.buildwise.service;

import com.buildwise.buildwise.entity.DailySiteReport;
import com.buildwise.buildwise.repository.DailySiteReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailySiteReportService {

    private final DailySiteReportRepository repository;

    public DailySiteReportService(DailySiteReportRepository repository) {
        this.repository = repository;
    }

    public DailySiteReport saveReport(DailySiteReport report) {
        return repository.save(report);
    }

    public List<DailySiteReport> getAllReports() {
        return repository.findAll();
    }

    public void deleteReport(Long id) {
        repository.deleteById(id);
    }
}

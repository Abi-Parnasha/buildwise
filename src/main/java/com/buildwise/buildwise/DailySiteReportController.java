
package com.buildwise.buildwise;

import com.buildwise.buildwise.entity.DailySiteReport;
import com.buildwise.buildwise.service.DailySiteReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class DailySiteReportController {

    private final DailySiteReportService reportService;

    public DailySiteReportController(DailySiteReportService reportService) {
        this.reportService = reportService;
    }
    @GetMapping("/api/reports")
    @ResponseBody
    public List<DailySiteReport> getAllReports() {
        return reportService.getAllReports();
    }

    @PostMapping("/save-report")
    public String saveReport(@ModelAttribute DailySiteReport report) {
        reportService.saveReport(report);
        return "redirect:/project-dashboard";
    }

    @GetMapping("/delete-report")
    public String deleteReport(@RequestParam Long id) {
        reportService.deleteReport(id);
        return "redirect:/project-dashboard";
    }
}

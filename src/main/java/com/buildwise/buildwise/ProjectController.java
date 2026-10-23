
package com.buildwise.buildwise;

import com.buildwise.buildwise.entity.Project;
import com.buildwise.buildwise.service.ProjectService;
import com.buildwise.buildwise.service.DailySiteReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProjectController {

    private final ProjectService projectService;
    private final DailySiteReportService reportService;

    public ProjectController(
            ProjectService projectService,
            DailySiteReportService reportService) {
        this.projectService = projectService;
        this.reportService = reportService;
    }

    @PostMapping("/save-project")
    public String saveProject(@ModelAttribute Project project) {
        projectService.saveProject(project);
        return "redirect:/project-dashboard";
    }

    @GetMapping("/saved-projects")
    public String savedProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "saved-projects";
    }

    @GetMapping("/project-dashboard")
    public String projectDashboard(Model model) {
        model.addAttribute("reports", reportService.getAllReports());
        return "project-dashboard";
    }
}

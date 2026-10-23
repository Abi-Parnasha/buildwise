
package com.buildwise.buildwise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/dream-home")
    public String dreamHome() {
        return "dream-home";
    }
    @GetMapping("/material-estimator")
    public String materialEstimator() {
        return "material-estimator";
}
    @GetMapping("/material-marketplace")
    public String materialMarketplace() {
        return "material-marketplace";
}
    
    @GetMapping("/construction-planner")
    public String constructionPlanner() {
        return "construction-planner";
}

    @GetMapping("/cost-calculator")
    public String costCalculator() {
        return "cost-calculator";
}

    
   

}

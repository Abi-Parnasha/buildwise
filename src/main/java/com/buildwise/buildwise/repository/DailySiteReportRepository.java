
package com.buildwise.buildwise.repository;

import com.buildwise.buildwise.entity.DailySiteReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailySiteReportRepository
        extends JpaRepository<DailySiteReport, Long> {
}

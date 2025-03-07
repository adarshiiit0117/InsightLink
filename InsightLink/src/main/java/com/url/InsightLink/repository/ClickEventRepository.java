package com.url.InsightLink.repository;

import com.url.InsightLink.models.ClickEvent;
import com.url.InsightLink.models.UrlMapping;
import com.url.InsightLink.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ClickEventRepository extends JpaRepository<ClickEvent,Long> {
    List<ClickEvent>findByUrlMappingAndClickDateBetween(UrlMapping mapping, LocalDateTime startDate,LocalDateTime endDate);
    List<ClickEvent>findByUrlMappingInAndClickDateBetween(List<UrlMapping>urlMapping, LocalDateTime startDate,LocalDateTime endDate);

}

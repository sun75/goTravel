package com.gotravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: shh
 * @createTime: 2025/3/1910:13
 */
@RestController
@RequestMapping("/api/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    // 搜索路线（模拟实时交通数据）
    @GetMapping("/search")
    public ResponseEntity<List<Route>> searchRoutes(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(routeService.searchRoutes(from, to, date));
    }
}

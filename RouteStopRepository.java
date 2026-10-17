package com.buspass.repository;

import com.buspass.entity.BusRoute;
import com.buspass.entity.BusStop;
import com.buspass.entity.RouteStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteStopRepository extends JpaRepository<RouteStop, Long> {
    List<RouteStop> findByBusRouteOrderByStopOrderAsc(BusRoute busRoute);
    List<RouteStop> findByBusStop(BusStop busStop);
    void deleteByBusRoute(BusRoute busRoute);
}

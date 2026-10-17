package com.buspass.repository;

import com.buspass.entity.BusRoute;
import com.buspass.entity.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, Long> {
    List<BusRoute> findByIsActiveTrue();
    Optional<BusRoute> findByRouteNumber(String routeNumber);
    List<BusRoute> findBySourceStopAndDestStop(BusStop sourceStop, BusStop destStop);
}

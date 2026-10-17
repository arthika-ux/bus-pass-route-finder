package com.buspass.repository;

import com.buspass.entity.BusRoute;
import com.buspass.entity.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusScheduleRepository extends JpaRepository<BusSchedule, Long> {
    List<BusSchedule> findByBusRoute(BusRoute busRoute);
    List<BusSchedule> findAllByOrderByDepartureTimeAsc();
    List<BusSchedule> findByBusRoute_IdOrderByDepartureTimeAsc(Long routeId);
}

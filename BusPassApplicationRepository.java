package com.buspass.repository;

import com.buspass.entity.ApplicationStatus;
import com.buspass.entity.BusPassApplication;
import com.buspass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusPassApplicationRepository extends JpaRepository<BusPassApplication, Long> {
    List<BusPassApplication> findByUserOrderByAppliedDateDesc(User user);
    List<BusPassApplication> findAllByOrderByAppliedDateDesc();
    Optional<BusPassApplication> findByApplicationNumber(String applicationNumber);
    long countByStatus(ApplicationStatus status);
}

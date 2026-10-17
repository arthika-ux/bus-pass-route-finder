package com.buspass.repository;

import com.buspass.entity.BusPass;
import com.buspass.entity.BusPassApplication;
import com.buspass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusPassRepository extends JpaRepository<BusPass, Long> {
    List<BusPass> findByUserOrderByIssuedDateDesc(User user);
    Optional<BusPass> findByPassNumber(String passNumber);
    Optional<BusPass> findByApplication(BusPassApplication application);
    long countByIsActiveTrue();
}

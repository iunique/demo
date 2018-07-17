package com.sign.repository;

import com.sign.domain.TeamInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamInfoRepository extends JpaRepository<TeamInfo,String> {
    public TeamInfo findByTel(String tel);
}

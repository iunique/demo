package com.sign.repository;

import com.sign.domain.SoloInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoloInfoRepository extends JpaRepository<SoloInfo,String> {
    public SoloInfo findByTel(String tel);
}

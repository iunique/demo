package com.sign.repository;

import com.sign.domain.Message;
import com.sign.domain.SoloInfo;
import com.sign.domain.TeamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Conn {
    @Autowired
    private  SoloInfoRepository soloInfoRepository;
    @Autowired
    private TeamInfoRepository teamInfoRepository;
    public List<SoloInfo> getAllSoloInfo()
    {
        return soloInfoRepository.findAll();
    }
    public List<TeamInfo> getAllTeamInfo()
    {
        return teamInfoRepository.findAll();
    }
    public void SoloInfoUpdate(SoloInfo soloInfo)
    {
        soloInfoRepository.save(soloInfo);
    }
    public void TeamInfoUpdate(TeamInfo teamInfo)
    {
        teamInfoRepository.save(teamInfo);
    }
    public SoloInfo getSoloInfo(String tel)
    {
        return soloInfoRepository.findByTel(tel);
    }
    public TeamInfo getTeamInfo(String tel)
    {
        return teamInfoRepository.findByTel(tel);
    }
}

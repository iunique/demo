package com.sign.service;

import com.sign.domain.SoloInfo;
import com.sign.domain.TeamInfo;
import com.sign.repository.Conn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;
@Service
public class Action {
    @Autowired
    private Conn conn;
    public List<SoloInfo> findAllSoloInfo()
    {
        return conn.getAllSoloInfo();
    }
    public List<TeamInfo> findAllTeamInfo()
    {
        return conn.getAllTeamInfo();
    }
    public SoloInfo findSoloInfo( String tel)
    {
        return conn.getSoloInfo(tel);
    }
    public TeamInfo findTeamInfo(String tel)
    {
        return conn.getTeamInfo(tel);
    }
    public void UpdateSoloInfo(SoloInfo soloInfo)
    {
        conn.SoloInfoUpdate(soloInfo);
    }
    public void UpdateTeamInfo(TeamInfo teamInfo)
    {
        conn.TeamInfoUpdate(teamInfo);
    }
}

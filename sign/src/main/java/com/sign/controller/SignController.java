package com.sign.controller;

import com.sign.domain.Message;
import com.sign.domain.SoloInfo;
import com.sign.domain.TeamInfo;
import com.sign.service.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

// @RestController相当于@Controller+@ResponseBody(每一个方法上默认返回的是json串)
@RestController
public class SignController {

    @Autowired
    private Action action;
    @GetMapping(value = "/getAllSoloInfo")
    public List<SoloInfo> getAllSoloInfo()
    {
        return action.findAllSoloInfo();
    }
    @GetMapping(value = "/getAllTeamInfo")
    public List<TeamInfo> getAllTeamInfo()
    {
        return action.findAllTeamInfo();
    }
    @PostMapping(value = "/updateTeamInfo")
    public Message updateTeamInfo(@Valid TeamInfo teamInfo,BindingResult bindingResult)
    {
        Message message=new Message();
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            message.setCode(0);
            message.setInfo("信息未填完整");
        }
        else
        {
            action.UpdateTeamInfo(teamInfo);
            message.setCode(1);
            message.setInfo("信息加入成功");
        }
        return message;
    }
    @PostMapping(value = "/updateSoloInfo")
    public Message updateSoloInfo(@Valid SoloInfo soloInfo, BindingResult bindingResult)
    {
        Message message=new Message();
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            message.setCode(0);
            message.setInfo("信息未填完整");
        }
        else {
            action.UpdateSoloInfo(soloInfo);
            message.setCode(1);
            message.setInfo("信息加入成功");
        }
        return message;
    }
    @PostMapping("/login")
    public Object login(@RequestParam("tel")String tel,@RequestParam("leader_name") String leader_name)
    {
        TeamInfo teamInfo=action.findTeamInfo(tel);
        Message message=new Message();
        if(teamInfo==null||!teamInfo.getLeader_name().equals(leader_name))
        {
            message.setCode(0);
            message.setInfo("电话号码或者队长姓名错误");
            return message;
        }
        else
            return action.findTeamInfo(tel);
    }
    @PostMapping(value = "/getOneSoloInfo")
    public SoloInfo getOneSoloInfo(String tel, BindingResult bindingResult)
    {
        return action.findSoloInfo(tel);
    }
    @PostMapping(value = "getOneTeamInfo")
    public TeamInfo getOneTeamInfo(String tel)
    {
        return action.findTeamInfo(tel);
    }
}

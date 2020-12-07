package com.haihong.charge.connectivity.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.haihong.charge.connectivity.entity.ChaStation;
import com.haihong.charge.connectivity.service.ChaStationService;
import com.haihong.charge.connectivity.util.ResultMap;
import com.haihong.charge.connectivity.util.TimeHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/chaStation")
@RestController
public class ChaStationController {
    @Resource
    private ChaStationService chaStationService;
    @RequestMapping("/getChaList")
    public ResultMap getChaList(){
        ResultMap resultMap = new ResultMap();
        EntityWrapper<ChaStation> wrapper = new EntityWrapper();
        wrapper.ge("createtime",TimeHelper.getLong("2019-01-01"));
        List<ChaStation> chaList = chaStationService.selectList(new EntityWrapper().eq("id","20190423144512167158731392082620"));
        resultMap.put("list",chaList);
        return resultMap;
    }
}

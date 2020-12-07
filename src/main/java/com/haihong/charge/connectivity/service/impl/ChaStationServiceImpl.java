package com.haihong.charge.connectivity.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.haihong.charge.connectivity.entity.ChaStation;
import com.haihong.charge.connectivity.dao.ChaStationMapper;
import com.haihong.charge.connectivity.service.ChaStationService;
import org.springframework.stereotype.Service;

@Service
public class ChaStationServiceImpl extends ServiceImpl<ChaStationMapper, ChaStation> implements ChaStationService {
}

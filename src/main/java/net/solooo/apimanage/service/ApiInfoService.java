package net.solooo.apimanage.service;

import net.solooo.apimanage.mapper.ApiInfoMapper;
import net.solooo.apimanage.model.ApiInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Eric on 2018/1/21.
 */
@Service
public class ApiInfoService {

    @Autowired
    private ApiInfoMapper apiInfoMapper;

    public List<ApiInfo> list() {

        return apiInfoMapper.selectByExample(null);
    }
}

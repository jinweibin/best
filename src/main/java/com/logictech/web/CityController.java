package com.logictech.web;

import com.logictech.entity.dto.CityDTO;
import com.logictech.mapper.CityMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JG.Hannibal
 * @since 2017/11/9 上午9:33
 */
@RestController
public class CityController {

    @Resource
    private CityMapper cityMapper;

    @RequestMapping("/cities")
    public List<CityDTO> getCities() {
        List<CityDTO> cities = cityMapper.selectAll();
        return cities;
    }
}
    
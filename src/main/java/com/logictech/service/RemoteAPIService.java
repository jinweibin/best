package com.logictech.service;

import com.logictech.entity.dto.cnode.CommonResponse;
import com.logictech.entity.dto.cnode.TopicsRequest;

import java.io.IOException;

/**
 * @author JG.Hannibal
 * @since 2019-07-02 16:36
 */
public interface RemoteAPIService {

    /**
     * 主题首页
     * @param topicsRequest
     * @return
     */
    CommonResponse cnodeAPITopics(TopicsRequest topicsRequest) throws IOException;
}

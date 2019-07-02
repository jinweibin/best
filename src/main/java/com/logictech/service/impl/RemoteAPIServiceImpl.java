package com.logictech.service.impl;

import com.alibaba.fastjson.JSON;
import com.logictech.entity.dto.cnode.CommonResponse;
import com.logictech.entity.dto.cnode.TopicItem;
import com.logictech.entity.dto.cnode.TopicsRequest;
import com.logictech.okhttp.OkHttpSender;
import com.logictech.service.RemoteAPIService;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author JG.Hannibal
 * @since 2019-07-02 16:55
 */
public class RemoteAPIServiceImpl implements RemoteAPIService {
    /**
     * 主题首页
     *
     * @param topicsRequest
     * @return
     */
    @Override
    public CommonResponse cnodeAPITopics(TopicsRequest topicsRequest) throws IOException {
        // 请求参数
        String queryString = topicsRequest.toString();
        Response response = OkHttpSender.get("https://cnodejs.org/api/v1/topics", queryString);
        // 响应结果
        String responseStr = response.body().string();
        // 处理封装成我们的 bean
        CommonResponse<TopicItem[]> topicsResponse = JSON.parseObject(responseStr, CommonResponse.class);
        return topicsResponse;
    }
}
    
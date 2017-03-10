package com.ks3.cdn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZHANSONG on 2017/3/10.
 */
@Service
public class HystrixService {

    @Autowired
    private CallDependencyService dependencyService;
    public String callDependencyService() {
        return dependencyService.mockGetUserInfo();
    }
}

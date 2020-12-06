package com.wddily.api.user.impl;

import com.wddily.api.user.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Modify
 * @since
 */
@Component
@DubboService(interfaceClass = UserService.class)
public class UserAPIImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        return true;
    }
}

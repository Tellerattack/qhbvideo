package cn.qianying.feign;

import cn.org.zhixiang.domain.User;
import cn.qianying.domain.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient {
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setName("王五");
        return user;
    }
}

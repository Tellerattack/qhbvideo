package cn.qianying.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视频类型入口
 */
@RequestMapping(value = "/type")
@FeignClient(value = "video-provider")
public interface VideoTypeFeignClient {

    @GetMapping(value = "/list")
    public Object list();
}

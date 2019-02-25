package cn.qianying.controller.type;

import cn.qianying.serviceapi.api.type.VideoTypeInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 视频类型控制器
 */
@RestController(value = "VideoTypeController")
@RequestMapping(value = "/type")
public class VideoTypeController implements VideoTypeInterface {

//    private
    @GetMapping(value = "/list",headers = {"token"})
    @Override
    public Object list() {

        return null;
    }
}

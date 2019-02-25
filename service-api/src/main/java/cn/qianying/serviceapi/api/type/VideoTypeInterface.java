package cn.qianying.serviceapi.api.type;

import io.swagger.annotations.*;

/**
 * 视频类型接口api
 */
@Api(value = "VideoTypeController", description = "视频类型", tags = "VideoType")
public interface VideoTypeInterface {

    /**
     * 视频类型列表
     *
     * @return
     */
    @ApiOperation(value = "视频类型列表", notes = "展示视频类型列表", httpMethod = "GET")
    /*@ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", dataType = "int", paramType = "query", value = "页码", required = false, defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", dataType = "int", paramType = "query", value = "页面大小", defaultValue = "15", required = false),
            @ApiImplicitParam(name = "keyword", dataType = "string", paramType = "query", value = "搜索关键字", required = false)
    })*/
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 201, message = "已请求，未响应"),
            @ApiResponse(code = 401, message = "未授权的请求"),
            @ApiResponse(code = 403, message = "请求被禁止"),
            @ApiResponse(code = 404, message = "未找到请求资源"),
            @ApiResponse(code = 400, message = "请求参数不正确")
    })
    Object list();
}

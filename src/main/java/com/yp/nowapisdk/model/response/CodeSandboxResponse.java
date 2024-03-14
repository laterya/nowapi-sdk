package com.yp.nowapisdk.model.response;

import java.util.List;

/**
 * @author yp
 *
 */
public class CodeSandboxResponse extends ResultResponse {

    private List<String> outputList;

    /**
     * 接口信息
     */
    private String message;

    /**
     * 执行状态
     */
    private Integer status;
}
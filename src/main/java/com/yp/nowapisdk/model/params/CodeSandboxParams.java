package com.yp.nowapisdk.model.params;

import lombok.Data;

import java.util.List;

/**
 * @author yp
 *
 */
@Data
public class CodeSandboxParams {

    /**
     * 多组测试样例
     */
    private List<String> inputList;

    /**
     * 提交的代码
     */
    private String code;

    /**
     * 提交的语言
     */
    private String language;
}

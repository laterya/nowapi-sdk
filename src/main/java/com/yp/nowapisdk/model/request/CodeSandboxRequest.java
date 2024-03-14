package com.yp.nowapisdk.model.request;

import com.yp.nowapisdk.model.enums.RequestMethodEnum;
import com.yp.nowapisdk.model.params.CodeSandboxParams;
import com.yp.nowapisdk.model.response.CodeSandboxResponse;

/**
 * @author yp
 *
 */
public class CodeSandboxRequest extends BaseRequest<CodeSandboxParams, CodeSandboxResponse> {
    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return "/codesandbox";
    }

    @Override
    public Class<CodeSandboxResponse> getResponseClass() {
        return CodeSandboxResponse.class;
    }
}

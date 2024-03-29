package com.yp.nowapisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ShortLinkResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425078539L;

    private String shortLinkUrl;

    private String msg;
}

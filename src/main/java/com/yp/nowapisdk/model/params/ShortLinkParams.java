package com.yp.nowapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yp
 */
@Data
@Accessors(chain = true)
public class ShortLinkParams {

    private String url;
}

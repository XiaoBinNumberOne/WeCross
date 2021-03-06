package com.webank.wecross.stub.fabric;

import com.webank.wecross.exception.Status;
import com.webank.wecross.restserver.response.TransactionResponse;
import com.webank.wecross.utils.WeCrossType;

public class FabricResponse extends TransactionResponse {

    public FabricResponse() {
        super.setErrorCode(Status.SUCCESS);
        super.setType(WeCrossType.TRANSACTION_RSP_TYPE_FABRIC);
    }
}

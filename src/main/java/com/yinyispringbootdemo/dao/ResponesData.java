package com.yinyispringbootdemo.dao;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.enums.ApiErrorCode;
import lombok.Data;

@Data
public class ResponesData<T> extends R {

    /**
     * 返回成功信息
     * @param data
     * @return
     */
    public static ResponesData<Object> success(Object data) {
        ResponesData responesData = new ResponesData<>();
        responesData.setData(data);
        responesData.setCode(ApiErrorCode.SUCCESS.getCode());
        responesData.setMsg(ApiErrorCode.SUCCESS.getMsg());
        return responesData;
    }

}

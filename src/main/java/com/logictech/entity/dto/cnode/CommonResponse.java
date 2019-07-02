package com.logictech.entity.dto.cnode;

/**
 * @author JG.Hannibal
 * @since 2019-07-02 16:43
 */
public class CommonResponse<T> {
    /**
     * 成功
     */
     private boolean success ;
    /**
     * 数据
     */
     private T data ;

    @Override
    public String toString() {
        return "CommonResponse{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }

    public CommonResponse(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
    
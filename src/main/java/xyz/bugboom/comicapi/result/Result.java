package xyz.bugboom.comicapi.result;

public class Result {

    //状态码
    private Integer code;
    // 返回信息
    private String message;
    // 返回数据
    private Object data;

    public Result(Integer code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }


}

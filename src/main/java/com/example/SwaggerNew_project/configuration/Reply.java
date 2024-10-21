package com.example.SwaggerNew_project.configuration;

public class Reply {
    private  String info;
    private String message;
   private Object data;
   private int flag;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
        this.flag=1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        this.flag=1;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}

package com.example.SwaggerNew_project.configuration;

import java.util.ArrayList;
import java.util.List;

public class Reply {
    private short errFlag;
    List<String> errMessages;
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

    public void addErrorMessage(String err){
        if(errMessages.isEmpty()){
            errMessages=new ArrayList<>();
            errMessages.add(err);
        }
        errMessages.add(err);
        this.errFlag=1;
    }
}

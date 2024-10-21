package com.example.SwaggerNew_project.service;

import com.example.SwaggerNew_project.configuration.Reply;
import com.example.SwaggerNew_project.dtos.UserDTO;
import com.example.SwaggerNew_project.entities.UserTbl;
import com.example.SwaggerNew_project.entities.UserTblPk;
import com.example.SwaggerNew_project.repos.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }
    public void savrUser(Reply reply, UserDTO userDTO) {
        UserTbl userTbl=new UserTbl(new UserTblPk(userDTO.getSerialNo(),userDTO.getUserId()));
        BeanUtils.copyProperties(userDTO,userTbl);
        userRepo.save(userTbl);
    }


    public List<UserTbl> getAllUsers(){
        List<UserTbl> userTbls=userRepo.findAll();
        return userTbls;
    }

    public UserTbl findUserById(UserTblPk userTblPk){
        Optional<UserTbl> optional=userRepo.findById(userTblPk);
        return optional.get();
    }

    public void addUser(Reply reply, UserDTO userDTO) {
        UserTbl userTbl=new UserTbl(new UserTblPk(userDTO.getSerialNo(),userDTO.getUserId()));
        BeanUtils.copyProperties(userDTO,userTbl);
        userRepo.save(userTbl);
        reply.setMessage("User Added/Updated successfully");
        reply.setData(userDTO);

    }

    public void fetchUserData(Reply reply, UserDTO userDTO) {
        List<UserTbl> userTblList=userRepo.findByUserTblPkUserId(userDTO.getUserId());
        if(userTblList.isEmpty()){
            reply.setMessage("No Data found");
            return;
        }
        userDTO.setSerialNo(userTblList.get(0).getUserTblPk().getSerialNo());
        BeanUtils.copyProperties(userTblList.get(0),userDTO);
        reply.setData(userDTO);
    }
}

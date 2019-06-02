package com.example.gobang.service;

import com.example.gobang.dao.ChessDao;
import com.example.gobang.domain.Chess;
import com.example.gobang.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author psl
 * @date 2019/6/2
 */
@Service
public class ChessService {
    @Autowired
    private ChessDao chessDao;
    @Transactional(rollbackFor = Exception.class)
    public int saveChessPlace(Chess chess, Integer uid,Integer rid) {
        boolean flag = chessDao.checkStatus(uid);
        if (flag){
            return -1;
        }
        int flag1 = chessDao.savePlace(chess, uid, rid);
        changeStatus(uid,true);
        Room room = chessDao.search(rid);
        if (room.getJUid() == uid ){
            changeStatus(room.getUid(),false);
        }else{
            changeStatus(room.getJUid(),false);
        }
        return flag1;
    }
    public void changeStatus(Integer id,boolean status){
        chessDao.changeStatus(id,status);
    }
    public boolean checkStatus(Integer uid){
        boolean flag = chessDao.checkStatus(uid);
        return flag;
    }

    public List<Chess> getPlace(Integer uid, Integer rid) {
        Room room = chessDao.search(rid);
        boolean flag = chessDao.checkStatus(uid);
        if (room.getJUid() == uid ){
            if (flag){
                List<Chess> chessList = chessDao.findPlaceById(room.getUid(), rid);
                return chessList;
            }else
                return null;
        }else{
            if (flag){
                List<Chess> chessList = chessDao.findPlaceById(room.getJUid(), rid);
                return chessList;
            }else
                return null;

        }
    }
}

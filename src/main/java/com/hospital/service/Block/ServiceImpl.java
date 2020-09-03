package com.hospital.service.Block;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.hospital.repo.BlockRepository;
import com.hospital.model.Block;

@Service
@Transactional
public class ServiceImpl implements BlockService {
    @Autowired
    private BlockRepository repo;

    @Override
    public List<Block> getList(){
        return (List<Block>) repo.findAll();
    }
    @Override
    public Block getBlock(int id){
        return repo.findById(id).get();
    }
    @Override
    public void save(Block block){}
    @Override
    public void delete(int id){}
}

package com.hospital.service.Block;

import com.hospital.model.Block;
import java.util.List;

public interface BlockService {
    List<Block> getList();
    Block getBlock(int id);
    void save(Block block);
    void delete(int id);
}

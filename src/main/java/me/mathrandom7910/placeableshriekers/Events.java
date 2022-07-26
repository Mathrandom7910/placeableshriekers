package me.mathrandom7910.placeableshriekers;

import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.SculkShrieker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Events implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Block block = e.getBlock();
        BlockData data = block.getBlockData();
        if(data instanceof SculkShrieker) {
            ((SculkShrieker) data).setCanSummon(true);
        }
        block.setBlockData(data);
    }
}

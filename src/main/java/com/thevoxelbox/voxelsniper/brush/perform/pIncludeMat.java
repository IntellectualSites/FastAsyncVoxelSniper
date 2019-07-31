/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.thevoxelbox.voxelsniper.brush.perform;

import com.boydti.fawe.bukkit.wrapper.AsyncBlock;
import com.thevoxelbox.voxelsniper.Message;
import com.thevoxelbox.voxelsniper.SnipeData;
import com.thevoxelbox.voxelsniper.util.VoxelList;


public class pIncludeMat extends vPerformer {

    private VoxelList includeList;
    private int id;

    public pIncludeMat() {
        name = "Include Material";
    }

    @Override
    public void info(Message vm) {
        vm.performerName(name);
        vm.voxelList();
        vm.voxel();
    }

    @Override
    public void init(SnipeData v) {
        w = v.getWorld();
        id = v.getVoxelId();
        includeList = v.getVoxelList();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void perform(AsyncBlock b) {
        if (includeList.contains(b.getBlockData())) {
            h.put(b);
            b.setTypeId(id);
        }
    }
}

package StevenDimDoors.mod_pocketDim.blocks;

import StevenDimDoors.mod_pocketDim.mod_pocketDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDoorGold extends BlockDoor
{
	public BlockDoorGold(Material par2Material)
	{
		super( par2Material);
	}

    @SideOnly(Side.CLIENT)
    protected String getTextureName()
    {
        return mod_pocketDim.modid + ":" + this.getUnlocalizedName();
    }
	
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return (par1 & 8) != 0 ? null : mod_pocketDim.itemGoldenDoor;
    }
}

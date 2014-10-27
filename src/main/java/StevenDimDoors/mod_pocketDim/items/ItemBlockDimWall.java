package StevenDimDoors.mod_pocketDim.items;

import StevenDimDoors.mod_pocketDim.mod_pocketDim;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDimWall extends ItemBlock
{
	private final static String[] subNames = {"Fabric of Reality", "Ancient Fabric" , "Altered Fabric"};
	
    public ItemBlockDimWall(Block block)
    {
    	  super(block);
          this.setCreativeTab(mod_pocketDim.dimDoorsCreativeTab);
          setHasSubtypes(true);
    }
    @Override
	public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(mod_pocketDim.modid + ":" + this.getUnlocalizedName().replace("tile.", ""));
    }
    
    @Override
	public int getMetadata (int damageValue) 
    {
		return damageValue;
	}
	
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return subNames[this.getDamage(par1ItemStack)];
    }  
}
package com.pahimar.ee3.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.pahimar.ee3.lib.BlockIds;
import com.pahimar.ee3.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Equivalent-Exchange-3
 * 
 * ModBlocks
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModBlocks {

    /* Mod block instances */
    public static Block calcinator;
    public static Block aludel;
    public static Block alchemicalChest;
    public static Block glassBell;
    public static Block redWaterStill;
    public static Block redWaterFlowing;

    public static void init() {

        calcinator = new BlockCalcinator(BlockIds.CALCINATOR);
        aludel = new BlockAludelBase(BlockIds.ALUDEL);
        alchemicalChest = new BlockAlchemicalChest(BlockIds.ALCHEMICAL_CHEST);
        glassBell = new BlockGlassBell(BlockIds.GLASS_BELL);
        redWaterStill = new BlockRedWaterStill(BlockIds.RED_WATER_STILL);
        redWaterFlowing = new BlockRedWaterFlowing(BlockIds.RED_WATER_STILL - 1);

        GameRegistry.registerBlock(calcinator, Strings.CALCINATOR_NAME);
        GameRegistry.registerBlock(aludel, Strings.ALUDEL_NAME);
        GameRegistry.registerBlock(alchemicalChest, Strings.ALCHEMICAL_CHEST_NAME);
        GameRegistry.registerBlock(glassBell, Strings.GLASS_BELL_NAME);
        //GameRegistry.registerBlock(redWaterStill, Strings.RED_WATER_STILL_NAME);
        //GameRegistry.registerBlock(redWaterFlowing, Strings.RED_WATER_FLOWING_NAME);

        initBlockRecipes();

    }

    private static void initBlockRecipes() {

        GameRegistry.addRecipe(new ItemStack(glassBell), new Object[] {"iii", "i i", "i i", Character.valueOf('i'), Block.glass });
    }
}

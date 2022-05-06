package com.laosun.mcrunpy;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.RegistryManager;

import java.util.Map;
import java.util.Set;

public class PythonItem {
    // TODO: Add more API for item
    public static Set<Map.Entry<ResourceLocation, IRecipe>> recipes;

    public static Item getItem(String unlocalizedName) {
        return Item.getByNameOrId(unlocalizedName);
    }

    public static void remove(String unlocalizedName) {
        recipes = ForgeRegistries.RECIPES.getEntries();
        ResourceLocation temp = null;
        for (Map.Entry<ResourceLocation, IRecipe> a : recipes) {
            temp = a.getKey();
            MCRunPythonMod.logger.info(temp.toString());
            if (temp.toString().equals(unlocalizedName)) {
                break;
            }
        }
        RegistryManager.ACTIVE.getRegistry(GameData.RECIPES).remove(temp);
    }
}


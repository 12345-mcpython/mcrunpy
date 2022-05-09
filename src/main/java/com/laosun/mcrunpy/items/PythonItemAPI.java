package com.laosun.mcrunpy.items;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.RegistryManager;

import java.util.Map;
import java.util.Set;


// TODO: Add more API for item
public class PythonItemAPI {
    public static Set<Map.Entry<ResourceLocation, IRecipe>> recipes;

    public static Item getItem(String unlocalizedName) {
        return Item.getByNameOrId(unlocalizedName);
    }

    public static void remove(String unlocalizedName) {
        // ForgeRegistries.ITEMS.register();


        recipes = ForgeRegistries.RECIPES.getEntries();
        ResourceLocation temp = null;
        IRecipe temp1 = null;
        for (Map.Entry<ResourceLocation, IRecipe> a : recipes) {
            temp = a.getKey();
            temp1 = a.getValue();
            // MCRunPythonMod.logger.info(temp.toString());
            // MCRunPythonMod.logger.info(temp1.getIngredients());
            // MCRunPythonMod.logger.info(temp1.getRecipeOutput());
            if (temp.toString().equals(unlocalizedName)) {
                break;
            }
        }
        RegistryManager.ACTIVE.getRegistry(GameData.RECIPES).remove(temp);
    }
}

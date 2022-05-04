package com.laosun.mcrunpy.utils;

import net.minecraft.item.Item;

public class GetEnv {
    public static boolean isProduct() {
        try {
            Item.class.getDeclaredField("maxStackSize");
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}

package io.github.shixinzia.mineralgenerator.categories;


import io.github.shixinzia.mineralgenerator.Mineralgenerator;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import org.bukkit.Material;


public final class Groups {

    public static final ItemGroup MINERALGENERATOR_MINERAL = new SubGroup("mineralgenerator_mineral",
        new CustomItemStack(Material.DIAMOND_ORE, "&e&l矿物生成器"));
    public static final ItemGroup MINERALGENERATOR_MAIN_CATEGORY = new MultiGroup("mineralgenerator_main",
            new CustomItemStack(Material.IRON_ORE, "&6&l矿物生成器"), 3,
            MINERALGENERATOR_MINERAL);

    public static void setup(Mineralgenerator inst) {
        MINERALGENERATOR_MAIN_CATEGORY.register(inst);
    }

}

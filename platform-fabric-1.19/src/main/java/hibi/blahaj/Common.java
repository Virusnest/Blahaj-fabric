package hibi.blahaj;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Common implements ModInitializer {

	public static final Identifier BLAHAJ_ID;
	public static final Identifier KLAPPAR_HAJ_ID;
	public static final Identifier BREAD_ID;

	@Override
	public void onInitialize() {
		Item grayShark = Registry.register(Registry.ITEM, KLAPPAR_HAJ_ID, new CuddlyItem(new Item.Settings().maxCount(1).group(ItemGroup.MISC), "item.blahaj.gray_shark.tooltip"));
		Registry.register(Registry.ITEM, BLAHAJ_ID, new CuddlyItem(new Item.Settings().maxCount(1).group(ItemGroup.MISC), "item.blahaj.blue_shark.tooltip"));
		Registry.register(Registry.ITEM, BREAD_ID, new CuddlyItem(new Item.Settings().maxCount(1).group(ItemGroup.MISC), null));

	}

	static {
		BLAHAJ_ID = new Identifier("blahaj", "blue_shark");
		KLAPPAR_HAJ_ID = new Identifier("blahaj", "gray_shark");
		BREAD_ID = new Identifier("blahaj", "bread");
	}
}

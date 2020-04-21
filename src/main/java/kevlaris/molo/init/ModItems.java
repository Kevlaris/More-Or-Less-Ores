package kevlaris.molo.init;

import java.util.List;

import kevlaris.molo.items.ItemBase;
import kevlaris.molo.items.armor.ArmorBase;
import kevlaris.molo.items.tools.ToolAxe;
import kevlaris.molo.items.tools.ToolHoe;
import kevlaris.molo.items.tools.ToolPickaxe;
import kevlaris.molo.items.tools.ToolSpade;
import kevlaris.molo.items.tools.ToolSword;
import kevlaris.molo.utils.Reference;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_THALINIUM = EnumHelper.addToolMaterial("material_thalinium", 3, 750, 8.5f, 4.0f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_THALINIUM = EnumHelper.addArmorMaterial("armor_material_thalinium", Reference.MOD_ID + ":thalinium", 15, new int[] {3, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	public static final Item THALINIUM_INGOT = new ItemBase("thalinium_ingot");
	
	//Tools
	public static final ItemSword THALINIUM_SWORD = new ToolSword("thalinium_sword", MATERIAL_THALINIUM);
	public static final ItemSpade THALINIUM_SHOVEL = new ToolSpade("thalinium_shovel", MATERIAL_THALINIUM);
	public static final ItemPickaxe THALINIUM_PICKAXE = new ToolPickaxe("thalinium_pickaxe", MATERIAL_THALINIUM);
	public static final ItemAxe THALINIUM_AXE = new ToolAxe("thalinium_axe", MATERIAL_THALINIUM);
	public static final ItemHoe THALINIUM_HOE = new ToolHoe("thalinium_hoe", MATERIAL_THALINIUM);
	
	//Armor
	public static final Item THALINIUM_HELMET = new ArmorBase("thalinium_helmet", ARMOR_MATERIAL_THALINIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item THALINIUM_CHESTPLATE = new ArmorBase("thalinium_chestplate", ARMOR_MATERIAL_THALINIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item THALINIUM_LEGGINGS = new ArmorBase("thalinium_leggings", ARMOR_MATERIAL_THALINIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item THALINIUM_BOOTS = new ArmorBase("thalinium_boots", ARMOR_MATERIAL_THALINIUM, 1, EntityEquipmentSlot.FEET);
}

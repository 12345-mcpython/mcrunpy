package com.laosun.mcrunpy.items;


import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IRarity;
import net.minecraftforge.common.animation.ITimeValue;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class PythonItem extends Item {
    public PythonItem() {
        super();
    }

    @Nullable

    public IItemPropertyGetter _getPropertyGetter(ResourceLocation key) {
        return super.getPropertyGetter(key);
    }

    public boolean _updateItemStackNBT(NBTTagCompound nbt) {
        return super.updateItemStackNBT(nbt);
    }

    public boolean _hasCustomProperties() {
        return super.hasCustomProperties();
    }

    public Item _setMaxStackSize(int maxStackSize) {
        return super.setMaxStackSize(maxStackSize);
    }


    public EnumActionResult _onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }


    public float _getDestroySpeed(ItemStack stack, IBlockState state) {
        return super.getDestroySpeed(stack, state);
    }


    public ActionResult<ItemStack> _onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


    public ItemStack _onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }


    @Deprecated
    public int _getItemStackLimit() {
        return super.getItemStackLimit();
    }


    public int _getMetadata(int damage) {
        return super.getMetadata(damage);
    }


    public boolean _getHasSubtypes() {
        return super.getHasSubtypes();
    }


    public Item _setHasSubtypes(boolean hasSubtypes) {
        return super.setHasSubtypes(hasSubtypes);
    }


    public int _getMaxDamage() {
        return super.getMaxDamage();
    }


    public Item _setMaxDamage(int maxDamageIn) {
        return super.setMaxDamage(maxDamageIn);
    }


    public boolean _isDamageable() {
        return super.isDamageable();
    }


    public boolean _hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        return super.hitEntity(stack, target, attacker);
    }


    public boolean _onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }


    public boolean _canHarvestBlock(IBlockState blockIn) {
        return super.canHarvestBlock(blockIn);
    }


    public boolean _itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
        return super.itemInteractionForEntity(stack, playerIn, target, hand);
    }


    public Item _setFull3D() {
        return super.setFull3D();
    }


    public boolean _isFull3D() {
        return super.isFull3D();
    }


    public boolean _shouldRotateAroundWhenRendering() {
        return super.shouldRotateAroundWhenRendering();
    }


    public Item _setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(unlocalizedName);
    }


    public String _getUnlocalizedNameInefficiently(ItemStack stack) {
        return super.getUnlocalizedNameInefficiently(stack);
    }


    public String _getUnlocalizedName() {
        return super.getUnlocalizedName();
    }


    public String _getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack);
    }


    public Item _setContainerItem(Item containerItem) {
        return super.setContainerItem(containerItem);
    }


    public boolean _getShareTag() {
        return super.getShareTag();
    }

    @Nullable

    public Item _getContainerItem() {
        return super.getContainerItem();
    }

    @Deprecated

    public boolean _hasContainerItem() {
        return super.hasContainerItem();
    }


    public void _onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }


    public void _onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        super.onCreated(stack, worldIn, playerIn);
    }


    public boolean _isMap() {
        return super.isMap();
    }


    public EnumAction _getItemUseAction(ItemStack stack) {
        return super.getItemUseAction(stack);
    }


    public int _getMaxItemUseDuration(ItemStack stack) {
        return super.getMaxItemUseDuration(stack);
    }


    public void _onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
        super.onPlayerStoppedUsing(stack, worldIn, entityLiving, timeLeft);
    }


    public void _addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }


    public String _getItemStackDisplayName(ItemStack stack) {
        return super.getItemStackDisplayName(stack);
    }


    public boolean _hasEffect(ItemStack stack) {
        return super.hasEffect(stack);
    }


    @Deprecated
    public EnumRarity _getRarity(ItemStack stack) {
        return super.getRarity(stack);
    }


    public boolean _isEnchantable(ItemStack stack) {
        return super.isEnchantable(stack);
    }


    protected RayTraceResult _rayTrace(World worldIn, EntityPlayer playerIn, boolean useLiquids) {
        return super.rayTrace(worldIn, playerIn, useLiquids);
    }


    public int _getItemEnchantability() {
        return super.getItemEnchantability();
    }


    public void _getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        super.getSubItems(tab, items);
    }


    protected boolean _isInCreativeTab(CreativeTabs targetTab) {
        return super.isInCreativeTab(targetTab);
    }

    @Nullable

    public CreativeTabs _getCreativeTab() {
        return super.getCreativeTab();
    }


    public Item _setCreativeTab(CreativeTabs tab) {
        return super.setCreativeTab(tab);
    }


    public boolean _canItemEditBlocks() {
        return super.canItemEditBlocks();
    }


    public boolean _getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return super.getIsRepairable(toRepair, repair);
    }


    @Deprecated
    public Multimap<String, AttributeModifier> _getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        return super.getItemAttributeModifiers(equipmentSlot);
    }


    public Multimap<String, AttributeModifier> _getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        return super.getAttributeModifiers(slot, stack);
    }


    public boolean _onDroppedByPlayer(ItemStack item, EntityPlayer player) {
        return super.onDroppedByPlayer(item, player);
    }


    public String _getHighlightTip(ItemStack item, String displayName) {
        return super.getHighlightTip(item, displayName);
    }


    public EnumActionResult _onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        return super.onItemUseFirst(player, world, pos, side, hitX, hitY, hitZ, hand);
    }


    public boolean _isRepairable() {
        return super.isRepairable();
    }


    public Item _setNoRepair() {
        return super.setNoRepair();
    }


    public float _getXpRepairRatio(ItemStack stack) {
        return super.getXpRepairRatio(stack);
    }

    @Nullable

    public NBTTagCompound _getNBTShareTag(ItemStack stack) {
        return super.getNBTShareTag(stack);
    }


    public void _readNBTShareTag(ItemStack stack, @Nullable NBTTagCompound nbt) {
        super.readNBTShareTag(stack, nbt);
    }


    public boolean _onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
        return super.onBlockStartBreak(itemstack, pos, player);
    }


    public void _onUsingTick(ItemStack stack, EntityLivingBase player, int count) {
        super.onUsingTick(stack, player, count);
    }


    public boolean _onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        return super.onLeftClickEntity(stack, player, entity);
    }


    public ItemStack _getContainerItem(ItemStack itemStack) {
        return super.getContainerItem(itemStack);
    }


    public boolean _hasContainerItem(ItemStack stack) {
        return super.hasContainerItem(stack);
    }


    public int _getEntityLifespan(ItemStack itemStack, World world) {
        return super.getEntityLifespan(itemStack, world);
    }


    public boolean _hasCustomEntity(ItemStack stack) {
        return super.hasCustomEntity(stack);
    }

    @Nullable

    public Entity _createEntity(World world, Entity location, ItemStack itemstack) {
        return super.createEntity(world, location, itemstack);
    }


    public boolean _onEntityItemUpdate(EntityItem entityItem) {
        return super.onEntityItemUpdate(entityItem);
    }


    public CreativeTabs[] _getCreativeTabs() {
        return super.getCreativeTabs();
    }


    public float _getSmeltingExperience(ItemStack item) {
        return super.getSmeltingExperience(item);
    }


    public boolean _doesSneakBypassUse(ItemStack stack, IBlockAccess world, BlockPos pos, EntityPlayer player) {
        return super.doesSneakBypassUse(stack, world, pos, player);
    }


    public void _onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);
    }


    public boolean _isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
        return super.isValidArmor(stack, armorType, entity);
    }

    @Nullable

    public EntityEquipmentSlot _getEquipmentSlot(ItemStack stack) {
        return super.getEquipmentSlot(stack);
    }


    public boolean _isBookEnchantable(ItemStack stack, ItemStack book) {
        return super.isBookEnchantable(stack, book);
    }

    @Nullable

    public String _getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return super.getArmorTexture(stack, entity, slot, type);
    }

    @Nullable

    public FontRenderer _getFontRenderer(ItemStack stack) {
        return super.getFontRenderer(stack);
    }

    @Nullable

    public ModelBiped _getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        return super.getArmorModel(entityLiving, itemStack, armorSlot, _default);
    }


    public boolean _nEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        return super.onEntitySwing(entityLiving, stack);
    }


    public void _renderHelmetOverlay(ItemStack stack, EntityPlayer player, ScaledResolution resolution, float partialTicks) {
        super.renderHelmetOverlay(stack, player, resolution, partialTicks);
    }


    public int _getDamage(ItemStack stack) {
        return super.getDamage(stack);
    }


    public int _getMetadata(ItemStack stack) {
        return super.getMetadata(stack);
    }


    public boolean _showDurabilityBar(ItemStack stack) {
        return super.showDurabilityBar(stack);
    }


    public double _getDurabilityForDisplay(ItemStack stack) {
        return super.getDurabilityForDisplay(stack);
    }


    public int _getRGBDurabilityForDisplay(ItemStack stack) {
        return super.getRGBDurabilityForDisplay(stack);
    }


    public int _getMaxDamage(ItemStack stack) {
        return super.getMaxDamage(stack);
    }


    public boolean _isDamaged(ItemStack stack) {
        return super.isDamaged(stack);
    }


    public void _setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, damage);
    }


    public boolean _canDestroyBlockInCreative(World world, BlockPos pos, ItemStack stack, EntityPlayer player) {
        return super.canDestroyBlockInCreative(world, pos, stack, player);
    }


    public boolean _canHarvestBlock(IBlockState state, ItemStack stack) {
        return super.canHarvestBlock(state, stack);
    }


    public int _getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }


    public void _setHarvestLevel(String toolClass, int level) {
        super.setHarvestLevel(toolClass, level);
    }


    public Set<String> _getToolClasses(ItemStack stack) {
        return super.getToolClasses(stack);
    }


    public int _getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
        return super.getHarvestLevel(stack, toolClass, player, blockState);
    }


    public int _getItemEnchantability(ItemStack stack) {
        return super.getItemEnchantability(stack);
    }


    public boolean _canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment);
    }


    public boolean _isBeaconPayment(ItemStack stack) {
        return super.isBeaconPayment(stack);
    }


    public boolean _shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return super.shouldCauseReequipAnimation(oldStack, newStack, slotChanged);
    }


    public boolean _shouldCauseBlockBreakReset(ItemStack oldStack, ItemStack newStack) {
        return super.shouldCauseBlockBreakReset(oldStack, newStack);
    }


    public boolean _canContinueUsing(ItemStack oldStack, ItemStack newStack) {
        return super.canContinueUsing(oldStack, newStack);
    }

    @Nullable

    public String _getCreatorModId(ItemStack itemStack) {
        return super.getCreatorModId(itemStack);
    }

    @Nullable

    public ICapabilityProvider _initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
        return super.initCapabilities(stack, nbt);
    }


    public ImmutableMap<String, ITimeValue> _getAnimationParameters(ItemStack stack, World world, EntityLivingBase entity) {
        return super.getAnimationParameters(stack, world, entity);
    }


    public boolean _canDisableShield(ItemStack stack, ItemStack shield, EntityLivingBase entity, EntityLivingBase attacker) {
        return super.canDisableShield(stack, shield, entity, attacker);
    }


    public boolean _isShield(ItemStack stack, @Nullable EntityLivingBase entity) {
        return super.isShield(stack, entity);
    }


    public int _getItemBurnTime(ItemStack itemStack) {
        return super.getItemBurnTime(itemStack);
    }


    public HorseArmorType _getHorseArmorType(ItemStack stack) {
        return super.getHorseArmorType(stack);
    }


    public String _getHorseArmorTexture(EntityLiving wearer, ItemStack stack) {
        return super.getHorseArmorTexture(wearer, stack);
    }


    public void _onHorseArmorTick(World world, EntityLiving horse, ItemStack armor) {
        super.onHorseArmorTick(world, horse, armor);
    }


    public void _setTileEntityItemStackRenderer(@Nullable TileEntityItemStackRenderer teisr) {
        super.setTileEntityItemStackRenderer(teisr);
    }


    public IRarity _getForgeRarity(ItemStack stack) {
        return super.getForgeRarity(stack);
    }


    public ItemStack _getDefaultInstance() {
        return super.getDefaultInstance();
    }
}

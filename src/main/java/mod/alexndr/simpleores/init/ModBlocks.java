package mod.alexndr.simpleores.init;

import mod.alexndr.simpleores.SimpleOres;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo
 */
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleOres.MODID);

    // Ore Blocks
    public static final RegistryObject<OreBlock> copper_ore = BLOCKS.register("copper_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 1.7F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<OreBlock> tin_ore = BLOCKS.register("tin_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 3.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<OreBlock> mythril_ore = BLOCKS.register("mythril_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 4.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<OreBlock> adamantium_ore = BLOCKS.register("adamantium_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 5.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<OreBlock> onyx_ore = BLOCKS.register("onyx_ore",
            () -> new OreBlock(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));

    // Metal Blocks
    public static final RegistryObject<Block> copper_block = BLOCKS.register("copper_block",
            () -> new Block(Block.Properties.create(Material.IRON,
                    MaterialColor.ORANGE_TERRACOTTA)
                    .hardnessAndResistance(3.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> tin_block = BLOCKS.register("tin_block",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(4.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> mythril_block = BLOCKS.register("mythril_block",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE)
                    .hardnessAndResistance(7.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> adamantium_block = BLOCKS.register("adamantium_block",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.GREEN)
                    .hardnessAndResistance(7.0F, 12.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> onyx_block = BLOCKS.register("onyx_block",
            () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.OBSIDIAN)
                    .hardnessAndResistance(20.0F, 100.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

}  // end class ModBlocks

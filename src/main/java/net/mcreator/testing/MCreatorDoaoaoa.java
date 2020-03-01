
package net.mcreator.testing;

@Elementstesting.ModElement.Tag
public class MCreatorDoaoaoa extends Elementstesting.ModElement {

	@ObjectHolder("testing:doaoaoa")
	public static final Item block = null;

	public MCreatorDoaoaoa(Elementstesting instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal.spawn")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("doaoaoa");
		}

	}

}

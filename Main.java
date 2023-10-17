public class FlySpeedEnchantment extends Enchantment {

  public FlySpeedEnchantment() {
    super(Rarity.RARE, EnchantmentTarget.CHESTPLATE, new EquipmentSlot[] {EquipmentSlot.CHEST});
  }

  @Override
  public int getMinLevel() {
    return 1;
  }

  @Override
  public int getMaxLevel() {
    return 4;
  }

  @Override
  public float getAttackDamage(int level, EntityGroup group) {
    return 0.0f;
  }

  @Override
  public boolean canAccept(Enchantment other) {
    return !(other instanceof FlySpeedEnchantment);
  }

  @Override
  public boolean isAcceptableItem(ItemStack stack) {
    return stack.getItem() instanceof ElytraItem;
  }

  @Override
  public boolean isAvailableForRandomSelection() {
    return false;
  }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {}

  @Override
  public void onTargetDamaged(LivingEntity user, Entity target, int level) {}

  @Override
  public void onTargetDamaged(LivingEntity user, LivingEntity target, int level) {}

  @Override
  public void onBreak(EquipmentSlot slot, int level) {}

  @Override
  public boolean isCursed() {
    return false;
  }

  @Override
  public boolean isTreasure() {
    return false;
  }

  @Override
  public boolean isAvailableForEnchantedBookOffer() {
    return false;
  }

  @Override
  public int getWeight() {
    return 1;
  }

  @Override
  public boolean isAvailableForRandomEnchantment(Enchantment enchantment) {
    return false;
  }

  @Override
  public boolean isAllowedOnBooks() {
    return false;
  }

  @Override
  public boolean isGlowing(ItemStack stack) {
    return false;
  }

  @Override
  public boolean isTradeable() {
    return false;
  }

  @Override
  public boolean isDiscoverable() {
    return false;
  }

  @Override
  public boolean isAllowedOnLeggings() {
    return false;
  }

  @Override
  public boolean canEnchant(ItemStack stack) {
    return stack.getItem() instanceof ElytraItem;
  }

  @Override
  public void onTargetDamaged(LivingEntity user, Entity target, int level, LivingEntity attacker) {}

  @Override
  public void onPossessedDamage(Entity user, LivingEntity target, int level) {}

  @Override
  public void onPossessedDamage(Entity user, Entity target, int level) {}

  public static class BoostFlightEvent {

    private final PlayerEntity player;
    private float originalSpeed;

    public BoostFlightEvent(PlayerEntity player) {
      this.player = player;
      this.originalSpeed = player.getFlySpeed();
    }

    public void boostFlight(int level) {
      float speedBoost = 0.1f * level;
      float newSpeed = originalSpeed + speedBoost;
      player.setFlySpeed(newSpeed);
    }

    public PlayerEntity getPlayer() {
      return player;
    }

    public float getOriginalSpeed() {
      return originalSpeed;
    }
  }
}
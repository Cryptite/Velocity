package com.velocitypowered.api.event.player;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;

/**
 * This event is fired when a client ({@link Player}) has a Brand Plugin Message sent.
 */
public final class PlayerBrandEvent {

  private final Player player;
  private final String brand;

  public PlayerBrandEvent(Player player, String brand) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.brand = Preconditions.checkNotNull(brand, "brand");
  }

  public Player getPlayer() {
    return player;
  }

  public String getBrand() {
    return brand;
  }

  @Override
  public String toString() {
    return "PlayerBrandEvent{"
            + "player=" + player
            + ", brand=" + brand
            + '}';
  }
}

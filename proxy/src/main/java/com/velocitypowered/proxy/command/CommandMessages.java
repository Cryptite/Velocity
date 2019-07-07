package com.velocitypowered.proxy.command;

import net.kyori.text.Component;
import net.kyori.text.TextComponent;
import net.kyori.text.TranslatableComponent;

class CommandMessages {

  public static final Component ONLY_PLAYERS_CAN_EXECUTE = TranslatableComponent
      .of("velocity.command.only-players-can-execute");
  public static final Component TOO_MANY_ARGUMENTS = TranslatableComponent
      .of("velocity.command.too-many-arguments");

  public static Component serverDoesntExist(String serverName) {
    return TranslatableComponent
        .of("velocity.command.server-doesnt-exist", TextComponent.of(serverName));
  }

  private CommandMessages() {
    throw new AssertionError();
  }
}
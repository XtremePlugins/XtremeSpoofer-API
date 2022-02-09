package Xtreme.Spoofer.Spigot;

import Xtreme.Spoofer.Spigot.MultiVersion.*;
import Xtreme.Spoofer.Spigot.PluginUtils.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class XtremeSpooferAPI {

    public static @Nullable XtremeSpoofer getFakePlayer(UUID uuid) {
        for (XtremeSpoofer player : fakePlayers) {
            if (player.getUUID() == uuid) {
                return player;
            }
        }

        return null;
    }

    public static @Nullable XtremeSpoofer getFakePlayer(String name) {
        for (XtremeSpoofer player : fakePlayers) {
            if (player.getName().equals(name)) {
                return player;
            }
        }

        return null;
    }

    public static int getAmount() {
        return fakePlayers.size();
    }

    public static List<XtremeSpoofer> getFakePlayers() {
        return fakePlayers;
    }

    public static XtremeSpoofer getRandomFakePlayer() {
        return fakePlayers.get(new Random().nextInt(fakePlayers.size()));
    }

    public static boolean connectFakePlayer(String name) {
        return new XtremeSpoofer(Main.getRandomUUID(name), name).spawn();
    }
	
}

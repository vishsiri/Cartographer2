package io.github.bananapuncher714.cartographer.module.worldguard.api;

import java.util.Collection;

import org.bukkit.World;

public interface WorldGuardWrapper {
	Collection< CuboidRegion > getRegionsFor( World world );
}

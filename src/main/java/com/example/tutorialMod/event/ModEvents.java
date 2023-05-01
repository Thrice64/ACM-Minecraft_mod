package com.example.tutorialMod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.example.TutorialMod;
import com.example.tutorialMod.entity.ModEntityTypes;
import com.example.tutorialMod.entity.custom.ChomperEntity;
import com.example.tutorialMod.entity.custom.JackEntity;
import com.example.tutorialMod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import java.util.List;
public class ModEvents {
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
    public static class ForgeEvents {

        @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(ModEntityTypes.CHOMPER.get(), ChomperEntity.setAttributes());
                event.put(ModEntityTypes.JACK.get(), JackEntity.setAttributes());
            }
        }

    }
}


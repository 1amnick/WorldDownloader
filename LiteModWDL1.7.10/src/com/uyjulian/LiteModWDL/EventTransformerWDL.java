package com.uyjulian.LiteModWDL;

import com.mumfrey.liteloader.transformers.event.Event;
import com.mumfrey.liteloader.transformers.event.EventInjectionTransformer;
import com.mumfrey.liteloader.transformers.event.MethodInfo;
import com.mumfrey.liteloader.transformers.event.inject.BeforeReturn;
import com.mumfrey.liteloader.transformers.event.inject.MethodHead;

public class EventTransformerWDL extends EventInjectionTransformer {

	@Override
	protected void addEvents() {
		this.addEvent(Event.getOrCreate("WDL_GuiIngameMenu_initGui"), new MethodInfo(ObfTableWDL.GuiIngameMenu, ObfTableWDL.GuiIngameMenu_initGui, Void.TYPE), new BeforeReturn()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "ingameMenuInit"));
		this.addEvent(Event.getOrCreate("WDL_GuiIngameMenu_actionPerformed"), new MethodInfo(ObfTableWDL.GuiIngameMenu, ObfTableWDL.GuiIngameMenu_actionPerformed, Void.TYPE, ObfTableWDL.GuiButton), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "ingameMenuActionPerformed")); //note: add GuiButton
		this.addEvent(Event.getOrCreate("WDL_WorldClient_tick"), new MethodInfo(ObfTableWDL.WorldClient, ObfTableWDL.WorldClient_tick, Void.TYPE), new BeforeReturn()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "worldClientTick"));
		this.addEvent(Event.getOrCreate("WDL_WorldClient_doPreChunk"), new MethodInfo(ObfTableWDL.WorldClient, ObfTableWDL.WorldClient_doPreChunk, Void.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "worldClientDoPreChunk"));
		this.addEvent(Event.getOrCreate("WDL_WorldClient_removeEntityFromWorld", true), new MethodInfo(ObfTableWDL.WorldClient, ObfTableWDL.WorldClient_removeEntityFromWorld, ObfTableWDL.Entity, Integer.TYPE), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "worldClientRemoveEntityFromWorld")); //note: add Entity

		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_handleDisconnect"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_handleDisconnect, Void.TYPE, ObfTableWDL.S40PacketDisconnect), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientHandleDisconnect")); //note: add S40PacketDisconnect
		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_onDisconnect"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_onDisconnect, Void.TYPE, ObfTableWDL.IChatComponent), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientOnDisconnect")); //note: add IChatComponent
		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_handleChat"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_handleChat, Void.TYPE, ObfTableWDL.S02PacketChat), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientHandleChat")); //note: add S02PacketChat
		
		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_handleBlockAction"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_handleBlockAction, Void.TYPE, ObfTableWDL.S24PacketBlockAction), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientHandleBlockAction")); //note: add S24PacketBlockAction
		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_handleMaps"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_handleMaps, Void.TYPE, ObfTableWDL.S34PacketMaps), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientHandleMaps")); //note: add S34PacketMaps
		this.addEvent(Event.getOrCreate("WDL_NetHandlerPlayClient_handleCustomPayload"), new MethodInfo(ObfTableWDL.NetHandlerPlayClient, ObfTableWDL.NetHandlerPlayClient_handleCustomPayload, Void.TYPE, ObfTableWDL.S3FPacketCustomPayload), new MethodHead()).addListener(new MethodInfo("com.uyjulian.LiteModWDL", "netHandlerPlayClientHandleCustomPayload")); //note: add S3FPacketCustomPayload
	}

}

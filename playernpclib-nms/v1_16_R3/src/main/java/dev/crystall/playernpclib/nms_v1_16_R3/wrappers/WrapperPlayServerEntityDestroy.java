package dev.crystall.playernpclib.nms_v1_16_R3.wrappers;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import dev.crystall.playernpclib.wrapper.AbstractPacket;
import dev.crystall.playernpclib.wrapper.BaseWrapperPlayServerEntityDestroy;

public class WrapperPlayServerEntityDestroy extends AbstractPacket implements BaseWrapperPlayServerEntityDestroy {

  public WrapperPlayServerEntityDestroy() {
    super(new PacketContainer(PacketType.Play.Server.ENTITY_DESTROY), PacketType.Play.Server.ENTITY_DESTROY);
    handle.getModifier().writeDefaults();
  }

  public WrapperPlayServerEntityDestroy(PacketContainer packet) {
    super(packet, PacketType.Play.Server.ENTITY_DESTROY);
  }

  @Override
  public int getCount() {
    return handle.getIntegerArrays().read(0).length;
  }

  @Override
  public int[] getEntityIDs() {
    return handle.getIntegerArrays().read(0);
  }

  @Override
  public void setEntityIds(int[] value) {
    handle.getIntegerArrays().write(0, value);
  }

}

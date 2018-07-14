package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_getParticipant
  extends TLObject
{
  public static int constructor = 1416484774;
  public TLRPC.InputChannel channel;
  public TLRPC.InputUser user_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_channels_channelParticipant.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    this.user_id.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_getParticipant.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
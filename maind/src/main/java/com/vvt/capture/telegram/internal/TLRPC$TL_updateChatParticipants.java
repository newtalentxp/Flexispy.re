package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateChatParticipants
  extends TLRPC.Update
{
  public static int constructor = 125178264;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.ChatParticipants localChatParticipants = TLRPC.ChatParticipants.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.participants = localChatParticipants;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.participants.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipants.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
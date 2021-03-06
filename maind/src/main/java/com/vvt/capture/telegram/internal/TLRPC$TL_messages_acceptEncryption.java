package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_acceptEncryption
  extends TLObject
{
  public static int constructor = 1035731989;
  public byte[] g_b;
  public long key_fingerprint;
  public TLRPC.TL_inputEncryptedChat peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.EncryptedChat.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    byte[] arrayOfByte = this.g_b;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    long l = this.key_fingerprint;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_acceptEncryption.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaVideo
  extends TLRPC.DecryptedMessageMedia
{
  public static int constructor = 1380598109;
  public byte[] thumb;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.thumb = ((byte[])localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.thumb_w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.thumb_h = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.h = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = ((byte[])localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.thumb;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    i = this.thumb_w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.thumb_h;
    paramAbstractSerializedData.writeInt32(i);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.key;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.iv;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
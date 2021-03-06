package com.vvt.capture.telegram.internal;

public class TLRPC$TL_document_old
  extends TLRPC.TL_document
{
  public static int constructor = -1627626714;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.file_name = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.thumb = ((TLRPC.PhotoSize)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.dc_id = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.file_name;
    paramAbstractSerializedData.writeString(str);
    str = this.mime_type;
    paramAbstractSerializedData.writeString(str);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    this.thumb.serializeToStream(paramAbstractSerializedData);
    i = this.dc_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_document_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
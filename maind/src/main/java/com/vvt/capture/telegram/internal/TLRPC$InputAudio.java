package com.vvt.capture.telegram.internal;

public class TLRPC$InputAudio
  extends TLObject
{
  public long access_hash;
  public long id;
  
  public static InputAudio TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in InputAudio", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputAudio;
      ((TLRPC.TL_inputAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputAudioEmpty;
      ((TLRPC.TL_inputAudioEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((InputAudio)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputAudio)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;

final class SqlDateTypeAdapter$1
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = paramTypeToken.getRawType();
    Class localClass = Date.class;
    if (localObject == localClass)
    {
      localObject = new com/google/gson/internal/bind/SqlDateTypeAdapter;
      ((SqlDateTypeAdapter)localObject).<init>();
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/SqlDateTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
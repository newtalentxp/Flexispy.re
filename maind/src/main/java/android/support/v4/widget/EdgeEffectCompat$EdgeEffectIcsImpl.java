package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

class EdgeEffectCompat$EdgeEffectIcsImpl
  implements EdgeEffectCompat.EdgeEffectImpl
{
  public boolean draw(Object paramObject, Canvas paramCanvas)
  {
    return EdgeEffectCompatIcs.draw(paramObject, paramCanvas);
  }
  
  public void finish(Object paramObject)
  {
    EdgeEffectCompatIcs.finish(paramObject);
  }
  
  public boolean isFinished(Object paramObject)
  {
    return EdgeEffectCompatIcs.isFinished(paramObject);
  }
  
  public Object newEdgeEffect(Context paramContext)
  {
    return EdgeEffectCompatIcs.newEdgeEffect(paramContext);
  }
  
  public boolean onAbsorb(Object paramObject, int paramInt)
  {
    return EdgeEffectCompatIcs.onAbsorb(paramObject, paramInt);
  }
  
  public boolean onPull(Object paramObject, float paramFloat)
  {
    return EdgeEffectCompatIcs.onPull(paramObject, paramFloat);
  }
  
  public boolean onRelease(Object paramObject)
  {
    return EdgeEffectCompatIcs.onRelease(paramObject);
  }
  
  public void setSize(Object paramObject, int paramInt1, int paramInt2)
  {
    EdgeEffectCompatIcs.setSize(paramObject, paramInt1, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
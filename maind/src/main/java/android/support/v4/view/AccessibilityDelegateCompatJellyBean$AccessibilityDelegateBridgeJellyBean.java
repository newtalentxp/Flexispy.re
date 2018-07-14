package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public abstract interface AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean
{
  public abstract boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract Object getAccessibilityNodeProvider(View paramView);
  
  public abstract void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void onInitializeAccessibilityNodeInfo(View paramView, Object paramObject);
  
  public abstract void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle);
  
  public abstract void sendAccessibilityEvent(View paramView, int paramInt);
  
  public abstract void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */
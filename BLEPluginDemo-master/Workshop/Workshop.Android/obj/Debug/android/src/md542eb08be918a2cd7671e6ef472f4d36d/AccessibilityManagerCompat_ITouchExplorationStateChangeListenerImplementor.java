package md542eb08be918a2cd7671e6ef472f4d36d;


public class AccessibilityManagerCompat_ITouchExplorationStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md542eb08be918a2cd7671e6ef472f4d36d.AccessibilityManagerCompat_ITouchExplorationStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchExplorationStateChanged:(Z)V:GetOnTouchExplorationStateChanged_ZHandler:Android.Support.V4.View.Accessibility.AccessibilityManagerCompat/ITouchExplorationStateChangeListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.View.Accessibility.AccessibilityManagerCompat+ITouchExplorationStateChangeListenerImplementor, Xamarin.Android.Support.Compat", AccessibilityManagerCompat_ITouchExplorationStateChangeListenerImplementor.class, __md_methods);
	}


	public AccessibilityManagerCompat_ITouchExplorationStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManagerCompat_ITouchExplorationStateChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.View.Accessibility.AccessibilityManagerCompat+ITouchExplorationStateChangeListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public void onTouchExplorationStateChanged (boolean p0)
	{
		n_onTouchExplorationStateChanged (p0);
	}

	private native void n_onTouchExplorationStateChanged (boolean p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

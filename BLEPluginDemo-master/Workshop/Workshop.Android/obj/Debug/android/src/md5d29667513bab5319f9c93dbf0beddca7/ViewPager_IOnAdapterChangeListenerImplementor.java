package md5d29667513bab5319f9c93dbf0beddca7;


public class ViewPager_IOnAdapterChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5d29667513bab5319f9c93dbf0beddca7.ViewPager_IOnAdapterChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdapterChanged:(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V:GetOnAdapterChanged_Landroid_support_v4_view_ViewPager_Landroid_support_v4_view_PagerAdapter_Landroid_support_v4_view_PagerAdapter_Handler:Android.Support.V4.View.ViewPager/IOnAdapterChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.View.ViewPager+IOnAdapterChangeListenerImplementor, Xamarin.Android.Support.Core.UI", ViewPager_IOnAdapterChangeListenerImplementor.class, __md_methods);
	}


	public ViewPager_IOnAdapterChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewPager_IOnAdapterChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.View.ViewPager+IOnAdapterChangeListenerImplementor, Xamarin.Android.Support.Core.UI", "", this, new java.lang.Object[] {  });
	}


	public void onAdapterChanged (android.support.v4.view.ViewPager p0, android.support.v4.view.PagerAdapter p1, android.support.v4.view.PagerAdapter p2)
	{
		n_onAdapterChanged (p0, p1, p2);
	}

	private native void n_onAdapterChanged (android.support.v4.view.ViewPager p0, android.support.v4.view.PagerAdapter p1, android.support.v4.view.PagerAdapter p2);

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

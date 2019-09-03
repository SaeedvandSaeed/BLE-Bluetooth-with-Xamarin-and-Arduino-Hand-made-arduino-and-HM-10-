package md5d29667513bab5319f9c93dbf0beddca7;


public class ViewPager_IOnPageChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5d29667513bab5319f9c93dbf0beddca7.ViewPager_IOnPageChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"n_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.View.ViewPager+IOnPageChangeListenerImplementor, Xamarin.Android.Support.Core.UI", ViewPager_IOnPageChangeListenerImplementor.class, __md_methods);
	}


	public ViewPager_IOnPageChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewPager_IOnPageChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.View.ViewPager+IOnPageChangeListenerImplementor, Xamarin.Android.Support.Core.UI", "", this, new java.lang.Object[] {  });
	}


	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);


	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);


	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

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

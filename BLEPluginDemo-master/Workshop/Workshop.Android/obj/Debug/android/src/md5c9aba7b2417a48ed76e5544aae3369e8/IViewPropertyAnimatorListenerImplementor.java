package md5c9aba7b2417a48ed76e5544aae3369e8;


public class IViewPropertyAnimatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5c9aba7b2417a48ed76e5544aae3369e8.IViewPropertyAnimatorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationCancel:(Landroid/view/View;)V:GetOnAnimationCancel_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"n_onAnimationEnd:(Landroid/view/View;)V:GetOnAnimationEnd_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"n_onAnimationStart:(Landroid/view/View;)V:GetOnAnimationStart_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.View.IViewPropertyAnimatorListenerImplementor, Xamarin.Android.Support.Compat", IViewPropertyAnimatorListenerImplementor.class, __md_methods);
	}


	public IViewPropertyAnimatorListenerImplementor ()
	{
		super ();
		if (getClass () == IViewPropertyAnimatorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.View.IViewPropertyAnimatorListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public void onAnimationCancel (android.view.View p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.view.View p0);


	public void onAnimationEnd (android.view.View p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.View p0);


	public void onAnimationStart (android.view.View p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.View p0);

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

package md53d92f57aad98d8db5b698f5d857713db;


public class RecyclerView_ItemAnimator_IItemAnimatorFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md53d92f57aad98d8db5b698f5d857713db.RecyclerView_ItemAnimator_IItemAnimatorFinishedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationsFinished:()V:GetOnAnimationsFinishedHandler:Android.Support.V7.Widget.RecyclerView/ItemAnimator/IItemAnimatorFinishedListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.RecyclerView+ItemAnimator+IItemAnimatorFinishedListenerImplementor, Xamarin.Android.Support.v7.RecyclerView", RecyclerView_ItemAnimator_IItemAnimatorFinishedListenerImplementor.class, __md_methods);
	}


	public RecyclerView_ItemAnimator_IItemAnimatorFinishedListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_ItemAnimator_IItemAnimatorFinishedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.RecyclerView+ItemAnimator+IItemAnimatorFinishedListenerImplementor, Xamarin.Android.Support.v7.RecyclerView", "", this, new java.lang.Object[] {  });
	}


	public void onAnimationsFinished ()
	{
		n_onAnimationsFinished ();
	}

	private native void n_onAnimationsFinished ();

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

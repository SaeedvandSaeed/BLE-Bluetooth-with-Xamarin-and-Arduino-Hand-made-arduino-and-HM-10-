package md5241842994fc3d20a4a1b139db0e6010a;


public class IMenuItemHoverListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5241842994fc3d20a4a1b139db0e6010a.IMenuItemHoverListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemHoverEnter:(Landroid/support/v7/view/menu/MenuBuilder;Landroid/view/MenuItem;)V:GetOnItemHoverEnter_Landroid_support_v7_view_menu_MenuBuilder_Landroid_view_MenuItem_Handler:Android.Support.V7.Widget.IMenuItemHoverListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onItemHoverExit:(Landroid/support/v7/view/menu/MenuBuilder;Landroid/view/MenuItem;)V:GetOnItemHoverExit_Landroid_support_v7_view_menu_MenuBuilder_Landroid_view_MenuItem_Handler:Android.Support.V7.Widget.IMenuItemHoverListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.IMenuItemHoverListenerImplementor, Xamarin.Android.Support.v7.AppCompat", IMenuItemHoverListenerImplementor.class, __md_methods);
	}


	public IMenuItemHoverListenerImplementor ()
	{
		super ();
		if (getClass () == IMenuItemHoverListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.IMenuItemHoverListenerImplementor, Xamarin.Android.Support.v7.AppCompat", "", this, new java.lang.Object[] {  });
	}


	public void onItemHoverEnter (android.support.v7.view.menu.MenuBuilder p0, android.view.MenuItem p1)
	{
		n_onItemHoverEnter (p0, p1);
	}

	private native void n_onItemHoverEnter (android.support.v7.view.menu.MenuBuilder p0, android.view.MenuItem p1);


	public void onItemHoverExit (android.support.v7.view.menu.MenuBuilder p0, android.view.MenuItem p1)
	{
		n_onItemHoverExit (p0, p1);
	}

	private native void n_onItemHoverExit (android.support.v7.view.menu.MenuBuilder p0, android.view.MenuItem p1);

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

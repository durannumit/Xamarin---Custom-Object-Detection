package md5eb100f568c3f4a6f65a2e89d0be6ed89;


public class Distribute_Listener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.appcenter.distribute.DistributeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReleaseAvailable:(Landroid/app/Activity;Lcom/microsoft/appcenter/distribute/ReleaseDetails;)Z:GetOnReleaseAvailable_Landroid_app_Activity_Lcom_microsoft_appcenter_distribute_ReleaseDetails_Handler:Com.Microsoft.Appcenter.Distribute.IDistributeListenerInvoker, Microsoft.AppCenter.Distribute.Android.Bindings\n" +
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Distribute.Distribute+Listener, Microsoft.AppCenter.Distribute", Distribute_Listener.class, __md_methods);
	}


	public Distribute_Listener ()
	{
		super ();
		if (getClass () == Distribute_Listener.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Distribute.Distribute+Listener, Microsoft.AppCenter.Distribute", "", this, new java.lang.Object[] {  });
	}


	public boolean onReleaseAvailable (android.app.Activity p0, com.microsoft.appcenter.distribute.ReleaseDetails p1)
	{
		return n_onReleaseAvailable (p0, p1);
	}

	private native boolean n_onReleaseAvailable (android.app.Activity p0, com.microsoft.appcenter.distribute.ReleaseDetails p1);

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

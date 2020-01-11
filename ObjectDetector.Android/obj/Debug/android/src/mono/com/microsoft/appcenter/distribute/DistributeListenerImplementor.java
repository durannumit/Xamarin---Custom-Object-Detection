package mono.com.microsoft.appcenter.distribute;


public class DistributeListenerImplementor
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
		mono.android.Runtime.register ("Com.Microsoft.Appcenter.Distribute.IDistributeListenerImplementor, Microsoft.AppCenter.Distribute.Android.Bindings", DistributeListenerImplementor.class, __md_methods);
	}


	public DistributeListenerImplementor ()
	{
		super ();
		if (getClass () == DistributeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Microsoft.Appcenter.Distribute.IDistributeListenerImplementor, Microsoft.AppCenter.Distribute.Android.Bindings", "", this, new java.lang.Object[] {  });
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

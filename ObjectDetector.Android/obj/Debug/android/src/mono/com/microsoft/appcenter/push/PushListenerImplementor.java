package mono.com.microsoft.appcenter.push;


public class PushListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.appcenter.push.PushListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPushNotificationReceived:(Landroid/app/Activity;Lcom/microsoft/appcenter/push/PushNotification;)V:GetOnPushNotificationReceived_Landroid_app_Activity_Lcom_microsoft_appcenter_push_PushNotification_Handler:Com.Microsoft.Appcenter.Push.IPushListenerInvoker, Microsoft.AppCenter.Push.Android.Bindings\n" +
			"";
		mono.android.Runtime.register ("Com.Microsoft.Appcenter.Push.IPushListenerImplementor, Microsoft.AppCenter.Push.Android.Bindings", PushListenerImplementor.class, __md_methods);
	}


	public PushListenerImplementor ()
	{
		super ();
		if (getClass () == PushListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Microsoft.Appcenter.Push.IPushListenerImplementor, Microsoft.AppCenter.Push.Android.Bindings", "", this, new java.lang.Object[] {  });
	}


	public void onPushNotificationReceived (android.app.Activity p0, com.microsoft.appcenter.push.PushNotification p1)
	{
		n_onPushNotificationReceived (p0, p1);
	}

	private native void n_onPushNotificationReceived (android.app.Activity p0, com.microsoft.appcenter.push.PushNotification p1);

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

package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {
    static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    public void onTokenRefresh() {
    String refreshedToken = FirebaseInstanceId.getInstance().getToken();
    Log.d(LOG_TAG, "Refreshed Token" + refreshedToken);
    sendRegistrationIdToServer(refreshedToken);
    }

    private void sendRegistrationIdToServer(String refreshToken) {
    }

}



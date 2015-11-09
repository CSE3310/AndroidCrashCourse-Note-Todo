package mobi.idappthat.notestodo;

import android.app.Application;
import android.content.Intent;

import com.parse.Parse;
import com.parse.ParseUser;

/**
 * Created by Cameron on 11/6/15.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "IawLg6MMPCvFDPafIEyRD8PScVakg6UAfAzHxPti", "zVLI3xQp31IPs06RGZ2b077ubacH196BbmOP1feR");

        if(ParseUser.getCurrentUser() != null) {
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        }
    }
}

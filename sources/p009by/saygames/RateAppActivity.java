package p009by.saygames;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

/* renamed from: by.saygames.RateAppActivity */
public class RateAppActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showRateDialog();
    }

    public void showRateDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final Context applicationContext = getApplicationContext();
        builder.setTitle(applicationContext.getApplicationInfo().loadLabel(applicationContext.getPackageManager()));
        builder.setMessage((CharSequence) "Do you like the game? Rate it!");
        builder.setCancelable(false);
        builder.setPositiveButton((CharSequence) "RATE NOW", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Activity activity = SayKit.getActivity();
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + applicationContext.getPackageName())));
                RateAppActivity.this.finish();
            }
        });
        builder.setNeutralButton((CharSequence) "No, thanks", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RateAppActivity.this.finish();
            }
        });
        builder.show();
    }
}

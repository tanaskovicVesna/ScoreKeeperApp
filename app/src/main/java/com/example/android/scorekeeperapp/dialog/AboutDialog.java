package com.example.android.scorekeeperapp.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.example.android.scorekeeperapp.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by Tanaskovic on 1/10/2018.
 */

public class AboutDialog extends AlertDialog.Builder {

    public AboutDialog( Context context) {
        super(context);

        setTitle(R.string.dialog_about_app);
        setMessage("Vesna Tanaskovic made this app");
        setCancelable(false);

        setPositiveButton(R.string.dialog_about_yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
    }

    public AlertDialog prepareDialog(){
        AlertDialog dialog = create();
        dialog.setCanceledOnTouchOutside(false);

        return dialog;
    }
}

/*
 Copyright 2012 - 2013 Sean O' Shea

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.krissytosi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.krissytosi.utils.KrissyTosiConstants;

/**
 * Be nice and thank a user for updating the application.
 */
public class ApplicationUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getDataString().contains(KrissyTosiConstants.PACKAGE_IDENTIFIER)) {
            Toast.makeText(context, R.string.app_update_received, Toast.LENGTH_SHORT).show();
        }
    }
}

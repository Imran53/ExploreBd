/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.car.setupwizardlib.partner;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import java.util.EnumMap;

/** The helper reads and caches the partner configurations from Car Setup Wizard. */
public class PartnerConfigHelper {

    private static final String TAG = PartnerConfigHelper.class.getSimpleName();

    @VisibleForTesting
    static final String SUW_AUTHORITY = "com.google.android.car.setupwizard.partner";

    @VisibleForTesting
    static final String SUW_GET_PARTNER_CONFIG_METHOD = "getOverlayConfig";
    private static volatile PartnerConfigHelper sInstance = null;

    @VisibleForTesting Bundle mResultBundle = null;

    @VisibleForTesting
    final EnumMap<PartnerConfig, Object> mPartnerResourceCache = new EnumMap<>(PartnerConfig.class);

    /** Factory method to get an instance */
    public static PartnerConfigHelper get(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (PartnerConfigHelper.class) {
                if (sInstance == null) {
                    sInstance = new PartnerConfigHelper(context);
                }
            }
        }
        return sInstance;
    }

    /
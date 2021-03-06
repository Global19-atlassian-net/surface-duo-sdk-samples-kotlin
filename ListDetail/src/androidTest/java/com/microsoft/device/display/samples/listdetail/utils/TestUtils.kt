/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 *
 */

package com.microsoft.device.display.samples.listdetail.utils

import androidx.test.espresso.ViewAction

/**
 * Returns an action that clicks the view without to check the coordinates on the screen.
 * Seems that ViewActions.click() finds coordinates of the view on the screen, and then performs the tap on the coordinates.
 * Seems tha changing the screen rotations affects these coordinates and ViewActions.click() throws exceptions.
 */
fun forceClick(): ViewAction = ForceClick()

/**
 * Returns a matcher that matches {@link ImageViews Views} that has the expected drawable background.
 * @param drawableId The expected Drawable resource id
 */
fun hasDrawable(drawableId: Int) = DrawableMatcher(drawableId)
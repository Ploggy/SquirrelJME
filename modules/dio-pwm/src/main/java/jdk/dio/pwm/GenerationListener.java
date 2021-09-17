// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package jdk.dio.pwm;

import jdk.dio.AsyncErrorHandler;
import jdk.dio.DeviceEventListener;

public interface GenerationListener
	extends DeviceEventListener, AsyncErrorHandler<PWMChannel>
{
	
	void pulseGenerationCompleted(GenerationEvent __a);
}


